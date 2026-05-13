package com.zepto;

import com.zepto.u42;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v00 extends u42 {
    public final String a;
    public final Integer b;
    public final x12 c;
    public final long d;
    public final long e;
    public final Map f;

    public static final class b extends u42.a {
        public String a;
        public Integer b;
        public x12 c;
        public Long d;
        public Long e;
        public Map f;

        @Override // com.zepto.u42.a
        public u42 d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new v00(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.u42.a
        public Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.zepto.u42.a
        public u42.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        @Override // com.zepto.u42.a
        public u42.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.zepto.u42.a
        public u42.a h(x12 x12Var) {
            if (x12Var == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = x12Var;
            return this;
        }

        @Override // com.zepto.u42.a
        public u42.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.u42.a
        public u42.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        @Override // com.zepto.u42.a
        public u42.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.zepto.u42
    public Map c() {
        return this.f;
    }

    @Override // com.zepto.u42
    public Integer d() {
        return this.b;
    }

    @Override // com.zepto.u42
    public x12 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u42)) {
            return false;
        }
        u42 u42Var = (u42) obj;
        return this.a.equals(u42Var.j()) && ((num = this.b) != null ? num.equals(u42Var.d()) : u42Var.d() == null) && this.c.equals(u42Var.e()) && this.d == u42Var.f() && this.e == u42Var.k() && this.f.equals(u42Var.c());
    }

    @Override // com.zepto.u42
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.zepto.u42
    public String j() {
        return this.a;
    }

    @Override // com.zepto.u42
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }

    public v00(String str, Integer num, x12 x12Var, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = x12Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
