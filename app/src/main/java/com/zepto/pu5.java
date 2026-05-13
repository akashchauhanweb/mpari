package com.zepto;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class pu5 {
    public static final pu5 a = new pu5();

    public static pu5 a() {
        return a;
    }

    public static pu5 b(pu5 pu5Var) throws GeneralSecurityException {
        if (pu5Var != null) {
            return pu5Var;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
