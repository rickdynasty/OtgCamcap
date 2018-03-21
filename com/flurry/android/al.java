package com.flurry.android;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class al {
    private List a = new ArrayList();
    private Handler b;
    private Handler c;
    private int d;
    private Runnable e;

    al(Handler handler, int i) {
        this.b = handler;
        this.c = new Handler();
        this.d = i;
        this.e = new f(this);
        b();
    }

    private synchronized void a() {
        List arrayList = new ArrayList();
        for (WeakReference weakReference : this.a) {
            j jVar = (j) weakReference.get();
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        this.c.post(new e(arrayList));
        b();
    }

    private synchronized void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        this.b.removeCallbacks(this.e);
        this.b.postDelayed(this.e, (long) this.d);
    }
}
