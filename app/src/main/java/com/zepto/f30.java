package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class f30 extends q0 {
    public final int g;
    public final q0[] h;

    public f30(byte[] bArr) {
        this(bArr, 1000);
    }

    public static byte[] k0(q0[] q0VarArr) {
        int length = q0VarArr.length;
        if (length == 0) {
            return q0.f;
        }
        if (length == 1) {
            return q0VarArr[0].c;
        }
        int length2 = 0;
        for (q0 q0Var : q0VarArr) {
            length2 += q0Var.c.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (q0 q0Var2 : q0VarArr) {
            byte[] bArr2 = q0Var2.c;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        if (!D()) {
            byte[] bArr = this.c;
            z41.k0(s0Var, z, bArr, 0, bArr.length);
            return;
        }
        s0Var.s(z, 36);
        s0Var.i(128);
        q0[] q0VarArr = this.h;
        if (q0VarArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = this.c;
                if (i >= bArr2.length) {
                    break;
                }
                int iMin = Math.min(bArr2.length - i, this.g);
                z41.k0(s0Var, true, this.c, i, iMin);
                i += iMin;
            }
        } else {
            s0Var.v(q0VarArr);
        }
        s0Var.i(0);
        s0Var.i(0);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return this.h != null || this.c.length > this.g;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        if (!D()) {
            return z41.l0(z, this.c.length);
        }
        int iT = z ? 4 : 3;
        if (this.h == null) {
            int length = this.c.length;
            int i = this.g;
            int i2 = length / i;
            int iL0 = iT + (z41.l0(true, i) * i2);
            int length2 = this.c.length - (i2 * this.g);
            return length2 > 0 ? iL0 + z41.l0(true, length2) : iL0;
        }
        int i3 = 0;
        while (true) {
            q0[] q0VarArr = this.h;
            if (i3 >= q0VarArr.length) {
                return iT;
            }
            iT += q0VarArr[i3].T(true);
            i3++;
        }
    }

    public f30(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    public f30(byte[] bArr, q0[] q0VarArr, int i) {
        super(bArr);
        this.h = q0VarArr;
        this.g = i;
    }

    public f30(q0[] q0VarArr) {
        this(q0VarArr, 1000);
    }

    public f30(q0[] q0VarArr, int i) {
        this(k0(q0VarArr), q0VarArr, i);
    }
}
