package com.zepto;

import com.zepto.zz2;

/* JADX INFO: loaded from: classes.dex */
public final class y00 extends zz2 {
    public final String a;
    public final String b;
    public final String c;
    public final ki6 d;
    public final zz2.b e;

    public static final class b extends zz2.a {
        public String a;
        public String b;
        public String c;
        public ki6 d;
        public zz2.b e;

        @Override // com.zepto.zz2.a
        public zz2 a() {
            return new y00(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // com.zepto.zz2.a
        public zz2.a b(ki6 ki6Var) {
            this.d = ki6Var;
            return this;
        }

        @Override // com.zepto.zz2.a
        public zz2.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.zepto.zz2.a
        public zz2.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.zepto.zz2.a
        public zz2.a e(zz2.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // com.zepto.zz2.a
        public zz2.a f(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // com.zepto.zz2
    public ki6 b() {
        return this.d;
    }

    @Override // com.zepto.zz2
    public String c() {
        return this.b;
    }

    @Override // com.zepto.zz2
    public String d() {
        return this.c;
    }

    @Override // com.zepto.zz2
    public zz2.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zz2)) {
            return false;
        }
        zz2 zz2Var = (zz2) obj;
        String str = this.a;
        if (str != null ? str.equals(zz2Var.f()) : zz2Var.f() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(zz2Var.c()) : zz2Var.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(zz2Var.d()) : zz2Var.d() == null) {
                    ki6 ki6Var = this.d;
                    if (ki6Var != null ? ki6Var.equals(zz2Var.b()) : zz2Var.b() == null) {
                        zz2.b bVar = this.e;
                        if (bVar == null) {
                            if (zz2Var.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(zz2Var.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.zepto.zz2
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ki6 ki6Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (ki6Var == null ? 0 : ki6Var.hashCode())) * 1000003;
        zz2.b bVar = this.e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }

    public y00(String str, String str2, String str3, ki6 ki6Var, zz2.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ki6Var;
        this.e = bVar;
    }
}
