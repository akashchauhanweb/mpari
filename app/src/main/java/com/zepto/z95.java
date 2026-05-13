package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z95 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final String o;

    public z95(String allotmentOffice, String applNo, String authrizationUpto, String entryStatus, int i, String ipAddress, int i2, String previousAuthrizationFrom, String previousAuthrizationNo, String previousAuthrizationUpto, String previousIssueDate, String previousPermitNo, int i3, String regnNo, String stateCode) {
        Intrinsics.checkNotNullParameter(allotmentOffice, "allotmentOffice");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(authrizationUpto, "authrizationUpto");
        Intrinsics.checkNotNullParameter(entryStatus, "entryStatus");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(previousAuthrizationFrom, "previousAuthrizationFrom");
        Intrinsics.checkNotNullParameter(previousAuthrizationNo, "previousAuthrizationNo");
        Intrinsics.checkNotNullParameter(previousAuthrizationUpto, "previousAuthrizationUpto");
        Intrinsics.checkNotNullParameter(previousIssueDate, "previousIssueDate");
        Intrinsics.checkNotNullParameter(previousPermitNo, "previousPermitNo");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.a = allotmentOffice;
        this.b = applNo;
        this.c = authrizationUpto;
        this.d = entryStatus;
        this.e = i;
        this.f = ipAddress;
        this.g = i2;
        this.h = previousAuthrizationFrom;
        this.i = previousAuthrizationNo;
        this.j = previousAuthrizationUpto;
        this.k = previousIssueDate;
        this.l = previousPermitNo;
        this.m = i3;
        this.n = regnNo;
        this.o = stateCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z95)) {
            return false;
        }
        z95 z95Var = (z95) obj;
        return Intrinsics.areEqual(this.a, z95Var.a) && Intrinsics.areEqual(this.b, z95Var.b) && Intrinsics.areEqual(this.c, z95Var.c) && Intrinsics.areEqual(this.d, z95Var.d) && this.e == z95Var.e && Intrinsics.areEqual(this.f, z95Var.f) && this.g == z95Var.g && Intrinsics.areEqual(this.h, z95Var.h) && Intrinsics.areEqual(this.i, z95Var.i) && Intrinsics.areEqual(this.j, z95Var.j) && Intrinsics.areEqual(this.k, z95Var.k) && Intrinsics.areEqual(this.l, z95Var.l) && this.m == z95Var.m && Intrinsics.areEqual(this.n, z95Var.n) && Intrinsics.areEqual(this.o, z95Var.o);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + Integer.hashCode(this.m)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public String toString() {
        return "RenewalOfPermitSavetoDraftRequest(allotmentOffice=" + this.a + ", applNo=" + this.b + ", authrizationUpto=" + this.c + ", entryStatus=" + this.d + ", flowSrno=" + this.e + ", ipAddress=" + this.f + ", officeCode=" + this.g + ", previousAuthrizationFrom=" + this.h + ", previousAuthrizationNo=" + this.i + ", previousAuthrizationUpto=" + this.j + ", previousIssueDate=" + this.k + ", previousPermitNo=" + this.l + ", purposeCode=" + this.m + ", regnNo=" + this.n + ", stateCode=" + this.o + ')';
    }
}
