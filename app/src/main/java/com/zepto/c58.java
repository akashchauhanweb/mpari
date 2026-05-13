package com.zepto;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class c58 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        int iQ = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iQ2 = 0;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            int i = ji5.i(iO);
            if (i == 1) {
                iQ = ji5.q(parcel, iO);
            } else if (i == 2) {
                account = (Account) ji5.c(parcel, iO, Account.CREATOR);
            } else if (i == 3) {
                iQ2 = ji5.q(parcel, iO);
            } else if (i != 4) {
                ji5.u(parcel, iO);
            } else {
                googleSignInAccount = (GoogleSignInAccount) ji5.c(parcel, iO, GoogleSignInAccount.CREATOR);
            }
        }
        ji5.h(parcel, iV);
        return new a58(iQ, account, iQ2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a58[i];
    }
}
