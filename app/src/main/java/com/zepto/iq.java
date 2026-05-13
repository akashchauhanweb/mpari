package com.zepto;

import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public final class iq {
    public final int a;
    public final yp b;
    public final yp.d c;
    public final String d;

    public iq(yp ypVar, yp.d dVar, String str) {
        this.b = ypVar;
        this.c = dVar;
        this.d = str;
        this.a = if4.b(ypVar, dVar, str);
    }

    public static iq a(yp ypVar, yp.d dVar, String str) {
        return new iq(ypVar, dVar, str);
    }

    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return if4.a(this.b, iqVar.b) && if4.a(this.c, iqVar.c) && if4.a(this.d, iqVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
