package com.a.a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class q implements u, x {
    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    q() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    q(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    public q(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    private q(DateFormat dateFormat, DateFormat dateFormat2) {
        this.a = dateFormat;
        this.b = dateFormat2;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private al a(Date date) {
        al akVar;
        synchronized (this.b) {
            akVar = new ak(this.a.format(date));
        }
        return akVar;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(q.class.getSimpleName());
        stringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
        return stringBuilder.toString();
    }
}
