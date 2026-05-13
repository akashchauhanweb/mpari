package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l68 extends p2 {
    public static final Parcelable.Creator<l68> CREATOR = new q68();
    public final int c;
    public final int e;
    public final long f;
    public final long g;

    public l68(int i, int i2, long j, long j2) {
        this.c = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l68) {
            l68 l68Var = (l68) obj;
            if (this.c == l68Var.c && this.e == l68Var.e && this.f == l68Var.f && this.g == l68Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return if4.b(Integer.valueOf(this.e), Integer.valueOf(this.c), Long.valueOf(this.g), Long.valueOf(this.f));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.c + " Cell status: " + this.e + " elapsed time NS: " + this.g + " system time ms: " + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.j(parcel, 2, this.e);
        ki5.m(parcel, 3, this.f);
        ki5.m(parcel, 4, this.g);
        ki5.b(parcel, iA);
    }
}
