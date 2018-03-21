package com.a.a.c;

final /* synthetic */ class b {
    static final /* synthetic */ int[] a = new int[c.values().length];

    static {
        try {
            a[c.EMPTY_DOCUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[c.EMPTY_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[c.NONEMPTY_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[c.DANGLING_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[c.NONEMPTY_DOCUMENT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
