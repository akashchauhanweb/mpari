package com.zepto;

import com.zepto.bm;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class wl extends vo3 {
    public final bm a;
    public final ou5 b;
    public final x80 c;
    public final Integer d;

    public static class b {
        public bm a;
        public ou5 b;
        public Integer c;

        public wl a() throws GeneralSecurityException {
            bm bmVar = this.a;
            if (bmVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (bmVar.c() != this.b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.a.f() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.a.f() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new wl(this.a, this.b, b(), this.c);
        }

        public final x80 b() {
            if (this.a.e() == bm.c.e) {
                return x80.a(new byte[0]);
            }
            if (this.a.e() == bm.c.d || this.a.e() == bm.c.c) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            }
            if (this.a.e() == bm.c.b) {
                return x80.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.a.e());
        }

        public b c(ou5 ou5Var) {
            this.b = ou5Var;
            return this;
        }

        public b d(Integer num) {
            this.c = num;
            return this;
        }

        public b e(bm bmVar) {
            this.a = bmVar;
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
    public bm b() {
        return this.a;
    }

    public wl(bm bmVar, ou5 ou5Var, x80 x80Var, Integer num) {
        this.a = bmVar;
        this.b = ou5Var;
        this.c = x80Var;
        this.d = num;
    }
}
