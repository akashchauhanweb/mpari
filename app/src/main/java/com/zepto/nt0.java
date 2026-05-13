package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nt0 {
    public final Object a;
    public final Function1 b;

    public nt0(Object obj, Function1 function1) {
        this.a = obj;
        this.b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt0)) {
            return false;
        }
        nt0 nt0Var = (nt0) obj;
        return Intrinsics.areEqual(this.a, nt0Var.a) && Intrinsics.areEqual(this.b, nt0Var.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
