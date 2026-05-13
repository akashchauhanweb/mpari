package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 implements jk0 {
    public static final hg6.b b = hg6.b.e;
    public final an2 a;

    public ik0(an2 an2Var) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = an2Var;
    }
}
