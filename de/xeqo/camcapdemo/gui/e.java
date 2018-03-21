package de.xeqo.camcapdemo.gui;

import android.view.View;
import android.view.View.OnClickListener;

final class e implements OnClickListener {
    private /* synthetic */ CameraPropertyBox a;

    e(CameraPropertyBox cameraPropertyBox) {
        this.a = cameraPropertyBox;
    }

    public final void onClick(View view) {
        this.a.b.performClick();
    }
}
