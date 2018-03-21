package de.xeqo.camcapdemo.gui;

import de.xeqo.a.a.k;
import de.xeqo.a.a.v;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class c implements Runnable {
    private static final v d;
    private Map a;
    private final Map b = new HashMap();
    private boolean c = false;

    static {
        v vVar = new v();
        d = vVar;
        vVar.a = true;
        d.c = true;
        d.b = true;
    }

    public final void a(f fVar) {
        if (fVar != null) {
            this.b.put(fVar.a(), fVar);
        }
    }

    public final void run() {
        synchronized (this) {
            if (this.c) {
                for (Entry value : this.b.entrySet()) {
                    f fVar = (f) value.getValue();
                    if (fVar != null) {
                        fVar.a(d);
                    }
                }
                this.c = false;
            } else if (this.a != null) {
                for (Entry value2 : this.a.entrySet()) {
                    if (this.b.containsKey(value2.getKey())) {
                        ((f) this.b.get(value2.getKey())).a((v) value2.getValue());
                    } else {
                        "Unknown CameraProperty! (" + ((k) value2.getKey()).toString() + ")";
                    }
                }
            }
        }
    }

    public final void a(Map map) {
        synchronized (this) {
            this.a = map;
        }
    }

    public final void a() {
        synchronized (this) {
            this.c = true;
        }
    }
}
