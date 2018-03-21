package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.a;
import de.xeqo.a.a.c.x;
import de.xeqo.a.a.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

public final class l extends x implements a {
    private static final Map a;
    private char b;
    private int c;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Character.valueOf('\u0002'), new SimpleEntry(Integer.valueOf(g.G), "Auto"));
        a.put(Character.valueOf('\u0004'), new SimpleEntry(Integer.valueOf(g.J), "Sunny"));
        a.put(Character.valueOf('\u0005'), new SimpleEntry(Integer.valueOf(g.M), "Fluor."));
        a.put(Character.valueOf('\u0006'), new SimpleEntry(Integer.valueOf(g.N), "Inc."));
        a.put(Character.valueOf('\u0007'), new SimpleEntry(Integer.valueOf(g.L), "Flash"));
        a.put(Character.valueOf('耐'), new SimpleEntry(Integer.valueOf(g.I), "Cloudy"));
        a.put(Character.valueOf('耑'), new SimpleEntry(Integer.valueOf(g.P), "Shade"));
        a.put(Character.valueOf('耒'), new SimpleEntry(Integer.valueOf(g.K), "Kelvin"));
        a.put(Character.valueOf('耓'), new SimpleEntry(Integer.valueOf(g.O), "Pre."));
    }

    private l(char c, String str, int i) {
        super(str);
        this.b = c;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.b == ((l) obj).b) {
            return true;
        }
        return false;
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putChar(this.b);
        return allocate;
    }

    public final int a() {
        return this.c;
    }

    public static l a(char c) {
        String str;
        int intValue;
        if (a.containsKey(Character.valueOf(c))) {
            String str2 = (String) ((SimpleEntry) a.get(Character.valueOf(c))).getValue();
            str = str2;
            intValue = ((Integer) ((SimpleEntry) a.get(Character.valueOf(c))).getKey()).intValue();
        } else {
            str = "unknown (" + String.valueOf(c) + ")";
            intValue = g.A;
        }
        return new l(c, str, intValue);
    }
}
