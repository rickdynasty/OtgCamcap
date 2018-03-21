package de.xeqo.camcapdemo;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.b.a.util.VersionUtils;

public final class CameraActivity2_ extends CameraActivity2 {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.main_view_2);
    }

    private void a() {
        this.f = (Spinner) findViewById(R.id.spinnerApertureValues);
        this.d = (LinearLayout) findViewById(R.id.autoBracketLayout);
        this.e = (Spinner) findViewById(R.id.spinnerShutterValues);
        this.a = (LinearLayout) findViewById(R.id.timeLapseLayout);
        this.c = (LinearLayout) findViewById(R.id.autoBracketContentLayout);
        this.b = (LinearLayout) findViewById(R.id.timeLapseContentLayout);
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VersionUtils.a() < 5 && i == 4 && keyEvent.getRepeatCount() == 0) {
            onBackPressed();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
