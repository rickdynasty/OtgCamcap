package com.a.a;

import com.a.a.a.i;
import com.a.a.d.a;

final class aa implements l {
    private final a a;
    private final boolean b;
    private final Class c;
    private final x d;
    private final u e;

    private aa(Object obj, a aVar, boolean z, byte b) {
        this.d = obj instanceof x ? (x) obj : null;
        if (obj instanceof u) {
            obj = (u) obj;
        } else {
            obj = null;
        }
        this.e = obj;
        boolean z2 = (this.d == null && this.e == null) ? false : true;
        i.a(z2);
        this.a = aVar;
        this.b = z;
        this.c = null;
    }

    public final am a(r rVar, a aVar) {
        boolean isAssignableFrom = this.a != null ? this.a.equals(aVar) || (this.b && this.a.b() == aVar.a()) : this.c.isAssignableFrom(aVar.a());
        return isAssignableFrom ? new k(this.d, this.e, rVar, aVar, this) : null;
    }
}
