package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ii6 {
    public final int A;
    public final String B;
    public final int C;
    public final String D;
    public final String E;
    public final long F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final String n;
    public final int o;
    public final String p;
    public final int q;
    public final int r;
    public final String s;
    public final String t;
    public final int u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public ii6(String str, String authMode, String chassisNo, String currentAddress1, String currentAddress2, String currentAddress3, String currentDistrict, int i, String currentState, String emailId, String fatherName, String garageAddress, boolean z, String movedOn, int i2, String openDate, int i3, int i4, String ownerFrom, String ownerName, int i5, String panNo, String permanentAddress1, String permanentAddress2, String permanentAddress3, String str2, int i6, String permanentState, int i7, String reason, String regnNo, long j, String saleDate, String services, String stateCode, String transferDate, String str3) {
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        Intrinsics.checkNotNullParameter(currentAddress1, "currentAddress1");
        Intrinsics.checkNotNullParameter(currentAddress2, "currentAddress2");
        Intrinsics.checkNotNullParameter(currentAddress3, "currentAddress3");
        Intrinsics.checkNotNullParameter(currentDistrict, "currentDistrict");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(fatherName, "fatherName");
        Intrinsics.checkNotNullParameter(garageAddress, "garageAddress");
        Intrinsics.checkNotNullParameter(movedOn, "movedOn");
        Intrinsics.checkNotNullParameter(openDate, "openDate");
        Intrinsics.checkNotNullParameter(ownerFrom, "ownerFrom");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(panNo, "panNo");
        Intrinsics.checkNotNullParameter(permanentAddress1, "permanentAddress1");
        Intrinsics.checkNotNullParameter(permanentAddress2, "permanentAddress2");
        Intrinsics.checkNotNullParameter(permanentAddress3, "permanentAddress3");
        Intrinsics.checkNotNullParameter(permanentState, "permanentState");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(saleDate, "saleDate");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(transferDate, "transferDate");
        this.a = str;
        this.b = authMode;
        this.c = chassisNo;
        this.d = currentAddress1;
        this.e = currentAddress2;
        this.f = currentAddress3;
        this.g = currentDistrict;
        this.h = i;
        this.i = currentState;
        this.j = emailId;
        this.k = fatherName;
        this.l = garageAddress;
        this.m = z;
        this.n = movedOn;
        this.o = i2;
        this.p = openDate;
        this.q = i3;
        this.r = i4;
        this.s = ownerFrom;
        this.t = ownerName;
        this.u = i5;
        this.v = panNo;
        this.w = permanentAddress1;
        this.x = permanentAddress2;
        this.y = permanentAddress3;
        this.z = str2;
        this.A = i6;
        this.B = permanentState;
        this.C = i7;
        this.D = reason;
        this.E = regnNo;
        this.F = j;
        this.G = saleDate;
        this.H = services;
        this.I = stateCode;
        this.J = transferDate;
        this.K = str3;
    }

    public final String A() {
        return this.I;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii6)) {
            return false;
        }
        ii6 ii6Var = (ii6) obj;
        return Intrinsics.areEqual(this.a, ii6Var.a) && Intrinsics.areEqual(this.b, ii6Var.b) && Intrinsics.areEqual(this.c, ii6Var.c) && Intrinsics.areEqual(this.d, ii6Var.d) && Intrinsics.areEqual(this.e, ii6Var.e) && Intrinsics.areEqual(this.f, ii6Var.f) && Intrinsics.areEqual(this.g, ii6Var.g) && this.h == ii6Var.h && Intrinsics.areEqual(this.i, ii6Var.i) && Intrinsics.areEqual(this.j, ii6Var.j) && Intrinsics.areEqual(this.k, ii6Var.k) && Intrinsics.areEqual(this.l, ii6Var.l) && this.m == ii6Var.m && Intrinsics.areEqual(this.n, ii6Var.n) && this.o == ii6Var.o && Intrinsics.areEqual(this.p, ii6Var.p) && this.q == ii6Var.q && this.r == ii6Var.r && Intrinsics.areEqual(this.s, ii6Var.s) && Intrinsics.areEqual(this.t, ii6Var.t) && this.u == ii6Var.u && Intrinsics.areEqual(this.v, ii6Var.v) && Intrinsics.areEqual(this.w, ii6Var.w) && Intrinsics.areEqual(this.x, ii6Var.x) && Intrinsics.areEqual(this.y, ii6Var.y) && Intrinsics.areEqual(this.z, ii6Var.z) && this.A == ii6Var.A && Intrinsics.areEqual(this.B, ii6Var.B) && this.C == ii6Var.C && Intrinsics.areEqual(this.D, ii6Var.D) && Intrinsics.areEqual(this.E, ii6Var.E) && this.F == ii6Var.F && Intrinsics.areEqual(this.G, ii6Var.G) && Intrinsics.areEqual(this.H, ii6Var.H) && Intrinsics.areEqual(this.I, ii6Var.I) && Intrinsics.areEqual(this.J, ii6Var.J) && Intrinsics.areEqual(this.K, ii6Var.K);
    }

    public final String f() {
        return this.g;
    }

    public final int g() {
        return this.h;
    }

    public final String h() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    public int hashCode() {
        String str = this.a;
        int iHashCode = (((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        boolean z = this.m;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + r2) * 31) + this.n.hashCode()) * 31) + Integer.hashCode(this.o)) * 31) + this.p.hashCode()) * 31) + Integer.hashCode(this.q)) * 31) + Integer.hashCode(this.r)) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + Integer.hashCode(this.u)) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31;
        String str2 = this.z;
        int iHashCode3 = (((((((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.A)) * 31) + this.B.hashCode()) * 31) + Integer.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Long.hashCode(this.F)) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31;
        String str3 = this.K;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.j;
    }

    public final String j() {
        return this.k;
    }

    public final String k() {
        return this.K;
    }

    public final int l() {
        return this.q;
    }

    public final String m() {
        return this.t;
    }

    public final int n() {
        return this.u;
    }

    public final String o() {
        return this.v;
    }

    public final String p() {
        return this.w;
    }

    public final String q() {
        return this.x;
    }

    public final String r() {
        return this.y;
    }

    public final String s() {
        return this.z;
    }

    public final int t() {
        return this.A;
    }

    public String toString() {
        return "ToSavetoDraftModelX(applNo=" + this.a + ", authMode=" + this.b + ", chassisNo=" + this.c + ", currentAddress1=" + this.d + ", currentAddress2=" + this.e + ", currentAddress3=" + this.f + ", currentDistrict=" + this.g + ", currentPinCode=" + this.h + ", currentState=" + this.i + ", emailId=" + this.j + ", fatherName=" + this.k + ", garageAddress=" + this.l + ", isRetainSwap=" + this.m + ", movedOn=" + this.n + ", officeCode=" + this.o + ", openDate=" + this.p + ", ownerCategory=" + this.q + ", ownerCode=" + this.r + ", ownerFrom=" + this.s + ", ownerName=" + this.t + ", ownerSerial=" + this.u + ", panNo=" + this.v + ", permanentAddress1=" + this.w + ", permanentAddress2=" + this.x + ", permanentAddress3=" + this.y + ", permanentDistrict=" + this.z + ", permanentPinCode=" + this.A + ", permanentState=" + this.B + ", purposeCode=" + this.C + ", reason=" + this.D + ", regnNo=" + this.E + ", saleAmmount=" + this.F + ", saleDate=" + this.G + ", services=" + this.H + ", stateCode=" + this.I + ", transferDate=" + this.J + ", Mobile_no=" + this.K + ')';
    }

    public final String u() {
        return this.B;
    }

    public final int v() {
        return this.C;
    }

    public final String w() {
        return this.D;
    }

    public final String x() {
        return this.E;
    }

    public final long y() {
        return this.F;
    }

    public final String z() {
        return this.G;
    }
}
