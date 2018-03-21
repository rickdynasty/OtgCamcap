package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.n;
import de.xeqo.camcapdemo.a.a;

final class bg extends a {
    private /* synthetic */ CameraActivity a;

    bg(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(int i) {
        n nVar = (n) this.a.I.getItem(i);
        if (this.a.S != null && nVar != null) {
            if (nVar.f()) {
                this.a.S.a(nVar);
            } else {
                this.a.a();
            }
        }
    }
}
