package com.zepto;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j68 implements ow2 {
    public final IBinder a;

    public j68(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.zepto.ow2
    public final void r(nw2 nw2Var, kj2 kj2Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(nw2Var != null ? nw2Var.asBinder() : null);
            if (kj2Var != null) {
                parcelObtain.writeInt(1);
                dj8.a(kj2Var, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
