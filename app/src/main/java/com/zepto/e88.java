package com.zepto;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e88 extends p88 implements g88 {
    public e88() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.zepto.p88
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        pw2 eh8Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            eh8Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            eh8Var = iInterfaceQueryLocalInterface instanceof pw2 ? (pw2) iInterfaceQueryLocalInterface : new eh8(strongBinder);
        }
        cb8.a(parcel);
        k(eh8Var);
        parcel2.writeNoException();
        return true;
    }
}
