package com.zepto;

import com.zepto.in3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b10 extends in3 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final f44 g;

    public static final class b extends in3.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public f44 g;

        @Override // com.zepto.in3.a
        public in3 a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new b10(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.in3.a
        public in3.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.zepto.in3.a
        public in3.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.in3.a
        public in3.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.in3.a
        public in3.a e(f44 f44Var) {
            this.g = f44Var;
            return this;
        }

        @Override // com.zepto.in3.a
        public in3.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // com.zepto.in3.a
        public in3.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // com.zepto.in3.a
        public in3.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.zepto.in3
    public Integer b() {
        return this.b;
    }

    @Override // com.zepto.in3
    public long c() {
        return this.a;
    }

    @Override // com.zepto.in3
    public long d() {
        return this.c;
    }

    @Override // com.zepto.in3
    public f44 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof in3)) {
            return false;
        }
        in3 in3Var = (in3) obj;
        if (this.a == in3Var.c() && ((num = this.b) != null ? num.equals(in3Var.b()) : in3Var.b() == null) && this.c == in3Var.d()) {
            if (Arrays.equals(this.d, in3Var instanceof b10 ? ((b10) in3Var).d : in3Var.f()) && ((str = this.e) != null ? str.equals(in3Var.g()) : in3Var.g() == null) && this.f == in3Var.h()) {
                f44 f44Var = this.g;
                if (f44Var == null) {
                    if (in3Var.e() == null) {
                        return true;
                    }
                } else if (f44Var.equals(in3Var.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.zepto.in3
    public byte[] f() {
        return this.d;
    }

    @Override // com.zepto.in3
    public String g() {
        return this.e;
    }

    @Override // com.zepto.in3
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int iHashCode2 = (((((i ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        f44 f44Var = this.g;
        return i2 ^ (f44Var != null ? f44Var.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }

    public b10(long j, Integer num, long j2, byte[] bArr, String str, long j3, f44 f44Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = f44Var;
    }
}
