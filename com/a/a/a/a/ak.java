package com.a.a.a.a;

import com.a.a.am;
import com.a.a.b.b;
import com.a.a.c.a;
import java.util.HashMap;
import java.util.Map;

final class ak extends am {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    public final /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        Enum enumR = (Enum) obj;
        aVar.c(enumR == null ? null : (String) this.b.get(enumR));
    }

    public ak(Class cls) {
        try {
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                Object a;
                String name = enumR.name();
                b bVar = (b) cls.getField(name).getAnnotation(b.class);
                if (bVar != null) {
                    a = bVar.a();
                } else {
                    String str = name;
                }
                this.a.put(a, enumR);
                this.b.put(enumR, a);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError();
        }
    }
}
