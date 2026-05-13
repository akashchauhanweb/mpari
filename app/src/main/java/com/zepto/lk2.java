package com.zepto;

import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public class lk2 implements xm6 {
    public final ae1 a;

    public lk2() {
        this(Date.class);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public GregorianCalendar b(String str) {
        return d(this.a.b(str));
    }

    public final GregorianCalendar d(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date != null) {
            gregorianCalendar.setTime(date);
        }
        return gregorianCalendar;
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String a(GregorianCalendar gregorianCalendar) {
        return this.a.a(gregorianCalendar.getTime());
    }

    public lk2(Class cls) {
        this.a = new ae1(cls);
    }
}
