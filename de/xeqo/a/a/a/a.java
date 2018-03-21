package de.xeqo.a.a.a;

import de.xeqo.a.a.c.af;
import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends x {
    private int a;
    private af b;

    public a(int i) {
        this.a = i;
    }

    public final af a() {
        return this.b;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('ဈ', i, this.a));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.f() || ahVar.g() != h.a || !ahVar.a()) {
            return false;
        }
        this.b = af.a(ahVar.b());
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
