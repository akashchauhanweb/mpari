package com.zepto;

import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class n60 {
    public int a = 0;
    public byte[] b = new byte[32];

    public void a(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Bad bit");
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            d(0);
            this.a -= 8;
        }
        byte[] bArr = this.b;
        int i3 = this.a;
        int i4 = i3 >> 3;
        bArr[i4] = (byte) ((i << (7 - i2)) | bArr[i4]);
        this.a = i3 + 1;
    }

    public void b(n60 n60Var) {
        int iG = n60Var.g();
        for (int i = 0; i < iG; i++) {
            a(n60Var.e(i));
        }
    }

    public void c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        while (i2 > 0) {
            if ((this.a & 7) != 0 || i2 < 8) {
                a((i >> (i2 - 1)) & 1);
                i2--;
            } else {
                d((i >> (i2 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                i2 -= 8;
            }
        }
    }

    public final void d(int i) {
        int i2 = this.a >> 3;
        byte[] bArr = this.b;
        if (i2 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length << 1];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.b = bArr2;
        }
        byte[] bArr3 = this.b;
        int i3 = this.a;
        bArr3[i3 >> 3] = (byte) i;
        this.a = i3 + 8;
    }

    public int e(int i) {
        if (i >= 0 && i < this.a) {
            return ((this.b[i >> 3] & UByte.MAX_VALUE) >> (7 - (i & 7))) & 1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bad index: ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public byte[] f() {
        return this.b;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return (this.a + 7) >> 3;
    }

    public void i(n60 n60Var) {
        if (this.a != n60Var.g()) {
            throw new IllegalArgumentException("BitVector sizes don't match");
        }
        int i = (this.a + 7) >> 3;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = this.b;
            bArr[i2] = (byte) (bArr[i2] ^ n60Var.b[i2]);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.a);
        for (int i = 0; i < this.a; i++) {
            if (e(i) == 0) {
                stringBuffer.append('0');
            } else {
                if (e(i) != 1) {
                    throw new IllegalArgumentException("Byte isn't 0 or 1");
                }
                stringBuffer.append('1');
            }
        }
        return stringBuffer.toString();
    }
}
