package com.zepto;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x38 extends n18 {
    public x38(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void p0(i48 i48Var, s38 s38Var) {
        Parcel parcelC = c();
        t28.c(parcelC, i48Var);
        t28.d(parcelC, s38Var);
        d(12, parcelC);
    }
}
