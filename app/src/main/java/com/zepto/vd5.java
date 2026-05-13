package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vd5 {
    public final int a;
    public final boolean b;
    public final String c;
    public final long d;
    public final String e;

    public vd5(int i, boolean z, String str, long j, String str2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd5)) {
            return false;
        }
        vd5 vd5Var = (vd5) obj;
        return this.a == vd5Var.a && this.b == vd5Var.b && Intrinsics.areEqual(this.c, vd5Var.c) && this.d == vd5Var.d && Intrinsics.areEqual(this.e, vd5Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.c;
        int iHashCode2 = (((i + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.d)) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Result(index=" + this.a + ", success=" + this.b + ", failureMessage=" + this.c + ", size=" + this.d + ", path=" + this.e + ')';
    }

    public /* synthetic */ vd5(int i, boolean z, String str, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, str, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? null : str2);
    }
}
