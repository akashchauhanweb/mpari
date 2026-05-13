package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a48 extends p2 implements ud5 {
    public static final Parcelable.Creator<a48> CREATOR = new e48();
    public final List c;
    public final String e;

    public a48(List list, String str) {
        this.c = list;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.p(parcel, 1, this.c, false);
        ki5.o(parcel, 2, this.e, false);
        ki5.b(parcel, iA);
    }
}
