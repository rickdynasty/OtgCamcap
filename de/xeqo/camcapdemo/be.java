package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.i;
import de.xeqo.camcapdemo.a.a;

final class be extends a {
    private /* synthetic */ CameraActivity a;

    be(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(int i) {
        i iVar = (i) this.a.K.getItem(i);
        if (this.a.S != null && iVar != null) {
            if (iVar.f()) {
                this.a.S.a(iVar);
            } else {
                this.a.a();
            }
        }
    }
}
