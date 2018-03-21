package com.flurry.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings.System;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.WeakHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class v implements LocationListener {
    static String a;
    private static final String[] b = new String[]{"9774d56d682e549c", "dead00beef"};
    private static volatile String c = null;
    private static volatile String d = "http://data.flurry.com/aap.do";
    private static volatile String e = "https://data.flurry.com/aap.do";
    private static volatile String f = null;
    private static volatile String g = "http://ad.flurry.com/getCanvas.do";
    private static volatile String h = null;
    private static volatile String i = "http://ad.flurry.com/getAndroidApp.do";
    private static final v j = new v();
    private static long k = 10000;
    private static boolean l = true;
    private static boolean m = false;
    private static boolean n = false;
    private static boolean o = true;
    private static Criteria p = null;
    private static boolean q = false;
    private static ad r = new ad();
    private String A;
    private String B;
    private boolean C = true;
    private List D;
    private LocationManager E;
    private String F;
    private boolean G;
    private long H;
    private List I = new ArrayList();
    private long J;
    private long K;
    private long L;
    private String M = "";
    private String N = "";
    private byte O = (byte) -1;
    private String P = "";
    private byte Q = (byte) -1;
    private Long R;
    private int S;
    private Location T;
    private Map U = new HashMap();
    private List V = new ArrayList();
    private boolean W;
    private int X;
    private List Y = new ArrayList();
    private int Z;
    private p aa = new p();
    private final Handler s;
    private File t;
    private File u = null;
    private volatile boolean v = false;
    private volatile boolean w = false;
    private long x;
    private Map y = new WeakHashMap();
    private String z;

    static /* synthetic */ void a(v vVar, Context context, boolean z) {
        Location location = null;
        if (z) {
            try {
                location = vVar.e(context);
            } catch (Throwable th) {
                am.b("FlurryAgent", "", th);
                return;
            }
        }
        synchronized (vVar) {
            vVar.T = location;
        }
        if (q) {
            vVar.aa.b();
        }
        vVar.b(true);
    }

    static /* synthetic */ void d(v vVar) {
        Object obj = null;
        try {
            synchronized (vVar) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - vVar.x;
                if (!vVar.v && elapsedRealtime > k && vVar.I.size() > 0) {
                    obj = 1;
                }
            }
            if (obj != null) {
                vVar.b(false);
            }
        } catch (Throwable th) {
            am.b("FlurryAgent", "", th);
        }
    }

    final void a(Throwable th) {
        th.printStackTrace();
        String str = "";
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            StackTraceElement stackTraceElement = stackTrace[0];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append(":").append(stackTraceElement.getLineNumber());
            if (th.getMessage() != null) {
                stringBuilder.append(" (" + th.getMessage() + ")");
            }
            str = stringBuilder.toString();
        } else if (th.getMessage() != null) {
            str = th.getMessage();
        }
        try {
            j.a("uncaught", str, th.getClass().toString());
        } catch (Throwable th2) {
            am.b("FlurryAgent", "", th2);
        }
        this.y.clear();
        a(null, true);
    }

    private v() {
        HandlerThread handlerThread = new HandlerThread("FlurryAgent");
        handlerThread.start();
        this.s = new Handler(handlerThread.getLooper());
    }

    public static void a(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("Null context");
        } else if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Api key not specified");
        } else {
            try {
                j.b(context, str);
            } catch (Throwable th) {
                am.b("FlurryAgent", "", th);
            }
        }
    }

    public static void a(Context context) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        try {
            j.a(context, false);
        } catch (Throwable th) {
            am.b("FlurryAgent", "", th);
        }
    }

    protected static boolean a() {
        return o;
    }

    static p b() {
        return j.aa;
    }

    private synchronized void b(Context context, String str) {
        if (!(this.z == null || this.z.equals(str))) {
            am.b("FlurryAgent", "onStartSession called with different api keys: " + this.z + " and " + str);
        }
        if (((Context) this.y.put(context, context)) != null) {
            am.d("FlurryAgent", "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context");
        }
        if (!this.v) {
            am.a("FlurryAgent", "Initializing Flurry session");
            this.z = str;
            this.u = context.getFileStreamPath(".flurryagent." + Integer.toString(this.z.hashCode(), 16));
            this.t = context.getFileStreamPath(".flurryb.");
            if (o) {
                Thread.setDefaultUncaughtExceptionHandler(new ai());
            }
            Context applicationContext = context.getApplicationContext();
            if (this.B == null) {
                this.B = d(applicationContext);
            }
            String packageName = applicationContext.getPackageName();
            if (!(this.A == null || this.A.equals(packageName))) {
                am.b("FlurryAgent", "onStartSession called from different application packages: " + this.A + " and " + packageName);
            }
            this.A = packageName;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.x > k) {
                am.a("FlurryAgent", "New session");
                this.J = System.currentTimeMillis();
                this.K = elapsedRealtime;
                this.L = -1;
                this.P = "";
                this.S = 0;
                this.T = null;
                this.N = TimeZone.getDefault().getID();
                this.M = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
                this.U = new HashMap();
                this.V = new ArrayList();
                this.W = true;
                this.Y = new ArrayList();
                this.X = 0;
                this.Z = 0;
                if (q) {
                    if (!this.aa.a()) {
                        am.a("FlurryAgent", "Initializing AppCircle");
                        s sVar = new s();
                        sVar.a = this.z;
                        sVar.b = this.H;
                        sVar.c = f != null ? f : g;
                        sVar.d = h != null ? h : i;
                        sVar.e = this.s;
                        this.aa.a(context, sVar);
                        am.a("FlurryAgent", "AppCircle initialized");
                    }
                    this.aa.a(this.J, this.K);
                }
                a(new t(this, applicationContext, this.C));
            } else {
                am.a("FlurryAgent", "Continuing previous session");
                if (!this.I.isEmpty()) {
                    this.I.remove(this.I.size() - 1);
                }
            }
            this.v = true;
        }
    }

    private synchronized void a(Context context, boolean z) {
        if (context != null) {
            if (((Context) this.y.remove(context)) == null) {
                am.d("FlurryAgent", "onEndSession called without context from corresponding onStartSession");
            }
        }
        if (this.v && this.y.isEmpty()) {
            am.a("FlurryAgent", "Ending session");
            j();
            Context applicationContext = context == null ? null : context.getApplicationContext();
            if (context != null) {
                String packageName = applicationContext.getPackageName();
                if (!this.A.equals(packageName)) {
                    am.b("FlurryAgent", "onEndSession called from different application package, expected: " + this.A + " actual: " + packageName);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.x = elapsedRealtime;
            this.L = elapsedRealtime - this.K;
            if (this.F == null) {
                am.b("FlurryAgent", "Not creating report because of bad Android ID or generated ID is null");
            }
            a(new r(this, z, applicationContext));
            this.v = false;
        }
    }

    private synchronized void g() {
        Throwable e;
        Closeable closeable = null;
        Closeable dataOutputStream;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(1);
                dataOutputStream.writeUTF(this.B);
                dataOutputStream.writeLong(this.J);
                dataOutputStream.writeLong(this.L);
                dataOutputStream.writeLong(0);
                dataOutputStream.writeUTF(this.M);
                dataOutputStream.writeUTF(this.N);
                dataOutputStream.writeByte(this.O);
                dataOutputStream.writeUTF(this.P == null ? "" : this.P);
                if (this.T == null) {
                    dataOutputStream.writeBoolean(false);
                } else {
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeDouble(a(this.T.getLatitude()));
                    dataOutputStream.writeDouble(a(this.T.getLongitude()));
                    dataOutputStream.writeFloat(this.T.getAccuracy());
                }
                dataOutputStream.writeInt(this.Z);
                dataOutputStream.writeByte(-1);
                dataOutputStream.writeByte(-1);
                dataOutputStream.writeByte(this.Q);
                if (this.R == null) {
                    dataOutputStream.writeBoolean(false);
                } else {
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeLong(this.R.longValue());
                }
                dataOutputStream.writeShort(this.U.size());
                for (Entry entry : this.U.entrySet()) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    dataOutputStream.writeInt(((b) entry.getValue()).a);
                }
                dataOutputStream.writeShort(this.V.size());
                for (d a : this.V) {
                    dataOutputStream.write(a.a());
                }
                dataOutputStream.writeBoolean(this.W);
                dataOutputStream.writeInt(this.S);
                dataOutputStream.writeShort(this.Y.size());
                for (aj ajVar : this.Y) {
                    dataOutputStream.writeLong(ajVar.a);
                    dataOutputStream.writeUTF(ajVar.b);
                    dataOutputStream.writeUTF(ajVar.c);
                    dataOutputStream.writeUTF(ajVar.d);
                }
                if (q) {
                    List<k> f = this.aa.f();
                    dataOutputStream.writeShort(f.size());
                    for (k a2 : f) {
                        a2.a((DataOutput) dataOutputStream);
                    }
                } else {
                    dataOutputStream.writeShort(0);
                }
                this.I.add(byteArrayOutputStream.toByteArray());
                m.a(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                closeable = dataOutputStream;
                try {
                    am.b("FlurryAgent", "", e);
                    m.a(closeable);
                } catch (Throwable th) {
                    e = th;
                    dataOutputStream = closeable;
                    m.a(dataOutputStream);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                m.a(dataOutputStream);
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            am.b("FlurryAgent", "", e);
            m.a(closeable);
        } catch (Throwable th3) {
            e = th3;
            dataOutputStream = null;
            m.a(dataOutputStream);
            throw e;
        }
    }

    private static double a(double d) {
        return ((double) Math.round(d * 1000.0d)) / 1000.0d;
    }

    private void a(Runnable runnable) {
        this.s.post(runnable);
    }

    private synchronized void a(String str, String str2, String str3) {
        if (this.Y == null) {
            am.b("FlurryAgent", "onError called before onStartSession.  Error: " + str);
        } else {
            this.S++;
            if (this.Y.size() < 10) {
                aj ajVar = new aj();
                ajVar.a = System.currentTimeMillis();
                ajVar.b = m.a(str, 255);
                ajVar.c = m.a(str2, 512);
                ajVar.d = m.a(str3, 255);
                this.Y.add(ajVar);
                am.a("FlurryAgent", "Error logged: " + ajVar.b);
            } else {
                am.a("FlurryAgent", "Max errors logged. No more errors logged.");
            }
        }
    }

    private synchronized byte[] a(boolean z) {
        Closeable dataOutputStream;
        byte[] toByteArray;
        Throwable th;
        synchronized (this) {
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(15);
                    if (q && z) {
                        dataOutputStream.writeShort(1);
                    } else {
                        dataOutputStream.writeShort(0);
                    }
                    if (q) {
                        dataOutputStream.writeLong(this.aa.d());
                        Set<Long> e = this.aa.e();
                        dataOutputStream.writeShort(e.size());
                        for (Long longValue : e) {
                            long longValue2 = longValue.longValue();
                            dataOutputStream.writeByte(1);
                            dataOutputStream.writeLong(longValue2);
                        }
                    } else {
                        dataOutputStream.writeLong(0);
                        dataOutputStream.writeShort(0);
                    }
                    dataOutputStream.writeShort(3);
                    dataOutputStream.writeShort(121);
                    dataOutputStream.writeLong(System.currentTimeMillis());
                    dataOutputStream.writeUTF(this.z);
                    dataOutputStream.writeUTF(this.B);
                    dataOutputStream.writeShort(0);
                    dataOutputStream.writeUTF(this.F);
                    dataOutputStream.writeLong(this.H);
                    dataOutputStream.writeLong(this.J);
                    dataOutputStream.writeShort(6);
                    dataOutputStream.writeUTF("device.model");
                    dataOutputStream.writeUTF(Build.MODEL);
                    dataOutputStream.writeUTF("build.brand");
                    dataOutputStream.writeUTF(Build.BRAND);
                    dataOutputStream.writeUTF("build.id");
                    dataOutputStream.writeUTF(Build.ID);
                    dataOutputStream.writeUTF("version.release");
                    dataOutputStream.writeUTF(VERSION.RELEASE);
                    dataOutputStream.writeUTF("build.device");
                    dataOutputStream.writeUTF(Build.DEVICE);
                    dataOutputStream.writeUTF("build.product");
                    dataOutputStream.writeUTF(Build.PRODUCT);
                    int size = this.I.size();
                    dataOutputStream.writeShort(size);
                    for (int i = 0; i < size; i++) {
                        dataOutputStream.write((byte[]) this.I.get(i));
                    }
                    this.D = new ArrayList(this.I);
                    dataOutputStream.close();
                    toByteArray = byteArrayOutputStream.toByteArray();
                    m.a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        am.b("FlurryAgent", "Error when generating report", th);
                        m.a(dataOutputStream);
                        toByteArray = null;
                        return toByteArray;
                    } catch (Throwable th3) {
                        th = th3;
                        m.a(dataOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = null;
                m.a(dataOutputStream);
                throw th;
            }
        }
        return toByteArray;
    }

    private static String h() {
        if (c != null) {
            return c;
        }
        if (n) {
            return d;
        }
        if (m) {
            return e;
        }
        return d;
    }

    private boolean a(byte[] bArr) {
        String h = h();
        if (h == null) {
            return false;
        }
        boolean a;
        try {
            a = a(bArr, h);
        } catch (Exception e) {
            am.a("FlurryAgent", "Sending report exception: " + e.getMessage());
            a = false;
        }
        if (a || c != null || !m || n) {
            return a;
        }
        synchronized (j) {
            n = true;
            String h2 = h();
            if (h2 == null) {
                return false;
            }
            try {
                return a(bArr, h2);
            } catch (Exception e2) {
                return a;
            }
        }
    }

    private boolean a(byte[] bArr, String str) {
        boolean z = true;
        if (!"local".equals(str)) {
            am.a("FlurryAgent", "Sending report to: " + str);
            HttpEntity byteArrayEntity = new ByteArrayEntity(bArr);
            byteArrayEntity.setContentType("application/octet-stream");
            HttpUriRequest httpPost = new HttpPost(str);
            httpPost.setEntity(byteArrayEntity);
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 15000);
            httpPost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
            HttpResponse execute = a(basicHttpParams).execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            synchronized (this) {
                if (statusCode == 200) {
                    am.a("FlurryAgent", "Report successful");
                    this.G = true;
                    this.I.removeAll(this.D);
                    HttpEntity entity = execute.getEntity();
                    am.a("FlurryAgent", "Processing report response");
                    if (!(entity == null || entity.getContentLength() == 0)) {
                        try {
                            a(new DataInputStream(entity.getContent()));
                        } finally {
                            entity.consumeContent();
                        }
                    }
                } else {
                    am.a("FlurryAgent", "Report failed. HTTP response: " + statusCode);
                    z = false;
                }
                this.D = null;
            }
        }
        return z;
    }

    private void a(DataInputStream dataInputStream) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        Map hashMap4 = new HashMap();
        Map hashMap5 = new HashMap();
        Map hashMap6 = new HashMap();
        int readUnsignedShort;
        do {
            readUnsignedShort = dataInputStream.readUnsignedShort();
            int readInt = dataInputStream.readInt();
            byte readByte;
            int readUnsignedShort2;
            switch (readUnsignedShort) {
                case 258:
                    dataInputStream.readInt();
                    break;
                case 259:
                    readByte = dataInputStream.readByte();
                    int readUnsignedShort3 = dataInputStream.readUnsignedShort();
                    Object obj = new q[readUnsignedShort3];
                    for (readInt = 0; readInt < readUnsignedShort3; readInt++) {
                        obj[readInt] = new q(dataInputStream);
                    }
                    hashMap.put(Byte.valueOf(readByte), obj);
                    break;
                case 262:
                    readUnsignedShort2 = dataInputStream.readUnsignedShort();
                    for (readInt = 0; readInt < readUnsignedShort2; readInt++) {
                        a aVar = new a(dataInputStream);
                        hashMap2.put(Long.valueOf(aVar.a), aVar);
                    }
                    break;
                case 263:
                    readUnsignedShort2 = dataInputStream.readInt();
                    for (readInt = 0; readInt < readUnsignedShort2; readInt++) {
                        x xVar = new x(dataInputStream);
                        hashMap4.put(xVar.a, xVar);
                        am.a("FlurryAgent", "Parsed hook: " + xVar);
                    }
                    break;
                case 264:
                    break;
                case 266:
                    readByte = dataInputStream.readByte();
                    for (byte b = (byte) 0; b < readByte; b++) {
                        u uVar = new u(dataInputStream);
                        hashMap5.put(Byte.valueOf(uVar.a), uVar);
                    }
                    break;
                case 268:
                    readUnsignedShort2 = dataInputStream.readInt();
                    for (readInt = 0; readInt < readUnsignedShort2; readInt++) {
                        hashMap6.put(Short.valueOf(dataInputStream.readShort()), Long.valueOf(dataInputStream.readLong()));
                    }
                    break;
                case 269:
                    dataInputStream.skipBytes(readInt);
                    break;
                case 270:
                    dataInputStream.skipBytes(readInt);
                    break;
                case 271:
                    byte readByte2 = dataInputStream.readByte();
                    for (readByte = (byte) 0; readByte < readByte2; readByte++) {
                        u uVar2 = (u) hashMap5.get(Byte.valueOf(dataInputStream.readByte()));
                        if (uVar2 != null) {
                            uVar2.a((DataInput) dataInputStream);
                        }
                    }
                    break;
                case 272:
                    long readLong = dataInputStream.readLong();
                    ae aeVar = (ae) hashMap3.get(Long.valueOf(readLong));
                    if (aeVar == null) {
                        aeVar = new ae();
                    }
                    aeVar.a = dataInputStream.readUTF();
                    aeVar.c = dataInputStream.readInt();
                    hashMap3.put(Long.valueOf(readLong), aeVar);
                    break;
                case 273:
                    dataInputStream.skipBytes(readInt);
                    break;
                default:
                    am.a("FlurryAgent", "Unknown chunkType: " + readUnsignedShort);
                    dataInputStream.skipBytes(readInt);
                    break;
            }
        } while (readUnsignedShort != 264);
        if (q) {
            if (hashMap.isEmpty()) {
                am.a("FlurryAgent", "No ads from server");
            }
            this.aa.a(hashMap, hashMap4, hashMap5, hashMap2, hashMap3, hashMap6);
        }
    }

    private void b(boolean z) {
        try {
            am.a("FlurryAgent", "generating report");
            byte[] a = a(z);
            if (a == null) {
                am.a("FlurryAgent", "Error generating report");
            } else if (a(a)) {
                am.a("FlurryAgent", "Done sending " + (this.v ? "initial " : "") + "agent report");
                i();
            }
        } catch (Throwable e) {
            am.a("FlurryAgent", "", e);
        } catch (Throwable e2) {
            am.b("FlurryAgent", "", e2);
        }
    }

    private synchronized void b(Context context) {
        Closeable dataInputStream;
        Throwable th;
        this.F = c(context);
        if (this.u.exists()) {
            am.c("FlurryAgent", "loading persistent data: " + this.u.getAbsolutePath());
            try {
                dataInputStream = new DataInputStream(new FileInputStream(this.u));
                try {
                    if (dataInputStream.readUnsignedShort() == 46586) {
                        b((DataInputStream) dataInputStream);
                    } else {
                        am.a("FlurryAgent", "Unexpected file type");
                    }
                    m.a(dataInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        am.b("FlurryAgent", "Error when loading persistent file", th);
                        m.a(dataInputStream);
                        if (!this.w) {
                            if (this.u.delete()) {
                                am.a("FlurryAgent", "Deleted persistence file");
                            } else {
                                am.b("FlurryAgent", "Cannot delete persistence file");
                            }
                        }
                        if (!this.w) {
                            this.G = false;
                            this.H = this.J;
                            this.w = true;
                        }
                        if (this.F == null) {
                            this.F = "ID" + Long.toString(Double.doubleToLongBits(Math.random()) + (37 * (System.nanoTime() + ((long) (this.z.hashCode() * 37)))), 16);
                            am.c("FlurryAgent", "Generated id");
                        }
                        this.aa.a(this.F);
                        c(context, this.F);
                    } catch (Throwable th3) {
                        th = th3;
                        m.a(dataInputStream);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                dataInputStream = null;
                m.a(dataInputStream);
                throw th;
            }
            try {
                if (this.w) {
                    if (this.u.delete()) {
                        am.a("FlurryAgent", "Deleted persistence file");
                    } else {
                        am.b("FlurryAgent", "Cannot delete persistence file");
                    }
                }
            } catch (Throwable th5) {
                am.b("FlurryAgent", "", th5);
            }
        } else {
            am.c("FlurryAgent", "Agent cache file doesn't exist.");
        }
        if (this.w) {
            this.G = false;
            this.H = this.J;
            this.w = true;
        }
        if (this.F == null) {
            this.F = "ID" + Long.toString(Double.doubleToLongBits(Math.random()) + (37 * (System.nanoTime() + ((long) (this.z.hashCode() * 37)))), 16);
            am.c("FlurryAgent", "Generated id");
        }
        this.aa.a(this.F);
        if (!(this.F.startsWith("AND") || this.t.exists())) {
            c(context, this.F);
        }
    }

    private synchronized void b(DataInputStream dataInputStream) {
        int i = 0;
        synchronized (this) {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            if (readUnsignedShort > 2) {
                am.b("FlurryAgent", "Unknown agent file version: " + readUnsignedShort);
                throw new IOException("Unknown agent file version: " + readUnsignedShort);
            }
            if (readUnsignedShort >= 2) {
                String readUTF = dataInputStream.readUTF();
                am.a("FlurryAgent", "Loading API key: " + a(this.z));
                if (readUTF.equals(this.z)) {
                    readUTF = dataInputStream.readUTF();
                    if (this.F == null) {
                        am.a("FlurryAgent", "Loading phoneId: " + readUTF);
                    }
                    this.F = readUTF;
                    this.G = dataInputStream.readBoolean();
                    this.H = dataInputStream.readLong();
                    am.a("FlurryAgent", "Loading session reports");
                    while (true) {
                        readUnsignedShort = dataInputStream.readUnsignedShort();
                        if (readUnsignedShort == 0) {
                            break;
                        }
                        Object obj = new byte[readUnsignedShort];
                        dataInputStream.readFully(obj);
                        this.I.add(0, obj);
                        i++;
                        am.a("FlurryAgent", "Session report added: " + i);
                    }
                    am.a("FlurryAgent", "Persistent file loaded");
                    this.w = true;
                } else {
                    am.a("FlurryAgent", "Api keys do not match, old: " + a(readUTF) + ", new: " + a(this.z));
                }
            } else {
                am.d("FlurryAgent", "Deleting old file version: " + readUnsignedShort);
            }
        }
    }

    private static String a(String str) {
        if (str == null || str.length() <= 4) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 4; i++) {
            stringBuilder.append('*');
        }
        stringBuilder.append(str.substring(str.length() - 4));
        return stringBuilder.toString();
    }

    private synchronized void i() {
        Throwable th;
        Closeable dataOutputStream;
        try {
            if (a(this.u)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.u));
                try {
                    dataOutputStream.writeShort(46586);
                    dataOutputStream.writeShort(2);
                    dataOutputStream.writeUTF(this.z);
                    dataOutputStream.writeUTF(this.F);
                    dataOutputStream.writeBoolean(this.G);
                    dataOutputStream.writeLong(this.H);
                    for (int size = this.I.size() - 1; size >= 0; size--) {
                        byte[] bArr = (byte[]) this.I.get(size);
                        int length = bArr.length;
                        if ((length + 2) + dataOutputStream.size() > 50000) {
                            am.a("FlurryAgent", "discarded sessions: " + size);
                            break;
                        }
                        dataOutputStream.writeShort(length);
                        dataOutputStream.write(bArr);
                    }
                    dataOutputStream.writeShort(0);
                    m.a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                m.a(null);
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            m.a(dataOutputStream);
            throw th;
        }
    }

    private static boolean a(File file) {
        File parentFile = file.getParentFile();
        if (parentFile.mkdirs() || parentFile.exists()) {
            return true;
        }
        am.b("FlurryAgent", "Unable to create persistent dir: " + parentFile);
        return false;
    }

    private synchronized void c(Context context, String str) {
        Closeable dataOutputStream;
        Throwable th;
        this.t = context.getFileStreamPath(".flurryb.");
        if (a(this.t)) {
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.t));
                try {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeUTF(str);
                    m.a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        am.b("FlurryAgent", "Error when saving b file", th);
                        m.a(dataOutputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        m.a(dataOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = null;
                m.a(dataOutputStream);
                throw th;
            }
        }
    }

    private String c(Context context) {
        Closeable dataInputStream;
        Throwable th;
        Throwable th2;
        String str = null;
        Object obj = null;
        if (this.F != null) {
            return this.F;
        }
        String string = System.getString(context.getContentResolver(), "android_id");
        if (string != null && string.length() > 0 && !string.equals("null")) {
            for (Object equals : b) {
                if (string.equals(equals)) {
                    break;
                }
            }
            obj = 1;
        }
        if (obj != null) {
            return "AND" + string;
        }
        File fileStreamPath = context.getFileStreamPath(".flurryb.");
        if (!fileStreamPath.exists()) {
            return str;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                dataInputStream.readInt();
                str = dataInputStream.readUTF();
                m.a(dataInputStream);
                return str;
            } catch (Throwable th3) {
                th = th3;
                try {
                    am.b("FlurryAgent", "Error when loading b file", th);
                    m.a(dataInputStream);
                    return str;
                } catch (Throwable th4) {
                    th2 = th4;
                    m.a(dataInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            dataInputStream = str;
            th2 = th5;
            m.a(dataInputStream);
            throw th2;
        }
    }

    private static String d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                return packageInfo.versionName;
            }
            if (packageInfo.versionCode != 0) {
                return Integer.toString(packageInfo.versionCode);
            }
            return "Unknown";
        } catch (Throwable th) {
            am.b("FlurryAgent", "", th);
        }
    }

    private Location e(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            synchronized (this) {
                if (this.E == null) {
                    this.E = locationManager;
                } else {
                    locationManager = this.E;
                }
            }
            Criteria criteria = p;
            if (criteria == null) {
                criteria = new Criteria();
            }
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                locationManager.requestLocationUpdates(bestProvider, 0, 0.0f, this, Looper.getMainLooper());
                return locationManager.getLastKnownLocation(bestProvider);
            }
        }
        return null;
    }

    private synchronized void j() {
        if (this.E != null) {
            this.E.removeUpdates(this);
        }
    }

    static String c() {
        return j.z;
    }

    public final synchronized void onLocationChanged(Location location) {
        try {
            this.T = location;
            j();
        } catch (Throwable th) {
            am.b("FlurryAgent", "", th);
        }
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    private static HttpClient a(HttpParams httpParams) {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load(null, null);
            SocketFactory anVar = new an(instance);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", anVar, 443));
            return new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        } catch (Exception e) {
            return new DefaultHttpClient(httpParams);
        }
    }
}
