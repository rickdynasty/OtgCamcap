package de.xeqo.a.a.a;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends x {
    private char a;
    private ByteBuffer b;

    public c(char c) {
        this.a = c;
    }

    public final ByteBuffer b() {
        return this.b;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('ပ', i, this.a));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.f() || ahVar.g() != h.a || !ahVar.h() || !ahVar.a()) {
            return false;
        }
        this.b = ahVar.b();
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
