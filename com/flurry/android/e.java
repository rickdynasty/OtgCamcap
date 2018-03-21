package com.flurry.android;

import java.util.List;

final class e implements Runnable {
    private /* synthetic */ List a;

    e(List list) {
        this.a = list;
    }

    public final void run() {
        for (j a : this.a) {
            a.a();
        }
    }
}
