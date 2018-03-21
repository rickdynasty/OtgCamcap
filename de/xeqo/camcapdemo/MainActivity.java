package de.xeqo.camcapdemo;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.b.a.util.VersionUtils;

import de.xeqo.camcapdemo.gui.CameraPropertyBox;

public final class MainActivity extends CameraActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    private void e() {
        this.w = (LinearLayout) findViewById(R.id.timeLapseLayout);
        this.B = (Button) findViewById(R.id.buttonShowOnMarket);
        this.A = (LinearLayout) findViewById(R.id.focusButtonsLayout);
        this.z = (LinearLayout) findViewById(R.id.autoBracketLayout);
        this.g = (CameraPropertyBox) findViewById(R.id.spinnerMeteringModeValues);
        this.E = (LinearLayout) findViewById(R.id.layoutBottom);
        this.a = (CameraPropertyBox) findViewById(R.id.spinnerShutterValues);
        this.d = (CameraPropertyBox) findViewById(R.id.spinnerEvValues);
        this.y = (LinearLayout) findViewById(R.id.autoBracketContentLayout);
        this.m = (ToggleButton) findViewById(R.id.toggleButtonLiveView);
        this.s = (Button) findViewById(R.id.buttonAutoFocus);
        this.l = (TextView) findViewById(R.id.textViewCameraMode);
        this.C = (Button) findViewById(R.id.buttonShowOnMarket2);
        this.o = (Button) findViewById(R.id.buttonMfDriveBackwardShort);
        this.p = (Button) findViewById(R.id.buttonMfDriveForwardLong);
        this.i = (CameraPropertyBox) findViewById(R.id.spinnerCompressionSetting);
        this.u = (CheckBox) findViewById(R.id.checkBoxTimeLapse);
        this.e = (CameraPropertyBox) findViewById(R.id.spinnerWhiteBalanceValues);
        this.t = findViewById(R.id.progressLoadingImage);
        this.q = (Button) findViewById(R.id.buttonMfDriveBackwardLong);
        this.k = (ImageView) findViewById(R.id.imageViewMain);
        this.h = (CameraPropertyBox) findViewById(R.id.spinnerPictureStyleValues);
        this.c = (CameraPropertyBox) findViewById(R.id.spinnerIsoValues);
        this.D = (LinearLayout) findViewById(R.id.rightLayout);
        this.r = (LinearLayout) findViewById(R.id.layoutThumbs);
        this.v = (LinearLayout) findViewById(R.id.timeLapseContentLayout);
        this.f = (CameraPropertyBox) findViewById(R.id.spinnerKelvinValues);
        this.b = (CameraPropertyBox) findViewById(R.id.spinnerApertureValues);
        this.n = (Button) findViewById(R.id.buttonMfDriveForwardShort);
        this.j = (Button) findViewById(R.id.buttonInitCapture);
        this.x = (CheckBox) findViewById(R.id.checkBoxBracketingMode);
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        e();
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        e();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        e();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VersionUtils.a() < 5 && i == 4 && keyEvent.getRepeatCount() == 0) {
            onBackPressed();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
