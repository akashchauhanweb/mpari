package com.zepto;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class o86 extends n0 {
    public eo c;
    public x e;

    public o86(x0 x0Var) {
        if (x0Var.size() == 2) {
            Enumeration enumerationK0 = x0Var.k0();
            this.c = eo.B(enumerationK0.nextElement());
            this.e = q41.p0(enumerationK0.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + x0Var.size());
        }
    }

    public static o86 B(Object obj) {
        if (obj instanceof o86) {
            return (o86) obj;
        }
        if (obj != null) {
            return new o86(x0.i0(obj));
        }
        return null;
    }

    public x D() {
        return this.e;
    }

    public u0 O() {
        return u0.d0(this.e.k0());
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0(2);
        b0Var.a(this.c);
        b0Var.a(this.e);
        return new d51(b0Var);
    }

    public eo z() {
        return this.c;
    }

    public o86(eo eoVar, a0 a0Var) {
        this.e = new q41(a0Var);
        this.c = eoVar;
    }

    public o86(eo eoVar, byte[] bArr) {
        this.e = new q41(bArr);
        this.c = eoVar;
    }
}
