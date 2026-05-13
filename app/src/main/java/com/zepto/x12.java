package com.zepto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x12 {
    public final c22 a;
    public final byte[] b;

    public x12(c22 c22Var, byte[] bArr) {
        if (c22Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = c22Var;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public c22 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x12)) {
            return false;
        }
        x12 x12Var = (x12) obj;
        if (this.a.equals(x12Var.a)) {
            return Arrays.equals(this.b, x12Var.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
