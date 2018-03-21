package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class e implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    e(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        this.a.d();
    }
}
