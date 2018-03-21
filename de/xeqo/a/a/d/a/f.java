package de.xeqo.a.a.d.a;

import de.xeqo.a.a.d.a;
import de.xeqo.a.a.d.c;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;

public final class f extends a {
    private final int a;
    private final int b;
    private final String c;
    private final int d;

    private f(int i, int i2, int i3, String str) {
        this.a = i;
        this.d = i2;
        this.b = i3;
        this.c = str;
    }

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 20) {
            return null;
        }
        int i = byteBuffer.getInt();
        int i2 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        byteBuffer.getInt();
        return new f(i, i3, i2, b(byteBuffer));
    }

    public static String b(ByteBuffer byteBuffer) {
        String str = "";
        if (byteBuffer.remaining() <= 0) {
            return str;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        int i = 0;
        int i2 = 0;
        while (i2 == 0 && byteBuffer.remaining() > 0) {
            byte b = byteBuffer.get();
            allocate.put(b);
            if (b == (byte) 0) {
                i2 = 1;
            } else {
                i++;
            }
        }
        return new String(allocate.array(), 0, i);
    }

    public final boolean a(r rVar) {
        if (rVar == null || !(rVar instanceof de.xeqo.a.a.b.a)) {
            return false;
        }
        ((de.xeqo.a.a.b.a) rVar).a(this.a, this.d, this.b, this.c);
        return true;
    }
}
