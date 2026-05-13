package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class pg8 extends t58 {
    public final IBinder g;
    public final /* synthetic */ t40 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg8(t40 t40Var, int i, IBinder iBinder, Bundle bundle) {
        super(t40Var, i, bundle);
        this.h = t40Var;
        this.g = iBinder;
    }

    @Override // com.zepto.t58
    public final void f(lw0 lw0Var) {
        if (this.h.v != null) {
            this.h.v.c(lw0Var);
        }
        this.h.I(lw0Var);
    }

    @Override // com.zepto.t58
    public final boolean g() {
        try {
            IBinder iBinder = this.g;
            iu4.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.B().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.h.B() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceP = this.h.p(this.g);
            if (iInterfaceP == null || !(t40.c0(this.h, 2, 4, iInterfaceP) || t40.c0(this.h, 3, 4, iInterfaceP))) {
                return false;
            }
            this.h.z = null;
            Bundle bundleU = this.h.u();
            t40 t40Var = this.h;
            if (t40Var.u == null) {
                return true;
            }
            t40Var.u.j(bundleU);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
