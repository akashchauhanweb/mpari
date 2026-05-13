package com.zepto;

import com.google.android.gms.common.api.Scope;
import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public abstract class n38 {
    public static final yp.g a;
    public static final yp.g b;
    public static final yp.a c;
    public static final yp.a d;
    public static final Scope e;
    public static final Scope f;
    public static final yp g;
    public static final yp h;

    static {
        yp.g gVar = new yp.g();
        a = gVar;
        yp.g gVar2 = new yp.g();
        b = gVar2;
        o18 o18Var = new o18();
        c = o18Var;
        z18 z18Var = new z18();
        d = z18Var;
        e = new Scope("profile");
        f = new Scope("email");
        g = new yp("SignIn.API", o18Var, gVar);
        h = new yp("SignIn.INTERNAL_API", z18Var, gVar2);
    }
}
