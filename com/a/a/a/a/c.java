package com.a.a.a.a;

import com.a.a.am;
import com.a.a.d.a;
import com.a.a.r;
import java.lang.reflect.Field;

final class c extends h {
    private am c = this.d.a(this.e);
    private /* synthetic */ r d;
    private /* synthetic */ a e;
    private /* synthetic */ Field f;
    private /* synthetic */ boolean g;
    private /* synthetic */ an h;

    c(an anVar, String str, boolean z, boolean z2, r rVar, a aVar, Field field, boolean z3) {
        this.h = anVar;
        this.d = rVar;
        this.e = aVar;
        this.f = field;
        this.g = z3;
        super(str, z, z2);
    }

    final void a(com.a.a.c.a aVar, Object obj) {
        new bc(this.d, this.c, this.e.b()).a(aVar, this.f.get(obj));
    }
}
