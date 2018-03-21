package de.xeqo.camcapdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.flurry.android.v;
import de.xeqo.a.a.c.e;
import de.xeqo.a.a.i;

public class FeedbackActivity extends Activity {
    Button mErrorReporterBtn;
    EditText b;
    EditText c;
    EditText d;
    Spinner e;
    Spinner f;
    Spinner g;
    Spinner h;
    Spinner i;
    Spinner j;
    EditText k;
    CheckBox l;
    CheckBox m;
    CheckBox n;
    private e o = null;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.feedback);
        getWindow().setSoftInputMode(3);
        i a = ((CamCap) getApplication()).a();
        if (a != null) {
            this.o = a.q();
        }
        //mErrorReporterBtn.setOnClickListener(new br(this));
    }

    protected void onStart() {
        super.onStart();
        v.a((Context) this, "9KHHKKN1MUHRB81BS39D");
    }

    protected void onStop() {
        super.onStop();
        v.a((Context) this);
    }
}
