package com.zepto;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface xw2 extends IInterface {

    public static abstract class a extends y18 implements xw2 {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.zepto.y18
        public final boolean p0(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) t28.a(parcel, Status.CREATOR);
            t28.b(parcel);
            P(status);
            return true;
        }
    }

    void P(Status status);
}
