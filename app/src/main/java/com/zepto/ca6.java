package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ca6 {
    public final String a;
    public final int b;
    public final int c;

    public ca6(String workSpecId, int i, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = workSpecId;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca6)) {
            return false;
        }
        ca6 ca6Var = (ca6) obj;
        return Intrinsics.areEqual(this.a, ca6Var.a) && this.b == ca6Var.b && this.c == ca6Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
