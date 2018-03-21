package de.xeqo.camcapdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;

final class PermissonReceiver extends BroadcastReceiver {
    public final static String EXTRA_USB_PERMISSION = "de.xeqo.camcap.USB_PERMISSION";//
    private final static String TAG = "PermissonReceiver";
    private /* synthetic */ RemoteCaptureActivity mRemoteCaptureActivity;

    PermissonReceiver(RemoteCaptureActivity remoteCaptureActivity) {
        mRemoteCaptureActivity = remoteCaptureActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (PermissonReceiver.EXTRA_USB_PERMISSION.equals(action)) {
            synchronized (this) {
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(UsbManager.EXTRA_DEVICE);
                if (!intent.getBooleanExtra(UsbManager.EXTRA_PERMISSION_GRANTED, false)) {
                    Log.i(TAG, "permission denied for device " + usbDevice);
                } else if (usbDevice != null) {
                    mRemoteCaptureActivity.f.connect(usbDevice);
                }
            }
        } else if (UsbManager.ACTION_USB_DEVICE_DETACHED.equals(action)) {//UsbManager.ACTION_USB_DEVICE_DETACHED
            "sdas".toString();
        } else if (UsbManager.ACTION_USB_DEVICE_ATTACHED.equals(action)) {//UsbManager.ACTION_USB_DEVICE_ATTACHED
            "sadas".toString();
        }
    }
}
