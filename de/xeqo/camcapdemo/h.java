package de.xeqo.camcapdemo;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

final class h implements OnScaleGestureListener {
    private float a;
    private /* synthetic */ CameraActivity b;

    h(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.b.a(this.a > 1.0f);
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.a = 1.0f;
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a *= scaleGestureDetector.getScaleFactor();
        return true;
    }
}
