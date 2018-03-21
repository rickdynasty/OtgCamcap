package de.xeqo.a.a;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class c {
    private final List a = new ArrayList();
    private boolean b;

    public abstract void a();

    public abstract String d();

    public abstract File e();

    public final void a(y yVar) {
        synchronized (this) {
            if (yVar != null) {
                if (!this.a.contains(yVar)) {
                    this.a.add(yVar);
                }
            }
        }
    }

    public final void b(y yVar) {
        synchronized (this) {
            if (yVar != null) {
                if (this.a.contains(yVar)) {
                    this.a.remove(yVar);
                }
            }
        }
    }

    private List g() {
        List arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    protected final void a(double d) {
        for (y a_ : g()) {
            a_.a_(d);
        }
    }

    protected final void b() {
        this.b = true;
        for (y c_ : g()) {
            c_.c_();
        }
    }

    protected final void c() {
        for (y d_ : g()) {
            d_.d_();
        }
    }

    public final boolean f() {
        return this.b;
    }
}
