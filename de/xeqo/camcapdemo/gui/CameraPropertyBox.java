package de.xeqo.camcapdemo.gui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import de.xeqo.camcapdemo.az;

public class CameraPropertyBox extends LinearLayout {
    private final TextView a;
    private final i b;

    public CameraPropertyBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.a = new TextView(context);
        this.a.setTextSize(2, 15.0f);
        this.a.setTextColor(-7829368);
        addView(this.a, new LayoutParams(-2, -2));
        this.b = new i(context);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setGravity(5);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.setMargins(0, 0, 0, 0);
        View frameLayout = new FrameLayout(context);
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.addView(this.b, layoutParams);
        addView(frameLayout, new LayoutParams(-1, -1, 10.0f));
        CharSequence string = context.obtainStyledAttributes(attributeSet, az.a).getString(0);
        if (string != null) {
            this.a.setText(string.toString());
        }
        setOnClickListener(new e(this));
    }

    public final i a() {
        return this.b;
    }
}
