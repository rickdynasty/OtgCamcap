package de.xeqo.a.a.c;

public abstract class k implements o {
    private boolean a = false;
    private char b = '\u0000';
    private boolean c = false;
    private char d = '\u0000';

    protected abstract void a(byte[] bArr, int i, int i2);

    protected abstract boolean a(int i);

    public final boolean a(int i, char c, char c2) {
        if (c == '\u0002') {
            this.c = true;
            this.d = c2;
            return a(i);
        } else if (c != '\u0003') {
            return false;
        } else {
            this.a = true;
            this.b = c2;
            return false;
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (!this.a && bArr != null) {
            a(bArr, i, i2);
        }
    }

    public final void e() {
        if (!this.a) {
            i();
        }
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean b(int i) {
        return this.a && this.b == i;
    }

    public final char g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    protected void i() {
    }
}
