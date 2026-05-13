package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class e45 extends n0 {
    public k0 c;
    public p0 e;
    public k0 f;
    public byte[][] g;
    public byte[][] h;
    public byte[] i;

    public e45(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.c = new k0(0L);
        this.f = new k0(i);
        this.g = g45.c(sArr);
        this.h = g45.c(sArr2);
        this.i = g45.a(sArr3);
    }

    public static e45 P(Object obj) {
        if (obj instanceof e45) {
            return (e45) obj;
        }
        if (obj != null) {
            return new e45(x0.i0(obj));
        }
        return null;
    }

    public short[] B() {
        return g45.b(this.i);
    }

    public short[][] D() {
        return g45.d(this.h);
    }

    public int O() {
        return this.f.m0();
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        a0 a0Var = this.c;
        if (a0Var == null) {
            a0Var = this.e;
        }
        b0Var.a(a0Var);
        b0Var.a(this.f);
        b0 b0Var2 = new b0();
        for (int i = 0; i < this.g.length; i++) {
            b0Var2.a(new z41(this.g[i]));
        }
        b0Var.a(new d51(b0Var2));
        b0 b0Var3 = new b0();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            b0Var3.a(new z41(this.h[i2]));
        }
        b0Var.a(new d51(b0Var3));
        b0 b0Var4 = new b0();
        b0Var4.a(new z41(this.i));
        b0Var.a(new d51(b0Var4));
        return new d51(b0Var);
    }

    public short[][] z() {
        return g45.d(this.g);
    }

    public e45(x0 x0Var) {
        if (x0Var.j0(0) instanceof k0) {
            this.c = k0.i0(x0Var.j0(0));
        } else {
            this.e = p0.l0(x0Var.j0(0));
        }
        this.f = k0.i0(x0Var.j0(1));
        x0 x0VarI0 = x0.i0(x0Var.j0(2));
        this.g = new byte[x0VarI0.size()][];
        for (int i = 0; i < x0VarI0.size(); i++) {
            this.g[i] = q0.i0(x0VarI0.j0(i)).j0();
        }
        x0 x0Var2 = (x0) x0Var.j0(3);
        this.h = new byte[x0Var2.size()][];
        for (int i2 = 0; i2 < x0Var2.size(); i2++) {
            this.h[i2] = q0.i0(x0Var2.j0(i2)).j0();
        }
        this.i = q0.i0(((x0) x0Var.j0(4)).j0(0)).j0();
    }
}
