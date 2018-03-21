package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import com.a.a.l;
import com.a.a.r;

public final class j extends am {
    public static final l a = new m();
    private final r b;

    private j(r rVar, byte b) {
        this.b = rVar;
    }

    public final void a(a aVar, Object obj) {
        if (obj == null) {
            aVar.h();
            return;
        }
        am a = this.b.a(obj.getClass());
        if (a instanceof j) {
            aVar.f();
            aVar.g();
            return;
        }
        a.a(aVar, obj);
    }
}
