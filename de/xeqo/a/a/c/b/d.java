package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.w;
import java.util.HashMap;
import java.util.Map;

public final class d extends j implements w {
    private static final Map a;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w wVar = (w) obj;
        return wVar instanceof d ? ((d) wVar).b() - b() : 0;
    }

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 40), "+5    ");
        a.put(Byte.valueOf((byte) 37), "+4 2/3");
        a.put(Byte.valueOf((byte) 35), "+4 1/3");
        a.put(Byte.valueOf((byte) 32), "+4    ");
        a.put(Byte.valueOf((byte) 29), "+3 2/3");
        a.put(Byte.valueOf((byte) 27), "+3 1/3");
        a.put(Byte.valueOf((byte) 24), "+3    ");
        a.put(Byte.valueOf((byte) 21), "+2 2/3");
        a.put(Byte.valueOf((byte) 20), "+2 1/2");
        a.put(Byte.valueOf((byte) 19), "+2 1/3");
        a.put(Byte.valueOf((byte) 16), "+2    ");
        a.put(Byte.valueOf((byte) 13), "+1 2/3");
        a.put(Byte.valueOf((byte) 12), "+1 1/2");
        a.put(Byte.valueOf((byte) 11), "+1 1/3");
        a.put(Byte.valueOf((byte) 8), "+1    ");
        a.put(Byte.valueOf((byte) 5), "+2/3  ");
        a.put(Byte.valueOf((byte) 4), "+1/2  ");
        a.put(Byte.valueOf((byte) 3), "+1/3  ");
        a.put(Byte.valueOf((byte) 0), "0     ");
        a.put(Byte.valueOf((byte) -3), "-1/3  ");
        a.put(Byte.valueOf((byte) -4), "-1/2  ");
        a.put(Byte.valueOf((byte) -5), "-2/3  ");
        a.put(Byte.valueOf((byte) -8), "-1    ");
        a.put(Byte.valueOf((byte) -11), "-1 1/3");
        a.put(Byte.valueOf((byte) -12), "-1 1/2");
        a.put(Byte.valueOf((byte) -13), "-1 2/3");
        a.put(Byte.valueOf((byte) -16), "-2    ");
        a.put(Byte.valueOf((byte) -19), "-2 1/3");
        a.put(Byte.valueOf((byte) -20), "-2 1/2");
        a.put(Byte.valueOf((byte) -21), "-2 2/3");
        a.put(Byte.valueOf((byte) -24), "-3    ");
        a.put(Byte.valueOf((byte) -27), "-3 1/3");
        a.put(Byte.valueOf((byte) -29), "-3 2/3");
        a.put(Byte.valueOf((byte) -32), "-4    ");
        a.put(Byte.valueOf((byte) -35), "-4 1/3");
        a.put(Byte.valueOf((byte) -37), "-3 2/3");
        a.put(Byte.valueOf((byte) -40), "-5    ");
    }

    public static d a(byte b) {
        if (a.containsKey(Byte.valueOf(b))) {
            return new d(b, (String) a.get(Byte.valueOf(b)));
        }
        return new d(b, "Unknown EvValue(" + b + ")");
    }

    private d(byte b, String str) {
        super(b, str);
    }
}
