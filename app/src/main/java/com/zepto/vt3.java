package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class vt3 extends p2 {
    public static final Parcelable.Creator<vt3> CREATOR = new q48();
    public final int c;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public vt3(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.c = i;
        this.e = i2;
        this.f = i3;
        this.g = j;
        this.h = j2;
        this.i = str;
        this.j = str2;
        this.k = i4;
        this.l = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.j(parcel, 2, this.e);
        ki5.j(parcel, 3, this.f);
        ki5.m(parcel, 4, this.g);
        ki5.m(parcel, 5, this.h);
        ki5.o(parcel, 6, this.i, false);
        ki5.o(parcel, 7, this.j, false);
        ki5.j(parcel, 8, this.k);
        ki5.j(parcel, 9, this.l);
        ki5.b(parcel, iA);
    }
}
