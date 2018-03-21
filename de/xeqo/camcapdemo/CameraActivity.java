package de.xeqo.camcapdemo;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.ToggleButton;

import de.xeqo.a.a.CameraStruc;
import de.xeqo.a.a.c.e;
import de.xeqo.a.a.i;
import de.xeqo.a.a.s;
import de.xeqo.a.a.z;
import de.xeqo.camcapdemo.gui.CameraPropertyBox;
import de.xeqo.camcapdemo.gui.c;
import de.xeqo.camcapdemo.gui.d;
import de.xeqo.camcapdemo.gui.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

public class CameraActivity extends Activity implements OnSharedPreferenceChangeListener {
    private static /* synthetic */ int[] ae;
    LinearLayout A;
    Button B;
    Button C;
    LinearLayout D;
    LinearLayout E;
    final Runnable F = new i(this);
    private PendingIntent G;
    private MenuItem H;
    private z I;
    private z J;
    private z K;
    private z L;
    private a M;
    private a N;
    private z O;
    private z P;
    private a Q;
    private Bitmap R;
    private i S;
    private final c T = new c();
    private Handler U = new Handler();
    private final BroadcastReceiver V = new j(this);
    private bs W;
    private Thread X;
    private bn Y = bn.Normal;
    private WakeLock Z;
    CameraPropertyBox a;
    private LayoutParams aa = null;
    private LayoutParams ab = null;
    private boolean ac = false;
    private boolean ad;
    CameraPropertyBox b;
    CameraPropertyBox c;
    CameraPropertyBox d;
    CameraPropertyBox e;
    CameraPropertyBox f;
    CameraPropertyBox g;
    CameraPropertyBox h;
    CameraPropertyBox i;
    Button j;
    ImageView k;
    TextView l;
    ToggleButton m;
    Button n;
    Button o;
    Button p;
    Button q;
    LinearLayout r;
    Button s;
    View t;
    CheckBox u;
    LinearLayout v;
    LinearLayout w;
    CheckBox x;
    LinearLayout y;
    LinearLayout z;

