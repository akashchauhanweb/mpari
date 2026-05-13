package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class jn3 {
    public static final jn3 c = new a().a();
    public final long a;
    public final b b;

    public static final class a {
        public long a = 0;
        public b b = b.REASON_UNKNOWN;

        public jn3 a() {
            return new jn3(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    public enum b implements yw4 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int c;

        b(int i) {
            this.c = i;
        }

        @Override // com.zepto.yw4
        public int a() {
            return this.c;
        }
    }

    public jn3(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }
}
