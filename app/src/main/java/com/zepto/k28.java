package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class k28 {
    public final iq a;
    public final w82 b;

    public /* synthetic */ k28(iq iqVar, w82 w82Var, j28 j28Var) {
        this.a = iqVar;
        this.b = w82Var;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k28)) {
            k28 k28Var = (k28) obj;
            if (if4.a(this.a, k28Var.a) && if4.a(this.b, k28Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return if4.b(this.a, this.b);
    }

    public final String toString() {
        return if4.c(this).a("key", this.a).a("feature", this.b).toString();
    }
}
