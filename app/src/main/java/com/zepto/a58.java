package com.zepto;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class a58 extends p2 {
    public static final Parcelable.Creator<a58> CREATOR = new c58();
    public final int c;
    public final Account e;
    public final int f;
    public final GoogleSignInAccount g;

    public a58(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.c = i;
        this.e = account;
        this.f = i2;
        this.g = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.n(parcel, 2, this.e, i, false);
        ki5.j(parcel, 3, this.f);
        ki5.n(parcel, 4, this.g, i, false);
        ki5.b(parcel, iA);
    }

    public a58(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
