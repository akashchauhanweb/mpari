package com.zepto;

import com.zepto.fn2;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class an2 extends vo3 {
    public final fn2 a;
    public final ou5 b;
    public final x80 c;
    public final Integer d;

    public static class b {
        public fn2 a;
        public ou5 b;
        public Integer c;

        public an2 a() throws GeneralSecurityException {
            fn2 fn2Var = this.a;
            if (fn2Var == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fn2Var.d() != this.b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.a.g() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.a.g() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new an2(this.a, this.b, b(), this.c);
        }

        public final x80 b() {
            if (this.a.f() == fn2.d.e) {
                return x80.a(new byte[0]);
            }
            if (this.a.f() == fn2.d.d || this.a.f() == fn2.d.c) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            }
            if (this.a.f() == fn2.d.b) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.a.f());
        }

        public b c(Integer num) {
            this.c = num;
            return this;
        }

        public b d(ou5 ou5Var) {
            this.b = ou5Var;
            return this;
        }

        public b e(fn2 fn2Var) {
            this.a = fn2Var;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // com.zepto.vo3
    public x80 a() {
        return this.c;
    }

    @Override // com.zepto.vo3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public fn2 b() {
        return this.a;
    }

    public an2(fn2 fn2Var, ou5 ou5Var, x80 x80Var, Integer num) {
        this.a = fn2Var;
        this.b = ou5Var;
        this.c = x80Var;
        this.d = num;
    }
}
