package com.zepto;

import com.zepto.gr4;
import com.zepto.hr4;

/* JADX INFO: loaded from: classes.dex */
public final class g10 extends hr4 {
    public final String b;
    public final gr4.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public static final class b extends hr4.a {
        public String a;
        public gr4.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        @Override // com.zepto.hr4.a
        public hr4 a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new g10(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.hr4.a
        public hr4.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.zepto.hr4.a
        public hr4.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.zepto.hr4.a
        public hr4.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.zepto.hr4.a
        public hr4.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.zepto.hr4.a
        public hr4.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.zepto.hr4.a
        public hr4.a g(gr4.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // com.zepto.hr4.a
        public hr4.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public b() {
        }

        public b(hr4 hr4Var) {
            this.a = hr4Var.d();
            this.b = hr4Var.g();
            this.c = hr4Var.b();
            this.d = hr4Var.f();
            this.e = Long.valueOf(hr4Var.c());
            this.f = Long.valueOf(hr4Var.h());
            this.g = hr4Var.e();
        }
    }

    @Override // com.zepto.hr4
    public String b() {
        return this.d;
    }

    @Override // com.zepto.hr4
    public long c() {
        return this.f;
    }

    @Override // com.zepto.hr4
    public String d() {
        return this.b;
    }

    @Override // com.zepto.hr4
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hr4)) {
            return false;
        }
        hr4 hr4Var = (hr4) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(hr4Var.d()) : hr4Var.d() == null) {
            if (this.c.equals(hr4Var.g()) && ((str = this.d) != null ? str.equals(hr4Var.b()) : hr4Var.b() == null) && ((str2 = this.e) != null ? str2.equals(hr4Var.f()) : hr4Var.f() == null) && this.f == hr4Var.c() && this.g == hr4Var.h()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (hr4Var.e() == null) {
                        return true;
                    }
                } else if (str4.equals(hr4Var.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.zepto.hr4
    public String f() {
        return this.e;
    }

    @Override // com.zepto.hr4
    public gr4.a g() {
        return this.c;
    }

    @Override // com.zepto.hr4
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.zepto.hr4
    public hr4.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    public g10(String str, gr4.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
