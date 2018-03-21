package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class al implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    al(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        if (this.a.S != null) {
            this.a.S.a(1, 2);
        }
    }
}
