package de.xeqo.a.a.d.a;

import de.xeqo.a.a.c.b.d;
import de.xeqo.a.a.d.c;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class e extends a {
    private final List a;

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 8) {
            return null;
        }
        byteBuffer.getInt();
        int i = byteBuffer.getInt();
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            d a = d.a((byte) byteBuffer.getInt());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            return new e(arrayList);
        }
        return null;
    }

    private e(List list) {
        this.a = list;
    }

    public final boolean a(r rVar) {
        rVar.j(this.a);
        return false;
    }
}
