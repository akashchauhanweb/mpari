package com.zepto;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ge8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 1;
        ae8 ae8Var = null;
        IBinder iBinderP = null;
        IBinder iBinderP2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderP3 = null;
        String strD = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    ae8Var = (ae8) ji5.c(parcel, iO, ae8.CREATOR);
                    break;
                case 3:
                    iBinderP = ji5.p(parcel, iO);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) ji5.c(parcel, iO, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderP2 = ji5.p(parcel, iO);
                    break;
                case 6:
                    iBinderP3 = ji5.p(parcel, iO);
                    break;
                case 7:
                default:
                    ji5.u(parcel, iO);
                    break;
                case 8:
                    strD = ji5.d(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new ee8(iQ, ae8Var, iBinderP, iBinderP2, pendingIntent, iBinderP3, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ee8[i];
    }
}
