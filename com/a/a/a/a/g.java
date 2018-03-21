package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import com.a.a.l;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class g extends am {
    public static final l a = new aa();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    private synchronized void a(a aVar, Time time) {
        aVar.c(time == null ? null : this.b.format(time));
    }
}
