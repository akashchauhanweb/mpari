package com.zepto;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class w48 implements Runnable {
    public final p48 c;
    public final /* synthetic */ z48 e;

    public w48(z48 z48Var, p48 p48Var) {
        this.e = z48Var;
        this.c = p48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.b) {
            lw0 lw0VarB = this.c.b();
            if (lw0VarB.f()) {
                z48 z48Var = this.e;
                z48Var.a.startActivityForResult(GoogleApiActivity.a(z48Var.b(), (PendingIntent) iu4.i(lw0VarB.e()), this.c.a(), false), 1);
                return;
            }
            z48 z48Var2 = this.e;
            if (z48Var2.e.a(z48Var2.b(), lw0VarB.c(), null) != null) {
                z48 z48Var3 = this.e;
                z48Var3.e.u(z48Var3.b(), this.e.a, lw0VarB.c(), 2, this.e);
            } else {
                if (lw0VarB.c() != 18) {
                    this.e.l(lw0VarB, this.c.a());
                    return;
                }
                z48 z48Var4 = this.e;
                Dialog dialogP = z48Var4.e.p(z48Var4.b(), this.e);
                z48 z48Var5 = this.e;
                z48Var5.e.q(z48Var5.b().getApplicationContext(), new t48(this, dialogP));
            }
        }
    }
}
