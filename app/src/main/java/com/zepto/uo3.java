package com.zepto;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class uo3 {
    public static final String a = new en2().d();
    public static final v75 b;
    public static final v75 c;
    public static final v75 d;

    static {
        v75 v75VarV = v75.V();
        b = v75VarV;
        c = v75VarV;
        d = v75VarV;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        xo3.f();
        kk0.d();
        en2.p(true);
        if (fg6.a()) {
            return;
        }
        am.o(true);
    }
}
