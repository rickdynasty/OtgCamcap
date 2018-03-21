package de.xeqo.camcapdemo.gui;

import android.widget.TextView;
import de.xeqo.a.a.c.b;
import de.xeqo.a.a.k;
import de.xeqo.a.a.l;
import de.xeqo.a.a.v;

public final class j extends f {
    private l a;
    private TextView b;

    public j(l lVar, TextView textView) {
        this.a = lVar;
        this.b = textView;
    }

    protected final k a() {
        return this.a.a();
    }

    public final void a(v vVar) {
        if (vVar != null && vVar.a && this.a.c() != null) {
            this.b.setText(((b) this.a.c()).d());
        }
    }
}
