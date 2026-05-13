package com.zepto;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y88 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        PendingIntent pendingIntent = null;
        String strD = null;
        int iQ2 = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                iQ2 = ji5.q(parcel, iO);
            } else if (i == 3) {
                pendingIntent = (PendingIntent) ji5.c(parcel, iO, PendingIntent.CREATOR);
            } else if (i != 4) {
                ji5.u(parcel, iO);
            } else {
                strD = ji5.d(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new lw0(iQ, iQ2, pendingIntent, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lw0[i];
    }
}
