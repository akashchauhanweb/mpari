package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l48 extends p2 {
    public static final Parcelable.Creator<l48> CREATOR = new m48();
    public final int c;
    public final lw0 e;
    public final d58 f;

    public l48(int i, lw0 lw0Var, d58 d58Var) {
        this.c = i;
        this.e = lw0Var;
        this.f = d58Var;
    }

    public final lw0 c() {
        return this.e;
    }

    public final d58 d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.n(parcel, 2, this.e, i, false);
        ki5.n(parcel, 3, this.f, i, false);
        ki5.b(parcel, iA);
    }
}
