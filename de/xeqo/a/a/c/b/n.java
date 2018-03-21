package de.xeqo.a.a.c.b;

import java.util.HashMap;
import java.util.Map;

public final class n extends j implements de.xeqo.a.a.c.n {
    private static final Map a;
    private double b;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 0), Double.valueOf(0.0d));
        a.put(Byte.valueOf((byte) 8), Double.valueOf(1.0d));
        a.put(Byte.valueOf((byte) 11), Double.valueOf(1.1d));
        a.put(Byte.valueOf((byte) 12), Double.valueOf(1.2d));
        a.put(Byte.valueOf((byte) 13), Double.valueOf(1.2d));
        a.put(Byte.valueOf((byte) 16), Double.valueOf(1.4d));
        a.put(Byte.valueOf((byte) 19), Double.valueOf(1.6d));
        a.put(Byte.valueOf((byte) 20), Double.valueOf(1.8d));
        a.put(Byte.valueOf((byte) 21), Double.valueOf(1.8d));
        a.put(Byte.valueOf((byte) 24), Double.valueOf(2.0d));
        a.put(Byte.valueOf((byte) 27), Double.valueOf(2.2d));
        a.put(Byte.valueOf((byte) 28), Double.valueOf(2.5d));
        a.put(Byte.valueOf((byte) 29), Double.valueOf(2.5d));
        a.put(Byte.valueOf((byte) 32), Double.valueOf(2.8d));
        a.put(Byte.valueOf((byte) 35), Double.valueOf(3.2d));
        a.put(Byte.valueOf((byte) 36), Double.valueOf(3.5d));
        a.put(Byte.valueOf((byte) 37), Double.valueOf(3.5d));
        a.put(Byte.valueOf((byte) 40), Double.valueOf(4.0d));
        a.put(Byte.valueOf((byte) 43), Double.valueOf(4.5d));
        a.put(Byte.valueOf((byte) 44), Double.valueOf(4.5d));
        a.put(Byte.valueOf((byte) 45), Double.valueOf(5.0d));
        a.put(Byte.valueOf((byte) 48), Double.valueOf(5.6d));
        a.put(Byte.valueOf((byte) 51), Double.valueOf(6.3d));
        a.put(Byte.valueOf((byte) 52), Double.valueOf(6.7d));
        a.put(Byte.valueOf((byte) 53), Double.valueOf(7.1d));
        a.put(Byte.valueOf((byte) 56), Double.valueOf(8.0d));
        a.put(Byte.valueOf((byte) 59), Double.valueOf(9.0d));
        a.put(Byte.valueOf((byte) 60), Double.valueOf(9.5d));
        a.put(Byte.valueOf((byte) 61), Double.valueOf(10.0d));
        a.put(Byte.valueOf((byte) 64), Double.valueOf(11.0d));
        a.put(Byte.valueOf((byte) 67), Double.valueOf(13.0d));
        a.put(Byte.valueOf((byte) 68), Double.valueOf(13.0d));
        a.put(Byte.valueOf((byte) 69), Double.valueOf(14.0d));
        a.put(Byte.valueOf((byte) 72), Double.valueOf(16.0d));
        a.put(Byte.valueOf((byte) 75), Double.valueOf(18.0d));
        a.put(Byte.valueOf((byte) 76), Double.valueOf(19.0d));
        a.put(Byte.valueOf((byte) 77), Double.valueOf(20.0d));
        a.put(Byte.valueOf((byte) 80), Double.valueOf(22.0d));
        a.put(Byte.valueOf((byte) 83), Double.valueOf(25.0d));
        a.put(Byte.valueOf((byte) 84), Double.valueOf(27.0d));
        a.put(Byte.valueOf((byte) 85), Double.valueOf(29.0d));
        a.put(Byte.valueOf((byte) 88), Double.valueOf(32.0d));
        a.put(Byte.valueOf((byte) 91), Double.valueOf(36.0d));
        a.put(Byte.valueOf((byte) 92), Double.valueOf(38.0d));
        a.put(Byte.valueOf((byte) 93), Double.valueOf(40.0d));
        a.put(Byte.valueOf((byte) 96), Double.valueOf(45.0d));
        a.put(Byte.valueOf((byte) 99), Double.valueOf(51.0d));
        a.put(Byte.valueOf((byte) 100), Double.valueOf(54.0d));
        a.put(Byte.valueOf((byte) 101), Double.valueOf(57.0d));
        a.put(Byte.valueOf((byte) 104), Double.valueOf(64.0d));
        a.put(Byte.valueOf((byte) 107), Double.valueOf(72.0d));
        a.put(Byte.valueOf((byte) 108), Double.valueOf(76.0d));
        a.put(Byte.valueOf((byte) 109), Double.valueOf(80.0d));
        a.put(Byte.valueOf((byte) 112), Double.valueOf(91.0d));
    }

    private n(byte b, double d) {
        super(b, String.valueOf(d));
        this.b = d;
    }

    public static n a(byte b) {
        if (a.containsKey(Byte.valueOf(b))) {
            return new n(b, ((Double) a.get(Byte.valueOf(b))).doubleValue());
        }
        return new n(b, 0.0d);
    }
}
