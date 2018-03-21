package com.b.a.util;

import android.os.Build.VERSION;

public final class VersionUtils {
    public static int a() {
        if (VERSION.RELEASE.startsWith("1.5")) {
            return 3;
        }
        return VERSION.SDK_INT;
    }
}
