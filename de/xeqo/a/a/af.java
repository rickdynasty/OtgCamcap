package de.xeqo.a.a;

import de.xeqo.a.a.PtpUsbConnection.c;
import java.util.List;
import java.util.Vector;

public abstract class af extends x {
    private final Vector a = new Vector();

    public final List b() {
        return this.a;
    }

    public final void c() {
        this.a.clear();
    }

    protected final void a(c cVar) {
        if (cVar != null && !this.a.contains(cVar)) {
            this.a.add(cVar);
        }
    }

    public final boolean d() {
        return this.a.size() > 0;
    }
}
