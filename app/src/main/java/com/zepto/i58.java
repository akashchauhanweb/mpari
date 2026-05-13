package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class i58 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        float fM = 0.0f;
        float fM2 = 0.0f;
        LatLng latLng = null;
        float fM3 = 0.0f;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 2) {
                latLng = (LatLng) ji5.c(parcel, iO, LatLng.CREATOR);
            } else if (i == 3) {
                fM = ji5.m(parcel, iO);
            } else if (i == 4) {
                fM3 = ji5.m(parcel, iO);
            } else if (i != 5) {
                ji5.u(parcel, iO);
            } else {
                fM2 = ji5.m(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new CameraPosition(latLng, fM, fM3, fM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
