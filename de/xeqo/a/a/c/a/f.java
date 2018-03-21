package de.xeqo.a.a.c.a;

import de.xeqo.a.a.a.b;
import de.xeqo.a.a.a.d;
import de.xeqo.a.a.c;
import de.xeqo.a.a.c.af;
import de.xeqo.a.a.q;
import de.xeqo.a.a.UsbService;
import de.xeqo.a.a.y;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class f extends c implements y {
    private final int a;
    private final String b;
    private final UsbService c;
    private final boolean d;
    private File e;
    private af f;
    private final boolean g;

    public f(UsbService wVar, int i, af afVar, boolean z) {
        this.c = wVar;
        this.a = i;
        this.f = afVar;
        this.g = z;
        this.b = afVar.b();
        this.d = afVar.a() != '㠁';
    }

    public final void a() {
        boolean z = false;
        this.e = null;
        try {
            File c = q.c();
            this.e = q.a(this.b);
            if (!(c == null || this.e == null || ((!c.exists() && !c.mkdirs()) || !this.e.createNewFile() || !this.e.canWrite()))) {
                z = true;
            }
            if (z) {
                a(0.0d);
                OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.e));
                z = new b(this.a, bufferedOutputStream, this).a(this.c);
                bufferedOutputStream.close();
                if (this.g) {
                    new d(this.a).a(this.c);
                }
                a(1.0d);
            }
            if (z) {
                b();
            } else {
                c();
            }
        } catch (IOException e) {
            e.printStackTrace();
            c();
        } catch (Throwable th) {
            if (null != null) {
                b();
            } else {
                c();
            }
        }
    }

    public final String d() {
        return this.b;
    }

    public final File e() {
        return this.e;
    }

    public final void a_(double d) {
        a(d);
    }

    public final void c_() {
        b();
    }

    public final void d_() {
        c();
    }
}
