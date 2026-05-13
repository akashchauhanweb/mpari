package com.zepto;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zepto.sw2;

/* JADX INFO: loaded from: classes.dex */
public interface tw2 extends IInterface {

    public static abstract class a extends Binder implements tw2 {

        /* JADX INFO: renamed from: com.zepto.tw2$a$a, reason: collision with other inner class name */
        public static class C0122a implements tw2 {
            public IBinder a;

            public C0122a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.zepto.tw2
            public void g0(int i, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.zepto.tw2
            public int o(sw2 sw2Var, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(sw2Var);
                    parcelObtain.writeString(str);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static tw2 c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof tw2)) ? new C0122a(iBinder) : (tw2) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i == 1) {
                int iO = o(sw2.a.c(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iO);
            } else if (i == 2) {
                z(sw2.a.c(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                g0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void g0(int i, String[] strArr);

    int o(sw2 sw2Var, String str);

    void z(sw2 sw2Var, int i);
}
