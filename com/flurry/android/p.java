package com.flurry.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

final class p implements OnClickListener {
    private static volatile long A = 0;
    static String a = "FlurryAgent";
    static String b = "";
    private static volatile String c = "market://";
    private static volatile String d = "market://details?id=";
    private static volatile String e = "https://market.android.com/details?id=";
    private static String f = "com.flurry.android.ACTION_CATALOG";
    private static int g = 5000;
    private String h;
    private String i;
    private String j;
    private long k;
    private long l;
    private long m;
    private long n;
    private y o = new y();
    private boolean p = true;
    private volatile boolean q;
    private String r;
    private Map s = new HashMap();
    private Handler t;
    private boolean u;
    private transient Map v = new HashMap();
    private al w;
    private List x = new ArrayList();
    private Map y = new HashMap();
    private ac z;

    static /* synthetic */ void a(p pVar, Context context, String str) {
        if (str.startsWith(d)) {
            String substring = str.substring(d.length());
            if (pVar.p) {
                try {
                    am.a(a, "Launching Android Market for app " + substring);
                    context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
                    return;
                } catch (Throwable e) {
                    am.c(a, "Cannot launch Marketplace url " + str, e);
                    return;
                }
            }
            am.a(a, "Launching Android Market website for app " + substring);
            context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(e + substring)));
            return;
        }
        am.d(a, "Unexpected android market url scheme: " + str);
    }

    static {
        Random random = new Random(System.currentTimeMillis());
    }

    final synchronized void a(Context context, s sVar) {
        boolean z = true;
        synchronized (this) {
            if (!this.q) {
                this.h = sVar.c;
                this.i = sVar.d;
                this.j = sVar.a;
                this.k = sVar.b;
                this.t = sVar.e;
                this.w = new al(this.t, g);
                context.getResources().getDisplayMetrics();
                this.y.clear();
                this.v.clear();
                this.o.a(context, this, sVar);
                this.s.clear();
                PackageManager packageManager = context.getPackageManager();
                String str = d + context.getPackageName();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (packageManager.queryIntentActivities(intent, 65536).size() <= 0) {
                    z = false;
                }
                this.p = z;
                this.q = true;
            }
        }
    }

    final synchronized void a(long j, long j2) {
        this.l = j;
        this.m = j2;
        this.n = 0;
        this.x.clear();
    }

    final boolean a() {
        return this.q;
    }

    final void a(String str) {
        this.r = str;
    }

    final synchronized void b() {
        if (l()) {
            this.o.e();
        }
    }

    final synchronized void c() {
        if (l()) {
            this.o.f();
        }
    }

    final synchronized void a(Map map, Map map2, Map map3, Map map4, Map map5, Map map6) {
        if (l()) {
            this.o.a(map, map2, map3, map4, map5, map6);
            Log.i("FlurryAgent", this.o.toString());
        }
    }

    final synchronized long d() {
        long d;
        if (l()) {
            d = this.o.d();
        } else {
            d = 0;
        }
        return d;
    }

    final synchronized Set e() {
        Set a;
        if (l()) {
            a = this.o.a();
        } else {
            a = Collections.emptySet();
        }
        return a;
    }

    final synchronized a a(long j) {
        a a;
        if (l()) {
            a = this.o.a(j);
        } else {
            a = null;
        }
        return a;
    }

    private synchronized a k() {
        a b;
        if (l()) {
            b = this.o.b();
        } else {
            b = null;
        }
        return b;
    }

    final synchronized List f() {
        return this.x;
    }

    final synchronized k b(long j) {
        return (k) this.v.get(Long.valueOf(j));
    }

    final synchronized void g() {
        this.v.clear();
    }

    final String h() {
        return this.h;
    }

    final synchronized void a(Context context, k kVar, String str) {
        if (l()) {
            this.t.post(new ag(this, str, context, kVar));
        }
    }

    private String b(String str) {
        try {
            if (str.startsWith(c)) {
                return str;
            }
            HttpResponse execute = new DefaultHttpClient().execute(new HttpGet(str));
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                str = EntityUtils.toString(execute.getEntity());
                if (str.startsWith(c)) {
                    return str;
                }
                return b(str);
            }
            am.c(a, "Cannot process with responseCode " + statusCode);
            c("Error when fetching application's android market ID, responseCode " + statusCode);
            return str;
        } catch (UnknownHostException e) {
            am.c(a, "Unknown host: " + e.getMessage());
            if (this.z != null) {
                c("Unknown host: " + e.getMessage());
            }
            return null;
        } catch (Throwable e2) {
            am.c(a, "Failed on url: " + str, e2);
            return null;
        }
    }

    private void c(String str) {
        a(new ar(this, str));
    }

    final synchronized List a(Context context, List list, Long l, int i, boolean z) {
        List emptyList;
        if (!l()) {
            emptyList = Collections.emptyList();
        } else if (!this.o.c() || list == null) {
            emptyList = Collections.emptyList();
        } else {
            List emptyList2;
            if (list == null || list.isEmpty() || !this.o.c()) {
                emptyList2 = Collections.emptyList();
            } else {
                q[] a = this.o.a((String) list.get(0));
                if (a == null || a.length <= 0) {
                    emptyList2 = Collections.emptyList();
                } else {
                    List arrayList = new ArrayList(Arrays.asList(a));
                    Collections.shuffle(arrayList);
                    if (l != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((q) it.next()).a == l.longValue()) {
                                it.remove();
                                break;
                            }
                        }
                    }
                    emptyList2 = arrayList.subList(0, Math.min(arrayList.size(), list.size()));
                }
            }
            int min = Math.min(list.size(), emptyList2.size());
            List arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < min; i2++) {
                String str = (String) list.get(i2);
                x b = this.o.b(str);
                if (b != null) {
                    k kVar = new k((String) list.get(i2), (byte) 1, i());
                    if (this.x.size() < 32767) {
                        this.x.add(kVar);
                        this.v.put(Long.valueOf(kVar.a()), kVar);
                    }
                    if (i2 < emptyList2.size()) {
                        kVar.b = (q) emptyList2.get(i2);
                        kVar.a(new w((byte) 2, i()));
                        arrayList2.add(new z(context, this, kVar, b, i, z));
                    }
                } else {
                    am.d(a, "Cannot find hook: " + str);
                }
            }
            emptyList = arrayList2;
        }
        return emptyList;
    }

    final synchronized long i() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (elapsedRealtime <= this.n) {
            elapsedRealtime = this.n + 1;
            this.n = elapsedRealtime;
        }
        this.n = elapsedRealtime;
        return this.n;
    }

    public final synchronized void onClick(View view) {
        z zVar = (z) view;
        k b = b(zVar.a());
        zVar.a(b);
        String a = a(b);
        if (this.u) {
            Context context = view.getContext();
            String str = this.h + a;
            Intent intent = new Intent(v.a != null ? v.a : f);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("u", str);
            if (b != null) {
                intent.putExtra("o", b.a());
            }
            context.startActivity(intent);
        } else {
            a(view.getContext(), b, this.i + a);
        }
    }

    final synchronized String a(k kVar) {
        StringBuilder append;
        q qVar = kVar.b;
        append = new StringBuilder().append("?apik=").append(this.j).append("&cid=").append(qVar.e).append("&adid=").append(qVar.a).append("&pid=").append(this.r).append("&iid=").append(this.k).append("&sid=").append(this.l).append("&its=").append(kVar.a()).append("&hid=").append(m.a(kVar.a)).append("&ac=").append(a(qVar.g));
        if (!(this.s == null || this.s.isEmpty())) {
            for (Entry entry : this.s.entrySet()) {
                String str = "c_" + m.a((String) entry.getKey());
                append.append("&").append(str).append("=").append(m.a((String) entry.getValue()));
            }
        }
        append.append("&ats=").append(System.currentTimeMillis());
        return append.toString();
    }

    private static String a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] >> 4) & 15;
            if (i2 < 10) {
                stringBuilder.append((char) (i2 + 48));
            } else {
                stringBuilder.append((char) ((i2 + 65) - 10));
            }
            i2 = bArr[i] & 15;
            if (i2 < 10) {
                stringBuilder.append((char) (i2 + 48));
            } else {
                stringBuilder.append((char) ((i2 + 65) - 10));
            }
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[adLogs=").append(this.x).append("]");
        return stringBuilder.toString();
    }

    final synchronized a j() {
        a k;
        if (l()) {
            k = k();
        } else {
            k = null;
        }
        return k;
    }

    final synchronized k b(k kVar) {
        if (!this.x.contains(kVar)) {
            k kVar2 = new k(kVar, i());
            this.x.add(kVar2);
            kVar = kVar2;
        }
        kVar.a(new w((byte) 4, i()));
        return kVar;
    }

    private static void a(Runnable runnable) {
        new Handler().post(runnable);
    }

    final synchronized void a(int i) {
        if (this.z != null) {
            a(new aq(this, i));
        }
    }

    private boolean l() {
        if (!this.q) {
            am.d(a, "AppCircle is not initialized");
        }
        if (this.r == null) {
            am.d(a, "Cannot identify UDID.");
        }
        return this.q;
    }
}
