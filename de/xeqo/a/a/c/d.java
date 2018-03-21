package de.xeqo.a.a.c;

import de.xeqo.a.a.y;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class d extends k {
    private OutputStream a;
    private int b;
    private int c = 0;
    private final List d = new ArrayList();

    public d(OutputStream outputStream) {
        this.a = outputStream;
    }

    public final boolean a() {
        return false;
    }

    public final ByteBuffer b() {
        return null;
    }

    public final boolean c() {
        return this.a != null;
    }

    protected final boolean a(int i) {
        this.b = i;
        a(0.0d);
        return true;
    }

    protected final void a(byte[] bArr, int i, int i2) {
        try {
            this.a.write(bArr, i, i2);
            this.c += i2;
            a(((double) this.c) / ((double) this.b));
        } catch (Exception e) {
        }
    }

    public final void a(y yVar) {
        synchronized (this) {
            if (yVar != null) {
                if (!this.d.contains(yVar)) {
                    this.d.add(yVar);
                }
            }
        }
    }

    public final void d() {
        synchronized (this) {
            this.d.clear();
        }
    }

    private void a(double d) {
        for (y a_ : this.d) {
            a_.a_(d);
        }
    }
}
