package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class vi8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        float fM = 0.0f;
        float fM2 = 0.0f;
        float fM3 = 0.0f;
        float fM4 = 0.0f;
        float fM5 = 0.0f;
        float fM6 = 0.0f;
        LatLng latLng = null;
        String strD = null;
        String strD2 = null;
        IBinder iBinderP = null;
        IBinder iBinderP2 = null;
        String strD3 = null;
        boolean zJ = false;
        boolean zJ2 = false;
        boolean zJ3 = false;
        int iQ = 0;
        int iQ2 = 0;
        float fM7 = 1.0f;
        float fM8 = 0.5f;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 2:
                    latLng = (LatLng) ji5.c(parcel, iO, LatLng.CREATOR);
                    break;
                case 3:
                    strD = ji5.d(parcel, iO);
                    break;
                case 4:
                    strD2 = ji5.d(parcel, iO);
                    break;
                case 5:
                    iBinderP = ji5.p(parcel, iO);
                    break;
                case 6:
                    fM = ji5.m(parcel, iO);
                    break;
                case 7:
                    fM2 = ji5.m(parcel, iO);
                    break;
                case 8:
                    zJ = ji5.j(parcel, iO);
                    break;
                case 9:
                    zJ2 = ji5.j(parcel, iO);
                    break;
                case 10:
                    zJ3 = ji5.j(parcel, iO);
                    break;
                case 11:
                    fM3 = ji5.m(parcel, iO);
                    break;
                case 12:
                    fM8 = ji5.m(parcel, iO);
                    break;
                case 13:
                    fM4 = ji5.m(parcel, iO);
                    break;
                case 14:
                    fM7 = ji5.m(parcel, iO);
                    break;
                case 15:
                    fM5 = ji5.m(parcel, iO);
                    break;
                case 16:
                default:
                    ji5.u(parcel, iO);
                    break;
                case 17:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 18:
                    iBinderP2 = ji5.p(parcel, iO);
                    break;
                case 19:
                    iQ2 = ji5.q(parcel, iO);
                    break;
                case 20:
                    strD3 = ji5.d(parcel, iO);
                    break;
                case 21:
                    fM6 = ji5.m(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new zp3(latLng, strD, strD2, iBinderP, fM, fM2, zJ, zJ2, zJ3, fM3, fM8, fM4, fM7, fM5, iQ, iBinderP2, iQ2, strD3, fM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zp3[i];
    }
}
