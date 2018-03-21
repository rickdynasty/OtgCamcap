package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.b;
import java.util.HashMap;
import java.util.Map;

public final class g extends j implements b {
    public static final b a = new g((byte) 5, "A-Dep");
    public static final b b = new g((byte) 3, "M");
    public static final b c = new g((byte) 2, "Av");
    public static final b d = new g((byte) 1, "Tv");
    public static final b e = new g((byte) 0, "P");
    public static final b f = new g((byte) 9, "Auto");
    public static final b g = new g((byte) 12, "Portrait");
    public static final b h = new g((byte) 13, "Landscape");
    public static final b i = new g((byte) 14, "Macro");
    public static final b j = new g((byte) 11, "Sport");
    public static final b k = new g((byte) 10, "NightPortrait");
    public static final b l = new g((byte) 15, "NoFLash");
    private static final Map m = new HashMap();

    static {
        m.put(Byte.valueOf((byte) 0), "P");
        m.put(Byte.valueOf((byte) 1), "Tv");
        m.put(Byte.valueOf((byte) 2), "Av");
        m.put(Byte.valueOf((byte) 3), "M");
        m.put(Byte.valueOf((byte) 4), "Blb");
        m.put(Byte.valueOf((byte) 5), "A-D");
        m.put(Byte.valueOf((byte) 6), "DEP");
        m.put(Byte.valueOf((byte) 7), "C");
        m.put(Byte.valueOf((byte) 8), "Lck");
        m.put(Byte.valueOf((byte) 9), "Grn");
        m.put(Byte.valueOf((byte) 10), "Ngh");
        m.put(Byte.valueOf((byte) 11), "Spr");
        m.put(Byte.valueOf((byte) 13), "Lnd");
        m.put(Byte.valueOf((byte) 14), "Cls");
        m.put(Byte.valueOf((byte) 15), "N/F");
    }

    public static g a(byte b) {
        if (m.containsKey(Byte.valueOf(b))) {
            return new g(b, (String) m.get(Byte.valueOf(b)));
        }
        return null;
    }

    private g(byte b, String str) {
        super(b, str);
    }
}
