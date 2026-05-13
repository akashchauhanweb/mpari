package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class d10 extends ln3 {
    public final long a;

    public d10(long j) {
        this.a = j;
    }

    @Override // com.zepto.ln3
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ln3) && this.a == ((ln3) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
