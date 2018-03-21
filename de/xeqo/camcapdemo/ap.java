package de.xeqo.camcapdemo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ap implements OnClickListener {
    private /* synthetic */ CameraActivity a;

    ap(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
