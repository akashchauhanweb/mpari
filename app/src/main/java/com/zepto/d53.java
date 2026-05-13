package com.zepto;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class d53 implements a22 {
    public static final we4 e = new we4() { // from class: com.zepto.a53
        @Override // com.zepto.we4
        public final void a(Object obj, Object obj2) {
            d53.l(obj, (xe4) obj2);
        }
    };
    public static final jm7 f = new jm7() { // from class: com.zepto.b53
        @Override // com.zepto.jm7
        public final void a(Object obj, Object obj2) {
            ((km7) obj2).c((String) obj);
        }
    };
    public static final jm7 g = new jm7() { // from class: com.zepto.c53
        @Override // com.zepto.jm7
        public final void a(Object obj, Object obj2) {
            d53.n((Boolean) obj, (km7) obj2);
        }
    };
    public static final b h = new b(null);
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public we4 c = e;
    public boolean d = false;

    public class a implements nd1 {
        public a() {
        }

        @Override // com.zepto.nd1
        public void a(Object obj, Writer writer) {
            z53 z53Var = new z53(writer, d53.this.a, d53.this.b, d53.this.c, d53.this.d);
            z53Var.h(obj, false);
            z53Var.p();
        }
    }

    public static final class b implements jm7 {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.zepto.jm7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, km7 km7Var) {
            km7Var.c(a.format(date));
        }
    }

    public d53() {
        p(String.class, f);
        p(Boolean.class, g);
        p(Date.class, h);
    }

    public static /* synthetic */ void l(Object obj, xe4 xe4Var) {
        throw new e22("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void n(Boolean bool, km7 km7Var) {
        km7Var.e(bool.booleanValue());
    }

    public nd1 i() {
        return new a();
    }

    public d53 j(aw0 aw0Var) {
        aw0Var.a(this);
        return this;
    }

    public d53 k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // com.zepto.a22
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public d53 a(Class cls, we4 we4Var) {
        this.a.put(cls, we4Var);
        this.b.remove(cls);
        return this;
    }

    public d53 p(Class cls, jm7 jm7Var) {
        this.b.put(cls, jm7Var);
        this.a.remove(cls);
        return this;
    }
}
