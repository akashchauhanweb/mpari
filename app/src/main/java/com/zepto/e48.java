package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e48 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        ArrayList arrayListE = null;
        String strD = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                arrayListE = ji5.e(parcel, iO);
            } else if (i != 2) {
                ji5.u(parcel, iO);
            } else {
                strD = ji5.d(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new a48(arrayListE, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a48[i];
    }
}
