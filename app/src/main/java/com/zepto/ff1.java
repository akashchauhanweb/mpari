package com.zepto;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ff1 extends mo6 {
    public final b a;
    public final List b;

    public static abstract class b {
        public static final b b = new a(Date.class);
        public final Class a;

        public class a extends b {
            public a(Class cls) {
                super(cls);
            }
        }

        public b(Class cls) {
            this.a = cls;
        }

        public final oo6 a(int i, int i2) {
            return c(new ff1(this, i, i2));
        }

        public final oo6 b(String str) {
            return c(new ff1(this, str));
        }

        public final oo6 c(ff1 ff1Var) {
            return to6.a(this.a, ff1Var);
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
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        a63Var.J0(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public ff1(b bVar, String str) {
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

    public ff1(b bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (y33.d()) {
            arrayList.add(it4.c(i, i2));
        }
    }
}
