package de.xeqo.a.a.d.a;

import de.xeqo.a.a.d.a;
import de.xeqo.a.a.d.c;
import de.xeqo.a.a.r;
import java.nio.ByteBuffer;

public final class t extends a {
    private final boolean a;

    private t(boolean z) {
        this.a = z;
    }

    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 4) {
            return null;
        }
        return new t(byteBuffer.getInt() != 0);
    }

    public final boolean a(r rVar) {
        if (!(rVar instanceof de.xeqo.a.a.b.a)) {
            return false;
        }
        ((de.xeqo.a.a.b.a) rVar).a(this.a);
        return true;
    }
}
