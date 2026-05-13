package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class mr3 extends n0 {
    public int c;
    public int e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public eo i;

    public mr3(int i, int i2, ji2 ji2Var, rs4 rs4Var, dr4 dr4Var, eo eoVar) {
        this.c = i;
        this.e = i2;
        this.f = ji2Var.e();
        this.g = rs4Var.h();
        this.h = dr4Var.a();
        this.i = eoVar;
    }

    public static mr3 O(Object obj) {
        if (obj instanceof mr3) {
            return (mr3) obj;
        }
        if (obj != null) {
            return new mr3(x0.i0(obj));
        }
        return null;
    }

    public ji2 B() {
        return new ji2(this.f);
    }

    public rs4 D() {
        return new rs4(B(), this.g);
    }

    public int P() {
        return this.e;
    }

    public int T() {
        return this.c;
    }

    public dr4 a0() {
        return new dr4(this.h);
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(new k0(this.c));
        b0Var.a(new k0(this.e));
        b0Var.a(new z41(this.f));
        b0Var.a(new z41(this.g));
        b0Var.a(new z41(this.h));
        b0Var.a(this.i);
        return new d51(b0Var);
    }

    public eo z() {
        return this.i;
    }

    public mr3(x0 x0Var) {
        this.c = ((k0) x0Var.j0(0)).m0();
        this.e = ((k0) x0Var.j0(1)).m0();
        this.f = ((q0) x0Var.j0(2)).j0();
        this.g = ((q0) x0Var.j0(3)).j0();
        this.h = ((q0) x0Var.j0(4)).j0();
        this.i = eo.B(x0Var.j0(5));
    }
}
