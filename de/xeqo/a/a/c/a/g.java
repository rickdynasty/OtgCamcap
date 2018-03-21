package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.r;
import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;

public final class g extends x implements r {
    private byte a;
    private final int b;

    public g(byte b, String str, int i) {
        super(str);
        this.a = b;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.a == ((g) obj).a) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put(this.a);
        return allocate;
    }

    public final int a() {
        return this.b;
    }
}
