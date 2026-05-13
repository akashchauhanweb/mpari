package com.zepto;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ob3 extends x0 {
    public byte[] f;

    public ob3(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.f = bArr;
    }

    private synchronized byte[] s0() {
        return this.f;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        byte[] bArrS0 = s0();
        if (bArrS0 != null) {
            s0Var.o(z, 48, bArrS0);
        } else {
            super.f0().B(s0Var, z);
        }
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        byte[] bArrS0 = s0();
        return bArrS0 != null ? s0.g(z, bArrS0.length) : super.f0().T(z);
    }

    @Override // com.zepto.x0, com.zepto.u0
    public u0 e0() {
        r0();
        return super.e0();
    }

    @Override // com.zepto.x0, com.zepto.u0
    public u0 f0() {
        r0();
        return super.f0();
    }

    @Override // com.zepto.x0, com.zepto.u0, com.zepto.n0
    public int hashCode() {
        r0();
        return super.hashCode();
    }

    @Override // com.zepto.x0, java.lang.Iterable
    public Iterator iterator() {
        r0();
        return super.iterator();
    }

    @Override // com.zepto.x0
    public a0 j0(int i) {
        r0();
        return super.j0(i);
    }

    @Override // com.zepto.x0
    public Enumeration k0() {
        byte[] bArrS0 = s0();
        return bArrS0 != null ? new mb3(bArrS0) : super.k0();
    }

    @Override // com.zepto.x0
    public x m0() {
        return ((x0) f0()).m0();
    }

    @Override // com.zepto.x0
    public e0 n0() {
        return ((x0) f0()).n0();
    }

    @Override // com.zepto.x0
    public q0 o0() {
        return ((x0) f0()).o0();
    }

    @Override // com.zepto.x0
    public z0 p0() {
        return ((x0) f0()).p0();
    }

    public final synchronized void r0() {
        if (this.f != null) {
            j0 j0Var = new j0(this.f, true);
            try {
                b0 b0VarE0 = j0Var.e0();
                j0Var.close();
                this.c = b0VarE0.g();
                this.f = null;
            } catch (IOException e) {
                throw new t0("malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // com.zepto.x0
    public int size() {
        r0();
        return super.size();
    }
}
