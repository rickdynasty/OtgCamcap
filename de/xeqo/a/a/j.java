package de.xeqo.a.a;

import java.lang.reflect.Field;

public final class j {
    private static final j a = new j();

    public static String a(char c) {
        Field[] fields = a.getClass().getFields();
        int length = fields.length;
        int i = 0;
        while (i < length) {
            Field field = fields[i];
            try {
                if (field.getChar(a) == c) {
                    return field.getName();
                }
                i++;
            } catch (Exception e) {
            }
        }
        return "Unknown (" + Integer.toHexString(c) + ")";
    }
}
