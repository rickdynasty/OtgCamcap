package com.a.a.a.a;

import com.a.a.ah;
import com.a.a.ai;
import com.a.a.ak;
import com.a.a.al;
import com.a.a.c.a;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class ap extends a {
    private static final Writer a = new a();
    private static final ak b = new ak("closed");
    private final List c = new ArrayList();
    private String d;
    private al e = ah.a;

    public ap() {
        super(a);
    }

    public final al i() {
        if (this.c.isEmpty()) {
            return this.e;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.c);
    }

    private al j() {
        return (al) this.c.get(this.c.size() - 1);
    }

    private void a(al alVar) {
        if (this.d != null) {
            if (!(alVar instanceof ah) || c()) {
                ((ai) j()).a(this.d, alVar);
            }
            this.d = null;
        } else if (this.c.isEmpty()) {
            this.e = alVar;
        } else {
            al j = j();
            if (j instanceof com.a.a.a) {
                ((com.a.a.a) j).a(alVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final a d() {
        al aVar = new com.a.a.a();
        a(aVar);
        this.c.add(aVar);
        return this;
    }

    public final a e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof com.a.a.a) {
            this.c.remove(this.c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final a f() {
        al aiVar = new ai();
        a(aiVar);
        this.c.add(aiVar);
        return this;
    }

    public final a g() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof ai) {
            this.c.remove(this.c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final a b(String str) {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof ai) {
            this.d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final a c(String str) {
        if (str == null) {
            return h();
        }
        a(new ak(str));
        return this;
    }

    public final a h() {
        a(ah.a);
        return this;
    }

    public final a d(boolean z) {
        a(new ak(Boolean.valueOf(z)));
        return this;
    }

    public final a a(long j) {
        a(new ak(Long.valueOf(j)));
        return this;
    }

    public final a a(Number number) {
        if (number == null) {
            return h();
        }
        if (!a()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new ak(number));
        return this;
    }

    public final void close() {
        if (this.c.isEmpty()) {
            this.c.add(b);
            return;
        }
        throw new IOException("Incomplete document");
    }
}
