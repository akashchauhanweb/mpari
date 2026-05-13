package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.zepto.kw2;

/* JADX INFO: loaded from: classes.dex */
public final class d58 extends p2 {
    public static final Parcelable.Creator<d58> CREATOR = new e58();
    public final int c;
    public final IBinder e;
    public final lw0 f;
    public final boolean g;
    public final boolean h;

    public d58(int i, IBinder iBinder, lw0 lw0Var, boolean z, boolean z2) {
        this.c = i;
        this.e = iBinder;
        this.f = lw0Var;
        this.g = z;
        this.h = z2;
    }

    public final lw0 c() {
        return this.f;
    }

    public final kw2 d() {
        IBinder iBinder = this.e;
        if (iBinder == null) {
            return null;
        }
        return kw2.a.d(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d58)) {
            return false;
        }
        d58 d58Var = (d58) obj;
        return this.f.equals(d58Var.f) && if4.a(d(), d58Var.d());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.i(parcel, 2, this.e, false);
        ki5.n(parcel, 3, this.f, i, false);
        ki5.c(parcel, 4, this.g);
        ki5.c(parcel, 5, this.h);
        ki5.b(parcel, iA);
    }
}
