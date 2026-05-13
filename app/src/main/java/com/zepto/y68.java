package com.zepto;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class y68 extends d78 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ rh8 i;
    public final /* synthetic */ i88 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y68(i88 i88Var, rh8 rh8Var, int i, String str, String str2, int i2, rh8 rh8Var2) {
        super(rh8Var);
        this.j = i88Var;
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = i2;
        this.i = rh8Var2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((dm8) this.j.d.e()).q(this.j.a, i88.l(this.e, this.f, this.g, this.h), i88.h(), new z78(this.j, this.i));
        } catch (RemoteException e) {
            i88.g.c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
