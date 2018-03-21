package de.xeqo.a.a.b;

import de.xeqo.a.a.UsbService;
import de.xeqo.a.a.CameraStruc;
import de.xeqo.a.a.b;
import de.xeqo.a.a.c.a.g;

public final class w extends q {
    public w(UsbService wVar, CameraStruc acVar) {
        super(wVar, acVar);
    }

    public static b a() {
        return new m();
    }

    protected final g a(byte b) {
        switch (b) {
            case (byte) 3:
                return new g(b, "Raw", de.xeqo.a.a.g.w);
            case (byte) 4:
                return new g(b, "Raw\nBasic", de.xeqo.a.a.g.x);
            default:
                return super.a(b);
        }
    }

    public final boolean g() {
        return true;
    }
}
