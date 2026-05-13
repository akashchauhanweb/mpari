package com.zepto;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class k68 extends p88 implements p68 {
    public static p68 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return iInterfaceQueryLocalInterface instanceof p68 ? (p68) iInterfaceQueryLocalInterface : new g68(iBinder);
    }
}
