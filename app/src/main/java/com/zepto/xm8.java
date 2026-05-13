package com.zepto;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        List listG = LocationResult.e;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            if (ji5.i(iO) != 1) {
                ji5.u(parcel, iO);
            } else {
                listG = ji5.g(parcel, iO, Location.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new LocationResult(listG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
