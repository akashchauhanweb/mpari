package com.zepto;

import java.math.BigInteger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class c0 extends u0 {
    public static final j1 f = new a(c0.class, 10);
    public static final c0[] g = new c0[12];
    public final byte[] c;
    public final int e;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return c0.g0(z41Var.j0(), false);
        }
    }

    public c0(byte[] bArr, boolean z) {
        if (k0.n0(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & ByteCompanionObject.MIN_VALUE) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.c = z ? wx.d(bArr) : bArr;
        this.e = k0.q0(bArr);
    }

    public static c0 g0(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new c0(bArr, z);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & UByte.MAX_VALUE;
        c0[] c0VarArr = g;
        if (i >= c0VarArr.length) {
            return new c0(bArr, z);
        }
        c0 c0Var = c0VarArr[i];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(bArr, z);
        c0VarArr[i] = c0Var2;
        return c0Var2;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 10, this.c);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    public BigInteger h0() {
        return new BigInteger(this.c);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return wx.k(this.c);
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof c0) {
            return wx.a(this.c, ((c0) u0Var).c);
        }
        return false;
    }
}
