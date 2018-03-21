package de.xeqo.a.a.d.a;

import de.xeqo.a.a.b.a;
import de.xeqo.a.a.c.b.i;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class c extends a {
    private final List a;

    private c(List list) {
        this.a = list;
    }

    public static de.xeqo.a.a.d.c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 8) {
            return null;
        }
        byteBuffer.getInt();
        int i = byteBuffer.getInt();
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            i a = i.a((byte) byteBuffer.getInt());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            return new c(arrayList);
        }
        return null;
    }

    public final boolean a(r rVar) {
        if (rVar instanceof a) {
            ((a) rVar).g(this.a);
        }
        return false;
    }
}
