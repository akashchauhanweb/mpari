package com.zepto;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class dk8 extends zi8 implements nk8 {
    public static nk8 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof nk8 ? (nk8) iInterfaceQueryLocalInterface : new tj8(iBinder);
    }
}
