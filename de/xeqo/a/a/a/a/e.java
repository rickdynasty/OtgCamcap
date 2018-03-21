package de.xeqo.a.a.a.a;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class e extends x {
    private final int a;
    private final int b;
    private final int c;
    private ByteBuffer d;

    public e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('ရ', i, this.a, this.b, this.c));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.b(h.a) || !ahVar.a()) {
            return false;
        }
        this.d = ahVar.b();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b() {
        return this.d;
    }
}
