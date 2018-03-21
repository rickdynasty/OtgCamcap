package com.a.a.a.a;

import com.a.a.a.b;
import com.a.a.al;
import com.a.a.am;
import com.a.a.d.a;
import com.a.a.l;
import com.a.a.p;
import com.a.a.r;
import java.lang.reflect.Type;
import java.util.Map;

public final class at implements l {
    private final com.a.a.a.l a;
    private final boolean b;

    public at(com.a.a.a.l lVar, boolean z) {
        this.a = lVar;
        this.b = z;
    }

    public final am a(r rVar, a aVar) {
        Type b = aVar.b();
        if (!Map.class.isAssignableFrom(aVar.a())) {
            return null;
        }
        Type[] b2 = b.b(b, b.b(b));
        b = b2[0];
        am a = (b == Boolean.TYPE || b == Boolean.class) ? aj.c : rVar.a(a.a(b));
        return new b(this, rVar, b2[0], a, b2[1], rVar.a(a.a(b2[1])), this.a.a(aVar));
    }

    private static al b(am amVar, Object obj) {
        try {
            com.a.a.c.a apVar = new ap();
            apVar.a(true);
            amVar.a(apVar, obj);
            return apVar.i();
        } catch (Throwable e) {
            throw new p(e);
        }
    }
}
