package com.a.a.a.a;

import com.a.a.am;
import com.a.a.c.a;
import java.util.Calendar;

final class n extends am {
    n() {
    }

    public final /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            aVar.h();
            return;
        }
        aVar.f();
        aVar.b("year");
        aVar.a((long) calendar.get(1));
        aVar.b("month");
        aVar.a((long) calendar.get(2));
        aVar.b("dayOfMonth");
        aVar.a((long) calendar.get(5));
        aVar.b("hourOfDay");
        aVar.a((long) calendar.get(11));
        aVar.b("minute");
        aVar.a((long) calendar.get(12));
        aVar.b("second");
        aVar.a((long) calendar.get(13));
        aVar.g();
    }
}
