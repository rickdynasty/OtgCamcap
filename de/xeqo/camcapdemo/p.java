package de.xeqo.camcapdemo;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class p implements OnSeekBarChangeListener {
    private /* synthetic */ RemoteCaptureActivity a;

    p(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.m = this.a.l[this.a.y.getProgress()];
        this.a.A.b((char) this.a.m);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.q.setText(String.valueOf(this.a.l[i]));
    }
}
