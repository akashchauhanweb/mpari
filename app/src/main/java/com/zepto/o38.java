package com.zepto;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o38 extends y18 implements s38 {
    public o38() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.zepto.y18
    public final boolean p0(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                t28.b(parcel);
                break;
            case 4:
                t28.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                t28.b(parcel);
                break;
            case 7:
                t28.b(parcel);
                break;
            case 8:
                l48 l48Var = (l48) t28.a(parcel, l48.CREATOR);
                t28.b(parcel);
                W(l48Var);
                break;
            case 9:
                t28.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
