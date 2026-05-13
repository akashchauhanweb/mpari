package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class hg5 extends ni2 {
    public static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int[] l = new int[64];
    public int m;

    public hg5() {
        k();
    }

    private static int l(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    private static int m(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    private static int n(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private static int o(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private static int p(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private static int q(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    @Override // com.zepto.wj1
    public int a(byte[] bArr, int i) {
        g();
        vk4.d(this.d, bArr, i);
        vk4.d(this.e, bArr, i + 4);
        vk4.d(this.f, bArr, i + 8);
        vk4.d(this.g, bArr, i + 12);
        vk4.d(this.h, bArr, i + 16);
        vk4.d(this.i, bArr, i + 20);
        vk4.d(this.j, bArr, i + 24);
        vk4.d(this.k, bArr, i + 28);
        k();
        return 32;
    }

    @Override // com.zepto.wj1
    public String b() {
        return "SHA-256";
    }

    @Override // com.zepto.wj1
    public int c() {
        return 32;
    }

    @Override // com.zepto.ni2
    public void h() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.l;
            int iQ = q(iArr[i - 2]);
            int[] iArr2 = this.l;
            iArr[i] = iQ + iArr2[i - 7] + p(iArr2[i - 15]) + this.l[i - 16];
        }
        int iN = this.d;
        int iN2 = this.e;
        int iN3 = this.f;
        int iN4 = this.g;
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = this.k;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iO = o(i2) + l(i2, i3, i4);
            int[] iArr3 = n;
            int i8 = i5 + iO + iArr3[i6] + this.l[i6];
            int i9 = iN4 + i8;
            int iN5 = i8 + n(iN) + m(iN, iN2, iN3);
            int i10 = i6 + 1;
            int iO2 = i4 + o(i9) + l(i9, i2, i3) + iArr3[i10] + this.l[i10];
            int i11 = iN3 + iO2;
            int iN6 = iO2 + n(iN5) + m(iN5, iN, iN2);
            int i12 = i6 + 2;
            int iO3 = i3 + o(i11) + l(i11, i9, i2) + iArr3[i12] + this.l[i12];
            int i13 = iN2 + iO3;
            int iN7 = iO3 + n(iN6) + m(iN6, iN5, iN);
            int i14 = i6 + 3;
            int iO4 = i2 + o(i13) + l(i13, i11, i9) + iArr3[i14] + this.l[i14];
            int i15 = iN + iO4;
            int iN8 = iO4 + n(iN7) + m(iN7, iN6, iN5);
            int i16 = i6 + 4;
            int iO5 = i9 + o(i15) + l(i15, i13, i11) + iArr3[i16] + this.l[i16];
            i5 = iN5 + iO5;
            iN4 = iO5 + n(iN8) + m(iN8, iN7, iN6);
            int i17 = i6 + 5;
            int iO6 = i11 + o(i5) + l(i5, i15, i13) + iArr3[i17] + this.l[i17];
            i4 = iN6 + iO6;
            iN3 = iO6 + n(iN4) + m(iN4, iN8, iN7);
            int i18 = i6 + 6;
            int iO7 = i13 + o(i4) + l(i4, i5, i15) + iArr3[i18] + this.l[i18];
            i3 = iN7 + iO7;
            iN2 = iO7 + n(iN3) + m(iN3, iN4, iN8);
            int i19 = i6 + 7;
            int iO8 = i15 + o(i3) + l(i3, i4, i5) + iArr3[i19] + this.l[i19];
            i2 = iN8 + iO8;
            iN = iO8 + n(iN2) + m(iN2, iN3, iN4);
            i6 += 8;
        }
        this.d += iN;
        this.e += iN2;
        this.f += iN3;
        this.g += iN4;
        this.h += i2;
        this.i += i3;
        this.j += i4;
        this.k += i5;
        this.m = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.l[i20] = 0;
        }
    }

    @Override // com.zepto.ni2
    public void i(long j) {
        if (this.m > 14) {
            h();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // com.zepto.ni2
    public void j(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.l;
        int i3 = this.m;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.m = i4;
        if (i4 == 16) {
            h();
        }
    }

    @Override // com.zepto.ni2
    public void k() {
        super.k();
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
