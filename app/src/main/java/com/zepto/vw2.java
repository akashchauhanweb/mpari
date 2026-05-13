package com.zepto;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface vw2 extends IInterface {

    public static abstract class a extends h98 implements vw2 {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static vw2 d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof vw2 ? (vw2) iInterfaceQueryLocalInterface : new e98(iBinder);
        }
    }
}
