package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ti8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        te5 te5Var = null;
        int[] iArrB = null;
        int[] iArrB2 = null;
        boolean zJ = false;
        boolean zJ2 = false;
        int iQ = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    te5Var = (te5) ji5.c(parcel, iO, te5.CREATOR);
                    break;
                case 2:
                    zJ = ji5.j(parcel, iO);
                    break;
                case 3:
                    zJ2 = ji5.j(parcel, iO);
                    break;
                case 4:
                    iArrB = ji5.b(parcel, iO);
                    break;
                case 5:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 6:
                    iArrB2 = ji5.b(parcel, iO);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new pw0(te5Var, zJ, zJ2, iArrB, iQ, iArrB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new pw0[i];
    }
}
