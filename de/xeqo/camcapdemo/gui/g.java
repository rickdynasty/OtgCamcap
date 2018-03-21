package de.xeqo.camcapdemo.gui;

import android.graphics.Bitmap;

final class g implements Runnable {
    private Bitmap a;
    private /* synthetic */ h b;

    g(h hVar) {
        this.b = hVar;
    }

    public final void run() {
        synchronized (this) {
            if (this.a != null) {
                this.b.a.setImageBitmap(this.a);
            }
            this.b.b.setVisibility(4);
        }
    }

    public final void a(Bitmap bitmap) {
        synchronized (this) {
            this.a = bitmap;
        }
    }
}
