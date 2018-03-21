package com.flurry.android;

import java.lang.Thread.UncaughtExceptionHandler;

public final class ai implements UncaughtExceptionHandler {
    private UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    ai() {
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            v.j.a(th);
        } catch (Throwable th2) {
            am.b("FlurryAgent", "", th2);
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }
}
