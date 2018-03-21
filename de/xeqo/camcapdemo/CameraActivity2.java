package de.xeqo.camcapdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import de.xeqo.a.a.i;
import de.xeqo.a.a.q;

public class CameraActivity2 extends Activity {
    LinearLayout a;
    LinearLayout b;
    LinearLayout c;
    LinearLayout d;
    Spinner e;
    Spinner f;
    private ab g;
    private ab h;
    private ab i;
    private ab j;
    private ab k;
    private ab l;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new ab(this, this, "Aperture");
        this.h = new ab(this, this, "Shutter");
        this.i = new ab(this, this, "ISO");
        this.j = new ab(this, this, "Ev");
        this.k = new ab(this, this, "W. balance");
        this.l = new ab(this, this, "Metering M.");
        this.e.setAdapter(this.h);
        this.f.setAdapter(this.g);
        String[] strArr = new String[]{"Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World", "Hello", "World"};
        LayoutParams layoutParams = new LayoutParams(-1, 0);
        LayoutParams layoutParams2 = new LayoutParams(-1, 150);
        this.a.setOnClickListener(new v(this, layoutParams, layoutParams2));
        this.d.setOnClickListener(new u(this, layoutParams, layoutParams2));
        i a = q.a();
        if (a != null && a.n()) {
            this.g.addAll(a.r().d());
            this.h.addAll(a.s().d());
        }
    }
}
