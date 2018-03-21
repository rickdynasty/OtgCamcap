package de.xeqo.a.a;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import java.io.File;
import java.util.Iterator;

import de.xeqo.ptp.PtpConstants;

public class q {
    private static q b = null;
    private static /* synthetic */ boolean d;
    private Context a;
    private UsbManager c;

    static {
        boolean z;
        if (q.class.desiredAssertionStatus()) {
            z = false;
        } else {
            z = true;
        }
        d = z;
    }

    public static final synchronized boolean a(Context context, UsbManager usbManager) {
        boolean z;
        synchronized (q.class) {
            z = false;
            if (!(b != null || context == null || usbManager == null)) {
                b = new q(context, usbManager);
                z = true;
            }
        }
        return z;
    }

    public static synchronized i a(UsbDevice usbDevice) {
        i iVar;
        synchronized (q.class) {
            iVar = null;
            if (usbDevice != null) {
                CameraStruc a = z.a(new CameraIdStruc(usbDevice.getVendorId(), usbDevice.getProductId()));
                if (a == null) {
                    if (usbDevice.getVendorId() == PtpConstants.NikonVendorId) {
                        a = z.b;
                    } else if (usbDevice.getVendorId() == PtpConstants.CanonVendorId) {
                        a = z.a;
                    }
                }

                if (a != null) {
                    UsbService a2 = UsbService.getUsbServiceInstance(usbDevice);
                    if (a2 != null) {
                        iVar = a.a(a2);
                    }
                }
            }
        }
        return iVar;
    }

    public static synchronized i a() {
        i iVar;
        synchronized (q.class) {
            iVar = null;
            if (!(b == null || b.c == null)) {
                Iterator it = b.c.getDeviceList().values().iterator();
                i iVar2 = null;
                while (iVar2 == null && it.hasNext()) {
                    UsbDevice usbDevice = (UsbDevice) it.next();
                    if (usbDevice != null) {
                        iVar2 = a(usbDevice);
                    }
                }
                iVar = iVar2;
            }
        }
        return iVar;
    }

    public static synchronized UsbManager b() {
        UsbManager usbManager;
        synchronized (q.class) {
            if (b != null) {
                usbManager = b.c;
            } else {
                usbManager = null;
            }
        }
        return usbManager;
    }

    private q(Context context, UsbManager usbManager) {
        if (!d && context == null) {
            throw new AssertionError();
        } else if (d || usbManager != null) {
            this.a = context;
            this.c = usbManager;
        } else {
            throw new AssertionError();
        }
    }

    public static File c() {
        return new File("/sdcard/CamCap/");
    }

    public static File a(String str) {
        if (d || str != null) {
            File c = c();
            if (!c.exists()) {
                c.mkdirs();
            }
            int i = 1;
            int lastIndexOf = str.lastIndexOf(46);
            String toLowerCase = str.substring(lastIndexOf + 1).toLowerCase();
            String substring = str.substring(0, lastIndexOf);
            File file = new File(c, str);
            while (file.exists()) {
                StringBuilder append = new StringBuilder(String.valueOf(substring)).append("_");
                int i2 = i + 1;
                file = new File(c, append.append(String.valueOf(i)).append(".").append(toLowerCase).toString());
                i = i2;
            }
            return file;
        }
        throw new AssertionError();
    }
}
