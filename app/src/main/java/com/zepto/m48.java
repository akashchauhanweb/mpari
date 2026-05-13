package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m48 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        lw0 lw0Var = null;
        d58 d58Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                lw0Var = (lw0) ji5.c(parcel, iO, lw0.CREATOR);
            } else if (i != 3) {
                ji5.u(parcel, iO);
            } else {
                d58Var = (d58) ji5.c(parcel, iO, d58.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new l48(iQ, lw0Var, d58Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new l48[i];
    }
}
