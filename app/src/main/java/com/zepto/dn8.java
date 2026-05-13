package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dn8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        ArrayList arrayListG = null;
        boolean zJ = false;
        boolean zJ2 = false;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                arrayListG = ji5.g(parcel, iO, LocationRequest.CREATOR);
            } else if (i == 2) {
                zJ = ji5.j(parcel, iO);
            } else if (i != 3) {
                ji5.u(parcel, iO);
            } else {
                zJ2 = ji5.j(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new xm3(arrayListG, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new xm3[i];
    }
}
