package com.zepto;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class p38 extends q28 {
    public final rc6 b;

    public p38(int i, rc6 rc6Var) {
        super(i);
        this.b = rc6Var;
    }

    @Override // com.zepto.j48
    public final void a(Status status) {
        this.b.d(new eq(status));
    }

    @Override // com.zepto.j48
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.zepto.j48
    public final void c(i28 i28Var) throws DeadObjectException {
        try {
            h(i28Var);
        } catch (DeadObjectException e) {
            a(j48.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(j48.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    public abstract void h(i28 i28Var);
}
