package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import com.a.a.l;
import com.a.a.r;
import java.lang.reflect.Array;

public final class e extends am {
    public static final l a = new k();
    private final Class b;
    private final am c;

    public e(r rVar, am amVar, Class cls) {
        this.c = new bc(rVar, amVar, cls);
        this.b = cls;
    }

    public final void a(a aVar, Object obj) {
        if (obj == null) {
            aVar.h();
            return;
        }
        aVar.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(aVar, Array.get(obj, i));
        }
        aVar.e();
    }
}
