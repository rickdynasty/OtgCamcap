package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.i;
import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class a extends x implements i {
    private final char a;
    private final boolean b;

    public static a a(char c) {
        return new a(a(c, false), c, false);
    }

    public static a b() {
        return new a(a('\u0000', true), '\u0000', true);
    }

    private a(String str, char c, boolean z) {
        super(str);
        this.a = c;
        this.b = z;
    }

    private static String a(char c, boolean z) {
        if (z) {
            return "Auto";
        }
        if (c == 'ὀ') {
            return "H 0.3";
        }
        if (c == '✐') {
            return "H 0.7";
        }
        if (c == '㈀') {
            return "H 1.0";
        }
        if (c == '搀') {
            return "H 2.0";
        }
        return String.valueOf(c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b) {
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

    public final boolean c() {
        return this.b;
    }
}
