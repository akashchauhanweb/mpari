package com.zepto;

import com.zepto.mn;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class in extends tl {
    public final mn a;
    public final ou5 b;
    public final x80 c;
    public final Integer d;

    public static class b {
        public mn a;
        public ou5 b;
        public Integer c;

        public in a() throws GeneralSecurityException {
            mn mnVar = this.a;
            if (mnVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (mnVar.b() != this.b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.a.d() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.a.d() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new in(this.a, this.b, b(), this.c);
        }

        public final x80 b() {
            if (this.a.c() == mn.c.d) {
                return x80.a(new byte[0]);
            }
            if (this.a.c() == mn.c.c) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            }
            if (this.a.c() == mn.c.b) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.a.c());
        }

        public b c(Integer num) {
            this.c = num;
            return this;
        }

        public b d(ou5 ou5Var) {
            this.b = ou5Var;
            return this;
        }

        public b e(mn mnVar) {
            this.a = mnVar;
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

    public in(mn mnVar, ou5 ou5Var, x80 x80Var, Integer num) {
        this.a = mnVar;
        this.b = ou5Var;
        this.c = x80Var;
        this.d = num;
    }
}
