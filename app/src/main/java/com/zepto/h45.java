package com.zepto;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class h45 {
    public static final ThreadLocal a = new a();

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return h45.b();
        }
    }

    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
