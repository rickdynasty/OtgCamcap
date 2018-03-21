package com.a.a.a;

final class v implements CharSequence {
    char[] a;

    v() {
    }

    public final int length() {
        return this.a.length;
    }

    public final char charAt(int i) {
        return this.a[i];
    }

    public final CharSequence subSequence(int i, int i2) {
        return new String(this.a, i, i2 - i);
    }
}
