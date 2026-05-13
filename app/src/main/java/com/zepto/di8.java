package com.zepto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class di8 extends p2 {
    public static final Parcelable.Creator<di8> CREATOR = new li8();
    public Bundle c;
    public w82[] e;
    public int f;
    public pw0 g;

    public di8(Bundle bundle, w82[] w82VarArr, int i, pw0 pw0Var) {
        this.c = bundle;
        this.e = w82VarArr;
        this.f = i;
        this.g = pw0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.d(parcel, 1, this.c, false);
        ki5.q(parcel, 2, this.e, i, false);
        ki5.j(parcel, 3, this.f);
        ki5.n(parcel, 4, this.g, i, false);
        ki5.b(parcel, iA);
    }
}
