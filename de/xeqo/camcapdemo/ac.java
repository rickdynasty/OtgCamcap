package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.r;
import de.xeqo.camcapdemo.a.a;

final class ac extends a {
    private /* synthetic */ CameraActivity a;

    ac(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(int i) {
        r rVar = (r) this.a.Q.getItem(i);
        if (this.a.S != null && rVar != null) {
            this.a.S.a(rVar);
        }
    }
}
