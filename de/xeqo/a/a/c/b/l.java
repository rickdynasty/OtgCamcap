package de.xeqo.a.a.c.b;

import de.xeqo.a.a.a.a.e;
import de.xeqo.a.a.a.a.g;
import de.xeqo.a.a.a.a.j;
import de.xeqo.a.a.c;
import de.xeqo.a.a.q;
import de.xeqo.a.a.UsbService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class l extends c {
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final UsbService e;
    private final boolean f;
    private File g;
    private final boolean h;

    public l(UsbService wVar, int i, int i2, int i3, String str, boolean z) {
        this.e = wVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.h = z;
        this.f = d.a(i3);
    }

    public final void a() {
        int i = 0;
        int i2 = 524288;
        int i3 = this.b;
        this.g = null;
        try {
            File c = q.c();
            this.g = q.a(this.d);
            if (!(c == null || this.g == null || ((!c.exists() && !c.mkdirs()) || !this.g.createNewFile() || !this.g.canWrite()))) {
                i = 1;
            }
            if (i != 0) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.g));
                while (i != 0 && i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    int i4 = this.b - i3;
                    a(((double) i4) / ((double) this.b));
                    e eVar = new e(this.a, i4, i2);
                    i &= eVar.a(this.e);
                    if (i != 0) {
                        ByteBuffer b = eVar.b();
                        if (b != null) {
                            i3 -= b.remaining();
                            bufferedOutputStream.write(b.array(), b.arrayOffset(), b.limit());
                        }
                    }
                }
                a(1.0d);
                bufferedOutputStream.close();
            }
            if (i == 0 || r1 != 0) {
                j.b(this.a).a(this.e);
                c();
            } else {
                j.a(this.a).a(this.e);
                b();
            }
            if (this.h) {
                new g(this.a).a(this.e);
            }
        } catch (IOException e) {
            e.printStackTrace();
            j.b(this.a).a(this.e);
            c();
            if (this.h) {
                new g(this.a).a(this.e);
            }
        } catch (Throwable th) {
            if (i == 0 || r1 != 0) {
                j.b(this.a).a(this.e);
                c();
            } else {
                j.a(this.a).a(this.e);
                b();
            }
            if (this.h) {
                new g(this.a).a(this.e);
            }
        }
    }

    public final String d() {
        return this.d;
    }

    public final File e() {
        return this.g;
    }
}
