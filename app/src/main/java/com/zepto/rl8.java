package com.zepto;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class rl8 extends o88 implements zl8 {
    public static zl8 d(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof zl8 ? (zl8) iInterfaceQueryLocalInterface : new kl8(iBinder);
    }
}
