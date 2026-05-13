package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.zepto.b68;
import com.zepto.iu4;
import com.zepto.ki5;
import com.zepto.p2;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new b68();
    public final int c;
    public final String e;

    public Scope(int i, String str) {
        iu4.f(str, "scopeUri must not be null or empty");
        this.c = i;
        this.e = str;
    }

    public String c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.e.equals(((Scope) obj).e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.o(parcel, 2, c(), false);
        ki5.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
