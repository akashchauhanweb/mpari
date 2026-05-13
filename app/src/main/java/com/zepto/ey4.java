package com.zepto;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class ey4 {
    public static p80 b(dy4 dy4Var, int i, int i2) {
        byte b;
        p80 p80VarC = dy4Var.c();
        int iF = p80VarC.f();
        int iD = p80VarC.d();
        int i3 = iF + 8;
        int i4 = iD + 8;
        int iMax = Math.max(i, i3);
        int iMax2 = Math.max(i2, i4);
        int iMin = Math.min(iMax / i3, iMax2 / i4);
        int i5 = iF * iMin;
        int i6 = (iMax - i5) / 2;
        int i7 = iD * iMin;
        int i8 = (iMax2 - i7) / 2;
        p80 p80Var = new p80(iMax2, iMax);
        byte[][] bArrC = p80Var.c();
        byte[] bArr = new byte[iMax];
        int i9 = 0;
        while (true) {
            b = -1;
            if (i9 >= i8) {
                break;
            }
            c(bArrC[i9], (byte) -1);
            i9++;
        }
        byte[][] bArrC2 = p80VarC.c();
        int i10 = 0;
        while (i10 < iD) {
            for (int i11 = 0; i11 < i6; i11++) {
                bArr[i11] = b;
            }
            int i12 = i6;
            int i13 = 0;
            while (i13 < iF) {
                byte[][] bArr2 = bArrC2;
                byte b2 = bArrC2[i10][i13] == 1 ? (byte) 0 : (byte) -1;
                for (int i14 = 0; i14 < iMin; i14++) {
                    bArr[i12 + i14] = b2;
                }
                i12 += iMin;
                i13++;
                bArrC2 = bArr2;
            }
            byte[][] bArr3 = bArrC2;
            for (int i15 = i6 + i5; i15 < iMax; i15++) {
                bArr[i15] = -1;
            }
            int i16 = (i10 * iMin) + i8;
            int i17 = 0;
            while (i17 < iMin) {
                System.arraycopy(bArr, 0, bArrC[i16 + i17], 0, iMax);
                i17++;
                i16 = i16;
            }
            i10++;
            bArrC2 = bArr3;
            b = -1;
        }
        for (int i18 = i8 + i7; i18 < iMax2; i18++) {
            c(bArrC[i18], (byte) -1);
        }
        return p80Var;
    }

    public static void c(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = b;
        }
    }

    public p80 a(String str, z30 z30Var, int i, int i2, Hashtable hashtable) throws oz7 {
        z22 z22Var;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (z30Var != z30.b) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can only encode QR_CODE, but got ");
            stringBuffer.append(z30Var);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        if (i < 0 || i2 < 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Requested dimensions are too small: ");
            stringBuffer2.append(i);
            stringBuffer2.append('x');
            stringBuffer2.append(i2);
            throw new IllegalArgumentException(stringBuffer2.toString());
        }
        z22 z22Var2 = z22.d;
        if (hashtable != null && (z22Var = (z22) hashtable.get(v12.a)) != null) {
            z22Var2 = z22Var;
        }
        dy4 dy4Var = new dy4();
        y12.k(str, z22Var2, dy4Var);
        return b(dy4Var, i, i2);
    }
}
