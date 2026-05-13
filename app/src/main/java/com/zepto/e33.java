package com.zepto;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e33 {
    public Provider a;
    public SecureRandom b;

    public e33(Provider provider, SecureRandom secureRandom) {
        this.a = provider;
        this.b = secureRandom;
    }

    public Provider a() {
        return this.a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }
}
