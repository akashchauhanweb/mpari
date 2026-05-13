package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ay7 {
    public final String a;
    public final int b;

    public ay7(String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = workSpecId;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay7)) {
            return false;
        }
        ay7 ay7Var = (ay7) obj;
        return Intrinsics.areEqual(this.a, ay7Var.a) && this.b == ay7Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
