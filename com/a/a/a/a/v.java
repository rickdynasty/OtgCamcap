package com.a.a.a.a;

import com.a.a.am;
import com.a.a.d.a;
import com.a.a.l;
import com.a.a.r;

final class v implements l {
    private /* synthetic */ Class a;
    private /* synthetic */ Class b;
    private /* synthetic */ am c;

    v(Class cls, Class cls2, am amVar) {
        this.a = cls;
        this.b = cls2;
        this.c = amVar;
    }

    public final am a(r rVar, a aVar) {
        Class a = aVar.a();
        return (a == this.a || a == this.b) ? this.c : null;
    }

    public final String toString() {
        return "Factory[type=" + this.a.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
    }
}
