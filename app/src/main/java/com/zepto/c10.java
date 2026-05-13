package com.zepto;

import com.zepto.kn3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c10 extends kn3 {
    public final long a;
    public final long b;
    public final rq0 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final jy4 g;

    public static final class b extends kn3.a {
        public Long a;
        public Long b;
        public rq0 c;
        public Integer d;
        public String e;
        public List f;
        public jy4 g;

        @Override // com.zepto.kn3.a
        public kn3 a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new c10(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.kn3.a
        public kn3.a b(rq0 rq0Var) {
            this.c = rq0Var;
            return this;
        }

        @Override // com.zepto.kn3.a
        public kn3.a c(List list) {
            this.f = list;
            return this;
        }

        @Override // com.zepto.kn3.a
        public kn3.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.zepto.kn3.a
        public kn3.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.zepto.kn3.a
        public kn3.a f(jy4 jy4Var) {
            this.g = jy4Var;
            return this;
        }

        @Override // com.zepto.kn3.a
        public kn3.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.kn3.a
        public kn3.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.zepto.kn3
    public rq0 b() {
        return this.c;
    }

    @Override // com.zepto.kn3
    public List c() {
        return this.f;
    }

    @Override // com.zepto.kn3
    public Integer d() {
        return this.d;
    }

    @Override // com.zepto.kn3
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        rq0 rq0Var;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kn3)) {
            return false;
        }
        kn3 kn3Var = (kn3) obj;
        if (this.a == kn3Var.g() && this.b == kn3Var.h() && ((rq0Var = this.c) != null ? rq0Var.equals(kn3Var.b()) : kn3Var.b() == null) && ((num = this.d) != null ? num.equals(kn3Var.d()) : kn3Var.d() == null) && ((str = this.e) != null ? str.equals(kn3Var.e()) : kn3Var.e() == null) && ((list = this.f) != null ? list.equals(kn3Var.c()) : kn3Var.c() == null)) {
            jy4 jy4Var = this.g;
            if (jy4Var == null) {
                if (kn3Var.f() == null) {
                    return true;
                }
            } else if (jy4Var.equals(kn3Var.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.kn3
    public jy4 f() {
        return this.g;
    }

    @Override // com.zepto.kn3
    public long g() {
        return this.a;
    }

    @Override // com.zepto.kn3
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        rq0 rq0Var = this.c;
        int iHashCode = (i ^ (rq0Var == null ? 0 : rq0Var.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        jy4 jy4Var = this.g;
        return iHashCode4 ^ (jy4Var != null ? jy4Var.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    public c10(long j, long j2, rq0 rq0Var, Integer num, String str, List list, jy4 jy4Var) {
        this.a = j;
        this.b = j2;
        this.c = rq0Var;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = jy4Var;
    }
}
