package com.zepto;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class lh8 extends p88 implements vh8 {
    public static vh8 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return iInterfaceQueryLocalInterface instanceof vh8 ? (vh8) iInterfaceQueryLocalInterface : new ch8(iBinder);
    }
}
