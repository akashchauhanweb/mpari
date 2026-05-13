package com.zepto;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.zepto.kw2;

/* JADX INFO: loaded from: classes.dex */
public abstract class r5 extends kw2.a {
    public static Account j(kw2 kw2Var) {
        Account accountH = null;
        if (kw2Var != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountH = kw2Var.h();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountH;
    }
}
