package de.xeqo.a.a.b;

import android.graphics.Bitmap;
import android.util.Log;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

import de.xeqo.a.a.a.a.c;
import de.xeqo.a.a.a.a.k;
import de.xeqo.a.a.a.a.m;
import de.xeqo.a.a.a.a.o;
import de.xeqo.a.a.a.a.p;
import de.xeqo.a.a.a.e;
import de.xeqo.a.a.CameraStruc;
import de.xeqo.a.a.af;
import de.xeqo.a.a.b;
import de.xeqo.a.a.c.ad;
import de.xeqo.a.a.c.ae;
import de.xeqo.a.a.c.b.g;
import de.xeqo.a.a.c.b.h;
import de.xeqo.a.a.c.b.l;
import de.xeqo.a.a.c.i;
import de.xeqo.a.a.c.j;
import de.xeqo.a.a.c.n;
import de.xeqo.a.a.c.y;
import de.xeqo.a.a.r;
import de.xeqo.a.a.s;
import de.xeqo.a.a.UsbService;

public class a extends r {
    protected boolean a;
    private boolean c = false;
    private boolean d = true;
    private boolean e = false;

    public a(UsbService wVar, CameraStruc acVar) {
        super(wVar, acVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(g.a);
        arrayList.add(g.b);
        arrayList.add(g.c);
        arrayList.add(g.d);
        arrayList.add(g.e);
        arrayList.add(g.f);
        arrayList.add(g.g);
        arrayList.add(g.h);
        arrayList.add(g.i);
        arrayList.add(g.j);
        arrayList.add(g.k);
        arrayList.add(g.l);
        a(arrayList);
    }

    public static b a() {
        return new l();
    }

    protected final boolean b() {
        boolean z = false;
        de.xeqo.a.a.a.g gVar = new de.xeqo.a.a.a.g();
        gVar.a(this.b);
        if (gVar.b()) {
            z = new k().a(this.b);
            if (z) {
                z = new p().a(this.b);
            }
            if (z) {
                c cVar = new c();
                if (cVar.a(this.b) && cVar.d()) {
                    k(cVar.b());
                }
            }
        }
        return z;
    }

    protected final void c() {
        if (this.a) {
            i();
        }
        new e().a(this.b);
    }

    protected final af d() {
        return new c();
    }

    protected final void e() {
    }

    public final boolean f() {
        boolean g = g();
        this.c = g;
        return g;
    }

    protected boolean g() {
        boolean a = new m().a(this.b);
        if (a) {
            a = de.xeqo.a.a.a.a.a.a().a(this.b);
        }
        if (a) {
            a = de.xeqo.a.a.a.a.a.b().a(this.b);
        }
        if (a) {
            a = de.xeqo.a.a.a.a.a.c().a(this.b);
        }
        if (a) {
            return de.xeqo.a.a.a.a.a.d().a(this.b);
        }
        return a;
    }

    public final void a(int i, int i2, int i3, String str) {
        boolean z = true;
        if (this.c) {
            this.c = false;
            if (m()) {
                this.e = true;
            } else {
                B();
            }
        }
        String str2;
        if (d.a(i3)) {
            if (str == null || str.length() == 0) {
                str2 = "EOS_IMG.cr2";
            } else {
                str2 = str;
            }
            if (D() == s.Tablet || D() == s.CameraAndTablet) {
                UsbService wVar = this.b;
                if (D() != s.Tablet) {
                    z = false;
                }
                a(new l(wVar, i, i2, i3, str2, z));
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            str2 = "EOS_IMG.jpg";
        } else {
            str2 = str;
        }
        if (C() == s.Tablet || C() == s.CameraAndTablet) {
            wVar = this.b;
            if (C() != s.Tablet) {
                z = false;
            }
            a(new l(wVar, i, i2, i3, str2, z));
        }
    }

    public final boolean a(n nVar) {
        if (nVar == null || nVar.equals(r().c()) || !(nVar instanceof de.xeqo.a.a.c.b.n)) {
            return false;
        }
        de.xeqo.a.a.c.b.n nVar2 = (de.xeqo.a.a.c.b.n) nVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53505);
        allocate.put(nVar2.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(ae aeVar) {
        if (aeVar == null || aeVar.equals(s().c()) || !(aeVar instanceof de.xeqo.a.a.c.b.m)) {
            return false;
        }
        de.xeqo.a.a.c.b.m mVar = (de.xeqo.a.a.c.b.m) aeVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53506);
        allocate.put(mVar.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(i iVar) {
        if (iVar == null || iVar.equals(t().c()) || !(iVar instanceof de.xeqo.a.a.c.b.e)) {
            return false;
        }
        de.xeqo.a.a.c.b.e eVar = (de.xeqo.a.a.c.b.e) iVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53507);
        allocate.put(eVar.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(de.xeqo.a.a.c.w wVar) {
        if (wVar == null || wVar.equals(u().c()) || !(wVar instanceof de.xeqo.a.a.c.b.d)) {
            return false;
        }
        de.xeqo.a.a.c.b.d dVar = (de.xeqo.a.a.c.b.d) wVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53508);
        allocate.put(dVar.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(de.xeqo.a.a.c.a aVar) {
        if (aVar == null || aVar.equals(w().c()) || !(aVar instanceof de.xeqo.a.a.c.b.i)) {
            return false;
        }
        de.xeqo.a.a.c.b.i iVar = (de.xeqo.a.a.c.b.i) aVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53513);
        allocate.put(iVar.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(j jVar) {
        return false;
    }

    public final boolean a(ad adVar) {
        if (adVar == null || adVar.equals(v().c()) || !(adVar instanceof h)) {
            return false;
        }
        h hVar = (h) adVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53511);
        allocate.put(hVar.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(y yVar) {
        if (yVar == null || yVar.equals(z().c()) || !(yVar instanceof de.xeqo.a.a.c.b.b)) {
            return false;
        }
        de.xeqo.a.a.c.b.b bVar = (de.xeqo.a.a.c.b.b) yVar;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53520);
        allocate.put(bVar.b_());
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public final boolean a(de.xeqo.a.a.c.r rVar) {
        if (rVar == null || rVar.equals(A().c()) || !(rVar instanceof de.xeqo.a.a.c.b.a)) {
            return false;
        }
        ByteBuffer b = ((de.xeqo.a.a.c.b.a) rVar).b();
        int limit = b.limit() + 8;
        ByteBuffer allocate = ByteBuffer.allocate(limit);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(limit);
        allocate.putInt(53536);
        allocate.put(b);
        return new de.xeqo.a.a.a.a.n(allocate).a(this.b);
    }

    public boolean h() {
        if (!de.xeqo.a.a.a.a.d.a(3).a(this.b)) {
            return false;
        }
        this.a = true;
        return true;
    }

    public final boolean i() {
        if (!de.xeqo.a.a.a.a.d.a(0).a(this.b)) {
            return false;
        }
        this.a = false;
        return true;
    }

    public final Bitmap j() {
        de.xeqo.a.a.a.a.i iVar = new de.xeqo.a.a.a.a.i();
        if (iVar.a(this.b)) {
            return iVar.getBitmap();
        }

        return null;
    }

    protected final void a(de.xeqo.a.a.c.b bVar) {
        boolean z = false;
        if (bVar != null) {
            try {
                E();
                boolean z2 = g.b.equals(bVar) || g.c.equals(bVar);
                b(z2);
                if (g.b.equals(bVar) || g.d.equals(bVar)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c(z2);
                if (g.b.equals(bVar) || g.c.equals(bVar) || g.d.equals(bVar) || g.e.equals(bVar) || g.a.equals(bVar)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d(z2);
                if (g.c.equals(bVar) || g.d.equals(bVar) || g.e.equals(bVar) || g.a.equals(bVar)) {
                    z = true;
                }
                j(z);
            } finally {
                F();
            }
        }
    }

    public final boolean a(int i, int i2) {
        if (i == 1) {
            return new de.xeqo.a.a.a.a.b(i2).a(this.b);
        }
        return new de.xeqo.a.a.a.a.b(32768 + i2).a(this.b);
    }

    public final boolean k() {
        return new o().a(this.b);
    }

    public final boolean l() {
        return new de.xeqo.a.a.a.a.h().a(this.b);
    }

    public final synchronized void a(boolean z) {
        boolean z2 = false;
        synchronized (this) {
            this.d = z;
            Log.d("CamCap_Lib", "Device is Busy: " + z);
            if (!z) {
                z2 = true;
            }
            k(z2);
            if (this.e) {
                B();
                this.e = false;
            }
        }
    }

    protected boolean m() {
        return false;
    }
}
