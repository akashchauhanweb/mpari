package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yg1 {
    public static byte[] a(o33 o33Var, byte[] bArr) throws f33 {
        iv0 iv0VarF = o33Var.f();
        if (iv0VarF == null) {
            return bArr;
        }
        if (!iv0VarF.equals(iv0.e)) {
            throw new f33("Unsupported compression algorithm: " + iv0VarF);
        }
        try {
            return zg1.a(bArr);
        } catch (Exception e) {
            throw new f33("Couldn't compress plain text: " + e.getMessage(), e);
        }
    }
}
