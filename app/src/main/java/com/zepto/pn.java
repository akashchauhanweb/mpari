package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class pn implements wi1 {
    public static final hg6.b c = hg6.b.c;
    public static final Collection d = Arrays.asList(64);
    public static final byte[] e = new byte[16];
    public static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final su4 a;
    public final byte[] b;

    public pn(byte[] bArr) throws GeneralSecurityException {
        if (!c.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (d.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.a = new su4(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    @Override // com.zepto.wi1
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) m22.b.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return y80.a(bArrC, cipher.doFinal(bArr));
    }

    @Override // com.zepto.wi1
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) m22.b.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && w86.b()) {
            bArrDoFinal = new byte[0];
        }
        if (y80.b(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.a.a(f, 16);
        }
        byte[] bArrA = this.a.a(e, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = y80.e(tn.b(bArrA), this.a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.a.a(bArr3.length >= 16 ? y80.f(bArr3, bArrA) : y80.e(tn.a(bArr3), tn.b(bArrA)), 16);
    }
}
