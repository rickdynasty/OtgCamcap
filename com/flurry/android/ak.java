package com.flurry.android;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

final class ak {
    private LinkedHashMap a = new c(this, ((int) Math.ceil(133.3333282470703d)) + 1);
    private int b = 100;

    ak() {
    }

    final synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    final synchronized void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    final synchronized int a() {
        return this.a.size();
    }

    final synchronized List b() {
        return new ArrayList(this.a.entrySet());
    }

    final synchronized Set c() {
        return this.a.keySet();
    }
}
