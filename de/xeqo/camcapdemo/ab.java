package de.xeqo.camcapdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class ab extends ArrayAdapter {
    private String a;
    private LayoutInflater b;
    private /* synthetic */ CameraActivity2 c;

    public ab(CameraActivity2 cameraActivity2, Context context, String str) {
        this.c = cameraActivity2;
        super(context, 17367050);
        this.a = str;
        this.b = cameraActivity2.getLayoutInflater();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return view == null ? this.b.inflate(R.layout.spinner_view, null) : view;
    }
}
