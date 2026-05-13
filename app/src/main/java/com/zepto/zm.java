package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zm implements rl {
    public static final hg6.b b = hg6.b.e;
    public final iz2 a;

    public zm(byte[] bArr) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new iz2(bArr, true);
    }

    @Override // com.zepto.rl
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.a.b(h45.c(12), bArr, bArr2);
    }

    @Override // com.zepto.rl
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
