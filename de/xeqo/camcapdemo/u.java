package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;

final class u implements OnClickListener {
    private /* synthetic */ CameraActivity2 a;
    private final /* synthetic */ LayoutParams b;
    private final /* synthetic */ LayoutParams c;

    u(CameraActivity2 cameraActivity2, LayoutParams layoutParams, LayoutParams layoutParams2) {
        this.a = cameraActivity2;
        this.b = layoutParams;
        this.c = layoutParams2;
    }

    public final void onClick(View view) {
        if (this.a.c.getHeight() > 0) {
            this.a.c.setLayoutParams(this.b);
            return;
        }
        this.a.b.setLayoutParams(this.b);
        this.a.c.setLayoutParams(this.c);
    }
}
