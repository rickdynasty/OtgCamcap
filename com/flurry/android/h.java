package com.flurry.android;

final class h implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ ag b;

    h(ag agVar, String str) {
        this.b = agVar;
        this.a = str;
    }

    public final void run() {
        if (this.a != null) {
            p.a(this.b.d, this.b.b, this.a);
            this.b.c.a(new w((byte) 8, this.b.d.i()));
            return;
        }
        String str = "Unable to launch in app market: " + this.b.a;
        am.d(p.a, str);
        this.b.d.c(str);
    }
}
