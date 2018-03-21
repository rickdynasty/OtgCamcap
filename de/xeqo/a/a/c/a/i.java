package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.ad;
import de.xeqo.a.a.c.x;
import de.xeqo.a.a.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public final class i extends x implements ad {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();
    private char c;
    private int d;

    static {
        a.put(Character.valueOf('\u0002'), "CenterWeightedMetering");
        a.put(Character.valueOf('\u0003'), "MultiPatternMetering");
        a.put(Character.valueOf('\u0004'), "SpotMetering");
        b.put(Character.valueOf('\u0002'), Integer.valueOf(g.q));
        b.put(Character.valueOf('\u0003'), Integer.valueOf(g.r));
        b.put(Character.valueOf('\u0004'), Integer.valueOf(g.s));
    }

    private i(String str, int i, char c) {
        super(str);
        this.c = c;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.c == ((i) obj).c) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putChar(this.c);
        return allocate;
    }

    public final int a() {
        return this.d;
    }

    public static i a(char c) {
        String str;
        int intValue;
        if (a.containsKey(Character.valueOf(c))) {
            str = (String) a.get(Character.valueOf(c));
        } else {
            str = null;
        }
        if (b.containsKey(Character.valueOf(c))) {
            intValue = ((Integer) b.get(Character.valueOf(c))).intValue();
        } else {
            intValue = 0;
        }
        return new i(str, intValue, c);
    }
}
