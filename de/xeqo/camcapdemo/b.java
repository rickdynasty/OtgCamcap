package de.xeqo.camcapdemo;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class b implements OnCheckedChangeListener {
    private /* synthetic */ CameraActivity a;

    b(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.x.isChecked()) {
            CameraActivity.a(this.a, bn.BracketingMode);
        } else {
            CameraActivity.a(this.a, bn.Normal);
        }
    }
}
