package com.zepto;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends n0 {
    public static u0 d0(byte[] bArr) throws IOException {
        j0 j0Var = new j0(bArr);
        try {
            u0 u0VarP = j0Var.P();
            if (j0Var.available() == 0) {
                return u0VarP;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract void B(s0 s0Var, boolean z);

    public abstract boolean D();

    public void O(OutputStream outputStream) {
        s0 s0VarA = s0.a(outputStream);
        s0VarA.u(this, true);
        s0VarA.c();
    }

    public void P(OutputStream outputStream, String str) {
        s0 s0VarB = s0.b(outputStream, str);
        s0VarB.u(this, true);
        s0VarB.c();
    }

    public abstract int T(boolean z);

    public final boolean a0(u0 u0Var) {
        return this == u0Var || z(u0Var);
    }

    public u0 e0() {
        return this;
    }

    @Override // com.zepto.n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && z(((a0) obj).m());
    }

    public u0 f0() {
        return this;
    }

    @Override // com.zepto.n0
    public abstract int hashCode();

    @Override // com.zepto.n0, com.zepto.a0
    public final u0 m() {
        return this;
    }

    public abstract boolean z(u0 u0Var);
}
