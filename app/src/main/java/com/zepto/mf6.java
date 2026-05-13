package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class mf6 {
    public static final mf6 a = new mf6();
    public static final ThreadLocal b = nf6.a(new s96("ThreadLocalEventLoop"));

    public final w42 a() {
        ThreadLocal threadLocal = b;
        w42 w42Var = (w42) threadLocal.get();
        if (w42Var != null) {
            return w42Var;
        }
        w42 w42VarA = z42.a();
        threadLocal.set(w42VarA);
        return w42VarA;
    }

    public final void b() {
        b.set(null);
    }

    public final void c(w42 w42Var) {
        b.set(w42Var);
    }
}
