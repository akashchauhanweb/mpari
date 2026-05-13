package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class kd8 extends f68 {
    public t40 a;
    public final int b;

    public kd8(t40 t40Var, int i) {
        this.a = t40Var;
        this.b = i;
    }

    @Override // com.zepto.nw2
    public final void N(int i, IBinder iBinder, di8 di8Var) {
        t40 t40Var = this.a;
        iu4.j(t40Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        iu4.i(di8Var);
        t40.Y(t40Var, di8Var);
        m0(i, iBinder, di8Var.c);
    }

    @Override // com.zepto.nw2
    public final void f(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.zepto.nw2
    public final void m0(int i, IBinder iBinder, Bundle bundle) {
        iu4.j(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.K(i, iBinder, bundle, this.b);
        this.a = null;
    }
}
