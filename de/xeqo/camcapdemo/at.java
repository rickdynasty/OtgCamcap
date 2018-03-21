package de.xeqo.camcapdemo;

import android.view.View;
import de.xeqo.a.a.c;
import de.xeqo.camcapdemo.gui.h;

final class at implements Runnable {
    final /* synthetic */ CameraActivity a;
    private final /* synthetic */ c b;

    at(CameraActivity cameraActivity, c cVar) {
        this.a = cameraActivity;
        this.b = cVar;
    }

    public final void run() {
        View hVar = new h(this.a, this.b);
        hVar.setOnClickListener(new ay(this, hVar));
        synchronized (this.a.r) {
            while (this.a.r.getChildCount() >= 5) {
                this.a.r.removeViewAt(0);
            }
            this.a.r.addView(hVar);
        }
    }
}
