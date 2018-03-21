package de.xeqo.a.a.d.a;

import de.xeqo.a.a.c.b.a;
import de.xeqo.a.a.d.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class r extends a {
    private final List a;

    private r(List list) {
        this.a = list;
    }

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 4) {
            return null;
        }
        byteBuffer.getInt();
        int i = byteBuffer.getInt();
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            a a = a.a(byteBuffer);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            return new r(arrayList);
        }
        return null;
    }

    public final boolean a(de.xeqo.a.a.r rVar) {
        if (this.a != null) {
            rVar.e(this.a);
        }
        return true;
    }
}
