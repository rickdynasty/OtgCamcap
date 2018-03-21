package com.a.a.a.a;

import com.a.a.a.m;
import com.a.a.am;
import com.a.a.c.a;
import com.a.a.r;
import java.lang.reflect.Type;
import java.util.Collection;

final class ar extends am {
    private final am a;
    private final m b;
    private /* synthetic */ am c;

    public final /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            aVar.h();
            return;
        }
        aVar.d();
        for (Object a : collection) {
            this.a.a(aVar, a);
        }
        aVar.e();
    }

    public ar(am amVar, r rVar, Type type, am amVar2, m mVar) {
        this.c = amVar;
        this.a = new bc(rVar, amVar2, type);
        this.b = mVar;
    }
}
