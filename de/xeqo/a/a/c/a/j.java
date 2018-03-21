package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.x;
import de.xeqo.a.a.c.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public final class j extends x implements y {
    private static final Map a;
    private final Character b;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Character.valueOf('\u0001'), "Standard");
        a.put(Character.valueOf('\u0002'), "Neutral");
        a.put(Character.valueOf('\u0003'), "Brillant");
        a.put(Character.valueOf('\u0004'), "B/W");
        a.put(Character.valueOf('\u0005'), "Portrait");
        a.put(Character.valueOf('\u0006'), "Landscape");
        a.put(Character.valueOf('É'), "C-1");
        a.put(Character.valueOf('Ê'), "C-2");
        a.put(Character.valueOf('Ë'), "C-3");
        a.put(Character.valueOf('Ì'), "C-4");
        a.put(Character.valueOf('Í'), "C-5");
        a.put(Character.valueOf('Î'), "C-6");
        a.put(Character.valueOf('Ï'), "C-7");
        a.put(Character.valueOf('Ð'), "C-8");
        a.put(Character.valueOf('Ñ'), "C-9");
        a.put(Character.valueOf('e'), "O-1");
        a.put(Character.valueOf('f'), "O-2");
        a.put(Character.valueOf('g'), "O-3");
        a.put(Character.valueOf('h'), "O-4");
    }

    private j(String str, char c) {
        super(str);
        this.b = Character.valueOf(c);
    }

    public final ByteBuffer b_() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putChar(this.b.charValue());
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.b == ((j) obj).b) {
            return true;
        }
        return false;
    }

    public static j a(char c) {
        String str;
        if (a.containsKey(Character.valueOf(c))) {
            str = (String) a.get(Character.valueOf(c));
        } else {
            str = "unknown(" + c + ")";
        }
        return new j(str, c);
    }
}
