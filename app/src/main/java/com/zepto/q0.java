package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 extends u0 implements r0 {
    public static final j1 e = new a(q0.class, 4);
    public static final byte[] f = new byte[0];
    public byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 c(x0 x0Var) {
            return x0Var.o0();
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return z41Var;
        }
    }

    public q0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.c = bArr;
    }

    public static q0 g0(byte[] bArr) {
        return new z41(bArr);
    }

    public static q0 h0(e1 e1Var, boolean z) {
        return (q0) e.e(e1Var, z);
    }

    public static q0 i0(Object obj) {
        if (obj == null || (obj instanceof q0)) {
            return (q0) obj;
        }
        if (obj instanceof a0) {
            u0 u0VarM = ((a0) obj).m();
            if (u0VarM instanceof q0) {
                return (q0) u0VarM;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (q0) e.b((byte[]) obj);
            } catch (IOException e2) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e2.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new z41(this.c);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new z41(this.c);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return wx.k(j0());
    }

    @Override // com.zepto.r0
    public InputStream j() {
        return new ByteArrayInputStream(this.c);
    }

    public byte[] j0() {
        return this.c;
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return m();
    }

    public String toString() {
        return "#" + i86.b(cm2.a(this.c));
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof q0) {
            return wx.a(this.c, ((q0) u0Var).c);
        }
        return false;
    }
}
