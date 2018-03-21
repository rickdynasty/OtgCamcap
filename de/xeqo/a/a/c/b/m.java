package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.ae;
import java.util.HashMap;
import java.util.Map;

public final class m extends j implements ae {
    private static final Map a;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Byte.valueOf((byte) 12), "Bulb");
        a.put(Byte.valueOf((byte) 16), "30\"");
        a.put(Byte.valueOf((byte) 19), "25\"");
        a.put(Byte.valueOf((byte) 20), "20\"");
        a.put(Byte.valueOf((byte) 21), "20\"");
        a.put(Byte.valueOf((byte) 24), "15\"");
        a.put(Byte.valueOf((byte) 27), "13\"");
        a.put(Byte.valueOf((byte) 28), "10\"");
        a.put(Byte.valueOf((byte) 29), "10\"");
        a.put(Byte.valueOf((byte) 32), " 8\"");
        a.put(Byte.valueOf((byte) 35), " 6\"");
        a.put(Byte.valueOf((byte) 36), " 6\"");
        a.put(Byte.valueOf((byte) 37), " 5\"");
        a.put(Byte.valueOf((byte) 40), " 4\"");
        a.put(Byte.valueOf((byte) 43), "3\"2");
        a.put(Byte.valueOf((byte) 44), " 3\"");
        a.put(Byte.valueOf((byte) 45), "2\"5");
        a.put(Byte.valueOf((byte) 48), " 2\"");
        a.put(Byte.valueOf((byte) 51), "1\"6");
        a.put(Byte.valueOf((byte) 52), "1\"5");
        a.put(Byte.valueOf((byte) 53), "1\"3");
        a.put(Byte.valueOf((byte) 56), " 1\"");
        a.put(Byte.valueOf((byte) 59), "0\"8");
        a.put(Byte.valueOf((byte) 60), "0\"7");
        a.put(Byte.valueOf((byte) 61), "0\"6");
        a.put(Byte.valueOf((byte) 64), "0\"5");
        a.put(Byte.valueOf((byte) 67), "0\"4");
        a.put(Byte.valueOf((byte) 68), "0\"3");
        a.put(Byte.valueOf((byte) 69), "0\"3");
        a.put(Byte.valueOf((byte) 72), "1/4");
        a.put(Byte.valueOf((byte) 75), "1/5");
        a.put(Byte.valueOf((byte) 76), "1/6");
        a.put(Byte.valueOf((byte) 77), "1/6");
        a.put(Byte.valueOf((byte) 80), "1/8");
        a.put(Byte.valueOf((byte) 83), "1/10");
        a.put(Byte.valueOf((byte) 84), "1/10");
        a.put(Byte.valueOf((byte) 85), "1/13");
        a.put(Byte.valueOf((byte) 88), "1/15");
        a.put(Byte.valueOf((byte) 91), "1/20");
        a.put(Byte.valueOf((byte) 92), "1/20");
        a.put(Byte.valueOf((byte) 93), "1/25");
        a.put(Byte.valueOf((byte) 96), "1/30");
        a.put(Byte.valueOf((byte) 99), "1/40");
        a.put(Byte.valueOf((byte) 100), "1/45");
        a.put(Byte.valueOf((byte) 101), "1/50");
        a.put(Byte.valueOf((byte) 104), "1/60");
        a.put(Byte.valueOf((byte) 107), "1/80");
        a.put(Byte.valueOf((byte) 108), "1/90");
        a.put(Byte.valueOf((byte) 109), "1/100");
        a.put(Byte.valueOf((byte) 112), "1/125");
        a.put(Byte.valueOf((byte) 115), "1/160");
        a.put(Byte.valueOf((byte) 116), "1/180");
        a.put(Byte.valueOf((byte) 117), "1/200");
        a.put(Byte.valueOf((byte) 120), "1/250");
        a.put(Byte.valueOf((byte) 123), "1/320");
        a.put(Byte.valueOf((byte) 124), "1/350");
        a.put(Byte.valueOf((byte) 125), "1/400");
        a.put(Byte.valueOf(Byte.MIN_VALUE), "1/500");
        a.put(Byte.valueOf((byte) -125), "1/640");
        a.put(Byte.valueOf((byte) -124), "1/750");
        a.put(Byte.valueOf((byte) -123), "1/800");
        a.put(Byte.valueOf((byte) -120), "1/1000");
        a.put(Byte.valueOf((byte) -117), "1/1250");
        a.put(Byte.valueOf((byte) -116), "1/1500");
        a.put(Byte.valueOf((byte) -115), "1/1600");
        a.put(Byte.valueOf((byte) -112), "1/2000");
        a.put(Byte.valueOf((byte) -109), "1/2500");
        a.put(Byte.valueOf((byte) -108), "1/3000");
        a.put(Byte.valueOf((byte) -107), "1/3200");
        a.put(Byte.valueOf((byte) -104), "1/4000");
        a.put(Byte.valueOf((byte) -101), "1/5000");
        a.put(Byte.valueOf((byte) -100), "1/6000");
        a.put(Byte.valueOf((byte) -99), "1/6400");
        a.put(Byte.valueOf((byte) -96), "1/8000");
    }

    public static m a(byte b) {
        if (a.containsKey(Byte.valueOf(b))) {
            return new m(b, (String) a.get(Byte.valueOf(b)));
        }
        return new m(b, "Unknown ShutterSpeed (" + b + ")");
    }

    private m(byte b, String str) {
        super(b, str);
    }
}
