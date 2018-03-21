package de.xeqo.camcapdemo;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

import de.xeqo.a.a.PtpUsbService;
import de.xeqo.a.a.a;
import de.xeqo.a.a.c.a.c;
import de.xeqo.a.a.c.a.e;
import de.xeqo.ptp.PtpConstants;

public class RemoteCaptureActivity extends Activity {
    public static final String TAG = "RemoteCaptureActivity";

    private a A;
    private t B;
    private PendingIntent pendingIntent;
    private final BroadcastReceiver mPermissonReceiver = new PermissonReceiver(this);
    public char a = '\u0000';
    final Runnable b = new m(this);
    private ArrayAdapter mAdapter1;
    private ArrayAdapter mAdapter2;
    private UsbManager mUsbManager;
    public PtpUsbService f;
    private de.xeqo.a.a.e.a g;
    private List h;
    private e i;
    public c[] j;
    private c k;
    private int[] l;
    private int m;
    private Handler n = new Handler();
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private ImageView s;
    private Bitmap t;
    private ImageView u;
    private Bitmap v;
    private SeekBar w;
    private SeekBar x;
    private SeekBar y;
    private SeekBar z;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        mUsbManager = (UsbManager) getSystemService(Context.USB_SERVICE);
        this.f = new PtpUsbService(mUsbManager);
        this.A = new a(this.f);
        pendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(PermissonReceiver.EXTRA_USB_PERMISSION), 0);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PermissonReceiver.EXTRA_USB_PERMISSION);
        intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
        intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED);
        registerReceiver(mPermissonReceiver, intentFilter);

        mAdapter1 = new ArrayAdapter(this, 17367043);
        ((ListView) findViewById(R.id.listView)).setAdapter(mAdapter1);
        this.o = (TextView) findViewById(R.id.textViewCurrentAperture);
        this.p = (TextView) findViewById(R.id.textViewCurrentShutterSpeed);
        this.q = (TextView) findViewById(R.id.textViewCurrentIso);
        this.r = (TextView) findViewById(R.id.textViewCurrentEv);
        this.s = (ImageView) findViewById(R.id.imageView);
        this.u = (ImageView) findViewById(R.id.imageLiveView);
        this.w = (SeekBar) findViewById(R.id.seekBarAperture);
        this.x = (SeekBar) findViewById(R.id.seekBarShutter);
        this.z = (SeekBar) findViewById(R.id.seekBarEv);
        this.y = (SeekBar) findViewById(R.id.seekBarIso);
        this.w.setOnSeekBarChangeListener(new n(this));
        this.x.setOnSeekBarChangeListener(new r(this));
        this.z.setOnSeekBarChangeListener(new s(this));
        this.y.setOnSeekBarChangeListener(new p(this));
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButtonHostMode);
        toggleButton.setOnClickListener(new q(this, toggleButton));
        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonLiveView);
        toggleButton.setOnClickListener(new l(this, toggleButton));
        Spinner spinner = (Spinner) findViewById(R.id.fNumberSpinner);
        mAdapter2 = new ArrayAdapter(this, 17367043);
        spinner.setAdapter(mAdapter2);
        ((Button) findViewById(R.id.usbButton)).setOnClickListener(new k(this));
        ((Button) findViewById(R.id.closeUsbButton)).setOnClickListener(new bo(this));
        ((Button) findViewById(R.id.sendDataButton)).setOnClickListener(new bi(this));
        ((Button) findViewById(R.id.getDviceInfoButton)).setOnClickListener(new bh(this));
        ((Button) findViewById(R.id.setFNumber)).setOnClickListener(new bk(this));
        ((Button) findViewById(R.id.takeCaptureButton)).setOnClickListener(new bj(this));
        ((Button) findViewById(R.id.buttonBkt)).setOnClickListener(new bm(this));
        this.u.setOnTouchListener(new bl(this));
    }

    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        Log.i(TAG, "intent: " + intent);
        String action = intent.getAction();
        UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(UsbManager.EXTRA_DEVICE);
        if (usbDevice == null) {
            for (UsbDevice usbDevice2 : mUsbManager.getDeviceList().values()) {
                Object obj;
                if (usbDevice2 != null) {
                    int vendorId = usbDevice2.getVendorId();
                    usbDevice2.getProductId();
                    if (vendorId == PtpConstants.NikonVendorId) {
                        obj = 1;
                        continue;

                        if (obj != null) {
                            mUsbManager.requestPermission(usbDevice2, pendingIntent);
                            return;
                        }
                    }
                }

                obj = null;
                continue;
                
                if (obj != null) {
                    mUsbManager.requestPermission(usbDevice2, pendingIntent);
                    return;
                }
            }
        } else if (UsbManager.ACTION_USB_DEVICE_ATTACHED.equals(action)) {
            this.f.connect(usbDevice);
        } else if (UsbManager.ACTION_USB_DEVICE_DETACHED.equals(action) && this.f.b() != null && this.f.b().equals(usbDevice)) {
            this.f.c();
        }
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
        unregisterReceiver(mPermissonReceiver);
    }

    protected void onStop() {
        super.onStop();
        this.f.c();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    static /* synthetic */ void b(RemoteCaptureActivity remoteCaptureActivity, ArrayList<de.xeqo.a.a.c.a.c> list) {
        for (c a : list) {
            remoteCaptureActivity.A.a(a);
            remoteCaptureActivity.A.d();
            remoteCaptureActivity.A.m();
        }
    }

    protected final void a() {
        this.B.a = true;
        this.A.g();
    }

    protected final void b() {
        this.A.f();
        this.B = new t(this, this.A);
        new Thread(this.B).start();
    }
}
