package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.zepto.vw2;

/* JADX INFO: loaded from: classes.dex */
public final class r88 extends a68 implements mw2 {
    public r88(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.zepto.mw2
    public final vw2 d0(LatLng latLng, float f) {
        Parcel parcelD = d();
        cb8.b(parcelD, latLng);
        parcelD.writeFloat(f);
        Parcel parcelC = c(9, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }
}
