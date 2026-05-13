package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class l86 {
    public final h03 a;
    public final ma3 b;
    public final ma3 c;
    public final nw3 d;
    public final boolean e;

    public l86(h03 h03Var, nw3 nw3Var, ma3 ma3Var, ma3 ma3Var2, boolean z) {
        this.e = z;
        this.a = h03Var;
        this.b = ma3Var;
        this.d = nw3Var;
        this.c = ma3Var2;
    }

    public h03 a() {
        return this.a;
    }

    public ip7 b() {
        ma3 ma3Var = this.b;
        if (ma3Var != null) {
            return (ip7) ma3Var.o().b(ip7.class);
        }
        return null;
    }

    public qu5 c() {
        return new rw3(this.d);
    }

    public ma3 d() {
        return this.c;
    }

    public ma3 e() {
        return this.b;
    }

    public boolean f() {
        return this.e;
    }
}
