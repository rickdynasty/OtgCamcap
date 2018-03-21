package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.ae;
import de.xeqo.camcapdemo.a.a;

final class bf extends a {
    private /* synthetic */ CameraActivity a;

    bf(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(int i) {
        ae aeVar = (ae) this.a.J.getItem(i);
        if (this.a.S != null && aeVar != null) {
            if (aeVar.f()) {
                this.a.S.a(aeVar);
            } else {
                this.a.a();
            }
        }
    }
}
