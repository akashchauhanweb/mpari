package com.zepto;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class oz2 extends mz2 {
    public oz2(byte[] bArr) {
        super(bArr);
    }

    @Override // com.zepto.mz2
    public /* bridge */ /* synthetic */ byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        return super.a(byteBuffer, bArr, bArr2);
    }

    @Override // com.zepto.mz2
    public /* bridge */ /* synthetic */ void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.b(byteBuffer, bArr, bArr2, bArr3);
    }

    @Override // com.zepto.mz2
    public kz2 e(byte[] bArr, int i) {
        return new nz2(bArr, i);
    }
}
