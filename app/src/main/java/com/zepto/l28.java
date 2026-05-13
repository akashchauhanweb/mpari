package com.zepto;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class l28 implements Runnable {
    public final /* synthetic */ lw0 c;
    public final /* synthetic */ m28 e;

    public l28(m28 m28Var, lw0 lw0Var) {
        this.e = m28Var;
        this.c = lw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m28 m28Var = this.e;
        i28 i28Var = (i28) m28Var.f.l.get(m28Var.b);
        if (i28Var == null) {
            return;
        }
        if (!this.c.g()) {
            i28Var.G(this.c, null);
            return;
        }
        this.e.e = true;
        if (this.e.a.k()) {
            this.e.h();
            return;
        }
        try {
            m28 m28Var2 = this.e;
            m28Var2.a.d(null, m28Var2.a.b());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.e.a.c("Failed to get service from broker.");
            i28Var.G(new lw0(10), null);
        }
    }
}
