package de.xeqo.a.a.a.a;

import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class n extends x {
    private ByteBuffer a;

    public n(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('鄐', i));
        list.add(new u('\u0002', '鄐', i, this.a));
    }
}
