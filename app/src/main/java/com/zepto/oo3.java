package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class oo3 extends ni2 {
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h = new int[16];
    public int i;

    public oo3() {
        k();
    }

    @Override // com.zepto.wj1
    public int a(byte[] bArr, int i) {
        g();
        q(this.d, bArr, i);
        q(this.e, bArr, i + 4);
        q(this.f, bArr, i + 8);
        q(this.g, bArr, i + 12);
        k();
        return 16;
    }

    @Override // com.zepto.wj1
    public String b() {
        return "MD5";
    }

    @Override // com.zepto.wj1
    public int c() {
        return 16;
    }

    @Override // com.zepto.ni2
    public void h() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int iP = p(((i + l(i2, i3, i4)) + this.h[0]) - 680876936, 7) + i2;
        int iP2 = p(((i4 + l(iP, i2, i3)) + this.h[1]) - 389564586, 12) + iP;
        int iP3 = p(i3 + l(iP2, iP, i2) + this.h[2] + 606105819, 17) + iP2;
        int iP4 = p(((i2 + l(iP3, iP2, iP)) + this.h[3]) - 1044525330, 22) + iP3;
        int iP5 = p(((iP + l(iP4, iP3, iP2)) + this.h[4]) - 176418897, 7) + iP4;
        int iP6 = p(iP2 + l(iP5, iP4, iP3) + this.h[5] + 1200080426, 12) + iP5;
        int iP7 = p(((iP3 + l(iP6, iP5, iP4)) + this.h[6]) - 1473231341, 17) + iP6;
        int iP8 = p(((iP4 + l(iP7, iP6, iP5)) + this.h[7]) - 45705983, 22) + iP7;
        int iP9 = p(iP5 + l(iP8, iP7, iP6) + this.h[8] + 1770035416, 7) + iP8;
        int iP10 = p(((iP6 + l(iP9, iP8, iP7)) + this.h[9]) - 1958414417, 12) + iP9;
        int iP11 = p(((iP7 + l(iP10, iP9, iP8)) + this.h[10]) - 42063, 17) + iP10;
        int iP12 = p(((iP8 + l(iP11, iP10, iP9)) + this.h[11]) - 1990404162, 22) + iP11;
        int iP13 = p(iP9 + l(iP12, iP11, iP10) + this.h[12] + 1804603682, 7) + iP12;
        int iP14 = p(((iP10 + l(iP13, iP12, iP11)) + this.h[13]) - 40341101, 12) + iP13;
        int iP15 = p(((iP11 + l(iP14, iP13, iP12)) + this.h[14]) - 1502002290, 17) + iP14;
        int iP16 = p(iP12 + l(iP15, iP14, iP13) + this.h[15] + 1236535329, 22) + iP15;
        int iP17 = p(((iP13 + m(iP16, iP15, iP14)) + this.h[1]) - 165796510, 5) + iP16;
        int iP18 = p(((iP14 + m(iP17, iP16, iP15)) + this.h[6]) - 1069501632, 9) + iP17;
        int iP19 = p(iP15 + m(iP18, iP17, iP16) + this.h[11] + 643717713, 14) + iP18;
        int iP20 = p(((iP16 + m(iP19, iP18, iP17)) + this.h[0]) - 373897302, 20) + iP19;
        int iP21 = p(((iP17 + m(iP20, iP19, iP18)) + this.h[5]) - 701558691, 5) + iP20;
        int iP22 = p(iP18 + m(iP21, iP20, iP19) + this.h[10] + 38016083, 9) + iP21;
        int iP23 = p(((iP19 + m(iP22, iP21, iP20)) + this.h[15]) - 660478335, 14) + iP22;
        int iP24 = p(((iP20 + m(iP23, iP22, iP21)) + this.h[4]) - 405537848, 20) + iP23;
        int iP25 = p(iP21 + m(iP24, iP23, iP22) + this.h[9] + 568446438, 5) + iP24;
        int iP26 = p(((iP22 + m(iP25, iP24, iP23)) + this.h[14]) - 1019803690, 9) + iP25;
        int iP27 = p(((iP23 + m(iP26, iP25, iP24)) + this.h[3]) - 187363961, 14) + iP26;
        int iP28 = p(iP24 + m(iP27, iP26, iP25) + this.h[8] + 1163531501, 20) + iP27;
        int iP29 = p(((iP25 + m(iP28, iP27, iP26)) + this.h[13]) - 1444681467, 5) + iP28;
        int iP30 = p(((iP26 + m(iP29, iP28, iP27)) + this.h[2]) - 51403784, 9) + iP29;
        int iP31 = p(iP27 + m(iP30, iP29, iP28) + this.h[7] + 1735328473, 14) + iP30;
        int iP32 = p(((iP28 + m(iP31, iP30, iP29)) + this.h[12]) - 1926607734, 20) + iP31;
        int iP33 = p(((iP29 + n(iP32, iP31, iP30)) + this.h[5]) - 378558, 4) + iP32;
        int iP34 = p(((iP30 + n(iP33, iP32, iP31)) + this.h[8]) - 2022574463, 11) + iP33;
        int iP35 = p(iP31 + n(iP34, iP33, iP32) + this.h[11] + 1839030562, 16) + iP34;
        int iP36 = p(((iP32 + n(iP35, iP34, iP33)) + this.h[14]) - 35309556, 23) + iP35;
        int iP37 = p(((iP33 + n(iP36, iP35, iP34)) + this.h[1]) - 1530992060, 4) + iP36;
        int iP38 = p(iP34 + n(iP37, iP36, iP35) + this.h[4] + 1272893353, 11) + iP37;
        int iP39 = p(((iP35 + n(iP38, iP37, iP36)) + this.h[7]) - 155497632, 16) + iP38;
        int iP40 = p(((iP36 + n(iP39, iP38, iP37)) + this.h[10]) - 1094730640, 23) + iP39;
        int iP41 = p(iP37 + n(iP40, iP39, iP38) + this.h[13] + 681279174, 4) + iP40;
        int iP42 = p(((iP38 + n(iP41, iP40, iP39)) + this.h[0]) - 358537222, 11) + iP41;
        int iP43 = p(((iP39 + n(iP42, iP41, iP40)) + this.h[3]) - 722521979, 16) + iP42;
        int iP44 = p(iP40 + n(iP43, iP42, iP41) + this.h[6] + 76029189, 23) + iP43;
        int iP45 = p(((iP41 + n(iP44, iP43, iP42)) + this.h[9]) - 640364487, 4) + iP44;
        int iP46 = p(((iP42 + n(iP45, iP44, iP43)) + this.h[12]) - 421815835, 11) + iP45;
        int iP47 = p(iP43 + n(iP46, iP45, iP44) + this.h[15] + 530742520, 16) + iP46;
        int iP48 = p(((iP44 + n(iP47, iP46, iP45)) + this.h[2]) - 995338651, 23) + iP47;
        int iP49 = p(((iP45 + o(iP48, iP47, iP46)) + this.h[0]) - 198630844, 6) + iP48;
        int iP50 = p(iP46 + o(iP49, iP48, iP47) + this.h[7] + 1126891415, 10) + iP49;
        int iP51 = p(((iP47 + o(iP50, iP49, iP48)) + this.h[14]) - 1416354905, 15) + iP50;
        int iP52 = p(((iP48 + o(iP51, iP50, iP49)) + this.h[5]) - 57434055, 21) + iP51;
        int iP53 = p(iP49 + o(iP52, iP51, iP50) + this.h[12] + 1700485571, 6) + iP52;
        int iP54 = p(((iP50 + o(iP53, iP52, iP51)) + this.h[3]) - 1894986606, 10) + iP53;
        int iP55 = p(((iP51 + o(iP54, iP53, iP52)) + this.h[10]) - 1051523, 15) + iP54;
        int iP56 = p(((iP52 + o(iP55, iP54, iP53)) + this.h[1]) - 2054922799, 21) + iP55;
        int iP57 = p(iP53 + o(iP56, iP55, iP54) + this.h[8] + 1873313359, 6) + iP56;
        int iP58 = p(((iP54 + o(iP57, iP56, iP55)) + this.h[15]) - 30611744, 10) + iP57;
        int iP59 = p(((iP55 + o(iP58, iP57, iP56)) + this.h[6]) - 1560198380, 15) + iP58;
        int iP60 = p(iP56 + o(iP59, iP58, iP57) + this.h[13] + 1309151649, 21) + iP59;
        int iP61 = p(((iP57 + o(iP60, iP59, iP58)) + this.h[4]) - 145523070, 6) + iP60;
        int iP62 = p(((iP58 + o(iP61, iP60, iP59)) + this.h[11]) - 1120210379, 10) + iP61;
        int iP63 = p(iP59 + o(iP62, iP61, iP60) + this.h[2] + 718787259, 15) + iP62;
        int iP64 = p(((iP60 + o(iP63, iP62, iP61)) + this.h[9]) - 343485551, 21) + iP63;
        this.d += iP61;
        this.e += iP64;
        this.f += iP63;
        this.g += iP62;
        this.i = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // com.zepto.ni2
    public void i(long j) {
        if (this.i > 14) {
            h();
        }
        int[] iArr = this.h;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // com.zepto.ni2
    public void j(byte[] bArr, int i) {
        int[] iArr = this.h;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        iArr[i2] = ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        if (i3 == 16) {
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
        this.i = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.h;
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
        return (i & i3) | (i2 & (~i3));
    }

    public final int n(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public final int o(int i, int i2, int i3) {
        return (i | (~i3)) ^ i2;
    }

    public final int p(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public final void q(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }
}
