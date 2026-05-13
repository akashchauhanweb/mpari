package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class e36 {
    public final int a;
    public final int b;

    public e36(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final e36 a(int i, int i2) {
        return new e36(i, i2);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e36)) {
            return false;
        }
        e36 e36Var = (e36) obj;
        return this.a == e36Var.a && this.b == e36Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
