package com.zepto;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class em2 implements z12 {
    public final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public final byte[] b = new byte[128];

    public em2() {
        f();
    }

    private static boolean e(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // com.zepto.z12
    public int a(int i) {
        return i * 2;
    }

    @Override // com.zepto.z12
    public int b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(36, i3);
            outputStream.write(bArr2, 0, d(bArr, i, iMin, bArr2, 0));
            i += iMin;
            i3 -= iMin;
        }
        return i2 * 2;
    }

    @Override // com.zepto.z12
    public int c(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[36];
        int i3 = i2 + i;
        while (i3 > i && e((char) bArr[i3 - 1])) {
            i3--;
        }
        int i4 = 0;
        int i5 = 0;
        while (i < i3) {
            while (i < i3 && e((char) bArr[i])) {
                i++;
            }
            int i6 = i + 1;
            byte b = this.b[bArr[i]];
            while (i6 < i3 && e((char) bArr[i6])) {
                i6++;
            }
            int i7 = i6 + 1;
            byte b2 = this.b[bArr[i6]];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            int i8 = i4 + 1;
            bArr2[i4] = (byte) ((b << 4) | b2);
            if (i8 == 36) {
                outputStream.write(bArr2);
                i4 = 0;
            } else {
                i4 = i8;
            }
            i5++;
            i = i7;
        }
        if (i4 > 0) {
            outputStream.write(bArr2, 0, i4);
        }
        return i5;
    }

    public int d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        int i5 = i3;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            int i7 = b & UByte.MAX_VALUE;
            int i8 = i5 + 1;
            byte[] bArr3 = this.a;
            bArr2[i5] = bArr3[i7 >>> 4];
            i5 += 2;
            bArr2[i8] = bArr3[b & 15];
            i = i6;
        }
        return i5 - i3;
    }

    public void f() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.b[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
