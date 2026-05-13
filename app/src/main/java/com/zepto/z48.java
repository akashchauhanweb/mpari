package com.zepto;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class z48 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean b;
    public final AtomicReference c;
    public final Handler d;
    public final xj2 e;

    public z48(af3 af3Var, xj2 xj2Var) {
        super(af3Var);
        this.c = new AtomicReference(null);
        this.d = new b58(Looper.getMainLooper());
        this.e = xj2Var;
    }

    public static final int p(p48 p48Var) {
        if (p48Var == null) {
            return -1;
        }
        return p48Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i, int i2, Intent intent) {
        p48 p48Var = (p48) this.c.get();
        if (i != 1) {
            if (i == 2) {
                int iF = this.e.f(b());
                if (iF == 0) {
                    o();
                    return;
                } else {
                    if (p48Var == null) {
                        return;
                    }
                    if (p48Var.b().c() == 18 && iF == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            o();
            return;
        } else if (i2 == 0) {
            if (p48Var == null) {
                return;
            }
            l(new lw0(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, p48Var.b().toString()), p(p48Var));
            return;
        }
        if (p48Var != null) {
            l(p48Var.b(), p48Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new p48(new lw0(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        p48 p48Var = (p48) this.c.get();
        if (p48Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", p48Var.a());
        bundle.putInt("failed_status", p48Var.b().c());
        bundle.putParcelable("failed_resolution", p48Var.b().e());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.b = false;
    }

    public final void l(lw0 lw0Var, int i) {
        this.c.set(null);
        m(lw0Var, i);
    }

    public abstract void m(lw0 lw0Var, int i);

    public abstract void n();

    public final void o() {
        this.c.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new lw0(13, null), p((p48) this.c.get()));
    }

    public final void s(lw0 lw0Var, int i) {
        p48 p48Var = new p48(lw0Var, i);
        AtomicReference atomicReference = this.c;
        while (!bf3.a(atomicReference, null, p48Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.d.post(new w48(this, p48Var));
    }
}
