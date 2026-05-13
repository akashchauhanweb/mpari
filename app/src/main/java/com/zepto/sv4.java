package com.zepto;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class sv4 extends n0 {
    public k0 c;
    public eo e;
    public q0 f;
    public z0 g;
    public x h;

    public sv4(x0 x0Var) {
        Enumeration enumerationK0 = x0Var.k0();
        k0 k0VarI0 = k0.i0(enumerationK0.nextElement());
        this.c = k0VarI0;
        int iP = P(k0VarI0);
        this.e = eo.B(enumerationK0.nextElement());
        this.f = q0.i0(enumerationK0.nextElement());
        int i = -1;
        while (enumerationK0.hasMoreElements()) {
            e1 e1Var = (e1) enumerationK0.nextElement();
            int iQ0 = e1Var.q0();
            if (iQ0 <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (iQ0 == 0) {
                this.g = z0.h0(e1Var, false);
            } else {
                if (iQ0 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iP < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.h = q41.o0(e1Var, false);
            }
            i = iQ0;
        }
    }

    public static sv4 B(Object obj) {
        if (obj instanceof sv4) {
            return (sv4) obj;
        }
        if (obj != null) {
            return new sv4(x0.i0(obj));
        }
        return null;
    }

    public static int P(k0 k0Var) {
        int iM0 = k0Var.m0();
        if (iM0 < 0 || iM0 > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return iM0;
    }

    public eo D() {
        return this.e;
    }

    public x O() {
        return this.h;
    }

    public a0 T() {
        return u0.d0(this.f.j0());
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0(5);
        b0Var.a(this.c);
        b0Var.a(this.e);
        b0Var.a(this.f);
        z0 z0Var = this.g;
        if (z0Var != null) {
            b0Var.a(new g51(false, 0, z0Var));
        }
        x xVar = this.h;
        if (xVar != null) {
            b0Var.a(new g51(false, 1, xVar));
        }
        return new d51(b0Var);
    }

    public z0 z() {
        return this.g;
    }

    public sv4(eo eoVar, a0 a0Var) {
        this(eoVar, a0Var, null, null);
    }

    public sv4(eo eoVar, a0 a0Var, z0 z0Var) {
        this(eoVar, a0Var, z0Var, null);
    }

    public sv4(eo eoVar, a0 a0Var, z0 z0Var, byte[] bArr) {
        this.c = new k0(bArr != null ? t50.b : t50.a);
        this.e = eoVar;
        this.f = new z41(a0Var);
        this.g = z0Var;
        this.h = bArr == null ? null : new q41(bArr);
    }
}
