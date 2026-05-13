package com.zepto;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wd8 extends p2 {
    public static final Parcelable.Creator<wd8> CREATOR = new yd8();
    public final int c;
    public final IBinder e;
    public final IBinder f;
    public final PendingIntent g;
    public final String h;
    public final String i;

    public wd8(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.c = i;
        this.e = iBinder;
        this.f = iBinder2;
        this.g = pendingIntent;
        this.h = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.i = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.zepto.cl8] */
    public static wd8 c(IInterface iInterface, cl8 cl8Var, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new wd8(2, iInterface, cl8Var, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.i(parcel, 2, this.e, false);
        ki5.i(parcel, 3, this.f, false);
        ki5.n(parcel, 4, this.g, i, false);
        ki5.o(parcel, 5, this.h, false);
        ki5.o(parcel, 6, this.i, false);
        ki5.b(parcel, iA);
    }
}
