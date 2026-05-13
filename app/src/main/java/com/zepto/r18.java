package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r18 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        ArrayList arrayListG = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i != 2) {
                ji5.u(parcel, iO);
            } else {
                arrayListG = ji5.g(parcel, iO, vt3.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new sd6(iQ, arrayListG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sd6[i];
    }
}
