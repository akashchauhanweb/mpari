package com.zepto;

import com.zepto.bv4;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class qy3 {
    public static qy3 b = new qy3();
    public final AtomicReference a = new AtomicReference(new bv4.b().c());

    public static qy3 c() {
        return b;
    }

    public Class a(Class cls) {
        return ((bv4) this.a.get()).c(cls);
    }

    public Object b(e63 e63Var, Class cls) {
        return ((bv4) this.a.get()).d(e63Var, cls);
    }

    public synchronized void d(wu4 wu4Var) {
        this.a.set(new bv4.b((bv4) this.a.get()).d(wu4Var).c());
    }

    public synchronized void e(ev4 ev4Var) {
        this.a.set(new bv4.b((bv4) this.a.get()).e(ev4Var).c());
    }

    public Object f(dv4 dv4Var, Class cls) {
        return ((bv4) this.a.get()).e(dv4Var, cls);
    }
}
