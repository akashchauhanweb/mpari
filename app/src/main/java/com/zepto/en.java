package com.zepto;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class en extends ul {
    public final int a;
    public final int b;
    public final int c;
    public final c d;

    public static final class b {
        public Integer a;
        public Integer b;
        public Integer c;
        public c d;

        public en a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.c != null) {
                return new en(num.intValue(), this.b.intValue(), this.c.intValue(), this.d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i) throws GeneralSecurityException {
            if (i <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i)));
            }
            this.b = Integer.valueOf(i);
            return this;
        }

        public b c(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.a = Integer.valueOf(i);
            return this;
        }

        public b d(int i) throws GeneralSecurityException {
            if (i != 12 && i != 13 && i != 14 && i != 15 && i != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i)));
            }
            this.c = Integer.valueOf(i);
            return this;
        }

        public b e(c cVar) {
            this.d = cVar;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = c.d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");
        public static final c c = new c("CRUNCHY");
        public static final c d = new c("NO_PREFIX");
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
        return this.c;
    }

    public c e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return enVar.c() == c() && enVar.b() == b() && enVar.d() == d() && enVar.e() == e();
    }

    public boolean f() {
        return this.d != c.d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.d + ", " + this.b + "-byte IV, " + this.c + "-byte tag, and " + this.a + "-byte key)";
    }

    public en(int i, int i2, int i3, c cVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = cVar;
    }
}
