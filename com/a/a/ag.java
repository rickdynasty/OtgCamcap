package com.a.a;

import java.lang.reflect.Field;

enum ag extends o {
    ag(String str) {
        super(str, 0);
    }

    public final String a(Field field) {
        return field.getName();
    }
}
