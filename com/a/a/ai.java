package com.a.a;

import com.a.a.a.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class ai extends al {
    private final Map a = new LinkedHashMap();

    public final void a(String str, al alVar) {
        if (alVar == null) {
            alVar = ah.a;
        }
        this.a.put(i.a((Object) str), alVar);
    }

    public final Set d() {
        return this.a.entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof ai) && ((ai) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
