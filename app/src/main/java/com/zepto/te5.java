package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class te5 extends p2 {
    public static final Parcelable.Creator<te5> CREATOR = new j78();
    public final int c;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;

    public te5(int i, boolean z, boolean z2, int i2, int i3) {
        this.c = i;
        this.e = z;
        this.f = z2;
        this.g = i2;
        this.h = i3;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public int g() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, g());
        ki5.c(parcel, 2, e());
        ki5.c(parcel, 3, f());
        ki5.j(parcel, 4, c());
        ki5.j(parcel, 5, d());
        ki5.b(parcel, iA);
    }
}
