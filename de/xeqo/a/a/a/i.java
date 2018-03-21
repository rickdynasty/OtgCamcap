package de.xeqo.a.a.a;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.c.e;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends x {
    private e a;

    public final e b() {
        return this.a;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('ခ', i));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.f() || ahVar.g() != h.a || !ahVar.h() || !ahVar.a()) {
            return false;
        }
        this.a = e.a(ahVar.b());
        if (this.a != null) {
            return true;
        }
        return false;
    }
}
