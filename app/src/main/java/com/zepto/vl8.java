package com.zepto;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class vl8 extends zi8 implements dm8 {
    public static dm8 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterfaceQueryLocalInterface instanceof dm8 ? (dm8) iInterfaceQueryLocalInterface : new nl8(iBinder);
    }
}
