package de.xeqo.camcapdemo;

import de.xeqo.a.a.i;

final class bs implements Runnable {
    boolean a = false;
    private i b;
    private /* synthetic */ CameraActivity c;

    public bs(CameraActivity cameraActivity, i iVar) {
        this.c = cameraActivity;
        this.b = iVar;
    }

    public final void run() {
        while (!this.a) {
            this.c.R = this.b.j();
            this.c.U.post(this.c.F);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
