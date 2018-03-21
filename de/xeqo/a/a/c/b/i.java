package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.a;
import de.xeqo.a.a.g;
import java.util.HashMap;
import java.util.Map;

public final class i extends j implements a {
    private static final Map a;
    private final int b;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 0), Integer.valueOf(g.H));
        a.put(Byte.valueOf((byte) 1), Integer.valueOf(g.J));
        a.put(Byte.valueOf((byte) 2), Integer.valueOf(g.I));
        a.put(Byte.valueOf((byte) 3), Integer.valueOf(g.N));
        a.put(Byte.valueOf((byte) 4), Integer.valueOf(g.M));
        a.put(Byte.valueOf((byte) 5), Integer.valueOf(g.L));
        a.put(Byte.valueOf((byte) 6), Integer.valueOf(g.B));
        a.put(Byte.valueOf((byte) 8), Integer.valueOf(g.P));
        a.put(Byte.valueOf((byte) 9), Integer.valueOf(g.K));
        a.put(Byte.valueOf((byte) 15), Integer.valueOf(g.C));
        a.put(Byte.valueOf((byte) 16), Integer.valueOf(g.D));
        a.put(Byte.valueOf((byte) 18), Integer.valueOf(g.E));
        a.put(Byte.valueOf((byte) 19), Integer.valueOf(g.F));
    }

    public static i a(byte b) {
        int intValue;
        if (a.containsKey(Byte.valueOf(b))) {
            intValue = ((Integer) a.get(Byte.valueOf(b))).intValue();
        } else {
            intValue = g.A;
        }
        return new i(b, intValue);
    }

    private i(byte b, int i) {
        super(b, "EOS WB: " + String.valueOf(b));
        this.b = i;
    }

    public final int a() {
        return this.b;
    }
}
