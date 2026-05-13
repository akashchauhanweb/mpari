package com.zepto;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class pj8 extends z58 implements yj8 {
    public pj8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.zepto.yj8
    public final void H(xm3 xm3Var, jl8 jl8Var, String str) {
        Parcel parcelC = c();
        bb8.c(parcelC, xm3Var);
        bb8.d(parcelC, jl8Var);
        parcelC.writeString(null);
        j(63, parcelC);
    }

    @Override // com.zepto.yj8
    public final void O(bb3 bb3Var, sk8 sk8Var) {
        Parcel parcelC = c();
        bb8.c(parcelC, bb3Var);
        bb8.d(parcelC, sk8Var);
        j(82, parcelC);
    }

    @Override // com.zepto.yj8
    public final Location a() {
        Parcel parcelD = d(7, c());
        Location location = (Location) bb8.a(parcelD, Location.CREATOR);
        parcelD.recycle();
        return location;
    }

    @Override // com.zepto.yj8
    public final void m(wd8 wd8Var, xw2 xw2Var) {
        Parcel parcelC = c();
        bb8.c(parcelC, wd8Var);
        bb8.d(parcelC, xw2Var);
        j(89, parcelC);
    }

    @Override // com.zepto.yj8
    public final void p(wd8 wd8Var, LocationRequest locationRequest, xw2 xw2Var) {
        Parcel parcelC = c();
        bb8.c(parcelC, wd8Var);
        bb8.c(parcelC, locationRequest);
        bb8.d(parcelC, xw2Var);
        j(88, parcelC);
    }

    @Override // com.zepto.yj8
    public final void v(ee8 ee8Var) {
        Parcel parcelC = c();
        bb8.c(parcelC, ee8Var);
        j(59, parcelC);
    }
}
