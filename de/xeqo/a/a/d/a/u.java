package de.xeqo.a.a.d.a;

import de.xeqo.a.a.b.a;
import de.xeqo.a.a.c.b.h;
import de.xeqo.a.a.d.c;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class u extends a {
    private final ArrayList a;

    private u(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 8) {
            return null;
        }
        byteBuffer.getInt();
        int i = byteBuffer.getInt();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            h a = h.a((byte) byteBuffer.getInt());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            return new u(arrayList);
        }
        return null;
    }

    public final boolean a(r rVar) {
        if (rVar instanceof a) {
            ((a) rVar).f(this.a);
        }
        return false;
    }
}
