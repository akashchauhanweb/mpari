package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public abstract class ga8 {
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (bArr[i] & UByte.MAX_VALUE);
    }

    public static long b(byte[] bArr, int i) {
        return ((long) ((a(bArr, i + 2) << 16) | a(bArr, i))) & 4294967295L;
    }
}
