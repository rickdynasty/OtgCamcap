package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.ae;
import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class e extends x implements ae {
    private int a;
    private int b;

    private e(int i, int i2, String str) {
        super(str);
        this.a = i;
        this.b = i2;
    }

    public static e a(int i) {
        String str;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.rewind();
        char c = allocate.getChar();
        char c2 = allocate.getChar();
        if (c == '￿' && c2 == '￾') {
            str = "250X";
        } else if (c == '￿' && c2 == '￿') {
            str = "bulb";
        } else if (c2 / c > 0) {
            r0 = c2 / c;
            r4 = c2 % c;
            str = r4 > 0 ? new StringBuilder(String.valueOf(r0)).append(".").append(r4).toString() : String.valueOf(r0);
        } else {
            r0 = c / c2;
            r4 = c % c2;
            str = r4 > 0 ? new StringBuilder(String.valueOf(r0)).append(".").append(r4).append("''").toString() : String.valueOf(r0) + "''";
        }
        return new e(c, c2, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b == eVar.b && this.a == eVar.a) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putChar((char) this.b);
        allocate.putChar((char) this.a);
        return allocate;
    }
}
