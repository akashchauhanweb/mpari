package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class h78 extends d78 {
    public final /* synthetic */ int e;
    public final /* synthetic */ rh8 f;
    public final /* synthetic */ i88 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h78(i88 i88Var, rh8 rh8Var, int i, rh8 rh8Var2) {
        super(rh8Var);
        this.g = i88Var;
        this.e = i;
        this.f = rh8Var2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((dm8) this.g.d.e()).Z(this.g.a, i88.i(this.e), i88.h(), new c88(this.g, this.f));
        } catch (RemoteException e) {
            i88.g.c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
