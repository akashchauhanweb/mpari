package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class fi8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        double dL = 0.0d;
        double dL2 = 0.0d;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 2) {
                dL = ji5.l(parcel, iO);
            } else if (i != 3) {
                ji5.u(parcel, iO);
            } else {
                dL2 = ji5.l(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new LatLng(dL, dL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
