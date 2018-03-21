package de.xeqo.camcapdemo;

final class i implements Runnable {
    private /* synthetic */ CameraActivity a;

    i(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void run() {
        if (this.a.R != null) {
            this.a.k.setImageBitmap(this.a.R);
        }
    }
}
