package com.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends al implements Iterable {
    private final List a = new ArrayList();

    public final void a(al alVar) {
        if (alVar == null) {
            alVar = ah.a;
        }
        this.a.add(alVar);
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final Number a() {
        if (this.a.size() == 1) {
            return ((al) this.a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    public final String b() {
        if (this.a.size() == 1) {
            return ((al) this.a.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public final boolean c() {
        if (this.a.size() == 1) {
            return ((al) this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof a) && ((a) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
