package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class l10 extends s66 {
    public final long a;
    public final long b;
    public final long c;

    public l10(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.zepto.s66
    public long b() {
        return this.b;
    }

    @Override // com.zepto.s66
    public long c() {
        return this.a;
    }

    @Override // com.zepto.s66
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s66)) {
            return false;
        }
        s66 s66Var = (s66) obj;
        return this.a == s66Var.c() && this.b == s66Var.b() && this.c == s66Var.d();
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
