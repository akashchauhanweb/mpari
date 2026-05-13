package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class tr3 extends n0 {
    public int c;
    public int e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    public tr3(int i, int i2, ji2 ji2Var, rs4 rs4Var, dr4 dr4Var, dr4 dr4Var2, ii2 ii2Var) {
        this.c = i;
        this.e = i2;
        this.f = ji2Var.e();
        this.g = rs4Var.h();
        this.h = ii2Var.c();
        this.i = dr4Var.a();
        this.j = dr4Var2.a();
    }

    public static tr3 D(Object obj) {
        if (obj instanceof tr3) {
            return (tr3) obj;
        }
        if (obj != null) {
            return new tr3(x0.i0(obj));
        }
        return null;
    }

    public rs4 B() {
        return new rs4(z(), this.g);
    }

    public int O() {
        return this.e;
    }

    public int P() {
        return this.c;
    }

    public dr4 T() {
        return new dr4(this.i);
    }

    public dr4 a0() {
        return new dr4(this.j);
    }

    public ii2 d0() {
        return new ii2(this.h);
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(new k0(this.c));
        b0Var.a(new k0(this.e));
        b0Var.a(new z41(this.f));
        b0Var.a(new z41(this.g));
        b0Var.a(new z41(this.i));
        b0Var.a(new z41(this.j));
        b0Var.a(new z41(this.h));
        return new d51(b0Var);
    }

    public ji2 z() {
        return new ji2(this.f);
    }

    public tr3(x0 x0Var) {
        this.c = ((k0) x0Var.j0(0)).m0();
        this.e = ((k0) x0Var.j0(1)).m0();
        this.f = ((q0) x0Var.j0(2)).j0();
        this.g = ((q0) x0Var.j0(3)).j0();
        this.i = ((q0) x0Var.j0(4)).j0();
        this.j = ((q0) x0Var.j0(5)).j0();
        this.h = ((q0) x0Var.j0(6)).j0();
    }
}
