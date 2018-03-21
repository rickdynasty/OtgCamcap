package de.xeqo.camcapdemo;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class n implements OnSeekBarChangeListener {
    private /* synthetic */ RemoteCaptureActivity a;

    n(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.a = ((Character) this.a.g.c().get(this.a.w.getProgress())).charValue();
        this.a.A.a(this.a.a);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.o.setText(String.valueOf(((double) ((Character) this.a.g.c().get(i)).charValue()) / 100.0d));
    }
}
