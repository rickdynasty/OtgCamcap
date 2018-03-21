package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.ad;
import de.xeqo.a.a.g;
import java.util.HashMap;
import java.util.Map;

public final class h extends j implements ad {
    private static final Map a;
    private final int b;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 1), Integer.valueOf(g.p));
        a.put(Byte.valueOf((byte) 3), Integer.valueOf(g.n));
        a.put(Byte.valueOf((byte) 4), Integer.valueOf(g.o));
        a.put(Byte.valueOf((byte) 5), Integer.valueOf(g.m));
    }

    private h(byte b, int i) {
        super(b, "MeteringModeRaw: " + String.valueOf(b));
        this.b = i;
    }

    public static h a(byte b) {
        int intValue;
        if (a.containsKey(Byte.valueOf(b))) {
            intValue = ((Integer) a.get(Byte.valueOf(b))).intValue();
        } else {
            intValue = g.A;
        }
        return new h(b, intValue);
    }

    public final int a() {
        return this.b;
    }
}
