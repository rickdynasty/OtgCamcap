package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import com.a.a.r;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class bc extends am {
    private final r a;
    private final am b;
    private final Type c;

    bc(r rVar, am amVar, Type type) {
        this.a = rVar;
        this.b = amVar;
        this.c = type;
    }

    public final void a(a aVar, Object obj) {
        am a;
        am amVar = this.b;
        Type type = this.c;
        if (obj != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = obj.getClass();
        }
        if (type != this.c) {
            a = this.a.a(com.a.a.d.a.a(type));
            if ((a instanceof d) && !(this.b instanceof d)) {
                a = this.b;
            }
        } else {
            a = amVar;
        }
        a.a(aVar, obj);
    }
}
