package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e58 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        IBinder iBinderP = null;
        lw0 lw0Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                iBinderP = ji5.p(parcel, iO);
            } else if (i == 3) {
                lw0Var = (lw0) ji5.c(parcel, iO, lw0.CREATOR);
            } else if (i == 4) {
                zJ = ji5.j(parcel, iO);
            } else if (i != 5) {
                ji5.u(parcel, iO);
            } else {
                zJ2 = ji5.j(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new d58(iQ, iBinderP, lw0Var, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new d58[i];
    }
}
