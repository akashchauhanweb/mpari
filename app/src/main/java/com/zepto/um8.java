package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class um8 extends zi8 implements an8 {
    public um8() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.zepto.zi8
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) {
        hn8 hn8Var = null;
        if (i == 2) {
            Bundle bundle = (Bundle) jj8.a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                hn8Var = iInterfaceQueryLocalInterface instanceof hn8 ? (hn8) iInterfaceQueryLocalInterface : new hn8(strongBinder);
            }
            T(bundle, hn8Var);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) jj8.a(parcel, Bundle.CREATOR);
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            hn8Var = iInterfaceQueryLocalInterface2 instanceof hn8 ? (hn8) iInterfaceQueryLocalInterface2 : new hn8(strongBinder2);
        }
        A(bundle2, hn8Var);
        return true;
    }
}
