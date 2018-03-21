package de.xeqo.camcapdemo.gui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;

import de.xeqo.a.a.c;
import de.xeqo.a.a.y;
import de.xeqo.camcapdemo.R;
import de.xeqo.util.BitmapUtils;

public class h extends RelativeLayout implements y {
    private static /* synthetic */ boolean g = (!h.class.desiredAssertionStatus());
    ImageView a;
    ProgressBar b;
    private TextView c;
    private g d = new g(this);
    private k e = new k(this);
    private c f;

    public h(Context context, c cVar) {
        super(context);
        if (g || cVar != null) {
            this.f = cVar;
            this.f.a((y) this);
            LayoutInflater.from(context).inflate(R.layout.transfer_view, this);
            this.c = (TextView) findViewById(R.id.transferObjectNameTextView);
            this.a = (ImageView) findViewById(R.id.transferImageView);
            this.b = (ProgressBar) findViewById(R.id.transferprogressBar);
            if (!g && this.c == null) {
                throw new AssertionError();
            } else if (g || this.a != null) {
                this.c.setText(cVar.d());
                if (cVar.f()) {
                    new Thread(new b(this)).start();
                    return;
                }
                return;
            } else {
                throw new AssertionError();
            }
        }
        throw new AssertionError();
    }

    public final void a_(double d) {
        this.e.a((int) (100.0d * d));
        post(this.e);
    }

    public final void c_() {
        this.d.a(BitmapUtils.decodeByFile(this.f.e(), 300));
        post(this.d);
    }

    public final void d_() {
        this.f.b(this);
        post(new a(this));
    }

    public final File c() {
        if (this.f != null) {
            return this.f.e();
        }
        return null;
    }
}
