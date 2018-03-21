package de.xeqo.a.a.a;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends x {
    private boolean a;

    public final boolean b() {
        return this.a;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        this.a = false;
        atomicReference.set(new u('ဂ', 0, 1));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.b(h.a) && !ahVar.b(h.b)) {
            return false;
        }
        this.a = true;
        return true;
    }
}
