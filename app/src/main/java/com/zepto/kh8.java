package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class kh8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        Status status = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            if (ji5.i(iO) != 1) {
                ji5.u(parcel, iO);
            } else {
                status = (Status) ji5.c(parcel, iO, Status.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new bh8(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bh8[i];
    }
}
