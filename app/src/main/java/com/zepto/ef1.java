package com.zepto;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ef1 extends no6 {
    public final b a;
    public final List b;

    public static abstract class b {
        public static final b b = new a(Date.class);
        public final Class a;

        public class a extends b {
            public a(Class cls) {
                super(cls);
            }

            @Override // com.zepto.ef1.b
            public Date d(Date date) {
                return date;
            }
        }

        public b(Class cls) {
            this.a = cls;
        }

        public final po6 a(int i, int i2) {
            return c(new ef1(this, i, i2));
        }

        public final po6 b(String str) {
            return c(new ef1(this, str));
        }

        public final po6 c(ef1 ef1Var) {
            return so6.b(this.a, ef1Var);
        }

        public abstract Date d(Date date);
    }

    private Date a(s53 s53Var) throws IOException {
        String strE0 = s53Var.E0();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
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
        if (s53Var.G0() == v53.NULL) {
            s53Var.C0();
            return null;
        }
        return this.a.d(a(s53Var));
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(b63 b63Var, Date date) throws IOException {
        String str;
        if (date == null) {
            b63Var.m0();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        b63Var.J0(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public ef1(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public ef1(b bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (z33.d()) {
            arrayList.add(jt4.c(i, i2));
        }
    }
}
