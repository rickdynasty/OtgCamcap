package de.xeqo.camcapdemo.gui;

import de.xeqo.a.a.k;
import de.xeqo.a.a.l;
import de.xeqo.a.a.v;
import de.xeqo.camcapdemo.z;

public final class d extends f {
    private final i a;
    private final z b;
    private final l c;

    public d(l lVar, i iVar, z zVar) {
        this.c = lVar;
        this.a = iVar;
        this.b = zVar;
    }

    protected final k a() {
        return this.c.a();
    }

    public final void a(v vVar) {
        if (vVar != null) {
            if (vVar.b) {
                this.b.clear();
                this.b.addAll(this.c.d());
            }
            if (vVar.a) {
                this.a.a(this.b.getPosition(this.c.c()));
            }
            if (vVar.c) {
                this.a.a(this.c.b());
            }
        }
    }
}
