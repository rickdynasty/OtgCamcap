package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.w;
import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class c extends x implements w {
    private short a;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w wVar = (w) obj;
        if (!(wVar instanceof c)) {
            return -1;
        }
        return this.a - ((c) wVar).a;
    }

    public c(short s) {
        super(new StringBuilder(String.valueOf(((double) Math.round(((double) s) / 100.0d)) / 10.0d)).append(" EV").toString());
        this.a = s;
    }

    public final short b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.a == ((c) obj).a) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort(this.a);
        return allocate;
    }
}
