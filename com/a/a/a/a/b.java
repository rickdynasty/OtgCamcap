package com.a.a.a.a;

import com.a.a.a.f;
import com.a.a.a.m;
import com.a.a.ah;
import com.a.a.ai;
import com.a.a.ak;
import com.a.a.al;
import com.a.a.am;
import com.a.a.c.a;
import com.a.a.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class b extends am {
    private final am a;
    private final am b;
    private final m c;
    private /* synthetic */ at d;

    public final /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        int i = 0;
        Map map = (Map) obj;
        if (map == null) {
            aVar.h();
        } else if (this.d.b) {
            List arrayList = new ArrayList(map.size());
            List arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            for (Entry entry : map.entrySet()) {
                al a = at.b(this.a, entry.getKey());
                arrayList.add(a);
                arrayList2.add(entry.getValue());
                int i3 = ((a instanceof com.a.a.a) || (a instanceof ai)) ? 1 : 0;
                i2 = i3 | i2;
            }
            if (i2 != 0) {
                aVar.d();
                while (i < arrayList.size()) {
                    aVar.d();
                    f.a((al) arrayList.get(i), aVar);
                    this.b.a(aVar, arrayList2.get(i));
                    aVar.e();
                    i++;
                }
                aVar.e();
                return;
            }
            aVar.f();
            while (i < arrayList.size()) {
                String valueOf;
                al alVar = (al) arrayList.get(i);
                if (alVar instanceof ak) {
                    ak g = alVar.g();
                    if (g.e()) {
                        valueOf = String.valueOf(g.a());
                    } else if (g.d()) {
                        valueOf = Boolean.toString(g.c());
                    } else if (g.f()) {
                        valueOf = g.b();
                    } else {
                        throw new AssertionError();
                    }
                } else if (alVar instanceof ah) {
                    valueOf = "null";
                } else {
                    throw new AssertionError();
                }
                aVar.b(valueOf);
                this.b.a(aVar, arrayList2.get(i));
                i++;
            }
            aVar.g();
        } else {
            aVar.f();
            for (Entry entry2 : map.entrySet()) {
                aVar.b(String.valueOf(entry2.getKey()));
                this.b.a(aVar, entry2.getValue());
            }
            aVar.g();
        }
    }

    public b(at atVar, r rVar, Type type, am amVar, Type type2, am amVar2, m mVar) {
        this.d = atVar;
        this.a = new bc(rVar, amVar, type);
        this.b = new bc(rVar, amVar2, type2);
        this.c = mVar;
    }
}
