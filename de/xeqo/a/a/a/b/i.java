package de.xeqo.a.a.a.b;

import de.xeqo.a.a.af;
import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.d.b;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends af {
    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('郇', i));
    }

    protected final boolean a(ah ahVar) {
        char c = '\u0000';
        if (!ahVar.b(h.a) || !ahVar.a()) {
            return false;
        }
        ByteBuffer b = ahVar.b();
        if (b.remaining() < 2) {
            return false;
        }
        char c2 = b.getChar();
        while (c < c2) {
            a(new b(b.getChar(), b.getInt()));
            c++;
        }
        return true;
    }
}
