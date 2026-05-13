package com.zepto;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y14 {
    public final u24 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public static final class a {
        public u24 a;
        public boolean b;
        public Object c;
        public boolean d;

        public final y14 a() {
            u24 u24VarC = this.a;
            if (u24VarC == null) {
                u24VarC = u24.c.c(this.c);
                Intrinsics.checkNotNull(u24VarC, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new y14(u24VarC, this.b, this.c, this.d);
        }

        public final a b(Object obj) {
            this.c = obj;
            this.d = true;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }

        public final a d(u24 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.a = type;
            return this;
        }
    }

    public y14(u24 type, boolean z, Object obj, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.c() && z) {
            throw new IllegalArgumentException((type.b() + " does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.a = type;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final u24 a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final void d(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (this.c) {
            this.a.h(bundle, name, this.d);
        }
    }

    public final boolean e(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.a.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(y14.class, obj.getClass())) {
            return false;
        }
        y14 y14Var = (y14) obj;
        if (this.b != y14Var.b || this.c != y14Var.c || !Intrinsics.areEqual(this.a, y14Var.a)) {
            return false;
        }
        Object obj2 = this.d;
        return obj2 != null ? Intrinsics.areEqual(obj2, y14Var.d) : y14Var.d == null;
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y14.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
