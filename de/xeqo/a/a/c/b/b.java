package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.y;
import java.util.HashMap;
import java.util.Map;

public final class b extends j implements y {
    private static final Map a;

    private b(byte b, String str) {
        super(b, str);
    }

    public static b a(byte b) {
        String str;
        if (a.containsKey(Byte.valueOf(b))) {
            str = (String) a.get(Byte.valueOf(b));
        } else {
            str = "unknown (" + b + ")";
        }
        return new b(b, str);
    }

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 33), "User 1");
        a.put(Byte.valueOf((byte) 34), "User 2");
        a.put(Byte.valueOf((byte) 35), "User 3");
        a.put(Byte.valueOf((byte) -127), "Standard");
        a.put(Byte.valueOf((byte) -126), "Portrait");
        a.put(Byte.valueOf((byte) -125), "Landscape");
        a.put(Byte.valueOf((byte) -124), "Neutral");
        a.put(Byte.valueOf((byte) -123), "Faithful");
        a.put(Byte.valueOf((byte) -122), "Monochrome");
    }
}
