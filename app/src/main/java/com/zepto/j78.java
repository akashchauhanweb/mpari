package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j78 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        int iQ2 = 0;
        int iQ3 = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                zJ = ji5.j(parcel, iO);
            } else if (i == 3) {
                zJ2 = ji5.j(parcel, iO);
            } else if (i == 4) {
                iQ2 = ji5.q(parcel, iO);
            } else if (i != 5) {
                ji5.u(parcel, iO);
            } else {
                iQ3 = ji5.q(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new te5(iQ, zJ, zJ2, iQ2, iQ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new te5[i];
    }
}
