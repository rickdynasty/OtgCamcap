package com.flurry.android;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.LinearLayout;

final class n extends LinearLayout {
    public n(CatalogActivity catalogActivity, Context context) {
        super(context);
        setBackgroundColor(-1);
        a j = catalogActivity.e.j();
        if (j != null) {
            ImageView imageView = new ImageView(context);
            imageView.setId(10000);
            byte[] bArr = j.e;
            if (bArr != null) {
                imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
            m.a(context, imageView, m.a(context, j.b), m.a(context, j.c));
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, -3);
            setGravity(3);
            addView(imageView, layoutParams);
        }
    }
}
