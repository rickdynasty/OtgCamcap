package com.a.a;

import com.a.a.a.a;
import com.a.a.a.h;
import com.a.a.a.i;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class aj {
    private a a = a.a;
    private b b = b.a;
    private w c = o.a;
    private final Map d = new HashMap();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private boolean g;
    private String h;
    private int i = 2;
    private int j = 2;
    private boolean k;
    private boolean l;
    private boolean m = true;
    private boolean n;
    private boolean o;

    public final aj a(Type type, Object obj) {
        boolean z = true;
        boolean z2 = (obj instanceof x) || (obj instanceof u) || (obj instanceof z) || (obj instanceof am);
        i.a(z2);
        if (h.a(type) || h.b(type)) {
            throw new IllegalArgumentException("Cannot register type adapters for " + type);
        }
        if (obj instanceof z) {
            this.d.put(type, (z) obj);
        }
        if ((obj instanceof x) || (obj instanceof u)) {
            com.a.a.d.a a = com.a.a.d.a.a(type);
            List list = this.e;
            if (a.b() != a.a()) {
                z = false;
            }
            list.add(new aa(obj, a, z));
        }
        if (obj instanceof am) {
            this.e.add(com.a.a.a.a.aj.a(com.a.a.d.a.a(type), (am) obj));
        }
        return this;
    }

    public final r a() {
        Object qVar;
        List arrayList = new ArrayList();
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        arrayList.addAll(this.f);
        String str = this.h;
        int i = this.i;
        int i2 = this.j;
        if (str == null || "".equals(str.trim())) {
            if (!(i == 2 || i2 == 2)) {
                qVar = new q(i, i2);
            }
            return new r(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, arrayList);
        }
        qVar = new q(str);
        arrayList.add(k.a(com.a.a.d.a.a(Date.class), qVar));
        arrayList.add(k.a(com.a.a.d.a.a(Timestamp.class), qVar));
        arrayList.add(k.a(com.a.a.d.a.a(java.sql.Date.class), qVar));
        return new r(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, arrayList);
    }
}
