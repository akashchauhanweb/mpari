package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q68 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 1;
        int iQ2 = 1;
        long jS = -1;
        long jS2 = -1;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                iQ2 = ji5.q(parcel, iO);
            } else if (i == 3) {
                jS = ji5.s(parcel, iO);
            } else if (i != 4) {
                ji5.u(parcel, iO);
            } else {
                jS2 = ji5.s(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new l68(iQ, iQ2, jS, jS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new l68[i];
    }
}
