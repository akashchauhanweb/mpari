package com.zepto;

import com.zepto.e52;

/* JADX INFO: loaded from: classes.dex */
public final class w00 extends e52 {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public static final class b extends e52.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override // com.zepto.e52.a
        public e52 a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new w00(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.e52.a
        public e52.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.zepto.e52.a
        public e52.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.e52.a
        public e52.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.zepto.e52.a
        public e52.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.zepto.e52.a
        public e52.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.zepto.e52
    public int b() {
        return this.d;
    }

    @Override // com.zepto.e52
    public long c() {
        return this.e;
    }

    @Override // com.zepto.e52
    public int d() {
        return this.c;
    }

    @Override // com.zepto.e52
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e52)) {
            return false;
        }
        e52 e52Var = (e52) obj;
        return this.b == e52Var.f() && this.c == e52Var.d() && this.d == e52Var.b() && this.e == e52Var.c() && this.f == e52Var.e();
    }

    @Override // com.zepto.e52
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    public w00(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
