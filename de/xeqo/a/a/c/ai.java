package de.xeqo.a.a.c;

import de.xeqo.a.a.k;
import de.xeqo.a.a.l;
import de.xeqo.a.a.o;
import de.xeqo.a.a.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class ai implements l, o {
    private final k a;
    private ag b;
    private List c = new ArrayList();
    private boolean d = true;
    private v e = new v();
    private Object f = new Object();

    protected ai(k kVar) {
        this.a = kVar;
    }

    public final k a() {
        return this.a;
    }

    public final ag c() {
        ag agVar;
        synchronized (this.f) {
            agVar = this.b;
        }
        return agVar;
    }

    public final boolean a(ag agVar, boolean z) {
        boolean z2 = false;
        synchronized (this.f) {
            if (agVar != null) {
                if (!agVar.equals(this.b) || z) {
                    this.b = agVar;
                    g().a = true;
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final List d() {
        List list;
        synchronized (this.f) {
            list = this.c;
        }
        return list;
    }

    public void a(List list) {
        synchronized (this.f) {
            if (this.c != null) {
                this.c = list;
                g().b = true;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f) {
            z = this.d;
        }
        return z;
    }

    public final void a(boolean z) {
        synchronized (this.f) {
            if (this.d != z) {
                this.d = z;
                g().c = true;
            }
        }
    }

    public final void a(Map map) {
        synchronized (this.f) {
            if (map != null) {
                if (this.e != null) {
                    map.put(this.a, this.e);
                    this.e = null;
                }
            }
        }
    }

    private v g() {
        if (this.e == null) {
            this.e = new v();
        }
        return this.e;
    }

    protected final void e() {
        synchronized (this.f) {
            if (this.c != null && this.c.size() > 2) {
                int nextInt;
                Random random = new Random();
                int nextInt2 = random.nextInt(this.c.size());
                do {
                    nextInt = random.nextInt(this.c.size());
                } while (nextInt == nextInt2);
                ((ag) this.c.get(nextInt2)).e();
                ((ag) this.c.get(nextInt)).e();
            }
        }
    }

    protected final void f() {
        synchronized (this.f) {
            if (this.c != null && this.c.size() > 0) {
                for (ag e : this.c) {
                    e.e();
                }
            }
        }
    }
}
