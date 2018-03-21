package com.a.a;

import java.lang.reflect.Field;

enum ab extends o {
    ab(String str) {
        super(str, 3);
    }

    public final String a(Field field) {
        return o.a(field.getName(), "_").toLowerCase();
    }
}
