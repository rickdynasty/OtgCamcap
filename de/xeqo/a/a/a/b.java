package de.xeqo.a.a.a;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.c.d;
import de.xeqo.a.a.c.o;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.UsbService;
import de.xeqo.a.a.x;
import de.xeqo.a.a.y;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends x {
    private int a;
    private d b;

    public b(int i, OutputStream outputStream, y yVar) {
        this.a = i;
        this.b = new d(outputStream);
        this.b.a(yVar);
    }

    protected final o a_() {
        return this.b;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('ဉ', i, this.a));
    }

    public final boolean a(UsbService wVar) {
        return super.a(wVar);
    }

    protected final boolean a(ah ahVar) {
        this.b.d();
        return ahVar.b(h.a) && ahVar.c();
    }
}
