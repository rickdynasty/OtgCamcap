package de.xeqo.a.a.b;

import de.xeqo.a.a.a.a.d;
import de.xeqo.a.a.a.a.f;
import de.xeqo.a.a.a.a.n;
import de.xeqo.a.a.CameraStruc;
import de.xeqo.a.a.b;
import de.xeqo.a.a.UsbService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class p extends a {
    public p(UsbService wVar, CameraStruc acVar) {
        super(wVar, acVar);
    }

    public final boolean g() {
        return new f().a(this.b);
    }

    public final boolean h() {
        if (!d.a(2).a(this.b)) {
            return false;
        }
        this.a = true;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(12);
        allocate.putInt(53683);
        allocate.putInt(0);
        new n(allocate).a(this.b);
        return true;
    }

    public static b a() {
        return new aa();
    }
}
