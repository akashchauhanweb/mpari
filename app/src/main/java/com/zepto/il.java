package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class il implements Parcelable {
    public static final Parcelable.Creator<il> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String c;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final il createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new il(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final il[] newArray(int i) {
            return new il[i];
        }
    }

    public il(String permDistrict, String permHouseNo, String presDistrict, String presHouseNo, String presStreet, String permSubDistrictCode, String presState, String permStateCode, String permState, String presCityCode, String permVillageOrTown, String presCity, String presSubDistrict, String presPinCode, String permSubDistrict, String permCityCode, String presDistrictCode, String presSubDistrictCode, String permLocation, String presStateCode, String presLocation, String permDistrictCode, String stayPeriodMonths, String permCity, String permStreet, String presVillageOrTown, String permPinCode, String stayPeriodYears) {
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(permSubDistrictCode, "permSubDistrictCode");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(permStateCode, "permStateCode");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(presCityCode, "presCityCode");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permCityCode, "permCityCode");
        Intrinsics.checkNotNullParameter(presDistrictCode, "presDistrictCode");
        Intrinsics.checkNotNullParameter(presSubDistrictCode, "presSubDistrictCode");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(presStateCode, "presStateCode");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(permDistrictCode, "permDistrictCode");
        Intrinsics.checkNotNullParameter(stayPeriodMonths, "stayPeriodMonths");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(stayPeriodYears, "stayPeriodYears");
        this.c = permDistrict;
        this.e = permHouseNo;
        this.f = presDistrict;
        this.g = presHouseNo;
        this.h = presStreet;
        this.i = permSubDistrictCode;
        this.j = presState;
        this.k = permStateCode;
        this.l = permState;
        this.m = presCityCode;
        this.n = permVillageOrTown;
        this.o = presCity;
        this.p = presSubDistrict;
        this.q = presPinCode;
        this.r = permSubDistrict;
        this.s = permCityCode;
        this.t = presDistrictCode;
        this.u = presSubDistrictCode;
        this.v = permLocation;
        this.w = presStateCode;
        this.x = presLocation;
        this.y = permDistrictCode;
        this.z = stayPeriodMonths;
        this.A = permCity;
        this.B = permStreet;
        this.C = presVillageOrTown;
        this.D = permPinCode;
        this.E = stayPeriodYears;
    }

    public final String A() {
        return this.u;
    }

    public final String B() {
        return this.C;
    }

    public final String C() {
        return this.z;
    }

    public final String D() {
        return this.E;
    }

    public final String c() {
        return this.A;
    }

    public final String d() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        return Intrinsics.areEqual(this.c, ilVar.c) && Intrinsics.areEqual(this.e, ilVar.e) && Intrinsics.areEqual(this.f, ilVar.f) && Intrinsics.areEqual(this.g, ilVar.g) && Intrinsics.areEqual(this.h, ilVar.h) && Intrinsics.areEqual(this.i, ilVar.i) && Intrinsics.areEqual(this.j, ilVar.j) && Intrinsics.areEqual(this.k, ilVar.k) && Intrinsics.areEqual(this.l, ilVar.l) && Intrinsics.areEqual(this.m, ilVar.m) && Intrinsics.areEqual(this.n, ilVar.n) && Intrinsics.areEqual(this.o, ilVar.o) && Intrinsics.areEqual(this.p, ilVar.p) && Intrinsics.areEqual(this.q, ilVar.q) && Intrinsics.areEqual(this.r, ilVar.r) && Intrinsics.areEqual(this.s, ilVar.s) && Intrinsics.areEqual(this.t, ilVar.t) && Intrinsics.areEqual(this.u, ilVar.u) && Intrinsics.areEqual(this.v, ilVar.v) && Intrinsics.areEqual(this.w, ilVar.w) && Intrinsics.areEqual(this.x, ilVar.x) && Intrinsics.areEqual(this.y, ilVar.y) && Intrinsics.areEqual(this.z, ilVar.z) && Intrinsics.areEqual(this.A, ilVar.A) && Intrinsics.areEqual(this.B, ilVar.B) && Intrinsics.areEqual(this.C, ilVar.C) && Intrinsics.areEqual(this.D, ilVar.D) && Intrinsics.areEqual(this.E, ilVar.E);
    }

    public final String f() {
        return this.y;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.v;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }

    public final String i() {
        return this.D;
    }

    public final String j() {
        return this.l;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.B;
    }

    public final String m() {
        return this.r;
    }

    public final String n() {
        return this.i;
    }

    public final String o() {
        return this.n;
    }

    public final String p() {
        return this.o;
    }

    public final String q() {
        return this.m;
    }

    public final String r() {
        return this.f;
    }

    public final String s() {
        return this.t;
    }

    public final String t() {
        return this.g;
    }

    public String toString() {
        return "AddressDetailsModal(permDistrict=" + this.c + ", permHouseNo=" + this.e + ", presDistrict=" + this.f + ", presHouseNo=" + this.g + ", presStreet=" + this.h + ", permSubDistrictCode=" + this.i + ", presState=" + this.j + ", permStateCode=" + this.k + ", permState=" + this.l + ", presCityCode=" + this.m + ", permVillageOrTown=" + this.n + ", presCity=" + this.o + ", presSubDistrict=" + this.p + ", presPinCode=" + this.q + ", permSubDistrict=" + this.r + ", permCityCode=" + this.s + ", presDistrictCode=" + this.t + ", presSubDistrictCode=" + this.u + ", permLocation=" + this.v + ", presStateCode=" + this.w + ", presLocation=" + this.x + ", permDistrictCode=" + this.y + ", stayPeriodMonths=" + this.z + ", permCity=" + this.A + ", permStreet=" + this.B + ", presVillageOrTown=" + this.C + ", permPinCode=" + this.D + ", stayPeriodYears=" + this.E + ')';
    }

    public final String u() {
        return this.x;
    }

    public final String v() {
        return this.q;
    }

    public final String w() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.c);
        out.writeString(this.e);
        out.writeString(this.f);
        out.writeString(this.g);
        out.writeString(this.h);
        out.writeString(this.i);
        out.writeString(this.j);
        out.writeString(this.k);
        out.writeString(this.l);
        out.writeString(this.m);
        out.writeString(this.n);
        out.writeString(this.o);
        out.writeString(this.p);
        out.writeString(this.q);
        out.writeString(this.r);
        out.writeString(this.s);
        out.writeString(this.t);
        out.writeString(this.u);
        out.writeString(this.v);
        out.writeString(this.w);
        out.writeString(this.x);
        out.writeString(this.y);
        out.writeString(this.z);
        out.writeString(this.A);
        out.writeString(this.B);
        out.writeString(this.C);
        out.writeString(this.D);
        out.writeString(this.E);
    }

    public final String x() {
        return this.w;
    }

    public final String y() {
        return this.h;
    }

    public final String z() {
        return this.p;
    }
}
