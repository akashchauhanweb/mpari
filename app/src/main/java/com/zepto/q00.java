package com.zepto;

import com.zepto.u30;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends u30 {
    public final u30.a a;
    public final long b;

    public q00(u30.a aVar, long j) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.a = aVar;
        this.b = j;
    }

    @Override // com.zepto.u30
    public long b() {
        return this.b;
    }

    @Override // com.zepto.u30
    public u30.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj;
        return this.a.equals(u30Var.c()) && this.b == u30Var.b();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
