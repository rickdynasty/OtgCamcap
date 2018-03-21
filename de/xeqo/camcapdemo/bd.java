package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.w;
import de.xeqo.camcapdemo.a.a;

final class bd extends a {
    private /* synthetic */ CameraActivity a;

    bd(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(int i) {
        w wVar = (w) this.a.L.getItem(i);
        if (this.a.S != null && wVar != null) {
            if (wVar.f()) {
                this.a.S.a(wVar);
            } else {
                this.a.a();
            }
        }
    }
}
