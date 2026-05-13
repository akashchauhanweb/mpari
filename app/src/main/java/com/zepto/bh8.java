package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class bh8 extends p2 implements ud5 {
    public final Status c;
    public static final bh8 e = new bh8(Status.j);
    public static final Parcelable.Creator<bh8> CREATOR = new kh8();

    public bh8(Status status) {
        this.c = status;
    }

    public final Status c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.n(parcel, 1, this.c, i, false);
        ki5.b(parcel, iA);
    }
}
