package com.zepto;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class k73 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static j73 a(String str) throws GeneralSecurityException {
        for (j73 j73Var : a) {
            if (j73Var.b(str)) {
                return j73Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
