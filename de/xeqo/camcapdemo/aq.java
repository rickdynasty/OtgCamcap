package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class aq implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    aq(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        CameraActivity.n(this.a);
    }
}
