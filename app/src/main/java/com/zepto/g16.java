package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g16 {
    public xl5 a;
    public String b;

    public g16(xl5 xl5Var, String str) {
        this.a = xl5Var;
        this.b = str;
    }

    public final xl5 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g16)) {
            return false;
        }
        g16 g16Var = (g16) obj;
        return this.a == g16Var.a && Intrinsics.areEqual(this.b, g16Var.b);
    }

    public int hashCode() {
        xl5 xl5Var = this.a;
        int iHashCode = (xl5Var == null ? 0 : xl5Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SharedStorageConfiguration(saveAt=" + this.a + ", subFolderName=" + this.b + ')';
    }
}
