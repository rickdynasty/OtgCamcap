package de.xeqo.a.a;

//Camera
public class CameraStruc {
    private static /* synthetic */ boolean d = (!CameraStruc.class.desiredAssertionStatus());
    private CameraIdStruc a = null;
    private b b = null;
    private String name = null;

    public CameraStruc(CameraIdStruc nVar, String name, b bVar) {
        if (!d && nVar == null) {
            throw new AssertionError();
        } else if (!d && name == null) {
            throw new AssertionError();
        } else if (d || bVar != null) {
            this.a = nVar;
            name = name;
            this.b = bVar;
        } else {
            throw new AssertionError();
        }
    }

    public final i a(UsbService wVar) {
        if (!d && (wVar == null || wVar.a() != this.a)) {
            throw new AssertionError();
        } else if (wVar != null) {
            return this.b.a(wVar, this);
        } else {
            return null;
        }
    }

    public final CameraIdStruc a() {
        return this.a;
    }

    public String toString() {
        return name;
    }
}
