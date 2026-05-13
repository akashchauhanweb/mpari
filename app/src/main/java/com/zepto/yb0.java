package com.zepto;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 implements rl {
    public final lz2 a;

    public yb0(byte[] bArr) {
        this.a = new lz2(bArr);
    }

    @Override // com.zepto.rl
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrC = h45.c(12);
        byteBufferAllocate.put(bArrC);
        this.a.b(byteBufferAllocate, bArrC, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // com.zepto.rl
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }
}
