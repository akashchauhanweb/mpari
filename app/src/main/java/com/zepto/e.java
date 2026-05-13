package com.zepto;

import com.zepto.t80;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final byte[] a;
    public static final byte[] b;

    static {
        t80.a aVar = t80.h;
        a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f();
        b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f();
    }

    public static final byte[] a(String decodeBase64ToArray) {
        int i;
        char cCharAt;
        Intrinsics.checkNotNullParameter(decodeBase64ToArray, "$this$decodeBase64ToArray");
        int length = decodeBase64ToArray.length();
        while (length > 0 && ((cCharAt = decodeBase64ToArray.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = decodeBase64ToArray.charAt(i6);
            if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (i4 >> 8);
                i5 += 3;
                bArr[i7] = (byte) i4;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i8 == 3) {
            int i9 = i4 << 6;
            int i10 = i5 + 1;
            bArr[i5] = (byte) (i9 >> 16);
            i5 += 2;
            bArr[i10] = (byte) (i9 >> 8);
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static final String b(byte[] encodeBase64, byte[] map) {
        Intrinsics.checkNotNullParameter(encodeBase64, "$this$encodeBase64");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = encodeBase64[i];
            int i3 = i + 2;
            byte b3 = encodeBase64[i + 1];
            i += 3;
            byte b4 = encodeBase64[i3];
            bArr[i2] = map[(b2 & UByte.MAX_VALUE) >> 2];
            bArr[i2 + 1] = map[((b2 & 3) << 4) | ((b3 & UByte.MAX_VALUE) >> 4)];
            int i4 = i2 + 3;
            bArr[i2 + 2] = map[((b3 & 15) << 2) | ((b4 & UByte.MAX_VALUE) >> 6)];
            i2 += 4;
            bArr[i4] = map[b4 & 63];
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b5 = encodeBase64[i];
            bArr[i2] = map[(b5 & UByte.MAX_VALUE) >> 2];
            bArr[i2 + 1] = map[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr[i2 + 2] = b6;
            bArr[i2 + 3] = b6;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b7 = encodeBase64[i];
            byte b8 = encodeBase64[i5];
            bArr[i2] = map[(b7 & UByte.MAX_VALUE) >> 2];
            bArr[i2 + 1] = map[((b7 & 3) << 4) | ((b8 & UByte.MAX_VALUE) >> 4)];
            bArr[i2 + 2] = map[(b8 & 15) << 2];
            bArr[i2 + 3] = (byte) 61;
        }
        return f.b(bArr);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = a;
        }
        return b(bArr, bArr2);
    }
}
