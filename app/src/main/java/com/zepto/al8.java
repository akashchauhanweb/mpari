package com.zepto;

import android.os.IBinder;
import android.os.Parcel;
import com.zepto.vw2;

/* JADX INFO: loaded from: classes.dex */
public final class al8 extends y58 {
    public al8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final vw2 j(vw2 vw2Var, String str, int i, vw2 vw2Var2) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        parcelD.writeInt(i);
        ab8.d(parcelD, vw2Var2);
        Parcel parcelC = c(2, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }

    public final vw2 p0(vw2 vw2Var, String str, int i, vw2 vw2Var2) {
        Parcel parcelD = d();
        ab8.d(parcelD, vw2Var);
        parcelD.writeString(str);
        parcelD.writeInt(i);
        ab8.d(parcelD, vw2Var2);
        Parcel parcelC = c(3, parcelD);
        vw2 vw2VarD = vw2.a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vw2VarD;
    }
}
