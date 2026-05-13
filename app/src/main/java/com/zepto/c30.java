package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class c30 extends x {
    public final int g;
    public final x[] h;

    public c30(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    public static byte[] m0(x[] xVarArr) {
        int length = xVarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return xVarArr[0].c;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = xVarArr[i2].c;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = xVarArr[i].c;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i3 = 1;
        for (x xVar : xVarArr) {
            byte[] bArr4 = xVar.c;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i3, length3);
            i3 += length3;
        }
        return bArr3;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        if (!D()) {
            byte[] bArr = this.c;
            p51.n0(s0Var, z, bArr, 0, bArr.length);
            return;
        }
        s0Var.s(z, 35);
        s0Var.i(128);
        x[] xVarArr = this.h;
        if (xVarArr != null) {
            s0Var.v(xVarArr);
        } else {
            byte[] bArr2 = this.c;
            if (bArr2.length >= 2) {
                byte b = bArr2[0];
                int length = bArr2.length;
                int i = length - 1;
                int i2 = this.g - 1;
                while (i > i2) {
                    p51.m0(s0Var, true, (byte) 0, this.c, length - i, i2);
                    i -= i2;
                }
                p51.m0(s0Var, true, b, this.c, length - i, i);
            }
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
            return p51.o0(z, this.c.length);
        }
        int iT = z ? 4 : 3;
        if (this.h == null) {
            byte[] bArr = this.c;
            if (bArr.length < 2) {
                return iT;
            }
            int length = bArr.length - 2;
            int i = this.g;
            int i2 = length / (i - 1);
            return iT + (p51.o0(true, i) * i2) + p51.o0(true, this.c.length - (i2 * (this.g - 1)));
        }
        int i3 = 0;
        while (true) {
            x[] xVarArr = this.h;
            if (i3 >= xVarArr.length) {
                return iT;
            }
            iT += xVarArr[i3].T(true);
            i3++;
        }
    }

    public c30(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.h = null;
        this.g = i2;
    }

    public c30(x[] xVarArr) {
        this(xVarArr, 1000);
    }

    public c30(x[] xVarArr, int i) {
        super(m0(xVarArr), false);
        this.h = xVarArr;
        this.g = i;
    }
}
