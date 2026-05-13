package com.zepto;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sz7 implements rl {
    public final oz2 a;

    public sz7(byte[] bArr) {
        this.a = new oz2(bArr);
    }

    @Override // com.zepto.rl
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrC = h45.c(24);
        byteBufferAllocate.put(bArrC);
        this.a.b(byteBufferAllocate, bArrC, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // com.zepto.rl
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }
}
