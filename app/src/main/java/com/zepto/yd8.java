package com.zepto;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class yd8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        IBinder iBinderP = null;
        IBinder iBinderP2 = null;
        PendingIntent pendingIntent = null;
        String strD = null;
        String strD2 = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    iBinderP = ji5.p(parcel, iO);
                    break;
                case 3:
                    iBinderP2 = ji5.p(parcel, iO);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) ji5.c(parcel, iO, PendingIntent.CREATOR);
                    break;
                case 5:
                    strD = ji5.d(parcel, iO);
                    break;
                case 6:
                    strD2 = ji5.d(parcel, iO);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new wd8(iQ, iBinderP, iBinderP2, pendingIntent, strD, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new wd8[i];
    }
}
