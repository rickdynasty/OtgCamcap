package com.a.a;

import com.a.a.a.w;
import com.a.a.d.a;

final class f extends w {
    f() {
    }

    public final am a(r rVar, l lVar, a aVar) {
        Object obj = null;
        for (l lVar2 : rVar.c) {
            if (obj != null) {
                am a = lVar2.a(rVar, aVar);
                if (a != null) {
                    return a;
                }
            } else if (lVar2 == lVar) {
                obj = 1;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }
}
