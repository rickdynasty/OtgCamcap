package de.xeqo.a.a.c.b;

public final class c {
    private final int a;
    private final int b;
    private final int c;

    public c(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("Format: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" Size: ");
        stringBuilder.append(this.b);
        stringBuilder.append(" Smooth: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + this.b) * 31) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a) {
            return false;
        }
        if (this.b != cVar.b) {
            return false;
        }
        if (this.c != cVar.c) {
            return false;
        }
        return true;
    }
}
