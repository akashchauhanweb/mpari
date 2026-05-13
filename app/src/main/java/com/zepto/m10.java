package com.zepto;

import com.zepto.ki6;

/* JADX INFO: loaded from: classes.dex */
public final class m10 extends ki6 {
    public final String a;
    public final long b;
    public final ki6.b c;

    public static final class b extends ki6.a {
        public String a;
        public Long b;
        public ki6.b c;

        @Override // com.zepto.ki6.a
        public ki6 a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new m10(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.ki6.a
        public ki6.a b(ki6.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.zepto.ki6.a
        public ki6.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.zepto.ki6.a
        public ki6.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.zepto.ki6
    public ki6.b b() {
        return this.c;
    }

    @Override // com.zepto.ki6
    public String c() {
        return this.a;
    }

    @Override // com.zepto.ki6
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ki6)) {
            return false;
        }
        ki6 ki6Var = (ki6) obj;
        String str = this.a;
        if (str != null ? str.equals(ki6Var.c()) : ki6Var.c() == null) {
            if (this.b == ki6Var.d()) {
                ki6.b bVar = this.c;
                if (bVar == null) {
                    if (ki6Var.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(ki6Var.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ki6.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    public m10(String str, long j, ki6.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }
}
