package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k48 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        a58 a58Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i != 2) {
                ji5.u(parcel, iO);
            } else {
                a58Var = (a58) ji5.c(parcel, iO, a58.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new i48(iQ, a58Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new i48[i];
    }
}
