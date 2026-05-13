package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class h08 extends n0 {
    public final k0 c;
    public final int e;
    public final int f;
    public final eo g;

    public h08(int i, int i2, eo eoVar) {
        this.c = new k0(0L);
        this.e = i;
        this.f = i2;
        this.g = eoVar;
    }

    public static h08 B(Object obj) {
        if (obj instanceof h08) {
            return (h08) obj;
        }
        if (obj != null) {
            return new h08(x0.i0(obj));
        }
        return null;
    }

    public int D() {
        return this.f;
    }

    public eo O() {
        return this.g;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(this.c);
        b0Var.a(new k0(this.e));
        b0Var.a(new k0(this.f));
        b0Var.a(this.g);
        return new d51(b0Var);
    }

    public int z() {
        return this.e;
    }

    public h08(x0 x0Var) {
        this.c = k0.i0(x0Var.j0(0));
        this.e = k0.i0(x0Var.j0(1)).m0();
        this.f = k0.i0(x0Var.j0(2)).m0();
        this.g = eo.B(x0Var.j0(3));
    }
}
