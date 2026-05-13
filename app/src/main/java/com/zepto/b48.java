package com.zepto;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class b48 extends q28 {
    public final qc6 b;
    public final rc6 c;
    public final i76 d;

    public b48(int i, qc6 qc6Var, rc6 rc6Var, i76 i76Var) {
        super(i);
        this.c = rc6Var;
        this.b = qc6Var;
        this.d = i76Var;
        if (i == 2 && qc6Var.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.zepto.j48
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.zepto.j48
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.zepto.j48
    public final void c(i28 i28Var) throws DeadObjectException {
        try {
            this.b.b(i28Var.u(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(j48.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.zepto.j48
    public final void d(v18 v18Var, boolean z) {
        v18Var.b(this.c, z);
    }

    @Override // com.zepto.q28
    public final boolean f(i28 i28Var) {
        return this.b.c();
    }

    @Override // com.zepto.q28
    public final w82[] g(i28 i28Var) {
        return this.b.e();
    }
}
