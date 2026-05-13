package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ag6 {
    public static final ag6 c = new a().a();
    public final long a;
    public final long b;

    public static final class a {
        public long a = 0;
        public long b = 0;

        public ag6 a() {
            return new ag6(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    public ag6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }
}
