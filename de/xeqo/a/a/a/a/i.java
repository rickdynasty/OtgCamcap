package de.xeqo.a.a.a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.h;
import de.xeqo.a.a.u;
import de.xeqo.a.a.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends x {
    private Bitmap mBitmap;

    protected final void a(int i, AtomicReference atomicReference, List list) {
        atomicReference.set(new u('酓', i, 2097152));
    }

    protected final boolean a(ah ahVar) {
        if (!ahVar.b(h.a) || !ahVar.a()) {
            return false;
        }
        ByteBuffer b = ahVar.b();
        if (b.remaining() < 4) {
            return false;
        }
        mBitmap = BitmapFactory.decodeByteArray(b.array(), b.arrayOffset() + 8, b.getInt());
        if (mBitmap != null) {
            return true;
        }
        return false;
    }

    public final Bitmap getBitmap() {
        return mBitmap;
    }
}
