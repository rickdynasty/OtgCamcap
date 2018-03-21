package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;

final class ad implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    ad(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(View view) {
        if (this.a.m.isChecked()) {
            this.a.c();
        } else {
            this.a.b();
        }
    }
}
