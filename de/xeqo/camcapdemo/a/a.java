package de.xeqo.camcapdemo.a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import de.xeqo.camcapdemo.gui.i;

public abstract class a implements OnItemSelectedListener {
    public abstract void a(int i);

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (adapterView instanceof i) {
            i iVar = (i) adapterView;
            if (i != iVar.a()) {
                a(i);
                iVar.b(i);
            }
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
