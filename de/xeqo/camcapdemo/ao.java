package de.xeqo.camcapdemo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ao implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    ao(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CameraActivity.n(this.a);
    }
}
