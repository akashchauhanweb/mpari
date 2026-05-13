package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class l13 extends c50 {
    public static sn3 k = sn3.a(l13.class);

    public static byte[] P(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }
}
