package de.xeqo.a.a.d.a;

import de.xeqo.a.a.b.a;
import de.xeqo.a.a.d.c;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;

public final class w extends c {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final String f;

    private w(int i, int i2, int i3, int i4, int i5, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = str;
    }

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 32) {
            return null;
        }
        int i = byteBuffer.getInt();
        int i2 = byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.getInt();
        return new w(i, i2, i3, i4, i5, f.b(byteBuffer));
    }

    public final boolean a(r rVar) {
        if (rVar instanceof a) {
            ((a) rVar).a(this.a, this.d, this.c, this.f);
        }
        return false;
    }
}
