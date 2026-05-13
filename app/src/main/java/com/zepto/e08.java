package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class e08 extends n0 {
    public final k0 c;
    public final int e;
    public final eo f;

    public e08(int i, eo eoVar) {
        this.c = new k0(0L);
        this.e = i;
        this.f = eoVar;
    }

    public static e08 B(Object obj) {
        if (obj instanceof e08) {
            return (e08) obj;
        }
        if (obj != null) {
            return new e08(x0.i0(obj));
        }
        return null;
    }

    public eo D() {
        return this.f;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(this.c);
        b0Var.a(new k0(this.e));
        b0Var.a(this.f);
        return new d51(b0Var);
    }

    public int z() {
        return this.e;
    }

    public e08(x0 x0Var) {
        this.c = k0.i0(x0Var.j0(0));
        this.e = k0.i0(x0Var.j0(1)).m0();
        this.f = eo.B(x0Var.j0(2));
    }
}
