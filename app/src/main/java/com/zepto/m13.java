package com.zepto;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public abstract class m13 {
    public static int a(byte b) {
        return b < 0 ? b + UByte.MIN_VALUE : b;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & UByte.MAX_VALUE))) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & UByte.MAX_VALUE))) / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[2]);
        return ((short) (((short) ((r0[0] << 8) & 65280)) | (r0[1] & UByte.MAX_VALUE))) / 256.0f;
    }

    public static String f(ByteBuffer byteBuffer) {
        int iH = h(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((iH >> ((2 - i) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    public static String g(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return ys6.a(bArr);
    }

    public static int h(ByteBuffer byteBuffer) {
        return (a(byteBuffer.get()) << 8) + a(byteBuffer.get());
    }

    public static int i(ByteBuffer byteBuffer) {
        return (h(byteBuffer) << 8) + a(byteBuffer.get());
    }

    public static long j(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long k(ByteBuffer byteBuffer) {
        long j = j(byteBuffer) << 32;
        if (j >= 0) {
            return j + j(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int l(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}
