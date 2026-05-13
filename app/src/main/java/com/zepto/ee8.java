package com.zepto;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ee8 extends p2 {
    public static final Parcelable.Creator<ee8> CREATOR = new ge8();
    public final int c;
    public final ae8 e;
    public final zl8 f;
    public final cl8 g;
    public final PendingIntent h;
    public final mi8 i;
    public final String j;

    public ee8(int i, ae8 ae8Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.c = i;
        this.e = ae8Var;
        mi8 uh8Var = null;
        this.f = iBinder != null ? rl8.d(iBinder) : null;
        this.h = pendingIntent;
        this.g = iBinder2 != null ? tk8.d(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            uh8Var = iInterfaceQueryLocalInterface instanceof mi8 ? (mi8) iInterfaceQueryLocalInterface : new uh8(iBinder3);
        }
        this.i = uh8Var;
        this.j = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.n(parcel, 2, this.e, i, false);
        zl8 zl8Var = this.f;
        ki5.i(parcel, 3, zl8Var == null ? null : zl8Var.asBinder(), false);
        ki5.n(parcel, 4, this.h, i, false);
        cl8 cl8Var = this.g;
        ki5.i(parcel, 5, cl8Var == null ? null : cl8Var.asBinder(), false);
        mi8 mi8Var = this.i;
        ki5.i(parcel, 6, mi8Var != null ? mi8Var.asBinder() : null, false);
        ki5.o(parcel, 8, this.j, false);
        ki5.b(parcel, iA);
    }
}
