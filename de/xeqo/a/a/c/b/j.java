package de.xeqo.a.a.c.b;

import java.nio.ByteBuffer;

public class j extends f {
    private byte a;

    protected j(byte b, String str) {
        super(str);
        this.a = b;
    }

    protected final byte b() {
        return this.a;
    }

    protected final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a & 255);
    }

    public final int hashCode() {
        return this.a + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        if (this.a != ((j) obj).a) {
            return false;
        }
        return true;
    }
}
