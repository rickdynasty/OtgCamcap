package de.xeqo.camcapdemo;

import android.app.Application;
import android.content.Context;
import android.hardware.usb.UsbManager;

import de.xeqo.a.a.i;
import de.xeqo.a.a.q;
//import org.acra.ACRA;
//import org.acra.c.a;

public class CamCap extends Application {
    private i a;
    private UsbManager mUsbManager;

    public void onCreate() {
        //异常上报 org.acra
        //ACRA.init(this);
        super.onCreate();
        mUsbManager = (UsbManager) getSystemService(Context.USB_SERVICE);
        q.a(this, mUsbManager);
    }

    public final void a(i iVar) {
        this.a = iVar;
    }

    public final i a() {
        return this.a;
    }
}
