package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class n76 {
    public static final n76 c = new a().a();
    public final long a;
    public final long b;

    public static final class a {
        public long a = 0;
        public long b = 0;

        public n76 a() {
            return new n76(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(long j) {
            this.b = j;
            return this;
        }
    }

    public n76(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}
