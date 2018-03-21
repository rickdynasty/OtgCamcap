package com.a.a.a;

import com.a.a.a.a.aj;
import com.a.a.al;
import com.a.a.c.a;
import java.io.Writer;

public final class f {
    public static void a(al alVar, a aVar) {
        aj.w.a(aVar, alVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new c(appendable);
    }
}
