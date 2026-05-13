package com.zepto;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class tk8 extends o88 implements cl8 {
    public tk8() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static cl8 d(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof cl8 ? (cl8) iInterfaceQueryLocalInterface : new jk8(iBinder);
    }

    @Override // com.zepto.o88
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) bb8.a(parcel, LocationResult.CREATOR);
            bb8.b(parcel);
            n0(locationResult);
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) bb8.a(parcel, LocationAvailability.CREATOR);
            bb8.b(parcel);
            B(locationAvailability);
        } else {
            if (i != 3) {
                return false;
            }
            g();
        }
        return true;
    }
}
