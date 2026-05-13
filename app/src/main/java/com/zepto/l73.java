package com.zepto;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class l73 implements rl {
    public static final byte[] c = new byte[0];
    public final s63 a;
    public final rl b;

    public l73(s63 s63Var, rl rlVar) {
        this.a = s63Var;
        this.b = rlVar;
    }

    @Override // com.zepto.rl
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrD = u75.j(this.a).d();
        return c(this.b.a(bArrD, c), ((rl) u75.g(this.a.a0(), bArrD, rl.class)).a(bArr, bArr2));
    }

    @Override // com.zepto.rl
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((rl) u75.g(this.a.a0(), this.b.b(bArr3, c), rl.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
