package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.n;
import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b extends x implements n {
    private char a;

    public static b a(char c) {
        return new b("F " + (((double) c) / 100.0d), c);
    }

    private b(String str, char c) {
        super(str);
        this.a = c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.a == ((b) obj).a) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putChar(this.a);
        return allocate;
    }
}
