package de.xeqo.camcapdemo.gui;

import android.content.Context;
import android.widget.Spinner;
import de.xeqo.camcapdemo.R;

public final class i extends Spinner {
    private static final int[] a = new int[]{R.attr.state_writeable};
    private static final int[] b = new int[]{R.attr.state_available};
    private boolean c;
    private boolean d;
    private int e = -1;

    public final void a(boolean z) {
        this.d = z;
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public i(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.c) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        if (this.d) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    public final void a(int i) {
        this.e = i;
        super.setSelection(i);
    }

    public final void b(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }
}
