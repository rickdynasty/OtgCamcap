package de.xeqo.a.a.c.a;

import de.xeqo.a.a.c.b;
import de.xeqo.a.a.c.x;
import java.util.HashMap;
import java.util.Map;

public final class h extends x implements b {
    private static final Map a;
    private char b;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Character.valueOf('\u0001'), "M");
        a.put(Character.valueOf('\u0002'), "P");
        a.put(Character.valueOf('\u0003'), "A");
        a.put(Character.valueOf('\u0004'), "S");
        a.put(Character.valueOf('耐'), "AUTO");
        a.put(Character.valueOf('耖'), "NoFlash");
        a.put(Character.valueOf('耘'), "SCENE");
        a.put(Character.valueOf('聐'), "U1");
        a.put(Character.valueOf('聑'), "U2");
    }

    private h(String str, char c) {
        super(str);
        this.b = c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        return this.b == ((h) obj).b;
    }

    public final boolean a() {
        if (this.b == '\u0001' || this.b == '\u0002' || this.b == '\u0004' || this.b == '\u0003') {
            return true;
        }
        return false;
    }

    public static h a(char c) {
        String str;
        if (a.containsKey(Character.valueOf(c))) {
            str = (String) a.get(Character.valueOf(c));
        } else {
            str = String.valueOf(c);
        }
        return new h(str, c);
    }
}
