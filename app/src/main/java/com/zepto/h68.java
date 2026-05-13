package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h68 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        boolean zJ = false;
        boolean zJ2 = false;
        boolean zJ3 = false;
        boolean zJ4 = false;
        boolean zJ5 = false;
        boolean zJ6 = false;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    zJ = ji5.j(parcel, iO);
                    break;
                case 2:
                    zJ2 = ji5.j(parcel, iO);
                    break;
                case 3:
                    zJ3 = ji5.j(parcel, iO);
                    break;
                case 4:
                    zJ4 = ji5.j(parcel, iO);
                    break;
                case 5:
                    zJ5 = ji5.j(parcel, iO);
                    break;
                case 6:
                    zJ6 = ji5.j(parcel, iO);
                    break;
                default:
                    ji5.u(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new an3(zJ, zJ2, zJ3, zJ4, zJ5, zJ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new an3[i];
    }
}
