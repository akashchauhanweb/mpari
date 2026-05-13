package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class iu7 {
    public final byte[][] a;

    public iu7(hu7 hu7Var, byte[][] bArr) {
        if (hu7Var == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (v08.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != hu7Var.a()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != hu7Var.c()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.a = v08.d(bArr);
    }

    public byte[][] a() {
        return v08.d(this.a);
    }
}
