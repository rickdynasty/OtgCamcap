package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;
import de.xeqo.a.a.c.g;
import de.xeqo.a.a.h;

final class bj implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;

    bj(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onClick(View view) {
        if (this.a.A.d() == h.a) {
            g m = this.a.A.m();
            if (this.a.A.b(m.b()) != null) {
                this.a.t = this.a.A.c(m.b());
                this.a.v = null;
                "captute image: " + this.a.t;
                this.a.n.post(this.a.b);
            }
        }
    }
}
