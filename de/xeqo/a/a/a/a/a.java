package de.xeqo.a.a.a.a;

import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends x {
    private final char a;
    private final int b;

    private a(char c, int i) {
        this.a = c;
        this.b = i;
    }

    public static x a() {
        return new a('鄨', 1);
    }

    public static x b() {
        return new a('鄨', 2);
    }

    public static x c() {
        return new a('鄩', 2);
    }

    public static x d() {
        return new a('鄩', 1);
    }

    protected final int e() {
        return 0;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u(this.a, i, this.b));
    }
}
