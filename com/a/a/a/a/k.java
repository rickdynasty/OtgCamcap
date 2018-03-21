package com.a.a.a.a;

import com.a.a.a.b;
import com.a.a.am;
import com.a.a.d.a;
import com.a.a.l;
import com.a.a.r;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class k implements l {
    k() {
    }

    public final am a(r rVar, a aVar) {
        Type b = aVar.b();
        if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
            return null;
        }
        b = b.d(b);
        return new e(rVar, rVar.a(a.a(b)), b.b(b));
    }
}
