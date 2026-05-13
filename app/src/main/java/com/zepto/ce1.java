package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends no6 {
    public static final po6 b = new a();
    public final List a;

    public class a implements po6 {
        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new ce1();
            }
            return null;
        }
    }

    public ce1() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (z33.d()) {
            arrayList.add(jt4.c(2, 2));
        }
    }

    public final Date a(s53 s53Var) throws IOException {
        String strE0 = s53Var.E0();
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strE0);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return ww2.c(strE0, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new u53("Failed parsing '" + strE0 + "' as Date; at path " + s53Var.U(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date read(s53 s53Var) throws IOException {
        if (s53Var.G0() != v53.NULL) {
            return a(s53Var);
        }
        s53Var.C0();
        return null;
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(b63 b63Var, Date date) throws IOException {
        String str;
        if (date == null) {
            b63Var.m0();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            str = dateFormat.format(date);
        }
        b63Var.J0(str);
    }
}
