package com.zepto;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g68 extends a68 implements p68 {
    public g68(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.zepto.p68
    public final boolean M(p68 p68Var) {
        Parcel parcelD = d();
        cb8.c(parcelD, p68Var);
        Parcel parcelC = c(16, parcelD);
        boolean zD = cb8.d(parcelC);
        parcelC.recycle();
        return zD;
    }

    @Override // com.zepto.p68
    public final int h0() {
        Parcel parcelC = c(17, d());
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }
}
