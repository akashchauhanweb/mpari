package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import com.zepto.vw2;

/* JADX INFO: loaded from: classes.dex */
public final class rk8 extends y58 {
    public rk8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int j() {
        Parcel parcelC = c(6, d());
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }

    public final int p0(vw2 vw2Var, String str, boolean z) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        ab8.c(parcelD, z);
        Parcel parcelC = c(3, parcelD);
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }

    public final int q0(vw2 vw2Var, String str, boolean z) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        ab8.c(parcelD, z);
        Parcel parcelC = c(5, parcelD);
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }

    public final vw2 r0(vw2 vw2Var, String str, int i) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        parcelD.writeInt(i);
        Parcel parcelC = c(2, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }

    public final vw2 s0(vw2 vw2Var, String str, int i, vw2 vw2Var2) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        parcelD.writeInt(i);
        ab8.d(parcelD, vw2Var2);
        Parcel parcelC = c(8, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }

    public final vw2 t0(vw2 vw2Var, String str, int i) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        parcelD.writeInt(i);
        Parcel parcelC = c(4, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }

    public final vw2 u0(vw2 vw2Var, String str, boolean z, long j) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        ab8.c(parcelD, z);
        parcelD.writeLong(j);
        Parcel parcelC = c(7, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }
}
