package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class f68 extends h98 implements nw2 {
    public f68() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.zepto.h98
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ab8.a(parcel, Bundle.CREATOR);
            ab8.b(parcel);
            m0(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            Bundle bundle2 = (Bundle) ab8.a(parcel, Bundle.CREATOR);
            ab8.b(parcel);
            f(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            di8 di8Var = (di8) ab8.a(parcel, di8.CREATOR);
            ab8.b(parcel);
            N(i5, strongBinder2, di8Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
