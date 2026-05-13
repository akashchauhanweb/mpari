package com.zepto;

import com.zepto.en;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class an extends tl {
    public final en a;
    public final ou5 b;
    public final x80 c;
    public final Integer d;

    public static class b {
        public en a;
        public ou5 b;
        public Integer c;

        public an a() throws GeneralSecurityException {
            en enVar = this.a;
            if (enVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (enVar.c() != this.b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.a.f() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.a.f() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new an(this.a, this.b, b(), this.c);
        }

        public final x80 b() {
            if (this.a.e() == en.c.d) {
                return x80.a(new byte[0]);
            }
            if (this.a.e() == en.c.c) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            }
            if (this.a.e() == en.c.b) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.a.e());
        }

        public b c(Integer num) {
            this.c = num;
            return this;
        }

        public b d(ou5 ou5Var) {
            this.b = ou5Var;
            return this;
        }

        public b e(en enVar) {
            this.a = enVar;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public an(en enVar, ou5 ou5Var, x80 x80Var, Integer num) {
        this.a = enVar;
        this.b = ou5Var;
        this.c = x80Var;
        this.d = num;
    }
}
