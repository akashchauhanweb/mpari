package com.zepto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nr4 implements Parcelable {
    public static final Parcelable.Creator<nr4> CREATOR = new a();
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nr4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new nr4(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final nr4[] newArray(int i) {
            return new nr4[i];
        }
    }

    public nr4(String fname, String relationType, String swdLname, String gender, String countryOfBirthCode, String countryOfBirth, String bloodGroupCode, String mobileNumber, String fullName, String dateOfBirth, String mname, String swdFname, String lname, String eduQualCode, String eduQual, String swdMname, String idMarks1, String idMarks2, String email, String altMobileNo) {
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(relationType, "relationType");
        Intrinsics.checkNotNullParameter(swdLname, "swdLname");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(countryOfBirthCode, "countryOfBirthCode");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(bloodGroupCode, "bloodGroupCode");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(swdFname, "swdFname");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(eduQualCode, "eduQualCode");
        Intrinsics.checkNotNullParameter(eduQual, "eduQual");
        Intrinsics.checkNotNullParameter(swdMname, "swdMname");
        Intrinsics.checkNotNullParameter(idMarks1, "idMarks1");
        Intrinsics.checkNotNullParameter(idMarks2, "idMarks2");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(altMobileNo, "altMobileNo");
        this.c = fname;
        this.e = relationType;
        this.f = swdLname;
        this.g = gender;
        this.h = countryOfBirthCode;
        this.i = countryOfBirth;
        this.j = bloodGroupCode;
        this.k = mobileNumber;
        this.l = fullName;
        this.m = dateOfBirth;
        this.n = mname;
        this.o = swdFname;
        this.p = lname;
        this.q = eduQualCode;
        this.r = eduQual;
        this.s = swdMname;
        this.t = idMarks1;
        this.u = idMarks2;
        this.v = email;
        this.w = altMobileNo;
    }

    public final String c() {
        return this.w;
    }

    public final String d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr4)) {
            return false;
        }
        nr4 nr4Var = (nr4) obj;
        return Intrinsics.areEqual(this.c, nr4Var.c) && Intrinsics.areEqual(this.e, nr4Var.e) && Intrinsics.areEqual(this.f, nr4Var.f) && Intrinsics.areEqual(this.g, nr4Var.g) && Intrinsics.areEqual(this.h, nr4Var.h) && Intrinsics.areEqual(this.i, nr4Var.i) && Intrinsics.areEqual(this.j, nr4Var.j) && Intrinsics.areEqual(this.k, nr4Var.k) && Intrinsics.areEqual(this.l, nr4Var.l) && Intrinsics.areEqual(this.m, nr4Var.m) && Intrinsics.areEqual(this.n, nr4Var.n) && Intrinsics.areEqual(this.o, nr4Var.o) && Intrinsics.areEqual(this.p, nr4Var.p) && Intrinsics.areEqual(this.q, nr4Var.q) && Intrinsics.areEqual(this.r, nr4Var.r) && Intrinsics.areEqual(this.s, nr4Var.s) && Intrinsics.areEqual(this.t, nr4Var.t) && Intrinsics.areEqual(this.u, nr4Var.u) && Intrinsics.areEqual(this.v, nr4Var.v) && Intrinsics.areEqual(this.w, nr4Var.w);
    }

    public final String f() {
        return this.h;
    }

    public final String g() {
        return this.m;
    }

    public final String h() {
        return this.q;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    public final String i() {
        return this.v;
    }

    public final String j() {
        return this.c;
    }

    public final String k() {
        return this.l;
    }

    public final String l() {
        return this.g;
    }

    public final String m() {
        return this.t;
    }

    public final String n() {
        return this.u;
    }

    public final String o() {
        return this.p;
    }

    public final String p() {
        return this.n;
    }

    public final String q() {
        return this.k;
    }

    public final String r() {
        return this.e;
    }

    public final String s() {
        return this.o;
    }

    public final String t() {
        return this.f;
    }

    public String toString() {
        return "PersonalDetailsModal(fname=" + this.c + ", relationType=" + this.e + ", swdLname=" + this.f + ", gender=" + this.g + ", countryOfBirthCode=" + this.h + ", countryOfBirth=" + this.i + ", bloodGroupCode=" + this.j + ", mobileNumber=" + this.k + ", fullName=" + this.l + ", dateOfBirth=" + this.m + ", mname=" + this.n + ", swdFname=" + this.o + ", lname=" + this.p + ", eduQualCode=" + this.q + ", eduQual=" + this.r + ", swdMname=" + this.s + ", idMarks1=" + this.t + ", idMarks2=" + this.u + ", email=" + this.v + ", altMobileNo=" + this.w + ')';
    }

    public final String u() {
        return this.s;
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
    }
}
