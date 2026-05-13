package com.zepto;

import com.zepto.vy5;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ry3 {
    public static final ry3 b = new ry3();
    public final AtomicReference a = new AtomicReference(new vy5.b().e());

    public static ry3 a() {
        return b;
    }

    public boolean b(sy5 sy5Var) {
        return ((vy5) this.a.get()).e(sy5Var);
    }

    public e63 c(sy5 sy5Var, pu5 pu5Var) {
        return ((vy5) this.a.get()).f(sy5Var, pu5Var);
    }

    public e63 d(zw4 zw4Var, pu5 pu5Var) {
        if (pu5Var == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(zw4Var)) {
            return c(zw4Var, pu5Var);
        }
        try {
            return new se3(zw4Var, pu5Var);
        } catch (GeneralSecurityException e) {
            throw new eg6("Creating a LegacyProtoKey failed", e);
        }
    }

    public synchronized void e(n63 n63Var) {
        this.a.set(new vy5.b((vy5) this.a.get()).f(n63Var).e());
    }

    public synchronized void f(o63 o63Var) {
        this.a.set(new vy5.b((vy5) this.a.get()).g(o63Var).e());
    }

    public synchronized void g(kl4 kl4Var) {
        this.a.set(new vy5.b((vy5) this.a.get()).h(kl4Var).e());
    }

    public synchronized void h(ll4 ll4Var) {
        this.a.set(new vy5.b((vy5) this.a.get()).i(ll4Var).e());
    }
}
