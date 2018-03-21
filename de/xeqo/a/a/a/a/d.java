package de.xeqo.a.a.a.a;

import de.xeqo.a.a.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class d extends n {
    public static x a(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53680);
        allocate.putInt(i);
        return new n(allocate);
    }
}
