package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class pq0 extends p2 {
    public static final Parcelable.Creator<pq0> CREATOR = new l18();
    public final int c;
    public final String e;

    public pq0(int i, String str) {
        this.c = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pq0)) {
            return false;
        }
        pq0 pq0Var = (pq0) obj;
        return pq0Var.c == this.c && if4.a(pq0Var.e, this.e);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.c + ":" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.o(parcel, 2, this.e, false);
        ki5.b(parcel, iA);
    }
}
