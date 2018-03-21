package de.xeqo.camcapdemo;

import android.hardware.usb.UsbDevice;
import android.view.View;
import android.view.View.OnClickListener;

final class k implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;

    k(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onClick(View view) {
        this.a.c.clear();
        for (UsbDevice a : this.a.e.getDeviceList().values()) {
            this.a.f.connect(a);
        }
    }
}
