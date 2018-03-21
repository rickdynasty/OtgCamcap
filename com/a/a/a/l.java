package com.a.a.a;

import com.a.a.d.a;
import com.a.a.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;

public final class l {
    private final Map a;

    public l(Map map) {
        this.a = map;
    }

    public l() {
        this(Collections.emptyMap());
    }

    public final m a(a aVar) {
        Type b = aVar.b();
        Class a = aVar.a();
        z zVar = (z) this.a.get(b);
        if (zVar != null) {
            return new u(this, zVar, b);
        }
        m a2 = a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = Collection.class.isAssignableFrom(a) ? SortedSet.class.isAssignableFrom(a) ? new t(this) : Set.class.isAssignableFrom(a) ? new q(this) : Queue.class.isAssignableFrom(a) ? new r(this) : new o(this) : Map.class.isAssignableFrom(a) ? new p(this) : null;
        if (a2 == null) {
            return new n(this, a, b);
        }
        return a2;
    }

    private m a(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new s(this, declaredConstructor);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
