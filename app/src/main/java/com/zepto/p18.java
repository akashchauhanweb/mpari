package com.zepto;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p18 extends p2 implements ud5 {
    public static final Parcelable.Creator<p18> CREATOR = new a28();
    public final int c;
    public int e;
    public Intent f;

    public p18(int i, int i2, Intent intent) {
        this.c = i;
        this.e = i2;
        this.f = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.j(parcel, 2, this.e);
        ki5.n(parcel, 3, this.f, i, false);
        ki5.b(parcel, iA);
    }
}
