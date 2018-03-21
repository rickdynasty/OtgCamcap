package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import com.a.a.l;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class al extends am {
    public static final l a = new aq();
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    private synchronized void a(a aVar, Date date) {
        aVar.c(date == null ? null : this.b.format(date));
    }
}
