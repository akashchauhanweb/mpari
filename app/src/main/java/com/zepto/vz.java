package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public final class vz {
    public final byte[] a;
    public final byte[] b;

    public vz(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.a = bArr;
        if (bArr2 == null) {
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        this.b = bArr2;
    }

    public byte[] a() {
        return this.b;
    }

    public byte[] b() {
        return this.a;
    }
}
