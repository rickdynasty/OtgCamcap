package com.a.a.a.a;

import com.a.a.am;
import com.a.a.d.a;
import com.a.a.l;
import com.a.a.r;

final class s implements l {
    s() {
    }

    public final am a(r rVar, a aVar) {
        Class a = aVar.a();
        if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
            return null;
        }
        if (!a.isEnum()) {
            a = a.getSuperclass();
        }
        return new ak(a);
    }
}
