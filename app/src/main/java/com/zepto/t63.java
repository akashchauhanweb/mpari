package com.zepto;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t63 {
    public static r63 a(String str) throws GeneralSecurityException {
        r63 r63Var = (r63) u75.i().get(str);
        if (r63Var != null) {
            return r63Var;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
