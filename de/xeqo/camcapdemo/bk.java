package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class bk implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;

    bk(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onClick(View view) {
        this.a.A.a(this.a.i);
        this.a.A.a(this.a.a);
        this.a.A.a(this.a.k);
        this.a.A.b((char) this.a.m);
    }
}
