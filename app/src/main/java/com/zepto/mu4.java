package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mu4 {
    public final String a;
    public final Long b;

    public mu4(String key, Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = key;
        this.b = l;
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu4)) {
            return false;
        }
        mu4 mu4Var = (mu4) obj;
        return Intrinsics.areEqual(this.a, mu4Var.a) && Intrinsics.areEqual(this.b, mu4Var.b);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mu4(String key, boolean z) {
        this(key, Long.valueOf(z ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
