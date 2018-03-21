package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import com.a.a.l;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class ai extends am {
    public static final l a = new l();
    private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d;

    public ai() {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.d = simpleDateFormat;
    }

    private synchronized void a(a aVar, Date date) {
        if (date == null) {
            aVar.h();
        } else {
            aVar.c(this.b.format(date));
        }
    }
}
