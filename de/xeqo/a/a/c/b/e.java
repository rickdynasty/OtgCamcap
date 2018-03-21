package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.i;
import java.util.HashMap;
import java.util.Map;

public final class e extends j implements i {
    private static final Map a;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 0), "AUTO");
        a.put(Byte.valueOf((byte) 40), "6");
        a.put(Byte.valueOf((byte) 48), "12");
        a.put(Byte.valueOf((byte) 56), "25");
        a.put(Byte.valueOf((byte) 64), "50");
        a.put(Byte.valueOf((byte) 72), "100");
        a.put(Byte.valueOf((byte) 75), "125");
        a.put(Byte.valueOf((byte) 77), "160");
        a.put(Byte.valueOf((byte) 80), "200");
        a.put(Byte.valueOf((byte) 83), "250");
        a.put(Byte.valueOf((byte) 85), "320");
        a.put(Byte.valueOf((byte) 88), "400");
        a.put(Byte.valueOf((byte) 91), "500");
        a.put(Byte.valueOf((byte) 93), "640");
        a.put(Byte.valueOf((byte) 96), "800");
        a.put(Byte.valueOf((byte) 99), "1000");
        a.put(Byte.valueOf((byte) 101), "1250");
        a.put(Byte.valueOf((byte) 104), "1600");
        a.put(Byte.valueOf((byte) 112), "3200");
        a.put(Byte.valueOf((byte) 120), "6400");
    }

    public static e a(byte b) {
        if (a.containsKey(Byte.valueOf(b))) {
            return new e(b, (String) a.get(Byte.valueOf(b)));
        }
        return new e(b, "Unknown ExposureIndex (" + b + ")");
    }

    private e(byte b, String str) {
        super(b, str);
    }
}
