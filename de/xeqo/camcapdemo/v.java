package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;

final class v implements OnClickListener {
    private /* synthetic */ CameraActivity2 a;
    private final /* synthetic */ LayoutParams b;
    private final /* synthetic */ LayoutParams c;

    v(CameraActivity2 cameraActivity2, LayoutParams layoutParams, LayoutParams layoutParams2) {
        this.a = cameraActivity2;
        this.b = layoutParams;
        this.c = layoutParams2;
    }

    public final void onClick(View view) {
        if (this.a.b.getHeight() > 0) {
            this.a.b.setLayoutParams(this.b);
            return;
        }
        this.a.c.setLayoutParams(this.b);
        this.a.b.setLayoutParams(this.c);
    }
}
