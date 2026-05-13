package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class hi1 {
    public final ky4 a;
    public final int b;
    public final int c;

    public hi1(Class cls, int i, int i2) {
        this(ky4.b(cls), i, i2);
    }

    public static String a(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static hi1 g(Class cls) {
        return new hi1(cls, 0, 0);
    }

    public static hi1 h(Class cls) {
        return new hi1(cls, 0, 1);
    }

    public static hi1 i(ky4 ky4Var) {
        return new hi1(ky4Var, 1, 0);
    }

    public static hi1 j(Class cls) {
        return new hi1(cls, 1, 0);
    }

    public static hi1 k(Class cls) {
        return new hi1(cls, 1, 1);
    }

    public static hi1 l(Class cls) {
        return new hi1(cls, 2, 0);
    }

    public ky4 b() {
        return this.a;
    }

    public boolean c() {
        return this.c == 2;
    }

    public boolean d() {
        return this.c == 0;
    }

    public boolean e() {
        return this.b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hi1)) {
            return false;
        }
        hi1 hi1Var = (hi1) obj;
        return this.a.equals(hi1Var.a) && this.b == hi1Var.b && this.c == hi1Var.c;
    }

    public boolean f() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.c));
        sb.append("}");
        return sb.toString();
    }

    public hi1(ky4 ky4Var, int i, int i2) {
        this.a = (ky4) ku4.c(ky4Var, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }
}
