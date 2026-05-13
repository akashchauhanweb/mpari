package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class oc8 implements wc8 {
    public wc8 a;

    public static void b(wc8 wc8Var, wc8 wc8Var2) {
        oc8 oc8Var = (oc8) wc8Var;
        if (oc8Var.a != null) {
            throw new IllegalStateException();
        }
        oc8Var.a = wc8Var2;
    }

    @Override // com.zepto.wc8
    public final Object a() {
        wc8 wc8Var = this.a;
        if (wc8Var != null) {
            return wc8Var.a();
        }
        throw new IllegalStateException();
    }
}
