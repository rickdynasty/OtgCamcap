package com.a.a.a.a;

import com.a.a.am;
import com.a.a.d.a;
import com.a.a.l;
import com.a.a.r;

final class w implements l {
    private /* synthetic */ Class a;
    private /* synthetic */ am b;

    w(Class cls, am amVar) {
        this.a = cls;
        this.b = amVar;
    }

    public final am a(r rVar, a aVar) {
        return this.a.isAssignableFrom(aVar.a()) ? this.b : null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
}
