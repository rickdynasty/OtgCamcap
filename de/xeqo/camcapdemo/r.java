package de.xeqo.camcapdemo;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import de.xeqo.a.a.c.a.e;

final class r implements OnSeekBarChangeListener {
    private /* synthetic */ RemoteCaptureActivity a;

    r(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.i = (e) this.a.h.get(this.a.x.getProgress());
        this.a.A.a(this.a.i);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.p.setText(String.valueOf(this.a.h.get(i)));
    }
}
