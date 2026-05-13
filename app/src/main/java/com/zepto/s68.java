package com.zepto;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s68 extends d78 {
    public final /* synthetic */ List e;
    public final /* synthetic */ rh8 f;
    public final /* synthetic */ i88 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s68(i88 i88Var, rh8 rh8Var, List list, rh8 rh8Var2) {
        super(rh8Var);
        this.g = i88Var;
        this.e = list;
        this.f = rh8Var2;
    }

    @Override // com.zepto.d78
    public final void a() {
        try {
            ((dm8) this.g.d.e()).J(this.g.a, i88.u(this.e), i88.h(), new r78(this.g, this.f));
        } catch (RemoteException e) {
            i88.g.c(e, "cancelDownloads(%s)", this.e);
        }
    }
}
