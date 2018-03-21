package de.xeqo.a.a.a;

import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends x {
    private int a;
    private final ByteBuffer b;

    public h(char c, ByteBuffer byteBuffer) {
        this.a = c;
        this.b = byteBuffer;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('ဖ', i, this.a));
        list.add(new u('\u0002', 'ဖ', i, this.b));
    }
}
