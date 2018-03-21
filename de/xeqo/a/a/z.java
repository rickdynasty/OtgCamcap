package de.xeqo.a.a;

import de.xeqo.a.a.b.ab;
import de.xeqo.a.a.b.p;
import de.xeqo.a.a.b.q;
import de.xeqo.a.a.b.r;
import de.xeqo.a.a.b.t;
import de.xeqo.a.a.b.w;
import de.xeqo.a.a.b.x;
import de.xeqo.a.a.b.y;
import de.xeqo.ptp.PtpConstants;

import java.util.Enumeration;
import java.util.Vector;

public final class z {
    public static final CameraStruc a = a(PtpConstants.CanonVendorId, 0, "Default Canon", a.a());
    public static final CameraStruc b = a(PtpConstants.NikonVendorId, 0, "Deault Nikon", q.a());
    private static z instance = null;
    private final Vector vecSupportedCameras = new Vector();

    private z() {
        vecSupportedCameras.add(a(PtpConstants.CanonVendorId, 12560, "Canon EOS 400D", c.a()));
        vecSupportedCameras.add(a(PtpConstants.CanonVendorId, 12751, "Canon EOS 500D", a.a()));
        vecSupportedCameras.add(a(PtpConstants.CanonVendorId, 12778, "Canon EOS 550D", a.a()));
        vecSupportedCameras.add(a(PtpConstants.CanonVendorId, 12612, "Canon 1D Mark III", p.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1064, "Nikon D7000", r.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1038, "Nikon D70", ab.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1044, "Nikon D40", w.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1059, "Nikon D5000", y.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1057, "Nikon D90", t.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1062, "Nikon D3s", y.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1050, "Nikon D300", x.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1052, "Nikon D3", x.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1056, "Nikon D3x", x.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1061, "Nikon D300s", x.a()));
        vecSupportedCameras.add(a(PtpConstants.NikonVendorId, 1050, "Nikon D700", x.a()));
    }

    public static CameraStruc a(CameraIdStruc nVar) {
        Enumeration a = a();
        CameraStruc acVar = null;
        while (acVar == null && a.hasMoreElements()) {
            CameraStruc acVar2 = (CameraStruc) a.nextElement();
            if (acVar2 != null && acVar2.a().equals(nVar)) {
                acVar = acVar2;
            }
        }
        return acVar;
    }

    public static Enumeration a() {
        return b().vecSupportedCameras.elements();
    }

    private static synchronized z b() {
        z zVar;
        synchronized (z.class) {
            if (instance == null) {
                instance = new z();
            }
            zVar = instance;
        }
        return zVar;
    }

    private static CameraStruc a(int i, int i2, String str, b bVar) {
        return new CameraStruc(new CameraIdStruc(i, i2), str, bVar);
    }
}
