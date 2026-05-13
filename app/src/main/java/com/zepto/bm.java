package com.zepto;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bm extends wo3 {
    public final int a;
    public final int b;
    public final c c;

    public static final class b {
        public Integer a;
        public Integer b;
        public c c;

        public bm a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.c != null) {
                return new bm(num.intValue(), this.b.intValue(), this.c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
            }
            this.a = Integer.valueOf(i);
            return this;
        }

        public b c(int i) throws GeneralSecurityException {
            if (i >= 10 && 16 >= i) {
                this.b = Integer.valueOf(i);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }

        public b d(c cVar) {
            this.c = cVar;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = c.e;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");
        public static final c c = new c("CRUNCHY");
        public static final c d = new c("LEGACY");
        public static final c e = new c("NO_PREFIX");
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        c cVar = this.c;
        if (cVar == c.e) {
            return b();
        }
        if (cVar != c.b && cVar != c.c && cVar != c.d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public c e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return bmVar.c() == c() && bmVar.d() == d() && bmVar.e() == e();
    }

    public boolean f() {
        return this.c != c.e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.c + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }

    public bm(int i, int i2, c cVar) {
        this.a = i;
        this.b = i2;
        this.c = cVar;
    }
}
