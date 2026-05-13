package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class xh8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 2) {
                latLng = (LatLng) ji5.c(parcel, iO, LatLng.CREATOR);
            } else if (i != 3) {
                ji5.u(parcel, iO);
            } else {
                latLng2 = (LatLng) ji5.c(parcel, iO, LatLng.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
