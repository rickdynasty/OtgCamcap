package de.xeqo.a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import de.xeqo.a.a.c.a.c;
import de.xeqo.a.a.c.a.e;
import de.xeqo.a.a.c.af;
import de.xeqo.a.a.c.g;
import de.xeqo.util.ByteUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class a {
    private PtpUsbService a;

    public a(PtpUsbService adVar) {
        this.a = adVar;
    }

    public final char a() {
        CameraPhotoBuffer a = this.a.a('ပ', null, 20487);
        if (a == null || a.getByteBuffer() == null) {
            return '\u0000';
        }
        return a.getByteBuffer().getChar();
    }

    public final void a(char c) {
        byte[] a = ByteUtils.createByteArrayByShort(((short) c);
        this.a.a('ဖ', a, 20487);
    }

    public final void a(e eVar) {
        byte[] array = eVar.b_().array();
        this.a.a('ဖ', array, 53504).toString();
    }

    public final e b() {
        CameraPhotoBuffer a = this.a.a('ပ', null, 53504);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        return e.a(a.getByteBuffer().getInt());
    }

    public final List c() {
        CameraPhotoBuffer a = this.a.a('န', null, 53504);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        de.xeqo.a.a.e.a a2 = de.xeqo.a.a.e.a.a(a.getByteBuffer());
        List arrayList = new ArrayList();
        for (Integer intValue : a2.c()) {
            arrayList.add(e.a(intValue.intValue()));
        }
        return arrayList;
    }

    public final int d() {
        CameraPhotoBuffer a = this.a.a('ဎ', null, null);
        if (a.getByteBuffer() != null) {
            return h.c;
        }
        return a.getBufferLen();
    }

    public final de.xeqo.a.a.e.a e() {
        CameraPhotoBuffer a = this.a.a('န', null, 20487);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        return de.xeqo.a.a.e.a.b(a.getByteBuffer());
    }

    public final void a(int i) {
        this.a.a('郂', null, i);
    }

    public final af b(int i) {
        CameraPhotoBuffer a = this.a.a('ဈ', null, i);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        return af.a(a.getByteBuffer());
    }

    public final Bitmap c(int i) {
        Date date = new Date();
        CameraPhotoBuffer a = this.a.a('ဉ', null, i);
        new Date().getTime();
        date.getTime();
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        int position = a.getByteBuffer().position();
        return BitmapFactory.decodeByteArray(a.getByteBuffer().array(), position, a.getByteBuffer().capacity() - position);
    }

    public final void f() {
        this.a.a('鈁', null, new int[0]);
    }

    public final void g() {
        this.a.a('鈂', null, new int[0]);
    }

    public final Bitmap h() {
        Bitmap bitmap = null;
        CameraPhotoBuffer a = this.a.a('鈃', null, new int[0]);
        if (!(a == null || a.getByteBuffer() == null)) {
            int position = a.getByteBuffer().position() + 384;
            bitmap = BitmapFactory.decodeByteArray(a.getByteBuffer().array(), position, a.getByteBuffer().capacity() - position);
            if (bitmap != null) {
                bitmap.getHeight();
                "asdfsd".toString();
            }
        }
        return bitmap;
    }

    public final c i() {
        CameraPhotoBuffer a = this.a.a('ပ', null, 20496);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        return new c(a.getByteBuffer().getShort());
    }

    public final c[] j() {
        CameraPhotoBuffer a = this.a.a('န', null, 20496);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        de.xeqo.a.a.e.a d = de.xeqo.a.a.e.a.d(a.getByteBuffer());
        c[] cVarArr = new c[d.c().size()];
        for (int i = 0; i < d.c().size(); i++) {
            cVarArr[i] = new c(((Short) d.c().get(i)).shortValue());
        }
        return cVarArr;
    }

    public final void a(c cVar) {
        byte[] a = ByteUtils.createByteArrayByShort(cVar.b());
        this.a.a('ဖ', a, 20496);
    }

    public final int k() {
        CameraPhotoBuffer a = this.a.a('ပ', null, 20495);
        if (a == null || a.getByteBuffer() == null) {
            return 0;
        }
        return a.getByteBuffer().getChar();
    }

    public final int[] l() {
        CameraPhotoBuffer a = this.a.a('န', null, 20495);
        if (a == null || a.getByteBuffer() == null) {
            return null;
        }
        de.xeqo.a.a.e.a b = de.xeqo.a.a.e.a.b(a.getByteBuffer());
        int[] iArr = new int[b.c().size()];
        for (int i = 0; i < b.c().size(); i++) {
            iArr[i] = ((Character) b.c().get(i)).charValue();
        }
        return iArr;
    }

    public final void b(char c) {
        byte[] a = ByteUtils.createByteArrayByShort(((short) c);
        this.a.a('ဖ', a, 20495);
    }

    public final g m() {
        while (true) {
            CameraPhotoBuffer a = this.a.a('郇', null, new int[0]);
            List<g> arrayList = new ArrayList();
            if (!(a == null || a.getByteBuffer() == null)) {
                char c = a.getByteBuffer().getChar();
                for (char c2 = '\u0000'; c2 < c; c2++) {
                    g gVar = new g();
                    char c3 = a.getByteBuffer().getChar();
                    int i = a.getByteBuffer().getInt();
                    gVar.a(c3);
                    gVar.b(i);
                    arrayList.add(gVar);
                }
            }
            for (g gVar2 : arrayList) {
                if (gVar2.a() == 16386) {
                    return gVar2;
                }
            }
        }
    }

    public final void c(char c) {
        byte[] a = ByteUtils.createByteArrayByShort(((short) c);
        this.a.a('ဖ', a, 53512);
    }
}
