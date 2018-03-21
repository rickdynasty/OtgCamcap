package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class d implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    d(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        if (this.a.x.isChecked()) {
            CameraActivity.a(this.a, bn.Normal);
        } else {
            CameraActivity.a(this.a, bn.BracketingMode);
        }
    }
}
