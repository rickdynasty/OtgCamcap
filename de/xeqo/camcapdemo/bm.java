package de.xeqo.camcapdemo;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

import de.xeqo.a.a.c.a.*;

final class bm implements OnClickListener {
    private /* synthetic */ RemoteCaptureActivity a;

    bm(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onClick(View view) {
        ArrayList<de.xeqo.a.a.c.a.c> arrayList = new ArrayList<de.xeqo.a.a.c.a.c>();
        arrayList.add(this.a.j[0]);
        arrayList.add(this.a.j[1]);
        arrayList.add(this.a.j[2]);
        arrayList.add(this.a.j[3]);
        RemoteCaptureActivity.b(this.a, arrayList);
    }
}
