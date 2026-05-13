package com.zepto;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xi1 {
    public static final String a = new sn().d();
    public static final v75 b = v75.V();
    public static final v75 c = v75.V();

    static {
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        yi1.e();
        if (fg6.a()) {
            return;
        }
        sn.m(true);
    }
}
