package de.xeqo.camcapdemo;

final class ax implements Runnable {
    private /* synthetic */ CameraActivity a;

    ax(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void run() {
        this.a.t.setVisibility(0);
    }
}
