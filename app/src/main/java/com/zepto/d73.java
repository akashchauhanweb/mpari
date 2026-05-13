package com.zepto;

import com.zepto.a73;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d73 {
    public final a73.b a;

    public d73(a73.b bVar) {
        this.a = bVar;
    }

    public static d73 i() {
        return new d73(a73.d0());
    }

    public static d73 j(b73 b73Var) {
        return new d73((a73.b) b73Var.h().T());
    }

    public synchronized d73 a(r63 r63Var) {
        b(r63Var.b(), false);
        return this;
    }

    public synchronized int b(s63 s63Var, boolean z) {
        a73.c cVarF;
        try {
            cVarF = f(s63Var);
            this.a.t(cVarF);
            if (z) {
                this.a.y(cVarF.a0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return cVarF.a0();
    }

    public final synchronized a73.c c(f63 f63Var, qj4 qj4Var) {
        int iG;
        iG = g();
        if (qj4Var == qj4.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (a73.c) a73.c.e0().t(f63Var).u(iG).x(q63.ENABLED).v(qj4Var).h();
    }

    public synchronized b73 d() {
        return b73.e((a73) this.a.h());
    }

    public final synchronized boolean e(int i) {
        Iterator it = this.a.x().iterator();
        while (it.hasNext()) {
            if (((a73.c) it.next()).a0() == i) {
                return true;
            }
        }
        return false;
    }

    public final synchronized a73.c f(s63 s63Var) {
        return c(u75.k(s63Var), s63Var.Z());
    }

    public final synchronized int g() {
        int iC;
        iC = ft6.c();
        while (e(iC)) {
            iC = ft6.c();
        }
        return iC;
    }

    public synchronized d73 h(int i) {
        for (int i2 = 0; i2 < this.a.v(); i2++) {
            a73.c cVarU = this.a.u(i2);
            if (cVarU.a0() == i) {
                if (!cVarU.c0().equals(q63.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                this.a.y(i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
