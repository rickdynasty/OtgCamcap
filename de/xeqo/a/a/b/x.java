package de.xeqo.a.a.b;

import de.xeqo.a.a.a.b.a;
import de.xeqo.a.a.a.b.g;
import de.xeqo.a.a.a.h;
import de.xeqo.a.a.CameraStruc;
import de.xeqo.a.a.b;
import de.xeqo.a.a.UsbService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class x extends q {
    public x(UsbService wVar, CameraStruc acVar) {
        super(wVar, acVar);
    }

    public final boolean h() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put((byte) 1);
        if (new h('턋', allocate).a(this.b) && super.h()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put((byte) 0);
        h hVar = new h('턋', allocate);
        if (super.i() && hVar.a(this.b)) {
            return true;
        }
        return false;
    }

    protected int m() {
        return 64;
    }

    protected final boolean k() {
        g gVar = new g();
        de.xeqo.a.a.a.b.h hVar = new de.xeqo.a.a.a.b.h();
        if (!gVar.a(this.b)) {
            return false;
        }
        do {
        } while (!hVar.a(this.b));
        return true;
    }

    public static b a() {
        return new n();
    }

    public final boolean l() {
        super.l();
        return new a().a(this.b);
    }
}
