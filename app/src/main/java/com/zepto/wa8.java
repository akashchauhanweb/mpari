package com.zepto;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
public final class wa8 implements Runnable {
    public final /* synthetic */ LifecycleCallback c;
    public final /* synthetic */ String e;
    public final /* synthetic */ jd8 f;

    public wa8(jd8 jd8Var, LifecycleCallback lifecycleCallback, String str) {
        this.f = jd8Var;
        this.c = lifecycleCallback;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jd8 jd8Var = this.f;
        if (jd8Var.e0 > 0) {
            this.c.f(jd8Var.f0 != null ? jd8Var.f0.getBundle(this.e) : null);
        }
        if (this.f.e0 >= 2) {
            this.c.j();
        }
        if (this.f.e0 >= 3) {
            this.c.h();
        }
        if (this.f.e0 >= 4) {
            this.c.k();
        }
        if (this.f.e0 >= 5) {
            this.c.g();
        }
    }
}
