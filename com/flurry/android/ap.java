package com.flurry.android;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;

final class ap implements OnFocusChangeListener {
    private /* synthetic */ TextView a;
    private /* synthetic */ ao b;

    ap(ao aoVar, TextView textView) {
        this.b = aoVar;
        this.a = textView;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.setText(z ? this.b.b : this.b.a);
    }
}
