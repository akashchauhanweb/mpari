package com.zepto;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class eh8 extends a68 implements pw2 {
    public eh8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.zepto.pw2
    public final void U(vw2 vw2Var) {
        Parcel parcelD = d();
        cb8.c(parcelD, vw2Var);
        j(5, parcelD);
    }

    @Override // com.zepto.pw2
    public final p68 X(zp3 zp3Var) {
        Parcel parcelD = d();
        cb8.b(parcelD, zp3Var);
        Parcel parcelC = c(11, parcelD);
        p68 p68VarD = k68.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return p68VarD;
    }
}
