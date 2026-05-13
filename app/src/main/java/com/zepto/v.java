package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends u0 implements ey2 {
    public final e1 c;

    public v(e1 e1Var) {
        g0(e1Var.p0());
        this.c = e1Var;
    }

    public static int g0(int i) {
        if (64 == i) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        this.c.B(s0Var, z);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return this.c.D();
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return this.c.T(z);
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new o41((e1) this.c.e0());
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new o51((e1) this.c.f0());
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.zepto.ey2
    public final u0 r() {
        return this;
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        e1 e1Var;
        if (u0Var instanceof v) {
            e1Var = ((v) u0Var).c;
        } else {
            if (!(u0Var instanceof e1)) {
                return false;
            }
            e1Var = (e1) u0Var;
        }
        return this.c.a0(e1Var);
    }
}
