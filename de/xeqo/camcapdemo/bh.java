package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class bh implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;

    bh(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onClick(View view) {
        this.a.i = this.a.A.b();
        this.a.h = this.a.A.c();
        this.a.a = this.a.A.a();
        this.a.g = this.a.A.e();
        this.a.m = this.a.A.k();
        this.a.l = this.a.A.l();
        this.a.k = this.a.A.i();
        this.a.j = this.a.A.j();
        this.a.n.post(this.a.b);
    }
}
