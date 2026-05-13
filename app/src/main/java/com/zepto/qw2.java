package com.zepto;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface qw2 extends IInterface {

    public static abstract class a extends Binder implements qw2 {

        /* JADX INFO: renamed from: com.zepto.qw2$a$a, reason: collision with other inner class name */
        public static class C0116a implements qw2 {
            public static qw2 b;
            public IBinder a;

            public C0116a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.zepto.qw2
            public boolean Q() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ai.protectt.app.security.IIsolatedService");
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && a.d() != null) {
                        return a.d().Q();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "ai.protectt.app.security.IIsolatedService");
        }

        public static qw2 c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ai.protectt.app.security.IIsolatedService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qw2)) ? new C0116a(iBinder) : (qw2) iInterfaceQueryLocalInterface;
        }

        public static qw2 d() {
            return C0116a.b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("ai.protectt.app.security.IIsolatedService");
                return true;
            }
            parcel.enforceInterface("ai.protectt.app.security.IIsolatedService");
            boolean zQ = Q();
            parcel2.writeNoException();
            parcel2.writeInt(zQ ? 1 : 0);
            return true;
        }
    }

    boolean Q();
}
