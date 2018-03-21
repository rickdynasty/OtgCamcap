package de.xeqo.a.a.a.a;

import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends x {
    private int a;

    public b(int i) {
        this.a = i;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('酕', i, this.a));
    }
}
