package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

final class q implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;
    private final /* synthetic */ ToggleButton b;

    q(RemoteCaptureActivity remoteCaptureActivity, ToggleButton toggleButton) {
        this.a = remoteCaptureActivity;
        this.b = toggleButton;
    }

    public final void onClick(View view) {
        if (this.b.isChecked()) {
            this.a.A.a(1);
        } else {
            this.a.A.a(0);
        }
    }
}
