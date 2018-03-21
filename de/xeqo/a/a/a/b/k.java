package de.xeqo.a.a.a.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;

public final class k extends x {
    private Bitmap mBitmap;
    private final int b;

    public k(int i) {
        this.b = i;
    }

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('鈃', i));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.b(h.a) || !ahVar.a()) {
            return false;
        }
        ByteBuffer byteBuffer = ahVar.b();
        if (!byteBuffer.hasArray()) {
            return false;
        }

        //限制
        int limit = byteBuffer.limit() - this.b;
        mBitmap = BitmapFactory.decodeByteArray(byteBuffer.array(), byteBuffer.arrayOffset() + this.b, limit);
        if (mBitmap != null) {
            return true;
        }

        return false;
    }

    public final Bitmap b() {
        return this.a;
    }
}
