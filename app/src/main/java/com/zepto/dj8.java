package com.zepto;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class dj8 implements Parcelable.Creator {
    public static void a(kj2 kj2Var, Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, kj2Var.c);
        ki5.j(parcel, 2, kj2Var.e);
        ki5.j(parcel, 3, kj2Var.f);
        ki5.o(parcel, 4, kj2Var.g, false);
        ki5.i(parcel, 5, kj2Var.h, false);
        ki5.q(parcel, 6, kj2Var.i, i, false);
        ki5.d(parcel, 7, kj2Var.j, false);
        ki5.n(parcel, 8, kj2Var.k, i, false);
        ki5.q(parcel, 10, kj2Var.l, i, false);
        ki5.q(parcel, 11, kj2Var.m, i, false);
        ki5.c(parcel, 12, kj2Var.n);
        ki5.j(parcel, 13, kj2Var.o);
        ki5.c(parcel, 14, kj2Var.p);
        ki5.o(parcel, 15, kj2Var.c(), false);
        ki5.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = ji5.v(parcel);
        Scope[] scopeArr = kj2.r;
        Bundle bundle = new Bundle();
        w82[] w82VarArr = kj2.s;
        w82[] w82VarArr2 = w82VarArr;
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        boolean zJ = false;
        int iQ4 = 0;
        boolean zJ2 = false;
        String strD = null;
        IBinder iBinderP = null;
        Account account = null;
        String strD2 = null;
        while (parcel.dataPosition() < iV) {
            int iO = ji5.o(parcel);
            switch (ji5.i(iO)) {
                case 1:
                    iQ = ji5.q(parcel, iO);
                    break;
                case 2:
                    iQ2 = ji5.q(parcel, iO);
                    break;
                case 3:
                    iQ3 = ji5.q(parcel, iO);
                    break;
                case 4:
                    strD = ji5.d(parcel, iO);
                    break;
                case 5:
                    iBinderP = ji5.p(parcel, iO);
                    break;
                case 6:
                    scopeArr = (Scope[]) ji5.f(parcel, iO, Scope.CREATOR);
                    break;
                case 7:
                    bundle = ji5.a(parcel, iO);
                    break;
                case 8:
                    account = (Account) ji5.c(parcel, iO, Account.CREATOR);
                    break;
                case 9:
                default:
                    ji5.u(parcel, iO);
                    break;
                case 10:
                    w82VarArr = (w82[]) ji5.f(parcel, iO, w82.CREATOR);
                    break;
                case 11:
                    w82VarArr2 = (w82[]) ji5.f(parcel, iO, w82.CREATOR);
                    break;
                case 12:
                    zJ = ji5.j(parcel, iO);
                    break;
                case 13:
                    iQ4 = ji5.q(parcel, iO);
                    break;
                case 14:
                    zJ2 = ji5.j(parcel, iO);
                    break;
                case 15:
                    strD2 = ji5.d(parcel, iO);
                    break;
            }
        }
        ji5.h(parcel, iV);
        return new kj2(iQ, iQ2, iQ3, strD, iBinderP, scopeArr, bundle, account, w82VarArr, w82VarArr2, zJ, iQ4, zJ2, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kj2[i];
    }
}
