package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 extends f1 {
    public final d1 b;

    public j1(Class cls, int i) {
        super(cls);
        this.b = d1.a(0, i);
    }

    public final u0 a(u0 u0Var) {
        if (this.a.isInstance(u0Var)) {
            return u0Var;
        }
        throw new IllegalStateException("unexpected object: " + u0Var.getClass().getName());
    }

    public final u0 b(byte[] bArr) {
        return a(u0.d0(bArr));
    }

    public u0 c(x0 x0Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public u0 d(z41 z41Var) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public final u0 e(e1 e1Var, boolean z) {
        if (128 == e1Var.p0()) {
            return a(e1Var.l0(z, this));
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }
}
