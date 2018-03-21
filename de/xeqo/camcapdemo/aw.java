package de.xeqo.camcapdemo;

import android.graphics.Bitmap;
import de.xeqo.util.BitmapUtils;

import java.io.File;

final class aw implements Runnable {
    final /* synthetic */ CameraActivity a;
    private final /* synthetic */ File b;

    aw(CameraActivity cameraActivity, File file) {
        this.a = cameraActivity;
        this.b = file;
    }

    public final void run() {
        try {
            Bitmap a = BitmapUtils.decodeByFile(this.b, 100);
            if (a != null) {
                this.a.R = a;
                this.a.U.post(this.a.F);
            }
            this.a.U.post(new bc(this));
        } catch (Throwable th) {
            this.a.U.post(new bc(this));
        }
    }
}
