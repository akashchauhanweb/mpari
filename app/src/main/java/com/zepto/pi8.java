package com.zepto;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class pi8 implements IInterface {
    public final IBinder a;
    public final String b;

    public pi8(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final void d(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
