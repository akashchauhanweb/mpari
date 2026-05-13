package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class gm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        long jS = Long.MAX_VALUE;
        int iQ = 0;
        boolean zJ = false;
        String strD = null;
        od8 od8Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                jS = ji5.s(parcel, iO);
            } else if (i == 2) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 3) {
                zJ = ji5.j(parcel, iO);
            } else if (i == 4) {
                strD = ji5.d(parcel, iO);
            } else if (i != 5) {
                ji5.u(parcel, iO);
            } else {
                od8Var = (od8) ji5.c(parcel, iO, od8.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new bb3(jS, iQ, zJ, strD, od8Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bb3[i];
    }
}
