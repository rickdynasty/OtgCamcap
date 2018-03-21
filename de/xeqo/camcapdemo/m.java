package de.xeqo.camcapdemo;

import de.xeqo.a.a.c.a.e;

final class m implements Runnable {
    private /* synthetic */ RemoteCaptureActivity a;

    m(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final void run() {
        int i;
        int i2 = 0;
        if (this.a.g != null) {
            this.a.d.clear();
            this.a.w.setMax(this.a.g.c().size() - 1);
        }
        if (this.a.h != null) {
            this.a.x.setMax(this.a.h.size() - 1);
        }
        if (this.a.j != null) {
            this.a.z.setMax(this.a.j.length - 1);
        }
        if (this.a.l != null) {
            this.a.y.setMax(this.a.l.length - 1);
        }
        if (this.a.k != null) {
            this.a.r.setText(String.valueOf(this.a.k));
            for (i = 0; i < this.a.j.length; i++) {
                if (this.a.j[i].equals(this.a.k)) {
                    this.a.z.setProgress(i);
                    break;
                }
            }
        }
        if (this.a.m != -128) {
            this.a.q.setText(String.valueOf(this.a.m));
            for (i = 0; i < this.a.l.length; i++) {
                if (this.a.l[i] == this.a.m) {
                    this.a.y.setProgress(i);
                    break;
                }
            }
        }
        if (this.a.a != '\u0000') {
            for (int i3 = 0; i3 < this.a.g.c().size(); i3++) {
                if (((Character) this.a.g.c().get(i3)).charValue() == this.a.a) {
                    this.a.w.setProgress(i3);
                    break;
                }
            }
        }
        if (this.a.i != null) {
            this.a.p.setText(this.a.i.toString());
            while (i2 < this.a.h.size()) {
                if (((e) this.a.h.get(i2)).equals(this.a.i)) {
                    this.a.x.setProgress(i2);
                    break;
                }
                i2++;
            }
        }
        if (this.a.t != null) {
            this.a.u.setImageBitmap(this.a.t);
        }
        if (this.a.v != null) {
            this.a.u.setImageBitmap(this.a.v);
        }
    }
}
