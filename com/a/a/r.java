package com.a.a;

import com.a.a.a.a;
import com.a.a.a.a.ai;
import com.a.a.a.a.aj;
import com.a.a.a.a.al;
import com.a.a.a.a.am;
import com.a.a.a.a.an;
import com.a.a.a.a.ao;
import com.a.a.a.a.at;
import com.a.a.a.a.e;
import com.a.a.a.a.g;
import com.a.a.a.a.i;
import com.a.a.a.a.j;
import com.a.a.a.f;
import com.a.a.a.l;
import com.a.a.a.w;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r {
    private final ThreadLocal a;
    private final Map b;
    private final List c;
    private final l d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private s i;
    private t j;

    static /* synthetic */ void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialDoubleValues() method.");
        }
    }

    public r() {
        this(a.a, o.a, Collections.emptyMap(), false, false, false, true, false, false, b.a, Collections.emptyList());
    }

    r(a aVar, w wVar, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, b bVar, List list) {
        this.a = new h(this);
        this.b = Collections.synchronizedMap(new HashMap());
        this.i = new g(this);
        this.j = new j(this);
        this.d = new l(map);
        this.e = z;
        this.g = z3;
        this.f = z4;
        this.h = z5;
        an anVar = new an(this.d, wVar, aVar);
        l lVar = new l();
        List arrayList = new ArrayList();
        arrayList.add(aj.m);
        arrayList.add(aj.g);
        arrayList.add(aj.d);
        arrayList.add(aj.e);
        arrayList.add(aj.f);
        arrayList.add(aj.a(Long.TYPE, Long.class, bVar == b.a ? aj.h : new d(this)));
        arrayList.add(aj.a(Double.TYPE, Double.class, z6 ? aj.j : new i(this)));
        arrayList.add(aj.a(Float.TYPE, Float.class, z6 ? aj.i : new e(this)));
        arrayList.add(aVar);
        arrayList.add(aj.k);
        arrayList.add(aj.l);
        arrayList.add(aj.n);
        arrayList.add(aj.o);
        arrayList.add(aj.a(BigDecimal.class, new ao()));
        arrayList.add(aj.a(BigInteger.class, new i()));
        arrayList.add(aj.x);
        arrayList.add(j.a);
        arrayList.addAll(list);
        arrayList.add(new am(lVar));
        arrayList.add(aj.p);
        arrayList.add(aj.q);
        arrayList.add(aj.s);
        arrayList.add(aj.v);
        arrayList.add(aj.r);
        arrayList.add(aj.b);
        arrayList.add(ai.a);
        arrayList.add(aj.u);
        arrayList.add(g.a);
        arrayList.add(al.a);
        arrayList.add(aj.t);
        arrayList.add(new at(lVar, z2));
        arrayList.add(e.a);
        arrayList.add(aj.y);
        arrayList.add(aj.a);
        arrayList.add(anVar);
        this.c = Collections.unmodifiableList(arrayList);
    }

    public final am a(com.a.a.d.a aVar) {
        am amVar = (am) this.b.get(aVar);
        if (amVar != null) {
            return amVar;
        }
        Map map = (Map) this.a.get();
        am amVar2 = (ac) map.get(aVar);
        if (amVar2 != null) {
            return amVar2;
        }
        ac acVar = new ac();
        map.put(aVar, acVar);
        try {
            for (l a : this.c) {
                amVar2 = a.a(this, aVar);
                if (amVar2 != null) {
                    acVar.a(amVar2);
                    this.b.put(aVar, amVar2);
                    return amVar2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
        }
    }

    static {
        w.a = new f();
    }

    public final am a(Class cls) {
        return a(com.a.a.d.a.a(cls));
    }

    public final String a(Object obj) {
        Object stringWriter;
        com.a.a.c.a a;
        boolean a2;
        boolean b;
        boolean c;
        if (obj == null) {
            al alVar = ah.a;
            stringWriter = new StringWriter();
            try {
                a = a(f.a(stringWriter));
                a2 = a.a();
                a.a(true);
                b = a.b();
                a.b(this.f);
                c = a.c();
                a.c(this.e);
                try {
                    f.a(alVar, a);
                    a.a(a2);
                    a.b(b);
                    a.c(c);
                    return stringWriter.toString();
                } catch (Throwable e) {
                    throw new p(e);
                } catch (Throwable th) {
                    a.a(a2);
                    a.b(b);
                    a.c(c);
                }
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }
        Type type = obj.getClass();
        stringWriter = new StringWriter();
        try {
            a = a(f.a(stringWriter));
            am a3 = a(com.a.a.d.a.a(type));
            a2 = a.a();
            a.a(true);
            b = a.b();
            a.b(this.f);
            c = a.c();
            a.c(this.e);
            try {
                a3.a(a, obj);
                a.a(a2);
                a.b(b);
                a.c(c);
                return stringWriter.toString();
            } catch (Throwable e22) {
                throw new p(e22);
            } catch (Throwable th2) {
                a.a(a2);
                a.b(b);
                a.c(c);
            }
        } catch (Throwable e222) {
            throw new p(e222);
        }
    }

    private com.a.a.c.a a(Writer writer) {
        if (this.g) {
            writer.write(")]}'\n");
        }
        com.a.a.c.a aVar = new com.a.a.c.a(writer);
        if (this.h) {
            aVar.a("  ");
        }
        aVar.c(this.e);
        return aVar;
    }

    public final String toString() {
        return "{" + "serializeNulls:" + this.e + "factories:" + this.c + ",instanceCreators:" + this.d + "}";
    }
}
