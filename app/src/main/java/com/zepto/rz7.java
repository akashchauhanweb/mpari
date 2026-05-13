package com.zepto;

import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rz7 {
    public static vz a(SecretKey secretKey, gy0 gy0Var, byte[] bArr, byte[] bArr2) throws f33 {
        try {
            try {
                byte[] bArrA = new sz7(secretKey.getEncoded()).a(bArr, bArr2);
                int length = bArrA.length - w80.a(128);
                int iA = w80.a(192);
                byte[] bArrD = w80.d(bArrA, 0, iA);
                byte[] bArrD2 = w80.d(bArrA, iA, length - iA);
                byte[] bArrD3 = w80.d(bArrA, length, w80.a(128));
                gy0Var.b(bArrD);
                return new vz(bArrD2, bArrD3);
            } catch (GeneralSecurityException e) {
                throw new f33("Couldn't encrypt with XChaCha20Poly1305: " + e.getMessage(), e);
            }
        } catch (GeneralSecurityException e2) {
            throw new f33("Invalid XChaCha20Poly1305 key: " + e2.getMessage(), e2);
        }
    }
}
