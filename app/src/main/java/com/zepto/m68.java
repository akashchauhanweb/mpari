package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class m68 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        CameraPosition cameraPosition = null;
        Float fN = null;
        Float fN2 = null;
        LatLngBounds latLngBounds = null;
        Integer numR = null;
        String strD = null;
        byte bK = -1;
        byte bK2 = -1;
        byte bK3 = -1;
        byte bK4 = -1;
        byte bK5 = -1;
        byte bK6 = -1;
        byte bK7 = -1;
        byte bK8 = -1;
        byte bK9 = -1;
        byte bK10 = -1;
        byte bK11 = -1;
        byte bK12 = -1;
        int iQ = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 2:
                    bK = ji5.k(parcel, iO);
                    break;
                case 3:
                    bK2 = ji5.k(parcel, iO);
                    break;
                case 4:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) ji5.c(parcel, iO, CameraPosition.CREATOR);
                    break;
                case 6:
                    bK3 = ji5.k(parcel, iO);
                    break;
                case 7:
                    bK4 = ji5.k(parcel, iO);
                    break;
                case 8:
                    bK5 = ji5.k(parcel, iO);
                    break;
                case 9:
                    bK6 = ji5.k(parcel, iO);
                    break;
                case 10:
                    bK7 = ji5.k(parcel, iO);
                    break;
                case 11:
                    bK8 = ji5.k(parcel, iO);
                    break;
                case 12:
                    bK9 = ji5.k(parcel, iO);
                    break;
                case 13:
                default:
                    ji5.u(parcel, iO);
                    break;
                case 14:
                    bK10 = ji5.k(parcel, iO);
                    break;
                case 15:
                    bK11 = ji5.k(parcel, iO);
                    break;
                case 16:
                    fN = ji5.n(parcel, iO);
                    break;
                case 17:
                    fN2 = ji5.n(parcel, iO);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) ji5.c(parcel, iO, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bK12 = ji5.k(parcel, iO);
                    break;
                case 20:
                    numR = ji5.r(parcel, iO);
                    break;
                case 21:
                    strD = ji5.d(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new GoogleMapOptions(bK, bK2, iQ, cameraPosition, bK3, bK4, bK5, bK6, bK7, bK8, bK9, bK10, bK11, fN, fN2, latLngBounds, bK12, numR, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
