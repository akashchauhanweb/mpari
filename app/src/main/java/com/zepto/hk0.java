package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class hk0 implements jk0 {
    public static final hg6.b b = hg6.b.c;
    public final wl a;

    public hk0(wl wlVar) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.a = wlVar;
    }
}
