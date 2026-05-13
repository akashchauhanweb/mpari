package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.a98;
import com.zepto.if4;
import com.zepto.ki5;
import com.zepto.lw0;
import com.zepto.ms0;
import com.zepto.p2;
import com.zepto.ud5;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends p2 implements ud5, ReflectedParcelable {
    public final int c;
    public final int e;
    public final String f;
    public final PendingIntent g;
    public final lw0 h;
    public static final Status i = new Status(-1);
    public static final Status j = new Status(0);
    public static final Status k = new Status(14);
    public static final Status l = new Status(8);
    public static final Status m = new Status(15);
    public static final Status n = new Status(16);
    public static final Status p = new Status(17);
    public static final Status o = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new a98();

    public Status(int i2, int i3, String str, PendingIntent pendingIntent, lw0 lw0Var) {
        this.c = i2;
        this.e = i3;
        this.f = str;
        this.g = pendingIntent;
        this.h = lw0Var;
    }

    public lw0 c() {
        return this.h;
    }

    public PendingIntent d() {
        return this.g;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.c == status.c && this.e == status.e && if4.a(this.f, status.f) && if4.a(this.g, status.g) && if4.a(this.h, status.h);
    }

    public String f() {
        return this.f;
    }

    public boolean g() {
        return this.g != null;
    }

    public boolean h() {
        return this.e <= 0;
    }

    public int hashCode() {
        return if4.b(Integer.valueOf(this.c), Integer.valueOf(this.e), this.f, this.g, this.h);
    }

    public final String i() {
        String str = this.f;
        return str != null ? str : ms0.a(this.e);
    }

    public String toString() {
        if4.a aVarC = if4.c(this);
        aVarC.a("statusCode", i());
        aVarC.a("resolution", this.g);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, e());
        ki5.o(parcel, 2, f(), false);
        ki5.n(parcel, 3, this.g, i2, false);
        ki5.n(parcel, 4, c(), i2, false);
        ki5.j(parcel, 1000, this.c);
        ki5.b(parcel, iA);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null, null);
    }

    public Status(lw0 lw0Var, String str) {
        this(lw0Var, str, 17);
    }

    public Status(lw0 lw0Var, String str, int i2) {
        this(1, i2, str, lw0Var.e(), lw0Var);
    }
}
