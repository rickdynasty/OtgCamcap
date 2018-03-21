package de.xeqo.camcapdemo;

import de.xeqo.a.a.a;

final class t implements Runnable {
    boolean a = false;
    private a b;
    private /* synthetic */ RemoteCaptureActivity c;

    public t(RemoteCaptureActivity remoteCaptureActivity, a aVar) {
        this.c = remoteCaptureActivity;
        this.b = aVar;
    }

    public final void run() {
        while (!this.a) {
            this.c.v = this.b.h();
            this.c.n.post(this.c.b);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
