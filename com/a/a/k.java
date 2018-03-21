package com.a.a;

import com.a.a.a.f;
import com.a.a.a.w;
import com.a.a.d.a;

final class k extends am {
    private final x a;
    private final u b;
    private final r c;
    private final a d;
    private final l e;
    private am f;

    private k(x xVar, u uVar, r rVar, a aVar, l lVar, byte b) {
        this.a = xVar;
        this.b = uVar;
        this.c = rVar;
        this.d = aVar;
        this.e = lVar;
    }

    public final void a(com.a.a.c.a aVar, Object obj) {
        if (this.a == null) {
            am amVar = this.f;
            if (amVar == null) {
                amVar = w.a.a(this.c, this.e, this.d);
                this.f = amVar;
            }
            amVar.a(aVar, obj);
        } else if (obj == null) {
            aVar.h();
        } else {
            f.a(this.a.a(obj), aVar);
        }
    }

    public static l a(a aVar, Object obj) {
        return new aa(obj, aVar, false);
    }
}
