package com.zepto;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.zepto.kw2;

/* JADX INFO: loaded from: classes.dex */
public class kj2 extends p2 {
    public static final Parcelable.Creator<kj2> CREATOR = new dj8();
    public static final Scope[] r = new Scope[0];
    public static final w82[] s = new w82[0];
    public final int c;
    public final int e;
    public int f;
    public String g;
    public IBinder h;
    public Scope[] i;
    public Bundle j;
    public Account k;
    public w82[] l;
    public w82[] m;
    public boolean n;
    public int o;
    public boolean p;
    public String q;

    public kj2(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, w82[] w82VarArr, w82[] w82VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? r : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        w82VarArr = w82VarArr == null ? s : w82VarArr;
        w82VarArr2 = w82VarArr2 == null ? s : w82VarArr2;
        this.c = i;
        this.e = i2;
        this.f = i3;
        if ("com.google.android.gms".equals(str)) {
            this.g = "com.google.android.gms";
        } else {
            this.g = str;
        }
        if (i < 2) {
            this.k = iBinder != null ? r5.j(kw2.a.d(iBinder)) : null;
        } else {
            this.h = iBinder;
            this.k = account;
        }
        this.i = scopeArr;
        this.j = bundle;
        this.l = w82VarArr;
        this.m = w82VarArr2;
        this.n = z;
        this.o = i4;
        this.p = z2;
        this.q = str2;
    }

    public final String c() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dj8.a(this, parcel, i);
    }
}
