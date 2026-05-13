package com.zepto;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i98 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            if (ji5.i(iO) != 1) {
                ji5.u(parcel, iO);
            } else {
                intent = (Intent) ji5.c(parcel, iO, Intent.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new br0(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new br0[i];
    }
}
