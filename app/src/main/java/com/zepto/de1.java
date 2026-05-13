package com.zepto;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class de1 extends mo6 {
    public static final oo6 b = new a();
    public final List a;

    public class a implements oo6 {
        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            if (uo6Var.c() == Date.class) {
                return new de1();
            }
            return null;
        }
    }

    public de1() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (y33.d()) {
            arrayList.add(it4.c(2, 2));
        }
    }

    @Override // com.zepto.mo6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(a63 a63Var, Date date) throws IOException {
        String str;
        if (date == null) {
            a63Var.m0();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            str = dateFormat.format(date);
        }
        a63Var.J0(str);
    }
}
