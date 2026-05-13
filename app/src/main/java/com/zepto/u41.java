package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class u41 extends g0 {
    public u41(byte[] bArr) {
        super(bArr);
    }

    @Override // com.zepto.g0, com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 24, l0());
    }

    @Override // com.zepto.g0, com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, l0().length);
    }

    @Override // com.zepto.g0, com.zepto.u0
    public u0 e0() {
        return this;
    }

    @Override // com.zepto.g0, com.zepto.u0
    public u0 f0() {
        return this;
    }

    public final byte[] l0() {
        byte[] bArr = this.c;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!i0()) {
            byte[] bArr2 = this.c;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(i86.d("0000Z"), 0, bArr3, this.c.length - 1, 5);
            return bArr3;
        }
        if (!j0()) {
            byte[] bArr4 = this.c;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(i86.d("00Z"), 0, bArr5, this.c.length - 1, 3);
            return bArr5;
        }
        if (!h0()) {
            return this.c;
        }
        int length = this.c.length - 2;
        while (length > 0 && this.c[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.c;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i);
        bArr8[i] = 90;
        return bArr8;
    }
}
