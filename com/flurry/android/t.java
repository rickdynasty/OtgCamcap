package com.flurry.android;

import android.content.Context;

final class t implements Runnable {
    private /* synthetic */ Context a;
    private /* synthetic */ boolean b;
    private /* synthetic */ v c;

    t(v vVar, Context context, boolean z) {
        this.c = vVar;
        this.a = context;
        this.b = z;
    }

    public final void run() {
        if (!this.c.w) {
            this.c.b(this.a);
        }
        v.a(this.c, this.a, this.b);
    }
}
