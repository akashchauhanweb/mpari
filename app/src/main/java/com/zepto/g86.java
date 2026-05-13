package com.zepto;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g86 {
    public static String a(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String b(byte[] bArr) {
        return a(bArr, StandardCharsets.UTF_8);
    }
}
