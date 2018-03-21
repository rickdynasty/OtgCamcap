package de.xeqo.a.a;

import android.hardware.usb.UsbDevice;
import de.xeqo.a.a.a.i;
import de.xeqo.a.a.c.aa;
import de.xeqo.a.a.c.ab;
import de.xeqo.a.a.c.ac;
import de.xeqo.a.a.c.ad;
import de.xeqo.a.a.c.ae;
import de.xeqo.a.a.c.b;
import de.xeqo.a.a.c.c;
import de.xeqo.a.a.c.e;
import de.xeqo.a.a.c.f;
import de.xeqo.a.a.c.h;
import de.xeqo.a.a.c.j;
import de.xeqo.a.a.c.m;
import de.xeqo.a.a.c.n;
import de.xeqo.a.a.c.p;
import de.xeqo.a.a.c.q;
import de.xeqo.a.a.c.s;
import de.xeqo.a.a.c.u;
import de.xeqo.a.a.c.v;
import de.xeqo.a.a.c.w;
import de.xeqo.a.a.c.y;
import de.xeqo.a.a.g.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class r implements i, p {
    private static /* synthetic */ boolean x = (!r.class.desiredAssertionStatus());
    private final ac a;
    protected final w b;
    private ae c;
    private final e d = new e(this);
    private Thread e;
    private final Thread f;
    private boolean g = false;
    private final Map h = new HashMap();
    private final h i;
    private final v j;
    private final p k;
    private final ab l;
    private final f m;
    private final q n;
    private final ac o;
    private final m p;
    private final aa q;
    private final c r;
    private final s s;
    private final List t = new ArrayList();
    private s u;
    private s v;
    private int w = 0;

    protected abstract boolean b();

    protected abstract void c();

    protected abstract void e();

    public r(w wVar, ac acVar) {
        if (!x && wVar == null) {
            throw new AssertionError();
        } else if (x || acVar != null) {
            this.b = wVar;
            this.a = acVar;
            this.b.a((p) this);
            this.f = new Thread(this.d);
            this.i = (h) a(new h());
            this.j = (v) a(new v());
            this.k = (p) a(new p());
            this.l = (ab) a(new ab());
            this.m = (f) a(new f());
            this.n = (q) a(new q());
            this.o = (ac) a(new ac());
            this.p = (m) a(new m());
            this.q = (aa) a(new aa());
            this.r = (c) a(new c());
            this.s = (s) a(new s());
        } else {
            throw new AssertionError();
        }
    }

    public final UsbDevice p() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    public final boolean n() {
        if (this.b.d() || !this.b.c()) {
            return false;
        }
        boolean b = b();
        if (!b) {
            return b;
        }
        if (!this.g) {
            try {
                this.g = true;
                e();
            } finally {
                this.g = false;
            }
        }
        if (!x && this.c != null) {
            throw new AssertionError();
        } else if (x || this.e == null) {
            if (this.c == null && this.e == null && d() != null) {
                this.c = new ae(this, this);
                this.e = new Thread(this.c);
                this.e.start();
            }
            this.f.start();
            a(s.Tablet);
            return b;
        } else {
            throw new AssertionError();
        }
    }

    public final boolean o() {
        if (!this.b.d()) {
            return false;
        }
        if (!x && this.c == null) {
            throw new AssertionError();
        } else if (x || this.e != null) {
            if (!(this.c == null || this.e == null)) {
                this.c.a();
                try {
                    this.e.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.c = null;
                this.e = null;
            }
            this.f.interrupt();
            c();
            return true;
        } else {
            throw new AssertionError();
        }
    }

    protected af d() {
        return null;
    }

    public final void a(a aVar) {
        if (!this.t.contains(aVar)) {
            this.t.add(aVar);
        }
    }

    private synchronized void b(c cVar) {
        if (cVar != null) {
            for (a a : this.t) {
                a.a(cVar);
            }
        }
    }

    protected final synchronized void B() {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public e q() {
        i iVar = new i();
        if (iVar.a(this.b)) {
            return iVar.b();
        }
        return null;
    }

    public final l r() {
        return this.i;
    }

    public final l s() {
        return this.j;
    }

    public final l t() {
        return this.k;
    }

    public final l u() {
        return this.l;
    }

    public final l v() {
        return this.o;
    }

    public final l w() {
        return this.m;
    }

    public final l x() {
        return this.n;
    }

    public final l y() {
        return this.q;
    }

    public final void b(n nVar) {
        try {
            E();
            if (this.i.a(nVar, false)) {
                this.i.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void a(List list) {
        try {
            E();
            this.i.a(list);
        } finally {
            F();
        }
    }

    protected final void b(boolean z) {
        try {
            E();
            this.i.a(z);
        } finally {
            F();
        }
    }

    public final void b(ae aeVar) {
        try {
            E();
            if (this.j.a(aeVar, false)) {
                this.j.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void b(List list) {
        try {
            E();
            this.j.a(list);
        } finally {
            F();
        }
    }

    protected final void c(boolean z) {
        try {
            E();
            this.j.a(z);
        } finally {
            F();
        }
    }

    public final void b(de.xeqo.a.a.c.i iVar) {
        try {
            E();
            if (this.k.a(iVar, false)) {
                this.k.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void c(List list) {
        try {
            E();
            this.k.a(list);
        } finally {
            F();
        }
    }

    protected final void d(boolean z) {
        try {
            E();
            this.k.a(z);
        } finally {
            F();
        }
    }

    public final l z() {
        return this.r;
    }

    public final void b(y yVar) {
        try {
            E();
            if (this.r.a(yVar, false)) {
                this.r.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void d(List list) {
        try {
            E();
            this.r.a(list);
        } finally {
            F();
        }
    }

    protected final void e(boolean z) {
        try {
            E();
            this.r.a(z);
        } finally {
            F();
        }
    }

    public final l A() {
        return this.s;
    }

    public final void b(de.xeqo.a.a.c.r rVar) {
        try {
            E();
            if (this.s.a(rVar, false)) {
                this.s.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void e(List list) {
        try {
            E();
            this.s.a(list);
        } finally {
            F();
        }
    }

    protected final void f(boolean z) {
        try {
            E();
            this.s.a(z);
        } finally {
            F();
        }
    }

    public final void b(ad adVar) {
        try {
            E();
            if (this.o.a(adVar, false)) {
                this.o.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void f(List list) {
        try {
            E();
            this.o.a(list);
        } finally {
            F();
        }
    }

    public final void b(de.xeqo.a.a.c.a aVar) {
        a(aVar, false);
    }

    public final void a(de.xeqo.a.a.c.a aVar, boolean z) {
        try {
            E();
            if (this.m.a(aVar, z)) {
                this.m.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void b(j jVar) {
        try {
            E();
            this.n.a(jVar, false);
        } finally {
            F();
        }
    }

    public final void g(List list) {
        try {
            E();
            this.m.a(list);
        } finally {
            F();
        }
    }

    protected final void g(boolean z) {
        try {
            E();
            this.m.a(z);
        } finally {
            F();
        }
    }

    public final void h(List list) {
        try {
            E();
            this.n.a(list);
        } finally {
            F();
        }
    }

    protected final void h(boolean z) {
        try {
            E();
            this.n.a(z);
        } finally {
            F();
        }
    }

    protected final void i(List list) {
        try {
            E();
            this.o.a(list);
        } finally {
            F();
        }
    }

    protected final void i(boolean z) {
        try {
            E();
            this.o.a(z);
        } finally {
            F();
        }
    }

    public final void a(u uVar) {
        try {
            E();
            if (this.p.a(uVar, false)) {
                this.p.c();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void b(w wVar) {
        try {
            E();
            if (this.l.a(wVar, false)) {
                this.l.d();
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void j(List list) {
        try {
            E();
            this.l.a(list);
        } finally {
            F();
        }
    }

    protected final void j(boolean z) {
        try {
            E();
            this.l.a(z);
        } finally {
            F();
        }
    }

    public final void b(b bVar) {
        try {
            E();
            if (this.q.a(bVar, false)) {
                a((b) this.q.c());
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void a(ArrayList arrayList) {
        try {
            E();
            this.q.a((List) arrayList);
        } finally {
            F();
        }
    }

    protected final void k(boolean z) {
        try {
            E();
            for (Entry value : this.h.entrySet()) {
                ((o) value.getValue()).a(z);
            }
            if (z) {
                a((b) this.q.c());
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final s C() {
        return this.u;
    }

    public final void a(s sVar) {
        if (sVar != this.u) {
            this.u = sVar;
        }
    }

    public final s D() {
        return this.v;
    }

    public final void b(s sVar) {
        if (sVar != this.v) {
            this.v = sVar;
        }
    }

    protected final void a(c cVar) {
        if (cVar != null) {
            b(cVar);
            e eVar = this.d;
            if (cVar != null && !eVar.a) {
                try {
                    eVar.b.put(cVar);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    protected void a(b bVar) {
    }

    public boolean a(PtpUsbConnection.c cVar) {
        return false;
    }

    public final void k(List list) {
        try {
            E();
            if (list != null) {
                for (PtpUsbConnection.c cVar : list) {
                    if (cVar != null) {
                        cVar.a(this);
                    }
                }
            }
            F();
        } catch (Throwable th) {
            F();
        }
    }

    public final void E() {
        this.w++;
    }

    public final void F() {
        this.w--;
        if (this.w == 0) {
            Map hashMap = new HashMap();
            for (Entry value : this.h.entrySet()) {
                ((o) value.getValue()).a(hashMap);
            }
            a(hashMap);
        }
    }

    private void a(Map map) {
        for (a a : this.t) {
            a.a(map);
        }
    }

    private l a(l lVar) {
        boolean z = false;
        t.a(lVar != null, "'property' darf nicht 'null' sein!");
        t.a(lVar instanceof o, "'property' muss 'IPropertyStatusManipulator' implementieren!");
        if (!this.h.containsKey(lVar.a())) {
            z = true;
        }
        t.a(z, "PropertyType bereits registriert");
        if (lVar instanceof o) {
            this.h.put(lVar.a(), (o) lVar);
        }
        return lVar;
    }
}
