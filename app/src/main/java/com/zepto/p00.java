package com.zepto;

import com.zepto.t30;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p00 extends t30 {
    public final Iterable a;
    public final byte[] b;

    public static final class b extends t30.a {
        public Iterable a;
        public byte[] b;

        @Override // com.zepto.t30.a
        public t30 a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new p00(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.t30.a
        public t30.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable;
            return this;
        }

        @Override // com.zepto.t30.a
        public t30.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // com.zepto.t30
    public Iterable b() {
        return this.a;
    }

    @Override // com.zepto.t30
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj;
        if (this.a.equals(t30Var.b())) {
            if (Arrays.equals(this.b, t30Var instanceof p00 ? ((p00) t30Var).b : t30Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public p00(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
