package com.flurry.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;

final class z extends RelativeLayout {
    private p a;
    private k b;
    private int c;

    public z(Context context, p pVar, k kVar, x xVar, int i, boolean z) {
        super(context);
        this.a = pVar;
        this.b = kVar;
        q qVar = kVar.b;
        this.c = i;
        switch (this.c) {
            case 1:
                break;
            case 2:
                if (!z) {
                    a(context, xVar, qVar, true);
                    break;
                } else {
                    a(context, xVar, qVar, false);
                    break;
                }
        }
        if (z) {
            a(context, xVar, qVar, false);
        } else {
            a(context, xVar, qVar, true);
        }
        setFocusable(true);
    }

    private void a(Context context, x xVar, q qVar, boolean z) {
        Bitmap createBitmap;
        setLayoutParams(new LayoutParams(-1, -1));
        u uVar = xVar.d;
        ImageView imageView = new ImageView(context);
        imageView.setId(1);
        a aVar = qVar.h;
        if (aVar != null) {
            byte[] obj = aVar.e;
            Bitmap bitmap = BitmapFactory.decodeByteArray(obj, 0, obj.length);
            if (bitmap == null) {
                am.a("FlurryAgent", "Ad with bad image: " + qVar.d + ", data: " + obj);
            }
            if (bitmap != null) {
                Bitmap copy;
                createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                RectF rectF = new RectF(rect);
                float a = (float) m.a(context, 8);
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-16777216);
                canvas.drawRoundRect(rectF, a, a, paint);
                paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
                canvas.drawBitmap(bitmap, rect, rect, paint);
                if (Integer.parseInt(VERSION.SDK) > 4) {
                    MaskFilter blurMaskFilter = new BlurMaskFilter(3.0f, Blur.OUTER);
                    Paint paint2 = new Paint();
                    paint2.setMaskFilter(blurMaskFilter);
                    int[] iArr = new int[2];
                    copy = createBitmap.extractAlpha(paint2, iArr).copy(Config.ARGB_8888, true);
                    new Canvas(copy).drawBitmap(createBitmap, (float) (-iArr[0]), (float) (-iArr[1]), null);
                } else {
                    copy = createBitmap;
                }
                imageView.setImageBitmap(copy);
                m.a(context, imageView, m.a(context, uVar.m), m.a(context, uVar.n));
                imageView.setScaleType(ScaleType.FIT_XY);
            }
        }
        aVar = this.a.a(uVar.c);
        if (aVar != null) {
            Drawable ninePatchDrawable;
            byte[] bArr = aVar.e;
            createBitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (NinePatch.isNinePatchChunk(createBitmap.getNinePatchChunk())) {
                ninePatchDrawable = new NinePatchDrawable(createBitmap, createBitmap.getNinePatchChunk(), new Rect(0, 0, 0, 0), null);
            } else {
                ninePatchDrawable = new BitmapDrawable(createBitmap);
            }
            setBackgroundDrawable(ninePatchDrawable);
        }
        TextView textView = new TextView(context);
        textView.setId(5);
        textView.setPadding(0, 0, 0, 0);
        TextView textView2 = new TextView(context);
        textView2.setId(3);
        textView2.setPadding(0, 0, 0, 0);
        if (z) {
            textView.setTextColor(uVar.f);
            textView.setTextSize((float) uVar.e);
            textView.setText(new String("• " + uVar.b));
            textView.setTypeface(Typeface.create(uVar.d, 0));
            textView2.setTextColor(uVar.i);
            textView2.setTextSize((float) uVar.h);
            textView2.setTypeface(Typeface.create(uVar.g, 0));
            textView2.setText(qVar.d);
        } else {
            textView.setId(3);
            textView.setText(qVar.d);
            textView.setTextColor(uVar.i);
            textView.setTextSize((float) uVar.h);
            textView.setTypeface(Typeface.create(uVar.g, 0));
            textView2.setId(4);
            textView2.setText(qVar.c);
            textView2.setTextColor(uVar.l);
            textView2.setTextSize((float) uVar.k);
            textView2.setTypeface(Typeface.create(uVar.j, 0));
        }
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(new ImageView(context), new LayoutParams(-1, -2));
        int i = (uVar.q - (uVar.o << 1)) - uVar.m;
        RelativeLayout.LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.setMargins(uVar.o, uVar.p, i, 0);
        addView(imageView, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.addRule(1, imageView.getId());
        layoutParams2.setMargins(0, 0, 0, 0);
        addView(textView, layoutParams2);
        layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.addRule(1, imageView.getId());
        layoutParams2.addRule(3, textView.getId());
        layoutParams2.setMargins(0, -2, 0, 0);
        addView(textView2, layoutParams2);
    }

    final k a() {
        return this.b;
    }

    final void a(k kVar) {
        this.b = kVar;
    }
}
