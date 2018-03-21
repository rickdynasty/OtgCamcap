package de.xeqo.a.a.a.a;

import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends x {
    private final char a;
    private final int b;

    private j(char c, int i) {
        this.a = c;
        this.b = i;
    }

    public static x a(int i) {
        return new j('鄗', i);
    }

    public static x b(int i) {
        return new j('鄘', i);
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u(this.a, i, this.b));
    }
}
