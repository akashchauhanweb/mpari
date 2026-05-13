package com.zepto;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class fm8 extends y58 implements kw2 {
    public fm8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.zepto.kw2
    public final Account h() {
        Parcel parcelC = c(2, d());
        Account account = (Account) ab8.a(parcelC, Account.CREATOR);
        parcelC.recycle();
        return account;
    }
}
