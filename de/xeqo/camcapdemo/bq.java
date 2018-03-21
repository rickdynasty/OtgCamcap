package de.xeqo.camcapdemo;

import de.xeqo.a.a.c;
import de.xeqo.a.a.g.a;
import java.util.Map;

final class bq implements a {
    final /* synthetic */ CameraActivity a;

    bq(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void a(Map map) {
        this.a.T.a(map);
        this.a.U.post(this.a.T);
    }

    public final void a(c cVar) {
        if (cVar != null) {
            CameraActivity.a(this.a, cVar);
            cVar.a(new ba(this, cVar));
        }
    }
}
