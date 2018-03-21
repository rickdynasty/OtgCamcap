package de.xeqo.camcapdemo.gui;

final class k implements Runnable {
    private int a;
    private /* synthetic */ h b;

    k(h hVar) {
        this.b = hVar;
    }

    public final void run() {
        synchronized (this) {
            this.b.b.setProgress(this.a);
        }
    }

    public final void a(int i) {
        synchronized (this) {
            this.a = i;
        }
    }
}
