package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class se5 {
    public static se5 b;
    public static final te5 c = new te5(0, false, false, 0, 0);
    public te5 a;

    public static synchronized se5 b() {
        try {
            if (b == null) {
                b = new se5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public te5 a() {
        return this.a;
    }

    public final synchronized void c(te5 te5Var) {
        if (te5Var == null) {
            this.a = c;
            return;
        }
        te5 te5Var2 = this.a;
        if (te5Var2 == null || te5Var2.g() < te5Var.g()) {
            this.a = te5Var;
        }
    }
}
