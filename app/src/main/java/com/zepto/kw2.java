package com.zepto;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface kw2 extends IInterface {

    public static abstract class a extends h98 implements kw2 {
        public static kw2 d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof kw2 ? (kw2) iInterfaceQueryLocalInterface : new fm8(iBinder);
        }
    }

    Account h();
}
