package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class od8 extends p2 {
    public static final Parcelable.Creator<od8> CREATOR = new nf8();
    public final int c;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final od8 j;
    public final List k;

    static {
        Process.myUid();
        Process.myPid();
    }

    public od8(int i, int i2, String str, String str2, String str3, int i3, List list, od8 od8Var) {
        this.c = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.i = str3;
        this.h = i3;
        this.k = af8.D(list);
        this.j = od8Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof od8) {
            od8 od8Var = (od8) obj;
            if (this.c == od8Var.c && this.e == od8Var.e && this.h == od8Var.h && this.f.equals(od8Var.f) && oe8.a(this.g, od8Var.g) && oe8.a(this.i, od8Var.i) && oe8.a(this.j, od8Var.j) && this.k.equals(od8Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.f, this.g, this.i});
    }

    public final String toString() {
        int length = this.f.length() + 18;
        String str = this.g;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.c);
        sb.append("/");
        sb.append(this.f);
        if (this.g != null) {
            sb.append("[");
            if (this.g.startsWith(this.f)) {
                sb.append((CharSequence) this.g, this.f.length(), this.g.length());
            } else {
                sb.append(this.g);
            }
            sb.append("]");
        }
        if (this.i != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.i.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.j(parcel, 1, this.c);
        ki5.j(parcel, 2, this.e);
        ki5.o(parcel, 3, this.f, false);
        ki5.o(parcel, 4, this.g, false);
        ki5.j(parcel, 5, this.h);
        ki5.o(parcel, 6, this.i, false);
        ki5.n(parcel, 7, this.j, i, false);
        ki5.r(parcel, 8, this.k, false);
        ki5.b(parcel, iA);
    }
}
