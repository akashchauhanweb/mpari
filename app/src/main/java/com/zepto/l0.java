package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 extends u0 {
    public static final j1 c = new a(l0.class, 5);

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return l0.g0(z41Var.j0());
        }
    }

    public static l0 g0(byte[] bArr) {
        if (bArr.length == 0) {
            return x41.e;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        return u0Var instanceof l0;
    }
}
