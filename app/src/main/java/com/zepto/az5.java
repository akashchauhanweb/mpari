package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public final class az5 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public az5(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az5)) {
            return false;
        }
        az5 az5Var = (az5) obj;
        return this.a == az5Var.a && this.b == az5Var.b && this.c == az5Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.c;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        return "ServiceListTO(purposeCode=" + this.a + ", selectService=" + this.b + ", isEnable=" + this.c + ')';
    }
}
