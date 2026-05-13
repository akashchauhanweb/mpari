package com.zepto;

import java.io.IOException;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class q41 extends x {
    public q41(a0 a0Var) {
        super(a0Var.m().w("DER"), 0);
    }

    public static q41 m0(x xVar) {
        return (q41) xVar.e0();
    }

    public static q41 n0(q0 q0Var) {
        return new q41(q0Var.j0(), true);
    }

    public static q41 o0(e1 e1Var, boolean z) {
        u0 u0VarO0 = e1Var.o0();
        return (z || (u0VarO0 instanceof q41)) ? p0(u0VarO0) : n0(q0.i0(u0VarO0));
    }

    public static q41 p0(Object obj) {
        if (obj == null || (obj instanceof q41)) {
            return (q41) obj;
        }
        if (obj instanceof x) {
            return m0((x) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return m0((x) u0.d0((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        byte[] bArr = this.c;
        int i = bArr[0] & UByte.MAX_VALUE;
        int length = bArr.length - 1;
        byte b = bArr[length];
        byte b2 = (byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & b);
        if (b == b2) {
            s0Var.o(z, 3, bArr);
        } else {
            s0Var.q(z, 3, bArr, 0, length, b2);
        }
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.x, com.zepto.u0
    public u0 e0() {
        return this;
    }

    @Override // com.zepto.x, com.zepto.u0
    public u0 f0() {
        return this;
    }

    public q41(byte[] bArr) {
        this(bArr, 0);
    }

    public q41(byte[] bArr, int i) {
        super(bArr, i);
    }

    public q41(byte[] bArr, boolean z) {
        super(bArr, z);
    }
}
