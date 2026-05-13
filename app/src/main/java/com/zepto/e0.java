package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 extends u0 {
    public static final j1 i = new a(e0.class, 8);
    public p0 c;
    public k0 e;
    public u0 f;
    public int g;
    public u0 h;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 c(x0 x0Var) {
            return x0Var.n0();
        }
    }

    public e0(p0 p0Var, k0 k0Var, u0 u0Var, int i2, u0 u0Var2) {
        this.c = p0Var;
        this.e = k0Var;
        this.f = u0Var;
        this.g = h0(i2);
        this.h = i0(i2, u0Var2);
    }

    public static int h0(int i2) {
        if (i2 >= 0 && i2 <= 2) {
            return i2;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i2);
    }

    public static u0 i0(int i2, u0 u0Var) {
        j1 j1Var;
        if (i2 == 1) {
            j1Var = q0.e;
        } else {
            if (i2 != 2) {
                return u0Var;
            }
            j1Var = x.e;
        }
        return j1Var.a(u0Var);
    }

    public static u0 j0(e1 e1Var) {
        int iP0 = e1Var.p0();
        int iQ0 = e1Var.q0();
        if (128 != iP0) {
            throw new IllegalArgumentException("invalid tag: " + k1.a(iP0, iQ0));
        }
        if (iQ0 == 0) {
            return e1Var.m0().m();
        }
        if (iQ0 == 1) {
            return q0.h0(e1Var, false);
        }
        if (iQ0 == 2) {
            return x.i0(e1Var, false);
        }
        throw new IllegalArgumentException("invalid tag: " + k1.a(iP0, iQ0));
    }

    public static u0 k0(x0 x0Var, int i2) {
        if (x0Var.size() > i2) {
            return x0Var.j0(i2).m();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.s(z, 40);
        g0().B(s0Var, false);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return true;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return g0().T(z);
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new r41(this.c, this.e, this.f, this.g, this.h);
    }

    public abstract x0 g0();

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return (((kf4.b(this.c) ^ kf4.b(this.e)) ^ kf4.b(this.f)) ^ this.g) ^ this.h.hashCode();
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (this == u0Var) {
            return true;
        }
        if (!(u0Var instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) u0Var;
        return kf4.a(this.c, e0Var.c) && kf4.a(this.e, e0Var.e) && kf4.a(this.f, e0Var.f) && this.g == e0Var.g && this.h.a0(e0Var.h);
    }

    public e0(x0 x0Var) {
        int i2 = 0;
        u0 u0VarK0 = k0(x0Var, 0);
        if (u0VarK0 instanceof p0) {
            this.c = (p0) u0VarK0;
            u0VarK0 = k0(x0Var, 1);
            i2 = 1;
        }
        if (u0VarK0 instanceof k0) {
            this.e = (k0) u0VarK0;
            i2++;
            u0VarK0 = k0(x0Var, i2);
        }
        if (!(u0VarK0 instanceof e1)) {
            this.f = u0VarK0;
            i2++;
            u0VarK0 = k0(x0Var, i2);
        }
        if (x0Var.size() != i2 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(u0VarK0 instanceof e1)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        e1 e1Var = (e1) u0VarK0;
        this.g = h0(e1Var.q0());
        this.h = j0(e1Var);
    }
}
