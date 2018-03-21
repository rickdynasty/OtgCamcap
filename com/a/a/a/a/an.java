package com.a.a.a.a;

import com.a.a.a.a;
import com.a.a.a.b;
import com.a.a.a.h;
import com.a.a.am;
import com.a.a.l;
import com.a.a.r;
import com.a.a.w;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public final class an implements l {
    private final com.a.a.a.l a;
    private final w b;
    private final a c;

    public an(com.a.a.a.l lVar, w wVar, a aVar) {
        this.a = lVar;
        this.b = wVar;
        this.c = aVar;
    }

    private boolean a(Field field, boolean z) {
        return (this.c.a(field.getType(), z) || this.c.a(field, z)) ? false : true;
    }

    public final am a(r rVar, com.a.a.d.a aVar) {
        Class a = aVar.a();
        if (Object.class.isAssignableFrom(a)) {
            return new d(this, this.a.a(aVar), a(rVar, aVar, a));
        }
        return null;
    }

    private Map a(r rVar, com.a.a.d.a aVar, Class cls) {
        Map linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.b();
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean a = a(field, true);
                boolean a2 = a(field, false);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = b.a(aVar.b(), cls, field.getGenericType());
                    com.a.a.b.b bVar = (com.a.a.b.b) field.getAnnotation(com.a.a.b.b.class);
                    String a4 = bVar == null ? this.b.a(field) : bVar.a();
                    com.a.a.d.a a5 = com.a.a.d.a.a(a3);
                    h cVar = new c(this, a4, a, a2, rVar, a5, field, h.a(a5.a()));
                    cVar = (h) linkedHashMap.put(cVar.a, cVar);
                    if (cVar != null) {
                        throw new IllegalArgumentException(b + " declares multiple JSON fields named " + cVar.a);
                    }
                }
            }
            aVar = com.a.a.d.a.a(b.a(aVar.b(), cls, cls.getGenericSuperclass()));
            cls = aVar.a();
        }
        return linkedHashMap;
    }
}
