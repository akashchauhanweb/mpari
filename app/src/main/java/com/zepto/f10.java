package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class f10 extends fr4 {
    public final long a;
    public final qn6 b;
    public final u42 c;

    public f10(long j, qn6 qn6Var, u42 u42Var) {
        this.a = j;
        if (qn6Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = qn6Var;
        if (u42Var == null) {
            throw new NullPointerException("Null event");
        }
        this.c = u42Var;
    }

    @Override // com.zepto.fr4
    public u42 b() {
        return this.c;
    }

    @Override // com.zepto.fr4
    public long c() {
        return this.a;
    }

    @Override // com.zepto.fr4
    public qn6 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fr4)) {
            return false;
        }
        fr4 fr4Var = (fr4) obj;
        return this.a == fr4Var.c() && this.b.equals(fr4Var.d()) && this.c.equals(fr4Var.b());
    }

    public int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
