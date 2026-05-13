package com.zepto;

import android.content.Context;
import com.zepto.yn6;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 extends yn6 {
    public lx4 c;
    public lx4 e;
    public lx4 f;
    public lx4 g;
    public lx4 h;
    public lx4 i;
    public lx4 j;
    public lx4 k;
    public lx4 l;
    public lx4 m;
    public lx4 n;
    public lx4 o;
    public lx4 p;

    public static final class b implements yn6.a {
        public Context a;

        public b() {
        }

        @Override // com.zepto.yn6.a
        public yn6 a() {
            hu4.a(this.a, Context.class);
            return new nc1(this.a);
        }

        @Override // com.zepto.yn6.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.a = (Context) hu4.b(context);
            return this;
        }
    }

    public static yn6.a j() {
        return new b();
    }

    @Override // com.zepto.yn6
    public d52 d() {
        return (d52) this.j.get();
    }

    @Override // com.zepto.yn6
    public xn6 e() {
        return (xn6) this.p.get();
    }

    public final void m(Context context) {
        this.c = iu1.a(z52.a());
        q72 q72VarA = d03.a(context);
        this.e = q72VarA;
        g31 g31VarA = g31.a(q72VarA, wf6.a(), xf6.a());
        this.f = g31VarA;
        this.g = iu1.a(nt3.a(this.e, g31VarA));
        this.h = lp5.a(this.e, g52.a(), i52.a());
        this.i = iu1.a(h52.a(this.e));
        this.j = iu1.a(gi5.a(wf6.a(), xf6.a(), j52.a(), this.h, this.i));
        zo5 zo5VarB = zo5.b(wf6.a());
        this.k = zo5VarB;
        bp5 bp5VarA = bp5.a(this.e, this.j, zo5VarB, xf6.a());
        this.l = bp5VarA;
        lx4 lx4Var = this.c;
        lx4 lx4Var2 = this.g;
        lx4 lx4Var3 = this.j;
        this.m = ag1.a(lx4Var, lx4Var2, bp5VarA, lx4Var3, lx4Var3);
        lx4 lx4Var4 = this.e;
        lx4 lx4Var5 = this.g;
        lx4 lx4Var6 = this.j;
        this.n = pr6.a(lx4Var4, lx4Var5, lx4Var6, this.l, this.c, lx4Var6, wf6.a(), xf6.a(), this.j);
        lx4 lx4Var7 = this.c;
        lx4 lx4Var8 = this.j;
        this.o = fy7.a(lx4Var7, lx4Var8, this.l, lx4Var8);
        this.p = iu1.a(zn6.a(wf6.a(), xf6.a(), this.m, this.n, this.o));
    }

    public nc1(Context context) {
        m(context);
    }
}