    private static /* synthetic */ int[] f() {
        int[] iArr = ae;
        if (iArr == null) {
            iArr = new int[bn.values().length];
            try {
                iArr[bn.BracketingMode.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[bn.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[bn.TimeLapseMode.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            ae = iArr;
        }
        return iArr;
    }

    protected void onCreate(Bundle bundle) {
        aa.a((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.main_view_2);
        this.k.setOnTouchListener(new g(this, new ScaleGestureDetector(this, new h(this))));
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PermissonReceiver.EXTRA_USB_PERMISSION);
        intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
        intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED);
        registerReceiver(this.V, intentFilter);
        this.Z = ((PowerManager) getSystemService("power")).newWakeLock(6, "CamCap Wake Lock");
        this.j.setOnClickListener(new e(this));
        this.z.setOnClickListener(new d(this));
        this.w.setOnClickListener(new c(this));
        this.x.setOnCheckedChangeListener(new b(this));
        this.u.setOnCheckedChangeListener(new f(this));
        LayoutInflater layoutInflater = getLayoutInflater();
        this.I = new z(this, "Aperture", layoutInflater);
        this.J = new z(this, "Speed", layoutInflater);
        this.K = new z(this, "ISO", layoutInflater);
        this.L = new z(this, "Ev", layoutInflater);
        this.M = new a(this, "WB", layoutInflater);
        this.N = new a(this, "Metring M.", layoutInflater);
        this.O = new z(this, "Kelvin", layoutInflater);
        this.P = new z(this, "Picture Style", layoutInflater);
        this.Q = new a(this, "Quality", layoutInflater);
        this.a.a().setAdapter(this.J);
        this.b.a().setAdapter(this.I);
        this.c.a().setAdapter(this.K);
        this.g.a().setAdapter(this.N);
        this.d.a().setAdapter(this.L);
        this.e.a().setAdapter(this.M);
        this.f.a().setAdapter(this.O);
        this.h.a().setAdapter(this.P);
        this.i.a().setAdapter(this.Q);
        this.b.a().setOnItemSelectedListener(new bg(this));
        this.a.a().setOnItemSelectedListener(new bf(this));
        this.c.a().setOnItemSelectedListener(new be(this));
        this.d.a().setOnItemSelectedListener(new bd(this));
        this.e.a().setOnItemSelectedListener(new ae(this));
        this.f.a().setOnItemSelectedListener(new af(this));
        this.g.a().setOnItemSelectedListener(new ag(this));
        this.h.a().setOnItemSelectedListener(new ah(this));
        this.i.a().setOnItemSelectedListener(new CameraStruc(this));
        this.m.setOnClickListener(new ad(this));
        this.n.setOnClickListener(new am(this));
        this.p.setOnClickListener(new aj(this));
        this.o.setOnClickListener(new ai(this));
        this.q.setOnClickListener(new al(this));
        this.s.setOnClickListener(new ak(this));
        this.B.setOnClickListener(new aq(this));
        this.C.setOnClickListener(new ar(this));
        new Thread(new an(this)).start();
    }

    protected final void a() {
        CharSequence string = getString(R.string.property_not_available);
        CharSequence string2 = getString(R.string.button_buy_on_market);
        CharSequence string3 = getString(R.string.button_continue_testing);
        Builder builder = new Builder(this);
        builder.setMessage(string).setCancelable(false).setPositiveButton(string2, new ao(this)).setNegativeButton(string3, new ap(this));
        builder.create().show();
    }

    static /* synthetic */ void n(CameraActivity cameraActivity) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=de.xeqo.camcap"));
        cameraActivity.startActivity(intent);
    }

    protected final void a(File file) {
        if (file != null && file.exists()) {
            this.U.post(new ax(this));
            new Thread(new aw(this, file)).start();
        }
    }

    protected final void b() {
        if (this.W != null) {
            this.W.a = true;
            if (this.X != null) {
                try {
                    this.X.join();
                } catch (InterruptedException e) {
                }
            }
        }
        if (this.S != null) {
            this.S.i();
        }
        this.A.setVisibility(4);
        this.s.setVisibility(4);
        this.W = null;
        this.X = null;
    }

    protected final void c() {
        if (this.S != null && this.S.h()) {
            this.W = new bs(this, this.S);
            this.X = new Thread(this.W);
            this.X.start();
            this.A.setVisibility(0);
            this.s.setVisibility(0);
        }
    }

    protected final void d() {
        if (this.S != null) {
            this.S.f();
        }
    }

    protected void onStart() {
        super.onStart();
        v.a((Context) this, "9KHHKKN1MUHRB81BS39D");
    }

    static /* synthetic */ void a(CameraActivity cameraActivity, de.xeqo.a.a.c cVar) {
        if (cVar != null) {
            cameraActivity.U.post(new at(cameraActivity, cVar));
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.S == null) {
            Intent intent = getIntent();
            "intent: " + intent;
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(UsbManager.EXTRA_DEVICE);
            i a;
            if (usbDevice == null) {
                a = q.a();
                if (!(q.b() == null || a == null || a.p() == null)) {
                    if (q.b().hasPermission(a.p())) {
                        this.G = null;
                        a(a);
                    } else if (this.G == null) {
                        this.G = PendingIntent.getBroadcast(this, 0, new Intent(PermissonReceiver.EXTRA_USB_PERMISSION), 0);
                        q.b().requestPermission(a.p(), this.G);
                    }
                }
            } else if (UsbManager.ACTION_USB_DEVICE_ATTACHED.equals(action)) {
                a = q.a(usbDevice);
                if (a != null) {
                    a(a);
                }
            } else if (UsbManager.ACTION_USB_DEVICE_DETACHED.equals(action) && this.S != null && usbDevice.equals(this.S.p())) {
                e();
            }
        }
        this.Z.acquire();
    }

    protected void onStop() {
        super.onStop();
        v.a((Context) this);
        b();
        try {
            unregisterReceiver(this.V);
        } catch (IllegalArgumentException e) {
        }
        e();
        if (this.Z.isHeld()) {
            this.Z.release();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.R = null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        this.H = menu.findItem(R.id.itemFullscreen);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.itemSelectCamera:
                View inflate = getLayoutInflater().inflate(R.layout.select_camera, null);
                Object arrayAdapter = new ArrayAdapter(this, 17367043);
                Collection arrayList = new ArrayList();
                Enumeration a = z.a();
                while (a.hasMoreElements()) {
                    arrayList.add((CameraStruc) a.nextElement());
                }
                arrayAdapter.addAll(arrayList);
                ListView listView = (ListView) inflate.findViewById(R.id.select_camera_listview);
                listView.setAdapter(arrayAdapter);
                PopupWindow popupWindow = new PopupWindow(inflate, 500, 300, true);
                listView.setOnItemClickListener(new as(this, arrayAdapter, popupWindow));
                popupWindow.showAtLocation(inflate, 17, 0, 0);
                return true;
            case R.id.itemSettings:
                startActivity(new Intent(getBaseContext(), Preferences.class));
                return true;
            case R.id.itemFeedback:
                startActivity(new Intent(this, FeedbackActivity_.class));
                return true;
            case R.id.itemFullscreen:
                a(!this.ac);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    private void a(boolean z) {
        this.ac = z;
        this.H.setChecked(this.ac);
        if (this.aa == null) {
            this.aa = (LayoutParams) this.D.getLayoutParams();
            this.ab = (LayoutParams) this.E.getLayoutParams();
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(0, 0);
            this.D.setLayoutParams(layoutParams);
            this.E.setLayoutParams(layoutParams);
            return;
        }
        this.D.setLayoutParams(this.aa);
        this.E.setLayoutParams(this.ab);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void a(i iVar) {
        if (this.S != null) {
            e();
        }
        this.S = iVar;
        if (this.S.n()) {
            ((CamCap) getApplication()).a(this.S);
            e q = this.S.q();
            if (q != null) {
                setTitle(getResources().getText(R.string.app_name) + "    " + (q.a() + " " + q.b()));
            }
            this.T.a(new d(this.S.r(), this.b.a(), this.I));
            this.T.a(new d(this.S.s(), this.a.a(), this.J));
            this.T.a(new d(this.S.t(), this.c.a(), this.K));
            this.T.a(new d(this.S.u(), this.d.a(), this.L));
            this.T.a(new d(this.S.w(), this.e.a(), this.M));
            this.T.a(new d(this.S.x(), this.f.a(), this.O));
            this.T.a(new d(this.S.v(), this.g.a(), this.N));
            this.T.a(new d(this.S.z(), this.h.a(), this.P));
            this.T.a(new d(this.S.A(), this.i.a(), this.Q));
            this.T.a(new j(this.S.y(), this.l));
            if (this.S != null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                try {
                    this.S.a(s.valueOf(defaultSharedPreferences.getString("prefTransferJpeg", "")));
                } catch (Exception e) {
                }
                try {
                    this.S.b(s.valueOf(defaultSharedPreferences.getString("prefTransferRaw", "")));
                } catch (Exception e2) {
                }
            }
            if (this.S != null) {
                this.S.a(new bq(this));
            }
            this.T.a();
            this.U.post(this.T);
        }
    }

    private void e() {
        if (this.S != null) {
            this.S.o();
            this.S = null;
        }
    }

    static /* synthetic */ void a(CameraActivity cameraActivity, bn bnVar) {
        if (!cameraActivity.ad) {
            int i;
            ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, 0);
            ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 150);
            cameraActivity.ad = true;
            cameraActivity.Y = bnVar;
            switch (f()[bnVar.ordinal()]) {
                case 2:
                    i = R.string.start_bracketing_mode;
                    cameraActivity.x.setChecked(true);
                    cameraActivity.y.setLayoutParams(layoutParams2);
                    cameraActivity.v.setLayoutParams(layoutParams);
                    cameraActivity.u.setChecked(false);
                    break;
                case 3:
                    i = R.string.start_time_lapse_mode;
                    cameraActivity.x.setChecked(false);
                    cameraActivity.u.setChecked(true);
                    cameraActivity.y.setLayoutParams(layoutParams);
                    cameraActivity.v.setLayoutParams(layoutParams2);
                    break;
                default:
                    i = R.string.capture;
                    cameraActivity.x.setChecked(false);
                    cameraActivity.u.setChecked(false);
                    cameraActivity.y.setLayoutParams(layoutParams);
                    cameraActivity.v.setLayoutParams(layoutParams);
                    break;
            }
            cameraActivity.j.setText(i);
            cameraActivity.ad = false;
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        s valueOf = s.valueOf(sharedPreferences.getString(str, ""));
        if (this.S != null) {
            this.S.a(valueOf);
        }
    }
}
