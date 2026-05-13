package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class zm3 extends p2 implements ud5 {
    public static final Parcelable.Creator<zm3> CREATOR = new c68();
    public final Status c;
    public final an3 e;

    public zm3(Status status, an3 an3Var) {
        this.c = status;
        this.e = an3Var;
    }

    public an3 c() {
        return this.e;
    }

    public Status d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.n(parcel, 1, d(), i, false);
        ki5.n(parcel, 2, c(), i, false);
        ki5.b(parcel, iA);
    }
}
