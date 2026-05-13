package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends u0 {
    public static final j1 e = new a(o0.class, 7);
    public final h0 c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 c(x0 x0Var) {
            return new o0((h0) h0.e.c(x0Var));
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return new o0((h0) h0.e.d(z41Var));
        }
    }

    public o0(h0 h0Var) {
        if (h0Var == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.c = h0Var;
    }

    public static o0 g0(byte[] bArr) {
        return new o0(h0.g0(bArr));
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.s(z, 7);
        this.c.B(s0Var, false);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return this.c.T(z);
    }

    @Override // com.zepto.u0
    public u0 e0() {
        h0 h0Var = (h0) this.c.e0();
        return h0Var == this.c ? this : new o0(h0Var);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        h0 h0Var = (h0) this.c.f0();
        return h0Var == this.c ? this : new o0(h0Var);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return ~this.c.hashCode();
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof o0) {
            return this.c.z(((o0) u0Var).c);
        }
        return false;
    }
}
