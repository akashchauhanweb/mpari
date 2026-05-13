package com.zepto;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class t58 extends xa8 {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ t40 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t58(t40 t40Var, int i, Bundle bundle) {
        super(t40Var, Boolean.TRUE);
        this.f = t40Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.zepto.xa8
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d != 0) {
            this.f.e0(1, null);
            Bundle bundle = this.e;
            f(new lw0(this.d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f.e0(1, null);
            f(new lw0(8, null));
        }
    }

    @Override // com.zepto.xa8
    public final void b() {
    }

    public abstract void f(lw0 lw0Var);

    public abstract boolean g();
}
