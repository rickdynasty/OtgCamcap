package de.xeqo.camcapdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import de.xeqo.a.a.c.t;

public final class a extends z {
    private LayoutInflater a;
    private String b;

    public a(Context context, String str, LayoutInflater layoutInflater) {
        super(context, str, layoutInflater);
        this.a = layoutInflater;
        this.b = str;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(R.layout.spinner_dropdown_image_view, null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.spinnerCustomViewImage);
        Object item = getItem(i);
        if (item != null && (item instanceof t)) {
            imageView.setImageResource(((t) item).a());
        }
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(R.layout.spinner_image_view, null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.spinnerCustomViewImage);
        Object item = getItem(i);
        if (item != null && (item instanceof t)) {
            imageView.setImageResource(((t) item).a());
        }
        return view;
    }
}
