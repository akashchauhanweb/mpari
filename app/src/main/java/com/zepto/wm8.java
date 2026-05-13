package com.zepto;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class wm8 extends h98 implements cn8 {
    public wm8() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.zepto.h98
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            vw2 vw2VarA = a();
            parcel2.writeNoException();
            ab8.d(parcel2, vw2VarA);
        } else {
            if (i != 2) {
                return false;
            }
            int iK0 = k0();
            parcel2.writeNoException();
            parcel2.writeInt(iK0);
        }
        return true;
    }
}
