package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class tj8 extends pi8 implements nk8 {
    public tj8(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // com.zepto.nk8
    public final void I(String str, Bundle bundle, gl8 gl8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.c(parcelC, gl8Var);
        d(3, parcelC);
    }

    @Override // com.zepto.nk8
    public final void b0(String str, Bundle bundle, gl8 gl8Var) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        jj8.b(parcelC, bundle);
        jj8.c(parcelC, gl8Var);
        d(2, parcelC);
    }
}
