package com.zepto;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lk0 {
    public static Cipher a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
