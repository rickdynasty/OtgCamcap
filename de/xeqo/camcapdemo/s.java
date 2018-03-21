package de.xeqo.camcapdemo;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class s implements OnSeekBarChangeListener {
    private /* synthetic */ RemoteCaptureActivity a;

    s(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.k = this.a.j[this.a.z.getProgress()];
        this.a.A.a(this.a.k);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.r.setText(String.valueOf(this.a.j[i]));
    }
}
