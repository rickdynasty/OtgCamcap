package com.flurry.android;

import android.util.Log;

final class am {
    private static boolean a = false;
    private static int b = 5;

    am() {
    }

    static int a(String str, String str2, Throwable th) {
        if (a || b <= 3) {
            return 0;
        }
        return Log.d(str, str2, th);
    }

    static int a(String str, String str2) {
        if (a || b <= 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    static int b(String str, String str2, Throwable th) {
        if (a || b <= 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    static int b(String str, String str2) {
        if (a || b <= 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    static int c(String str, String str2, Throwable th) {
        if (a || b <= 4) {
            return 0;
        }
        return Log.i(str, str2, th);
    }

    static int c(String str, String str2) {
        if (a || b <= 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    static int d(String str, String str2) {
        if (a || b <= 5) {
            return 0;
        }
        return Log.w(str, str2);
    }
}
