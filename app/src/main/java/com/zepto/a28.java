package com.zepto;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a28 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        Intent intent = null;
        int iQ2 = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                iQ2 = ji5.q(parcel, iO);
            } else if (i != 3) {
                ji5.u(parcel, iO);
            } else {
                intent = (Intent) ji5.c(parcel, iO, Intent.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new p18(iQ, iQ2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new p18[i];
    }
}
