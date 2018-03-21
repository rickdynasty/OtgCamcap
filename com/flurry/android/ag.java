package com.flurry.android;

import android.content.Context;
import android.os.Handler;

final class ag implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ k c;
    final /* synthetic */ p d;

    ag(p pVar, String str, Context context, k kVar) {
        this.d = pVar;
        this.a = str;
        this.b = context;
        this.c = kVar;
    }

    public final void run() {
        new Handler().post(new h(this, this.d.b(this.a)));
    }
}
