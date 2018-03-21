package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import java.util.BitSet;

final class ba extends am {
    ba() {
    }

    public final /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        if (bitSet == null) {
            aVar.h();
            return;
        }
        aVar.d();
        for (int i = 0; i < bitSet.length(); i++) {
            aVar.a((long) (bitSet.get(i) ? 1 : 0));
        }
        aVar.e();
    }
}
