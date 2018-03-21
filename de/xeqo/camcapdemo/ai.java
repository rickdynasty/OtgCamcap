package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class ai implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    ai(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        if (this.a.S != null) {
            this.a.S.a(1, 1);
        }
    }
}
