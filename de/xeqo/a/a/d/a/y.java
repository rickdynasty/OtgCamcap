package de.xeqo.a.a.d.a;

import de.xeqo.a.a.b.a;
import de.xeqo.a.a.c.b.b;
import de.xeqo.a.a.d.c;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class y extends a {
    private final List a;

    private y(List list) {
        this.a = list;
    }

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 8) {
            return null;
        }
        byteBuffer.getInt();
        int i = byteBuffer.getInt();
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            b a = b.a((byte) byteBuffer.getInt());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            return new y(arrayList);
        }
        return null;
    }

    public final boolean a(r rVar) {
        if (!(rVar instanceof a)) {
            return false;
        }
        ((a) rVar).d(this.a);
        return true;
    }
}
