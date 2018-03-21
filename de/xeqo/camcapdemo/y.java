package de.xeqo.camcapdemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class y implements OnCancelListener {
    private final /* synthetic */ Activity a;

    y(Activity activity) {
        this.a = activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
