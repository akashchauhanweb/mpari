package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class fm2 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            throw new IllegalArgumentException("invalid hex digit");
        }
        return c - 'W';
    }

    public static byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length + 1) / 2];
        int i = 1;
        int i2 = 0;
        if (length % 2 == 1) {
            bArr[0] = (byte) a(str.charAt(0));
            i2 = 1;
        } else {
            i = 0;
        }
        while (i < length) {
            int i3 = i + 1;
            int iA = a(str.charAt(i)) << 4;
            i += 2;
            bArr[i2] = (byte) (a(str.charAt(i3)) | iA);
            i2++;
        }
        return bArr;
    }

    public static String c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static String d(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            byte b = bArr[i4];
            int i5 = i3 + 1;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b >>> 4) & 15];
            i3 += 2;
            cArr[i5] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
