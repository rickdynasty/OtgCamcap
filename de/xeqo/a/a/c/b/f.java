package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class f extends x {
    protected abstract void a(ByteBuffer byteBuffer);

    protected f(String str) {
        super(str);
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        a(allocate);
        allocate.rewind();
        return allocate;
    }
}
