package com.zepto;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class yf6 {
    public static final yf6 c = new yf6(null, null);
    public final Long a;
    public final TimeZone b;

    public yf6(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static yf6 c() {
        return c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
