package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class c implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    c(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        if (this.a.u.isChecked()) {
            CameraActivity.a(this.a, bn.Normal);
        } else {
            CameraActivity.a(this.a, bn.TimeLapseMode);
        }
    }
}
