package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 extends u0 implements ey2 {
    public final int c;
    public final int e;
    public final int f;
    public final a0 g;

    public e1(int i, int i2, int i3, a0 a0Var) {
        if (a0Var == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException("invalid tag class: " + i2);
        }
        this.c = i;
        this.e = i2;
        this.f = i3;
        this.g = a0Var;
    }

    public static e1 g0(u0 u0Var) {
        if (u0Var instanceof e1) {
            return (e1) u0Var;
        }
        throw new IllegalStateException("unexpected object: " + u0Var.getClass().getName());
    }

    public static u0 h0(int i, int i2, b0 b0Var) {
        sb1 sb1Var = b0Var.f() == 1 ? new sb1(3, i, i2, b0Var.d(0)) : new sb1(4, i, i2, y71.a(b0Var));
        return i != 64 ? sb1Var : new o51(sb1Var);
    }

    public static u0 i0(int i, int i2, b0 b0Var) {
        l30 l30Var = b0Var.f() == 1 ? new l30(3, i, i2, b0Var.d(0)) : new l30(4, i, i2, e30.a(b0Var));
        return i != 64 ? l30Var : new a30(l30Var);
    }

    public static u0 j0(int i, int i2, byte[] bArr) {
        sb1 sb1Var = new sb1(4, i, i2, new z41(bArr));
        return i != 64 ? sb1Var : new o51(sb1Var);
    }

    public static e1 n0(Object obj) {
        if (obj == null || (obj instanceof e1)) {
            return (e1) obj;
        }
        if (obj instanceof a0) {
            u0 u0VarM = ((a0) obj).m();
            if (u0VarM instanceof e1) {
                return (e1) u0VarM;
            }
        } else if (obj instanceof byte[]) {
            try {
                return g0(u0.d0((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new g51(this.c, this.e, this.f, this.g);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new sb1(this.c, this.e, this.f, this.g);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return (((this.e * 7919) ^ this.f) ^ (r0() ? 15 : 240)) ^ this.g.m().hashCode();
    }

    public n0 k0() {
        a0 a0Var = this.g;
        return a0Var instanceof n0 ? (n0) a0Var : a0Var.m();
    }

    public u0 l0(boolean z, j1 j1Var) {
        if (z) {
            if (r0()) {
                return j1Var.a(this.g.m());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        if (1 == this.c) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        u0 u0VarM = this.g.m();
        int i = this.c;
        return i != 3 ? i != 4 ? j1Var.a(u0VarM) : u0VarM instanceof x0 ? j1Var.c((x0) u0VarM) : j1Var.d((z41) u0VarM) : j1Var.c(s0(u0VarM));
    }

    public n0 m0() {
        if (!r0()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        a0 a0Var = this.g;
        return a0Var instanceof n0 ? (n0) a0Var : a0Var.m();
    }

    public u0 o0() {
        if (128 == p0()) {
            return this.g.m();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public int p0() {
        return this.e;
    }

    public int q0() {
        return this.f;
    }

    @Override // com.zepto.ey2
    public final u0 r() {
        return this;
    }

    public boolean r0() {
        int i = this.c;
        return i == 1 || i == 3;
    }

    public abstract x0 s0(u0 u0Var);

    public String toString() {
        return k1.a(this.e, this.f) + this.g;
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof v) {
            return u0Var.a0(this);
        }
        if (!(u0Var instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) u0Var;
        if (this.f != e1Var.f || this.e != e1Var.e) {
            return false;
        }
        if (this.c != e1Var.c && r0() != e1Var.r0()) {
            return false;
        }
        u0 u0VarM = this.g.m();
        u0 u0VarM2 = e1Var.g.m();
        if (u0VarM == u0VarM2) {
            return true;
        }
        if (r0()) {
            return u0VarM.z(u0VarM2);
        }
        try {
            return wx.a(getEncoded(), e1Var.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public e1(boolean z, int i, int i2, a0 a0Var) {
        this(z ? 1 : 2, i, i2, a0Var);
    }

    public e1(boolean z, int i, a0 a0Var) {
        this(z, 128, i, a0Var);
    }
}
