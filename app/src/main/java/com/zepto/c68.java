package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class c68 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        Status status = null;
        an3 an3Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                status = (Status) ji5.c(parcel, iO, Status.CREATOR);
            } else if (i != 2) {
                ji5.u(parcel, iO);
            } else {
                an3Var = (an3) ji5.c(parcel, iO, an3.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new zm3(status, an3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zm3[i];
    }
}
