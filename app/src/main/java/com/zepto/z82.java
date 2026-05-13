package com.zepto;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z82 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public z82(String applNo, String chasiNo, String regnNo, ArrayList purCdsForFee) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Intrinsics.checkNotNullParameter(purCdsForFee, "purCdsForFee");
        this.a = applNo;
        this.b = chasiNo;
        this.c = regnNo;
        this.d = purCdsForFee;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z82)) {
            return false;
        }
        z82 z82Var = (z82) obj;
        return Intrinsics.areEqual(this.a, z82Var.a) && Intrinsics.areEqual(this.b, z82Var.b) && Intrinsics.areEqual(this.c, z82Var.c) && Intrinsics.areEqual(this.d, z82Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "FeeModle(applNo=" + this.a + ", chasiNo=" + this.b + ", regnNo=" + this.c + ", purCdsForFee=" + this.d + ')';
    }
}
