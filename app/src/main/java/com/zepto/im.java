package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class im implements iy2 {
    public static final hg6.b d = hg6.b.e;
    public static final ThreadLocal e = new a();
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) m22.b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public im(byte[] bArr, int i) throws GeneralSecurityException {
        if (!d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        hm7.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) e.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    @Override // com.zepto.iy2
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length > IntCompanionObject.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (IntCompanionObject.MAX_VALUE - this.b));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrC = h45.c(i);
        System.arraycopy(bArrC, 0, bArr2, 0, this.b);
        c(bArr, 0, bArr.length, bArr2, this.b, bArrC, true);
        return bArr2;
    }

    @Override // com.zepto.iy2
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.b;
        byte[] bArr3 = new byte[length2 - i2];
        c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) e.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.a, ivParameterSpec);
        } else {
            cipher.init(2, this.a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
