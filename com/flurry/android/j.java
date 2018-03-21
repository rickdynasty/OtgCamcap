package com.flurry.android;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

final class j extends RelativeLayout {
    private p a;
    private Context b;
    private String c;
    private int d;
    private boolean e;
    private boolean f;

    final void a() {
        if (!this.e) {
            View c = c();
            if (c != null) {
                removeAllViews();
                addView(c, b());
                c.a().a(new w((byte) 3, this.a.i()));
                this.e = true;
            } else if (!this.f) {
                c = new TextView(this.b);
                c.setText(p.b);
                c.setTextSize(1, 20.0f);
                addView(c, b());
            }
            this.f = true;
        }
    }

    private static LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    private synchronized z c() {
        z zVar;
        List a = this.a.a(this.b, Arrays.asList(new String[]{this.c}), null, this.d, false);
        if (a.isEmpty()) {
            zVar = null;
        } else {
            zVar = (z) a.get(0);
            zVar.setOnClickListener(this.a);
        }
        return zVar;
    }
}
