package de.xeqo.a.a.a.a;

import de.xeqo.a.a.af;
import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.d.a;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends af {
    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('鄖', i));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.b(h.a) || !ahVar.a()) {
            return false;
        }
        ByteBuffer b = ahVar.b();
        if (b != null) {
            while (true) {
                de.xeqo.a.a.d.c a = a.a(b);
                if (a == null) {
                    break;
                }
                a(a);
            }
        }
        return true;
    }
}
