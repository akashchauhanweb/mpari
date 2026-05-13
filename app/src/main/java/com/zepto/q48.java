package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q48 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        int iQ4 = 0;
        long jS = 0;
        long jS2 = 0;
        String strD = null;
        String strD2 = null;
        int iQ5 = -1;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    iQ2 = ji5.q(parcel, iO);
                    break;
                case 3:
                    iQ3 = ji5.q(parcel, iO);
                    break;
                case 4:
                    jS = ji5.s(parcel, iO);
                    break;
                case 5:
                    jS2 = ji5.s(parcel, iO);
                    break;
                case 6:
                    strD = ji5.d(parcel, iO);
                    break;
                case 7:
                    strD2 = ji5.d(parcel, iO);
                    break;
                case 8:
                    iQ4 = ji5.q(parcel, iO);
                    break;
                case 9:
                    iQ5 = ji5.q(parcel, iO);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new vt3(iQ, iQ2, iQ3, jS, jS2, strD, strD2, iQ4, iQ5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new vt3[i];
    }
}
