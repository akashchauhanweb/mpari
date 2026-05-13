package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class xi8 extends d78 {
    public final /* synthetic */ String e;
    public final /* synthetic */ rh8 f;
    public final /* synthetic */ vk8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi8(vk8 vk8Var, rh8 rh8Var, String str, rh8 rh8Var2) {
        super(rh8Var);
        this.g = vk8Var;
        this.e = str;
        this.f = rh8Var2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            nk8 nk8Var = (nk8) this.g.a.e();
            vk8 vk8Var = this.g;
            nk8Var.b0(vk8Var.b, vk8.b(vk8Var, this.e), new lk8(this.g, this.f, this.e));
        } catch (RemoteException e) {
            vk8.e.c(e, "requestUpdateInfo(%s)", this.e);
            this.f.d(new RuntimeException(e));
        }
    }
}
