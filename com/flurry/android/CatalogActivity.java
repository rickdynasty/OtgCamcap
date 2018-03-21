package com.flurry.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;

public class CatalogActivity extends Activity implements OnClickListener {
    private static volatile String a = "<html><body><table height='100%' width='100%' border='0'><tr><td style='vertical-align:middle;text-align:center'>No recommendations available<p><button type='input' onClick='activity.finish()'>Back</button></td></tr></table></body></html>";
    private WebView b;
    private ab c;
    private List d = new ArrayList();
    public p e;
    private k f;

    protected void onCreate(Bundle bundle) {
        setTheme(16973839);
        super.onCreate(bundle);
        this.e = v.b();
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            Long valueOf = Long.valueOf(intent.getExtras().getLong("o"));
            if (valueOf != null) {
                this.f = this.e.b(valueOf.longValue());
            }
        }
        View aoVar = new ao(this, this);
        aoVar.setId(1);
        aoVar.setBackgroundColor(-16777216);
        this.b = new WebView(this);
        this.b.setId(2);
        this.b.setScrollBarStyle(0);
        this.b.setBackgroundColor(-1);
        if (this.f != null) {
            this.b.setWebViewClient(new l(this));
        }
        this.b.getSettings().setJavaScriptEnabled(true);
        this.b.addJavascriptInterface(this, "activity");
        this.c = new ab(this, this);
        this.c.setId(3);
        View relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LayoutParams(-1, -1));
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10, aoVar.getId());
        relativeLayout.addView(aoVar, layoutParams);
        layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, aoVar.getId());
        layoutParams.addRule(2, this.c.getId());
        relativeLayout.addView(this.b, layoutParams);
        layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, aoVar.getId());
        relativeLayout.addView(this.c, layoutParams);
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString("u");
        if (string == null) {
            this.b.loadDataWithBaseURL(null, a, "text/html", "utf-8", null);
        } else {
            this.b.loadUrl(string);
        }
        setContentView(relativeLayout);
    }

    public void finish() {
        super.finish();
    }

    protected void onDestroy() {
        this.e.g();
        super.onDestroy();
    }

    public void onClick(View view) {
        if (view instanceof z) {
            aa aaVar = new aa();
            aaVar.a = this.b.getUrl();
            aaVar.b = new ArrayList(this.c.b());
            this.d.add(aaVar);
            if (this.d.size() > 5) {
                this.d.remove(0);
            }
            aa aaVar2 = new aa();
            z zVar = (z) view;
            this.f = this.e.b(zVar.a());
            zVar.a(this.f);
            aaVar2.a = this.e.h() + this.e.a(zVar.a());
            aaVar2.b = this.c.a(view.getContext());
            a(aaVar2);
        } else if (view.getId() == 10000) {
            finish();
        } else if (view.getId() == 10002) {
            this.c.a();
        } else if (this.d.isEmpty()) {
            finish();
        } else {
            a((aa) this.d.remove(this.d.size() - 1));
        }
    }

    private void a(aa aaVar) {
        try {
            this.b.loadUrl(aaVar.a);
            this.c.a(aaVar.b);
        } catch (Exception e) {
            am.a("FlurryAgent", "Error loading url: " + aaVar.a);
        }
    }
}
