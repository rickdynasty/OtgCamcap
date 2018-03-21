package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class ak implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    ak(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        if (this.a.S != null) {
            this.a.S.l();
        }
    }
}
