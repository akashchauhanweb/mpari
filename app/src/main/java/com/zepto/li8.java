package com.zepto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class li8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        Bundle bundleA = null;
        pw0 pw0Var = null;
        int iQ = 0;
        w82[] w82VarArr = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                bundleA = ji5.a(parcel, iO);
            } else if (i == 2) {
                w82VarArr = (w82[]) ji5.f(parcel, iO, w82.CREATOR);
            } else if (i == 3) {
                iQ = ji5.q(parcel, iO);
            } else if (i != 4) {
                ji5.u(parcel, iO);
            } else {
                pw0Var = (pw0) ji5.c(parcel, iO, pw0.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new di8(bundleA, w82VarArr, iQ, pw0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new di8[i];
    }
}
