package com.a.a;

import com.a.a.a.k;
import java.math.BigInteger;

public final class ak extends al {
    private static final Class[] a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object b;

    public ak(Boolean bool) {
        a((Object) bool);
    }

    public ak(Number number) {
        a((Object) number);
    }

    public ak(String str) {
        a((Object) str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.Object r8) {
        /*
        r7 = this;
        r1 = 1;
        r0 = 0;
        r2 = r8 instanceof java.lang.Character;
        if (r2 == 0) goto L_0x0013;
    L_0x0006:
        r8 = (java.lang.Character) r8;
        r0 = r8.charValue();
        r0 = java.lang.String.valueOf(r0);
        r7.b = r0;
    L_0x0012:
        return;
    L_0x0013:
        r2 = r8 instanceof java.lang.Number;
        if (r2 != 0) goto L_0x001e;
    L_0x0017:
        r2 = r8 instanceof java.lang.String;
        if (r2 == 0) goto L_0x0025;
    L_0x001b:
        r2 = r1;
    L_0x001c:
        if (r2 == 0) goto L_0x001f;
    L_0x001e:
        r0 = r1;
    L_0x001f:
        com.a.a.a.i.a(r0);
        r7.b = r8;
        goto L_0x0012;
    L_0x0025:
        r3 = r8.getClass();
        r4 = a;
        r5 = r4.length;
        r2 = r0;
    L_0x002d:
        if (r2 >= r5) goto L_0x003c;
    L_0x002f:
        r6 = r4[r2];
        r6 = r6.isAssignableFrom(r3);
        if (r6 == 0) goto L_0x0039;
    L_0x0037:
        r2 = r1;
        goto L_0x001c;
    L_0x0039:
        r2 = r2 + 1;
        goto L_0x002d;
    L_0x003c:
        r2 = r0;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.ak.a(java.lang.Object):void");
    }

    public final boolean d() {
        return this.b instanceof Boolean;
    }

    public final boolean c() {
        if (this.b instanceof Boolean) {
            return ((Boolean) this.b).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    public final boolean e() {
        return this.b instanceof Number;
    }

    public final Number a() {
        return this.b instanceof String ? new k((String) this.b) : (Number) this.b;
    }

    public final boolean f() {
        return this.b instanceof String;
    }

    public final String b() {
        if (this.b instanceof Number) {
            return a().toString();
        }
        if (this.b instanceof Boolean) {
            return ((Boolean) this.b).toString();
        }
        return (String) this.b;
    }

    public final int hashCode() {
        if (this.b == null) {
            return 31;
        }
        long longValue;
        if (a(this)) {
            longValue = a().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        } else if (!(this.b instanceof Number)) {
            return this.b.hashCode();
        } else {
            longValue = Double.doubleToLongBits(a().doubleValue());
            return (int) (longValue ^ (longValue >>> 32));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ak akVar = (ak) obj;
        if (this.b == null) {
            if (akVar.b != null) {
                return false;
            }
            return true;
        } else if (a(this) && a(akVar)) {
            if (a().longValue() != akVar.a().longValue()) {
                return false;
            }
            return true;
        } else if (!(this.b instanceof Number) || !(akVar.b instanceof Number)) {
            return this.b.equals(akVar.b);
        } else {
            double doubleValue = a().doubleValue();
            double doubleValue2 = akVar.a().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
    }

    private static boolean a(ak akVar) {
        if (!(akVar.b instanceof Number)) {
            return false;
        }
        Number number = (Number) akVar.b;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }
}
