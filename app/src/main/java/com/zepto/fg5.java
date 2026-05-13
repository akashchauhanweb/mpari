package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class fg5 extends ni2 {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int[] i = new int[80];
    public int j;

    public fg5() {
        k();
    }

    @Override // com.zepto.wj1
    public int a(byte[] bArr, int i) {
        g();
        vk4.d(this.d, bArr, i);
        vk4.d(this.e, bArr, i + 4);
        vk4.d(this.f, bArr, i + 8);
        vk4.d(this.g, bArr, i + 12);
        vk4.d(this.h, bArr, i + 16);
        k();
        return 20;
    }

    @Override // com.zepto.wj1
    public String b() {
        return "SHA-1";
    }

    @Override // com.zepto.wj1
    public int c() {
        return 20;
    }

    @Override // com.zepto.ni2
    public void h() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iN = this.d;
        int iN2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iL = i5 + ((iN << 5) | (iN >>> 27)) + l(iN2, i3, i4) + this.i[i6] + 1518500249;
            int i8 = (iN2 >>> 2) | (iN2 << 30);
            int iL2 = i4 + ((iL << 5) | (iL >>> 27)) + l(iN, i8, i3) + this.i[i6 + 1] + 1518500249;
            int i9 = (iN >>> 2) | (iN << 30);
            int iL3 = i3 + ((iL2 << 5) | (iL2 >>> 27)) + l(iL, i9, i8) + this.i[i6 + 2] + 1518500249;
            i5 = (iL >>> 2) | (iL << 30);
            int i10 = i6 + 4;
            iN2 = i8 + ((iL3 << 5) | (iL3 >>> 27)) + l(iL2, i5, i9) + this.i[i6 + 3] + 1518500249;
            i4 = (iL2 >>> 2) | (iL2 << 30);
            i6 += 5;
            iN = i9 + ((iN2 << 5) | (iN2 >>> 27)) + l(iL3, i4, i5) + this.i[i10] + 1518500249;
            i3 = (iL3 >>> 2) | (iL3 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iN3 = i5 + ((iN << 5) | (iN >>> 27)) + n(iN2, i3, i4) + this.i[i6] + 1859775393;
            int i12 = (iN2 >>> 2) | (iN2 << 30);
            int iN4 = i4 + ((iN3 << 5) | (iN3 >>> 27)) + n(iN, i12, i3) + this.i[i6 + 1] + 1859775393;
            int i13 = (iN >>> 2) | (iN << 30);
            int iN5 = i3 + ((iN4 << 5) | (iN4 >>> 27)) + n(iN3, i13, i12) + this.i[i6 + 2] + 1859775393;
            i5 = (iN3 >>> 2) | (iN3 << 30);
            int i14 = i6 + 4;
            iN2 = i12 + ((iN5 << 5) | (iN5 >>> 27)) + n(iN4, i5, i13) + this.i[i6 + 3] + 1859775393;
            i4 = (iN4 >>> 2) | (iN4 << 30);
            i6 += 5;
            iN = i13 + ((iN2 << 5) | (iN2 >>> 27)) + n(iN5, i4, i5) + this.i[i14] + 1859775393;
            i3 = (iN5 >>> 2) | (iN5 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iM = i5 + (((((iN << 5) | (iN >>> 27)) + m(iN2, i3, i4)) + this.i[i6]) - 1894007588);
            int iM2 = i4 + (((((iM << 5) | (iM >>> 27)) + m(iN, r2, i3)) + this.i[i6 + 1]) - 1894007588);
            int iM3 = i3 + (((((iM2 << 5) | (iM2 >>> 27)) + m(iM, r1, r2)) + this.i[i6 + 2]) - 1894007588);
            i5 = (iM >>> 2) | (iM << 30);
            int i16 = i6 + 4;
            iN2 = ((iN2 >>> 2) | (iN2 << 30)) + (((((iM3 << 5) | (iM3 >>> 27)) + m(iM2, i5, r1)) + this.i[i6 + 3]) - 1894007588);
            i4 = (iM2 >>> 2) | (iM2 << 30);
            i6 += 5;
            iN = ((iN >>> 2) | (iN << 30)) + (((((iN2 << 5) | (iN2 >>> 27)) + m(iM3, i4, i5)) + this.i[i16]) - 1894007588);
            i3 = (iM3 >>> 2) | (iM3 << 30);
        }
        for (int i17 = 0; i17 <= 3; i17++) {
            int iN6 = i5 + (((((iN << 5) | (iN >>> 27)) + n(iN2, i3, i4)) + this.i[i6]) - 899497514);
            int iN7 = i4 + (((((iN6 << 5) | (iN6 >>> 27)) + n(iN, r2, i3)) + this.i[i6 + 1]) - 899497514);
            int iN8 = i3 + (((((iN7 << 5) | (iN7 >>> 27)) + n(iN6, r1, r2)) + this.i[i6 + 2]) - 899497514);
            i5 = (iN6 >>> 2) | (iN6 << 30);
            int i18 = i6 + 4;
            iN2 = ((iN2 >>> 2) | (iN2 << 30)) + (((((iN8 << 5) | (iN8 >>> 27)) + n(iN7, i5, r1)) + this.i[i6 + 3]) - 899497514);
            i4 = (iN7 >>> 2) | (iN7 << 30);
            i6 += 5;
            iN = ((iN >>> 2) | (iN << 30)) + (((((iN2 << 5) | (iN2 >>> 27)) + n(iN8, i4, i5)) + this.i[i18]) - 899497514);
            i3 = (iN8 >>> 2) | (iN8 << 30);
        }
        this.d += iN;
        this.e += iN2;
        this.f += i3;
        this.g += i4;
        this.h += i5;
        this.j = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.i[i19] = 0;
        }
    }

    @Override // com.zepto.ni2
    public void i(long j) {
        if (this.j > 14) {
            h();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // com.zepto.ni2
    public void j(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.i;
        int i3 = this.j;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 == 16) {
            h();
        }
    }

    @Override // com.zepto.ni2
    public void k() {
        super.k();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.i;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final int l(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    public final int m(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    public final int n(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }
}
