package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ky4 {
    public final Class a;
    public final Class b;

    public @interface a {
    }

    public ky4(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static ky4 a(Class cls, Class cls2) {
        return new ky4(cls, cls2);
    }

    public static ky4 b(Class cls) {
        return new ky4(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ky4.class != obj.getClass()) {
            return false;
        }
        ky4 ky4Var = (ky4) obj;
        if (this.b.equals(ky4Var.b)) {
            return this.a.equals(ky4Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
