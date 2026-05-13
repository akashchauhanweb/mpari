package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ce8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayListG = null;
        String strD = null;
        String strD2 = null;
        boolean zJ = false;
        boolean zJ2 = false;
        boolean zJ3 = false;
        boolean zJ4 = false;
        long jS = Long.MAX_VALUE;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                locationRequest = (LocationRequest) ji5.c(parcel, iO, LocationRequest.CREATOR);
            } else if (i != 5) {
                switch (i) {
                    case 8:
                        zJ = ji5.j(parcel, iO);
                        break;
                    case 9:
                        zJ2 = ji5.j(parcel, iO);
                        break;
                    case 10:
                        strD = ji5.d(parcel, iO);
                        break;
                    case 11:
                        zJ3 = ji5.j(parcel, iO);
                        break;
                    case 12:
                        zJ4 = ji5.j(parcel, iO);
                        break;
                    case 13:
                        strD2 = ji5.d(parcel, iO);
                        break;
                    case 14:
                        jS = ji5.s(parcel, iO);
                        break;
                    default:
                        ji5.u(parcel, iO);
                        break;
                }
            } else {
                arrayListG = ji5.g(parcel, iO, pq0.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new ae8(locationRequest, arrayListG, zJ, zJ2, strD, zJ3, zJ4, strD2, jS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ae8[i];
    }
}
