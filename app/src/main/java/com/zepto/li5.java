package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class li5 {
    public long a;
    public long b;

    public li5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li5)) {
            return false;
        }
        li5 li5Var = (li5) obj;
        return this.a == li5Var.a && this.b == li5Var.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "Sample(offset=" + this.a + ", size=" + this.b + ')';
    }
}
