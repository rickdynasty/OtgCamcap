package com.a.a;

import java.util.HashMap;

final class h extends ThreadLocal {
    private /* synthetic */ r a;

    h(r rVar) {
        this.a = rVar;
    }

    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return new HashMap();
    }
}
