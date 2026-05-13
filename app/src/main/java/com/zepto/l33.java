package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public final class l33 extends Cdo {
    public static final l33 A;
    public static final l33 B;
    public static final l33 C;
    public static final l33 g = new l33("RSA1_5", uc5.REQUIRED);
    public static final l33 h;
    public static final l33 i;
    public static final l33 j;
    public static final l33 k;
    public static final l33 l;
    public static final l33 m;
    public static final l33 n;
    public static final l33 o;
    public static final l33 p;
    public static final l33 q;
    public static final l33 r;
    public static final l33 s;
    public static final l33 t;
    public static final l33 u;
    public static final l33 v;
    public static final l33 w;
    public static final l33 x;
    public static final l33 y;
    public static final l33 z;

    static {
        uc5 uc5Var = uc5.OPTIONAL;
        h = new l33("RSA-OAEP", uc5Var);
        i = new l33("RSA-OAEP-256", uc5Var);
        j = new l33("RSA-OAEP-384", uc5Var);
        k = new l33("RSA-OAEP-512", uc5Var);
        uc5 uc5Var2 = uc5.RECOMMENDED;
        l = new l33("A128KW", uc5Var2);
        m = new l33("A192KW", uc5Var);
        n = new l33("A256KW", uc5Var2);
        o = new l33("dir", uc5Var2);
        p = new l33("ECDH-ES", uc5Var2);
        q = new l33("ECDH-ES+A128KW", uc5Var2);
        r = new l33("ECDH-ES+A192KW", uc5Var);
        s = new l33("ECDH-ES+A256KW", uc5Var2);
        t = new l33("ECDH-1PU", uc5Var);
        u = new l33("ECDH-1PU+A128KW", uc5Var);
        v = new l33("ECDH-1PU+A192KW", uc5Var);
        w = new l33("ECDH-1PU+A256KW", uc5Var);
        x = new l33("A128GCMKW", uc5Var);
        y = new l33("A192GCMKW", uc5Var);
        z = new l33("A256GCMKW", uc5Var);
        A = new l33("PBES2-HS256+A128KW", uc5Var);
        B = new l33("PBES2-HS384+A192KW", uc5Var);
        C = new l33("PBES2-HS512+A256KW", uc5Var);
    }

    public l33(String str, uc5 uc5Var) {
        super(str, uc5Var);
    }
}
