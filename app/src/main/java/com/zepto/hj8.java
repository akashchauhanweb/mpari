package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class hj8 extends d78 {
    public final /* synthetic */ rh8 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ vk8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj8(vk8 vk8Var, rh8 rh8Var, rh8 rh8Var2, String str) {
        super(rh8Var);
        this.g = vk8Var;
        this.e = rh8Var2;
        this.f = str;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((nk8) this.g.a.e()).I(this.g.b, vk8.i(), new bk8(this.g, this.e));
        } catch (RemoteException e) {
            vk8.e.c(e, "completeUpdate(%s)", this.f);
            this.e.d(new RuntimeException(e));
        }
    }
}
