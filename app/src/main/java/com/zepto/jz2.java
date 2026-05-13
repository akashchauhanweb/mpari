package com.zepto;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class jz2 extends kz2 {
    public jz2(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.zepto.kz2
    public int[] b(int[] iArr, int i) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        gc0.c(iArr2, this.a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // com.zepto.kz2
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // com.zepto.kz2
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // com.zepto.kz2
    public int e() {
        return 12;
    }
}
