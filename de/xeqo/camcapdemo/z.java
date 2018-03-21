package de.xeqo.camcapdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import de.xeqo.a.a.c.ag;

public class z extends ArrayAdapter {
    private String a;
    private LayoutInflater b;

    public z(Context context, String str, LayoutInflater layoutInflater) {
        super(context, 17367050);
        this.a = str;
        this.b = layoutInflater;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.spinner_dropdown_view, null);
        }
        TextView textView = (TextView) view.findViewById(R.id.spinnerCustomViewText);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewLock);
        Object item = getItem(i);
        if (item != null) {
            if (item instanceof ag) {
                if (((ag) item).f()) {
                    imageView.setVisibility(4);
                } else {
                    imageView.setVisibility(0);
                }
            }
            textView.setText(item.toString());
        }
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.spinner_view, null);
        }
        TextView textView = (TextView) view.findViewById(R.id.spinnerCustomViewText);
        Object item = getItem(i);
        if (item != null) {
            textView.setText(item.toString());
        }
        return view;
    }
}
