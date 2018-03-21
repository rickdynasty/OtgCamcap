package com.flurry.android;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class l extends WebViewClient {
    private /* synthetic */ CatalogActivity a;

    l(CatalogActivity catalogActivity) {
        this.a = catalogActivity;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        if (this.a.f != null) {
            this.a.f.a(new w((byte) 6, this.a.e.i()));
        }
        this.a.e.a(webView.getContext(), this.a.f, str);
        return true;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        am.c("FlurryAgent", "Failed to load url: " + str2 + " with an errorCode of " + i);
        webView.loadData("Cannot find Android Market information. <p>Please check your network", "text/html", "UTF-8");
    }

    public final void onPageFinished(WebView webView, String str) {
        try {
            k a = this.a.f;
            w wVar = new w((byte) 5, this.a.e.i());
            long j = this.a.f.c;
            a.d.add(wVar);
            a.c = j;
        } catch (Exception e) {
        }
    }
}
