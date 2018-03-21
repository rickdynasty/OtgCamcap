package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.j;
import de.xeqo.a.a.c.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public final class k extends x implements j {
    private static final Map a;
    private char b;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Character.valueOf('\u0000'), "2500K");
        a.put(Character.valueOf('\u0001'), "2560K");
        a.put(Character.valueOf('\u0002'), "2630K");
        a.put(Character.valueOf('\u0003'), "2700K");
        a.put(Character.valueOf('\u0004'), "2780K");
        a.put(Character.valueOf('\u0005'), "2860K");
        a.put(Character.valueOf('\u0006'), "2940K");
        a.put(Character.valueOf('\u0007'), "3030K");
        a.put(Character.valueOf('\b'), "3130K");
        a.put(Character.valueOf('\t'), "3230K");
        a.put(Character.valueOf('\n'), "3330K");
        a.put(Character.valueOf('\u000b'), "3450K");
        a.put(Character.valueOf('\f'), "3570K");
        a.put(Character.valueOf('\r'), "3700K");
        a.put(Character.valueOf('\u000e'), "3850K");
        a.put(Character.valueOf('\u000f'), "4000K");
        a.put(Character.valueOf('\u0010'), "4170K");
        a.put(Character.valueOf('\u0011'), "4350K");
        a.put(Character.valueOf('\u0012'), "4550K");
        a.put(Character.valueOf('\u0013'), "4760K");
        a.put(Character.valueOf('\u0014'), "5000K");
        a.put(Character.valueOf('\u0015'), "5260K");
        a.put(Character.valueOf('\u0016'), "5560K");
        a.put(Character.valueOf('\u0017'), "5880K");
        a.put(Character.valueOf('\u0018'), "6250K");
        a.put(Character.valueOf('\u0019'), "6670K");
        a.put(Character.valueOf('\u001a'), "7140K");
        a.put(Character.valueOf('\u001b'), "7690K");
        a.put(Character.valueOf('\u001c'), "8330K");
        a.put(Character.valueOf('\u001d'), "9090K");
        a.put(Character.valueOf('\u001e'), "10000K");
    }

    private k(String str, Character ch) {
        super(str);
        this.b = ch.charValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.b == ((k) obj).b) {
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

    public static k a(Character ch) {
        String str;
        if (a.containsKey(ch)) {
            str = (String) a.get(ch);
        } else {
            str = String.valueOf(ch.charValue());
        }
        return new k(str, ch);
    }
}
