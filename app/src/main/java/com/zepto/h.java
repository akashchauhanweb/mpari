package com.zepto;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static byte[] a(h40 h40Var) {
        return h40Var.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] b(o33 o33Var) {
        return a(o33Var.c());
    }

    public static byte[] c(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(w80.c(bArr)).array();
    }
}
