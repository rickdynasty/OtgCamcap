package com.a.a;

import java.lang.reflect.Field;

enum ad extends o {
    ad(String str) {
        super(str, 4);
    }

    public final String a(Field field) {
        return o.a(field.getName(), "-").toLowerCase();
    }
}
