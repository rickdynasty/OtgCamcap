package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class bi implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;

    bi(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onClick(View view) {
        this.a.c.add(String.valueOf(this.a.f.a()));
    }
}
