package de.xeqo.camcapdemo;

import android.hardware.usb.UsbDevice;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.PopupWindow;
import de.xeqo.a.a.CameraStruc;
import de.xeqo.a.a.q;
import de.xeqo.a.a.UsbService;

final class as implements OnItemClickListener {
    private /* synthetic */ CameraActivity a;
    private final /* synthetic */ ArrayAdapter b;
    private final /* synthetic */ PopupWindow c;

    as(CameraActivity cameraActivity, ArrayAdapter arrayAdapter, PopupWindow popupWindow) {
        this.a = cameraActivity;
        this.b = arrayAdapter;
        this.c = popupWindow;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CameraStruc acVar = (CameraStruc) this.b.getItem(i);
        if (!(acVar == null || q.b() == null || q.b().getDeviceList().values().isEmpty())) {
            UsbDevice usbDevice = (UsbDevice) q.b().getDeviceList().values().iterator().next();
            if (usbDevice != null) {
                this.a.a(acVar.a(UsbService.getUsbServiceInstance(usbDevice)));
            }
        }
        this.c.dismiss();
    }
}
