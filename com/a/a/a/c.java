package com.a.a.a;

import java.io.Writer;

final class c extends Writer {
    private final Appendable a;
    private final v b;

    private c(Appendable appendable, byte b) {
        this.b = new v();
        this.a = appendable;
    }

    public final void write(char[] cArr, int i, int i2) {
        this.b.a = cArr;
        this.a.append(this.b, i, i + i2);
    }

    public final void write(int i) {
        this.a.append((char) i);
    }

    public final void flush() {
    }

    public final void close() {
    }
}
