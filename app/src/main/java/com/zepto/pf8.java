package com.zepto;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes.dex */
public final class pf8 extends a68 implements sg8 {
    public pf8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // com.zepto.sg8
    public final void L(vw2 vw2Var, int i) {
        Parcel parcelD = d();
        cb8.c(parcelD, vw2Var);
        parcelD.writeInt(i);
        j(10, parcelD);
    }

    @Override // com.zepto.sg8
    public final vh8 S() {
        Parcel parcelC = c(5, d());
        vh8 vh8VarD = lh8.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return vh8VarD;
    }

    @Override // com.zepto.sg8
    public final int a() {
        Parcel parcelC = c(9, d());
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }

    @Override // com.zepto.sg8
    public final mw2 e() {
        mw2 r88Var;
        Parcel parcelC = c(4, d());
        IBinder strongBinder = parcelC.readStrongBinder();
        if (strongBinder == null) {
            r88Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            r88Var = iInterfaceQueryLocalInterface instanceof mw2 ? (mw2) iInterfaceQueryLocalInterface : new r88(strongBinder);
        }
        parcelC.recycle();
        return r88Var;
    }

    @Override // com.zepto.sg8
    public final void s(vw2 vw2Var) {
        Parcel parcelD = d();
        cb8.c(parcelD, vw2Var);
        j(11, parcelD);
    }

    @Override // com.zepto.sg8
    public final void t(vw2 vw2Var, int i) {
        Parcel parcelD = d();
        cb8.c(parcelD, vw2Var);
        parcelD.writeInt(18020000);
        j(6, parcelD);
    }

    @Override // com.zepto.sg8
    public final rw2 y(vw2 vw2Var, GoogleMapOptions googleMapOptions) {
        rw2 ui8Var;
        Parcel parcelD = d();
        cb8.c(parcelD, vw2Var);
        cb8.b(parcelD, googleMapOptions);
        Parcel parcelC = c(3, parcelD);
        IBinder strongBinder = parcelC.readStrongBinder();
        if (strongBinder == null) {
            ui8Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            ui8Var = iInterfaceQueryLocalInterface instanceof rw2 ? (rw2) iInterfaceQueryLocalInterface : new ui8(strongBinder);
        }
        parcelC.recycle();
        return ui8Var;
    }
}
