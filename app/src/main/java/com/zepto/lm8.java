package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes.dex */
public final class lm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 1000;
        int iQ2 = 1;
        int iQ3 = 1;
        long jS = 0;
        l68[] l68VarArr = null;
        boolean zJ = false;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ2 = ji5.q(parcel, iO);
                    break;
                case 2:
                    iQ3 = ji5.q(parcel, iO);
                    break;
                case 3:
                    jS = ji5.s(parcel, iO);
                    break;
                case 4:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 5:
                    l68VarArr = (l68[]) ji5.f(parcel, iO, l68.CREATOR);
                    break;
                case 6:
                    zJ = ji5.j(parcel, iO);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new LocationAvailability(iQ, iQ2, iQ3, jS, l68VarArr, zJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
