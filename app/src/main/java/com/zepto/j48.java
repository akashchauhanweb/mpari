package com.zepto;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class j48 {
    public final int a;

    public j48(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(i28 i28Var);

    public abstract void d(v18 v18Var, boolean z);
}
