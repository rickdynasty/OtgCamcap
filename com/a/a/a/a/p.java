package com.a.a.a.a;

import com.a.a.ah;
import com.a.a.ai;
import com.a.a.ak;
import com.a.a.al;
import com.a.a.am;
import com.a.a.c.a;
import java.util.Iterator;
import java.util.Map.Entry;

final class p extends am {
    p() {
    }

    private void a(a aVar, al alVar) {
        if (alVar == null || (alVar instanceof ah)) {
            aVar.h();
        } else if (alVar instanceof ak) {
            ak g = alVar.g();
            if (g.e()) {
                aVar.a(g.a());
            } else if (g.d()) {
                aVar.d(g.c());
            } else {
                aVar.c(g.b());
            }
        } else if (alVar instanceof com.a.a.a) {
            aVar.d();
            if (alVar instanceof com.a.a.a) {
                Iterator it = ((com.a.a.a) alVar).iterator();
                while (it.hasNext()) {
                    a(aVar, (al) it.next());
                }
                aVar.e();
                return;
            }
            throw new IllegalStateException("This is not a JSON Array.");
        } else if (alVar instanceof ai) {
            aVar.f();
            if (alVar instanceof ai) {
                for (Entry entry : ((ai) alVar).d()) {
                    aVar.b((String) entry.getKey());
                    a(aVar, (al) entry.getValue());
                }
                aVar.g();
                return;
            }
            throw new IllegalStateException("Not a JSON Object: " + alVar);
        } else {
            throw new IllegalArgumentException("Couldn't write " + alVar.getClass());
        }
    }
}
