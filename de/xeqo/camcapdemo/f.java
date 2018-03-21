package de.xeqo.camcapdemo;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class f implements OnCheckedChangeListener {
    private /* synthetic */ CameraActivity a;

    f(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.u.isChecked()) {
            CameraActivity.a(this.a, bn.TimeLapseMode);
        } else {
            CameraActivity.a(this.a, bn.Normal);
        }
    }
}
