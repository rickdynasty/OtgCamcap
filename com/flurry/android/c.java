package com.flurry.android;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class c extends LinkedHashMap {
    private /* synthetic */ ak a;

    c(ak akVar, int i) {
        this.a = akVar;
        super(i, 0.75f, true);
    }

    protected final boolean removeEldestEntry(Entry entry) {
        return size() > this.a.b;
    }
}
