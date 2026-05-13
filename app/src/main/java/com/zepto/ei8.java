package com.zepto;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ei8 extends o88 implements mi8 {
    public ei8() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.zepto.o88
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            bh8 bh8Var = (bh8) bb8.a(parcel, bh8.CREATOR);
            bb8.b(parcel);
            a0(bh8Var);
        } else {
            if (i != 2) {
                return false;
            }
            e();
        }
        return true;
    }
}
