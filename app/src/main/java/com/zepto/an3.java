package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class an3 extends p2 {
    public static final Parcelable.Creator<an3> CREATOR = new h68();
    public final boolean c;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public an3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.c = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.c;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.c(parcel, 1, f());
        ki5.c(parcel, 2, h());
        ki5.c(parcel, 3, d());
        ki5.c(parcel, 4, e());
        ki5.c(parcel, 5, g());
        ki5.c(parcel, 6, c());
        ki5.b(parcel, iA);
    }
}
