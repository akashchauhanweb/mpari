package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class eo extends n0 {
    public p0 c;
    public a0 e;

    public eo(p0 p0Var) {
        this.c = p0Var;
    }

    public static eo B(Object obj) {
        if (obj instanceof eo) {
            return (eo) obj;
        }
        if (obj != null) {
            return new eo(x0.i0(obj));
        }
        return null;
    }

    public a0 D() {
        return this.e;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0(2);
        b0Var.a(this.c);
        a0 a0Var = this.e;
        if (a0Var != null) {
            b0Var.a(a0Var);
        }
        return new d51(b0Var);
    }

    public p0 z() {
        return this.c;
    }

    public eo(p0 p0Var, a0 a0Var) {
        this.c = p0Var;
        this.e = a0Var;
    }

    public eo(x0 x0Var) {
        if (x0Var.size() >= 1 && x0Var.size() <= 2) {
            this.c = p0.l0(x0Var.j0(0));
            this.e = x0Var.size() == 2 ? x0Var.j0(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + x0Var.size());
        }
    }
}
