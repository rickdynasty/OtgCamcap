package com.a.a.a;

import com.a.a.am;
import com.a.a.d.a;
import com.a.a.r;

final class g extends am {
    private am a;
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean c;
    private /* synthetic */ r d;
    private /* synthetic */ a e;
    private /* synthetic */ a f;

    g(a aVar, boolean z, boolean z2, r rVar, a aVar2) {
        this.f = aVar;
        this.b = z;
        this.c = z2;
        this.d = rVar;
        this.e = aVar2;
    }

    public final void a(com.a.a.c.a aVar, Object obj) {
        if (this.c) {
            aVar.h();
            return;
        }
        am amVar = this.a;
        if (amVar == null) {
            amVar = w.a.a(this.d, this.f, this.e);
            this.a = amVar;
        }
        amVar.a(aVar, obj);
    }
}
