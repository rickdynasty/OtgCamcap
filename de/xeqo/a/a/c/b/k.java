package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.j;
import java.nio.ByteBuffer;

public final class k extends f implements j {
    private char a;

    private k(char c) {
        super(String.valueOf(c) + "K");
        this.a = c;
    }

    protected final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a & 65535);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.a == ((k) obj).a) {
            return true;
        }
        return false;
    }

    public static k a(char c) {
        return new k(c);
    }
}
