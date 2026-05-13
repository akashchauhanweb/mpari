package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i48 extends p2 {
    public static final Parcelable.Creator<i48> CREATOR = new k48();
    public final int c;
    public final a58 e;

    public i48(int i, a58 a58Var) {
        this.c = i;
        this.e = a58Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.n(parcel, 2, this.e, i, false);
        ki5.b(parcel, iA);
    }
}
