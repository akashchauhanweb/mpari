package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class su4 implements ru4 {
    public static final hg6.b d = hg6.b.c;
    public final SecretKey a;
    public byte[] b;
    public byte[] c;

    public su4(byte[] bArr) throws GeneralSecurityException {
        hm7.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        b();
    }

    public static Cipher c() throws GeneralSecurityException {
        if (d.a()) {
            return (Cipher) m22.b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.zepto.ru4
    public byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherC = c();
        cipherC.init(1, this.a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrD = iMax * 16 == bArr.length ? y80.d(bArr, (iMax - 1) * 16, this.b, 0, 16) : y80.e(tn.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.c);
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherC.doFinal(y80.d(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherC.doFinal(y80.e(bArrD, bArrDoFinal)), i);
    }

    public final void b() throws GeneralSecurityException {
        Cipher cipherC = c();
        cipherC.init(1, this.a);
        byte[] bArrB = tn.b(cipherC.doFinal(new byte[16]));
        this.b = bArrB;
        this.c = tn.b(bArrB);
    }
}
