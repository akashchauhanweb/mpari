package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class va8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        String strD = null;
        int iQ = 0;
        long jS = -1;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                strD = ji5.d(parcel, iO);
            } else if (i == 2) {
                iQ = ji5.q(parcel, iO);
            } else if (i != 3) {
                ji5.u(parcel, iO);
            } else {
                jS = ji5.s(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new w82(strD, iQ, jS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new w82[i];
    }
}
