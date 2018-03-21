package com.a.a;

import com.a.a.c.a;

final class i extends am {
    private /* synthetic */ r a;

    i(r rVar) {
        this.a = rVar;
    }

    public final /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            aVar.h();
            return;
        }
        r.a(number.doubleValue());
        aVar.a(number);
    }
}
