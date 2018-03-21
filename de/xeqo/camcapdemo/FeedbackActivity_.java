package de.xeqo.camcapdemo;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.b.a.util.VersionUtils;

public final class FeedbackActivity_ extends FeedbackActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    private void a() {
        this.m = (CheckBox) findViewById(R.id.checkBoxManualFocus);
        mErrorReporterBtn = (Button) findViewById(R.id.buttonSendReport);
        this.c = (EditText) findViewById(R.id.feedback_data_android_device);
        this.n = (CheckBox) findViewById(R.id.checkBoxLiveView);
        this.h = (Spinner) findViewById(R.id.spinnerMeteringModeFeedback);
        this.i = (Spinner) findViewById(R.id.spinnerPictureStyleFeedback);
        this.j = (Spinner) findViewById(R.id.spinnerWhiteBalanceFeedback);
        this.k = (EditText) findViewById(R.id.editTextSummary);
        this.g = (Spinner) findViewById(R.id.spinnerIsoFeedback);
        this.f = (Spinner) findViewById(R.id.spinnerApertureFeedback);
        this.e = (Spinner) findViewById(R.id.spinnerShutterSpeedFeedback);
        this.l = (CheckBox) findViewById(R.id.checkBoxAutofocus);
        this.d = (EditText) findViewById(R.id.feedback_data_mail);
        this.b = (EditText) findViewById(R.id.feedback_data_cam_model);
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
