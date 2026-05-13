package com.zepto;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class a98 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        int iQ2 = 0;
        String strD = null;
        PendingIntent pendingIntent = null;
        lw0 lw0Var = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ2 = ji5.q(parcel, iO);
            } else if (i == 2) {
                strD = ji5.d(parcel, iO);
            } else if (i == 3) {
                pendingIntent = (PendingIntent) ji5.c(parcel, iO, PendingIntent.CREATOR);
            } else if (i == 4) {
                lw0Var = (lw0) ji5.c(parcel, iO, lw0.CREATOR);
            } else if (i != 1000) {
                ji5.u(parcel, iO);
            } else {
                iQ = ji5.q(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new Status(iQ, iQ2, strD, pendingIntent, lw0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
