package com.zepto;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public class uu4 implements to3 {
    public final ru4 a;
    public final int b;

    public uu4(ru4 ru4Var, int i) throws InvalidAlgorithmParameterException {
        this.a = ru4Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        ru4Var.a(new byte[0], i);
    }

    @Override // com.zepto.to3
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!y80.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.zepto.to3
    public byte[] b(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
