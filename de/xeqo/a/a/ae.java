package de.xeqo.a.a;

import android.util.Log;
import java.util.List;

final class ae implements Runnable {
    private static /* synthetic */ boolean d = (!r.class.desiredAssertionStatus());
    private boolean a = false;
    private final r b;
    private /* synthetic */ r c;

    public ae(r rVar, r rVar2) {
        this.c = rVar;
        if (d || rVar2 != null) {
            this.b = rVar2;
            return;
        }
        throw new AssertionError();
    }

    public final void a() {
        this.a = true;
    }

    public final void run() {
        af d = this.b.d();
        if (d != null) {
            int i = 0;
            while (!this.a) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    i++;
                    if (i >= 5) {
                        this.a = true;
                    }
                }
                if (!(this.a || this.b == null || this.b.b == null)) {
                    d.c();
                    if (d.a(this.b.b) && d.f() && d.d()) {
                        List b = d.b();
                        if (b != null) {
                            this.b.k(b);
                        }
                    }
                }
            }
            Log.d("CamCap_Lib", "FetchEventLoop stopped");
        }
    }
}
