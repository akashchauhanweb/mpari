package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class bb3 extends p2 {
    public static final Parcelable.Creator<bb3> CREATOR = new gm8();
    public final long c;
    public final int e;
    public final boolean f;
    public final String g;
    public final od8 h;

    public static final class a {
        public long a = LongCompanionObject.MAX_VALUE;
        public int b = 0;
        public boolean c = false;
        public String d = null;
        public od8 e = null;

        public bb3 a() {
            return new bb3(this.a, this.b, this.c, this.d, this.e);
        }
    }

    public bb3(long j, int i, boolean z, String str, od8 od8Var) {
        this.c = j;
        this.e = i;
        this.f = z;
        this.g = str;
        this.h = od8Var;
    }

    public int c() {
        return this.e;
    }

    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bb3)) {
            return false;
        }
        bb3 bb3Var = (bb3) obj;
        return this.c == bb3Var.c && this.e == bb3Var.e && this.f == bb3Var.f && if4.a(this.g, bb3Var.g) && if4.a(this.h, bb3Var.h);
    }

    public int hashCode() {
        return if4.b(Long.valueOf(this.c), Integer.valueOf(this.e), Boolean.valueOf(this.f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.c != LongCompanionObject.MAX_VALUE) {
            sb.append("maxAge=");
            ke8.b(this.c, sb);
        }
        if (this.e != 0) {
            sb.append(", ");
            sb.append(zj8.b(this.e));
        }
        if (this.f) {
            sb.append(", bypass");
        }
        if (this.g != null) {
            sb.append(", moduleId=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", impersonation=");
            sb.append(this.h);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = ki5.a(parcel);
        ki5.m(parcel, 1, d());
        ki5.j(parcel, 2, c());
        ki5.c(parcel, 3, this.f);
        ki5.o(parcel, 4, this.g, false);
        ki5.n(parcel, 5, this.h, i, false);
        ki5.b(parcel, iA);
    }
}
