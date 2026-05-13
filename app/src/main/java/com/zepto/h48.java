package com.zepto;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h48 extends n18 {
    public h48(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void p0(sd6 sd6Var) {
        Parcel parcelC = c();
        t28.c(parcelC, sd6Var);
        j(1, parcelC);
    }
}
