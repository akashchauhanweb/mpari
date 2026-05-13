package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jq7 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public jq7(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq7)) {
            return false;
        }
        jq7 jq7Var = (jq7) obj;
        return this.a == jq7Var.a && this.b == jq7Var.b && this.c == jq7Var.c && Intrinsics.areEqual(this.d, jq7Var.d);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewConfig(dayViewRes=" + this.a + ", monthHeaderRes=" + this.b + ", monthFooterRes=" + this.c + ", monthViewClass=" + this.d + ")";
    }
}
