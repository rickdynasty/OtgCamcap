package de.xeqo.a.a;

import java.io.File;

public final class m extends c {
    private final File a;
    private boolean b = true;

    public m(File file) {
        this.a = file;
        if (this.a != null && !this.a.exists()) {
            String substring = this.a.getName().substring(this.a.getName().lastIndexOf("."));
            if (substring != null && substring.length() > 0) {
                if (substring.toLowerCase().equals(".jpg") || substring.toLowerCase().equals(".jpeg")) {
                    this.b = false;
                }
            }
        }
    }

    public final void a() {
        b();
    }

    public final String d() {
        if (this.a != null) {
            return this.a.getName();
        }
        return null;
    }

    public final File e() {
        return this.a;
    }
}
