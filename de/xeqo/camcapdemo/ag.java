package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.ad;
import de.xeqo.camcapdemo.a.a;

final class ag extends a {
    private /* synthetic */ CameraActivity a;

    ag(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(int i) {
        ad adVar = (ad) this.a.N.getItem(i);
        if (this.a.S != null && adVar != null) {
            this.a.S.a(adVar);
        }
    }
}
