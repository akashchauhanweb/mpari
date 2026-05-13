package com.zepto;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class bl8 extends o88 implements jl8 {
    public bl8() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.zepto.o88
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zm3 zm3Var = (zm3) bb8.a(parcel, zm3.CREATOR);
        bb8.b(parcel);
        G(zm3Var);
        return true;
    }
}
