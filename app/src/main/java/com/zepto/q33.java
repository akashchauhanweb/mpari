package com.zepto;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class q33 extends e33 {
    public Provider c;
    public Provider d;
    public Provider e;

    public q33() {
        this(null, null, null, null, null);
    }

    public Provider c() {
        Provider provider = this.d;
        return provider != null ? provider : a();
    }

    public Provider d() {
        Provider provider = this.c;
        return provider != null ? provider : a();
    }

    public Provider e() {
        Provider provider = this.e;
        return provider != null ? provider : a();
    }

    public q33(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }
}
