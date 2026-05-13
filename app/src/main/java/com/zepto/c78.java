package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class c78 extends d78 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ rh8 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ i88 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c78(i88 i88Var, rh8 rh8Var, int i, String str, rh8 rh8Var2, int i2) {
        super(rh8Var);
        this.i = i88Var;
        this.e = i;
        this.f = str;
        this.g = rh8Var2;
        this.h = i2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((dm8) this.i.d.e()).l0(this.i.a, i88.y(this.e, this.f), i88.h(), new b88(this.i, this.g, this.e, this.f, this.h));
        } catch (RemoteException e) {
            i88.g.c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
