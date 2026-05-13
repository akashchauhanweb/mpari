package com.zepto;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qe3 {
    public static m a(SecretKey secretKey, boolean z) {
        m mVar = new m();
        mVar.c(z, new m63(secretKey.getEncoded()));
        return mVar;
    }

    public static ci2 b(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        ci2 ci2Var = new ci2(a(secretKey, z));
        ci2Var.i(z, new i(new m63(secretKey.getEncoded()), 128, bArr, bArr2));
        return ci2Var;
    }

    public static vz c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws f33 {
        ci2 ci2VarB = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[ci2VarB.h(bArr2.length)];
        int iM = ci2VarB.m(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int iB = (iM + ci2VarB.b(bArr4, iM)) - 16;
            byte[] bArr5 = new byte[iB];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, iB);
            System.arraycopy(bArr4, iB, bArr6, 0, 16);
            return new vz(bArr5, bArr6);
        } catch (z03 e) {
            throw new f33("Couldn't generate GCM authentication tag: " + e.getMessage(), e);
        }
    }
}
