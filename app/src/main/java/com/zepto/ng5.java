package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ng5 extends n0 {
    public final k0 c;
    public final eo e;

    public ng5(x0 x0Var) {
        this.c = k0.i0(x0Var.j0(0));
        this.e = eo.B(x0Var.j0(1));
    }

    public static final ng5 z(Object obj) {
        if (obj instanceof ng5) {
            return (ng5) obj;
        }
        if (obj != null) {
            return new ng5(x0.i0(obj));
        }
        return null;
    }

    public eo B() {
        return this.e;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(this.c);
        b0Var.a(this.e);
        return new d51(b0Var);
    }

    public ng5(eo eoVar) {
        this.c = new k0(0L);
        this.e = eoVar;
    }
}
