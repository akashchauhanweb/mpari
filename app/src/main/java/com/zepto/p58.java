package com.zepto;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
public final class p58 implements Runnable {
    public final /* synthetic */ LifecycleCallback c;
    public final /* synthetic */ String e;
    public final /* synthetic */ b98 f;

    public p58(b98 b98Var, LifecycleCallback lifecycleCallback, String str) {
        this.f = b98Var;
        this.c = lifecycleCallback;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b98 b98Var = this.f;
        if (b98Var.b > 0) {
            this.c.f(b98Var.c != null ? b98Var.c.getBundle(this.e) : null);
        }
        if (this.f.b >= 2) {
            this.c.j();
        }
        if (this.f.b >= 3) {
            this.c.h();
        }
        if (this.f.b >= 4) {
            this.c.k();
        }
        if (this.f.b >= 5) {
            this.c.g();
        }
    }
}
