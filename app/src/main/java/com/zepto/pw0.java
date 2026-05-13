package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class pw0 extends p2 {
    public static final Parcelable.Creator<pw0> CREATOR = new ti8();
    public final te5 c;
    public final boolean e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int[] i;

    public pw0(te5 te5Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.c = te5Var;
        this.e = z;
        this.f = z2;
        this.g = iArr;
        this.h = i;
        this.i = iArr2;
    }

    public int c() {
        return this.h;
    }

    public int[] d() {
        return this.g;
    }

    public int[] e() {
        return this.i;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public final te5 h() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.n(parcel, 1, this.c, i, false);
        ki5.c(parcel, 2, f());
        ki5.c(parcel, 3, g());
        ki5.k(parcel, 4, d(), false);
        ki5.j(parcel, 5, c());
        ki5.k(parcel, 6, e(), false);
        ki5.b(parcel, iA);
    }
}
