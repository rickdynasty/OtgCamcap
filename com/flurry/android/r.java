package com.flurry.android;

import android.content.Context;

final class r implements Runnable {
    final /* synthetic */ v a;
    private /* synthetic */ boolean b;
    private /* synthetic */ Context c;

    r(v vVar, boolean z, Context context) {
        this.a = vVar;
        this.b = z;
        this.c = context;
    }

    public final void run() {
        this.a.g();
        this.a.i();
        if (!this.b) {
            this.a.s.postDelayed(new g(this), v.k);
        }
        if (v.q) {
            this.a.aa.c();
        }
    }
}
