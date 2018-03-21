package de.xeqo.camcapdemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;

final class w implements OnClickListener {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ Activity b;

    w(SharedPreferences sharedPreferences, Activity activity) {
        this.a = sharedPreferences;
        this.b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.edit().putBoolean("eula.accepted", true).commit();
    }
}
