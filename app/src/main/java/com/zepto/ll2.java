package com.zepto;

import com.zepto.t80;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ll2 {
    public static final t80 d;
    public static final t80 e;
    public static final t80 f;
    public static final t80 g;
    public static final t80 h;
    public static final t80 i;
    public static final a j = new a(null);
    public final int a;
    public final t80 b;
    public final t80 c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        t80.a aVar = t80.h;
        d = aVar.d(":");
        e = aVar.d(":status");
        f = aVar.d(":method");
        g = aVar.d(":path");
        h = aVar.d(":scheme");
        i = aVar.d(":authority");
    }

    public ll2(t80 name, t80 value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.b = name;
        this.c = value;
        this.a = name.t() + 32 + value.t();
    }

    public final t80 a() {
        return this.b;
    }

    public final t80 b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll2)) {
            return false;
        }
        ll2 ll2Var = (ll2) obj;
        return Intrinsics.areEqual(this.b, ll2Var.b) && Intrinsics.areEqual(this.c, ll2Var.c);
    }

    public int hashCode() {
        t80 t80Var = this.b;
        int iHashCode = (t80Var != null ? t80Var.hashCode() : 0) * 31;
        t80 t80Var2 = this.c;
        return iHashCode + (t80Var2 != null ? t80Var2.hashCode() : 0);
    }

    public String toString() {
        return this.b.w() + ": " + this.c.w();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ll2(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        t80.a aVar = t80.h;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ll2(t80 name, String value) {
        this(name, t80.h.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
