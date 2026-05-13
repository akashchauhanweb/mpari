package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.zepto.vw2;

/* JADX INFO: loaded from: classes.dex */
public final class ui8 extends a68 implements rw2 {
    public ui8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // com.zepto.rw2
    public final void E(g88 g88Var) {
        Parcel parcelD = d();
        cb8.c(parcelD, g88Var);
        j(9, parcelD);
    }

    @Override // com.zepto.rw2
    public final vw2 K() {
        Parcel parcelC = c(8, d());
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }

    @Override // com.zepto.rw2
    public final void i(Bundle bundle) {
        Parcel parcelD = d();
        cb8.b(parcelD, bundle);
        j(2, parcelD);
    }
}
