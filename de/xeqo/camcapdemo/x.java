package de.xeqo.camcapdemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class x implements OnClickListener {
    private final /* synthetic */ Activity a;

    x(Activity activity) {
        this.a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
