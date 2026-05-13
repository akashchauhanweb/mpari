package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class n78 extends d78 {
    public final /* synthetic */ rh8 e;
    public final /* synthetic */ i88 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n78(i88 i88Var, rh8 rh8Var, rh8 rh8Var2) {
        super(rh8Var);
        this.f = i88Var;
        this.e = rh8Var2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((dm8) this.f.e.e()).R(this.f.a, i88.h(), new x78(this.f, this.e));
        } catch (RemoteException e) {
            i88.g.c(e, "keepAlive", new Object[0]);
        }
    }
}
