package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class or3 extends n0 {
    public final int c;
    public final int e;
    public final ii2 f;
    public final eo g;

    public or3(int i, int i2, ii2 ii2Var, eo eoVar) {
        this.c = i;
        this.e = i2;
        this.f = new ii2(ii2Var.c());
        this.g = eoVar;
    }

    public static or3 D(Object obj) {
        if (obj instanceof or3) {
            return (or3) obj;
        }
        if (obj != null) {
            return new or3(x0.i0(obj));
        }
        return null;
    }

    public ii2 B() {
        return this.f;
    }

    public int O() {
        return this.c;
    }

    public int P() {
        return this.e;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(new k0(this.c));
        b0Var.a(new k0(this.e));
        b0Var.a(new z41(this.f.c()));
        b0Var.a(this.g);
        return new d51(b0Var);
    }

    public eo z() {
        return this.g;
    }

    public or3(x0 x0Var) {
        this.c = ((k0) x0Var.j0(0)).m0();
        this.e = ((k0) x0Var.j0(1)).m0();
        this.f = new ii2(((q0) x0Var.j0(2)).j0());
        this.g = eo.B(x0Var.j0(3));
    }
}
