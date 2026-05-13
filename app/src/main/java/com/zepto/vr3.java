package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class vr3 extends n0 {
    public final int c;
    public final int e;
    public final ii2 f;

    public vr3(int i, int i2, ii2 ii2Var) {
        this.c = i;
        this.e = i2;
        this.f = new ii2(ii2Var);
    }

    public static vr3 B(Object obj) {
        if (obj instanceof vr3) {
            return (vr3) obj;
        }
        if (obj != null) {
            return new vr3(x0.i0(obj));
        }
        return null;
    }

    public int D() {
        return this.c;
    }

    public int O() {
        return this.e;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(new k0(this.c));
        b0Var.a(new k0(this.e));
        b0Var.a(new z41(this.f.c()));
        return new d51(b0Var);
    }

    public ii2 z() {
        return new ii2(this.f);
    }

    public vr3(x0 x0Var) {
        this.c = ((k0) x0Var.j0(0)).m0();
        this.e = ((k0) x0Var.j0(1)).m0();
        this.f = new ii2(((q0) x0Var.j0(2)).j0());
    }
}
