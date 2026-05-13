package com.zepto;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mn extends ul {
    public final int a;
    public final c b;

    public static final class b {
        public Integer a;
        public c b;

        public mn a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.b != null) {
                return new mn(num.intValue(), this.b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.a = Integer.valueOf(i);
            return this;
        }

        public b c(c cVar) {
            this.b = cVar;
            return this;
        }

        public b() {
            this.a = null;
            this.b = c.d;
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
        return this.a;
    }

    public c c() {
        return this.b;
    }

    public boolean d() {
        return this.b != c.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return mnVar.b() == b() && mnVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.b + ", " + this.a + "-byte key)";
    }

    public mn(int i, c cVar) {
        this.a = i;
        this.b = cVar;
    }
}
