package com.zepto;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f22 implements rl {
    public final iy2 a;
    public final to3 b;
    public final int c;

    public f22(iy2 iy2Var, to3 to3Var, int i) {
        this.a = iy2Var;
        this.b = to3Var;
        this.c = i;
    }

    @Override // com.zepto.rl
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return y80.a(bArrA, this.b.b(y80.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // com.zepto.rl
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, y80.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.a.b(bArrCopyOfRange);
    }
}
