package com.zepto;

import com.zepto.a03;

/* JADX INFO: loaded from: classes.dex */
public final class z00 extends a03 {
    public final String a;
    public final long b;
    public final long c;

    public static final class b extends a03.a {
        public String a;
        public Long b;
        public Long c;

        @Override // com.zepto.a03.a
        public a03 a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new z00(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.a03.a
        public a03.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.a = str;
            return this;
        }

        @Override // com.zepto.a03.a
        public a03.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.a03.a
        public a03.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.zepto.a03
    public String b() {
        return this.a;
    }

    @Override // com.zepto.a03
    public long c() {
        return this.c;
    }

    @Override // com.zepto.a03
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a03)) {
            return false;
        }
        a03 a03Var = (a03) obj;
        return this.a.equals(a03Var.b()) && this.b == a03Var.d() && this.c == a03Var.c();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public z00(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
