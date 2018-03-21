package com.a.a.a.a;

import com.a.a.a.m;
import com.a.a.am;
import com.a.a.c.a;
import java.util.Map;

public final class d extends am {
    private final m a;
    private final Map b;
    private /* synthetic */ an c;

    private d(an anVar, m mVar, Map map, byte b) {
        this.c = anVar;
        this.a = mVar;
        this.b = map;
    }

    public final void a(a aVar, Object obj) {
        if (obj == null) {
            aVar.h();
            return;
        }
        aVar.f();
        try {
            for (h hVar : this.b.values()) {
                if (hVar.b) {
                    aVar.b(hVar.a);
                    hVar.a(aVar, obj);
                }
            }
            aVar.g();
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        }
    }
}
