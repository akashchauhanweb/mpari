package com.zepto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class g85 implements Parcelable.Creator {
    public static void c(f85 f85Var, Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.d(parcel, 2, f85Var.c, false);
        ki5.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f85 createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            if (ji5.i(iO) != 2) {
                ji5.u(parcel, iO);
            } else {
                bundleA = ji5.a(parcel, iO);
            }
        }
        ji5.h(parcel, iV);
        return new f85(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f85[] newArray(int i) {
        return new f85[i];
    }
}
