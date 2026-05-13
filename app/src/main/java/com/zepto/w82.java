package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import com.zepto.if4;

/* JADX INFO: loaded from: classes.dex */
public class w82 extends p2 {
    public static final Parcelable.Creator<w82> CREATOR = new va8();
    public final String c;
    public final int e;
    public final long f;

    public w82(String str, int i, long j) {
        this.c = str;
        this.e = i;
        this.f = j;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        long j = this.f;
        return j == -1 ? this.e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w82) {
            w82 w82Var = (w82) obj;
            if (((c() != null && c().equals(w82Var.c())) || (c() == null && w82Var.c() == null)) && d() == w82Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return if4.b(c(), Long.valueOf(d()));
    }

    public final String toString() {
        if4.a aVarC = if4.c(this);
        aVarC.a("name", c());
        aVarC.a("version", Long.valueOf(d()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.o(parcel, 1, c(), false);
        ki5.j(parcel, 2, this.e);
        ki5.m(parcel, 3, d());
        ki5.b(parcel, iA);
    }

    public w82(String str, long j) {
        this.c = str;
        this.f = j;
        this.e = -1;
    }
}
