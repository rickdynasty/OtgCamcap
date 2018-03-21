package de.xeqo.camcapdemo;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;

final class g implements OnTouchListener {
    private /* synthetic */ CameraActivity a;
    private final /* synthetic */ ScaleGestureDetector b;

    g(CameraActivity cameraActivity, ScaleGestureDetector scaleGestureDetector) {
        this.a = cameraActivity;
        this.b = scaleGestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.b.onTouchEvent(motionEvent);
        return true;
    }
}
