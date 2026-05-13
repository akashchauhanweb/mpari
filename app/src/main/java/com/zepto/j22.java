package com.zepto;

import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class j22 extends Cdo {
    public static final j22 h;
    public static final j22 i;
    public static final j22 j;
    public static final j22 k;
    public static final j22 l;
    public static final j22 m;
    public static final j22 n;
    public static final j22 o;
    public static final j22 p;
    public final int g;

    static {
        uc5 uc5Var = uc5.REQUIRED;
        h = new j22("A128CBC-HS256", uc5Var, 256);
        uc5 uc5Var2 = uc5.OPTIONAL;
        i = new j22("A192CBC-HS384", uc5Var2, 384);
        j = new j22("A256CBC-HS512", uc5Var, ConstantsKt.MINIMUM_BLOCK_SIZE);
        k = new j22("A128CBC+HS256", uc5Var2, 256);
        l = new j22("A256CBC+HS512", uc5Var2, ConstantsKt.MINIMUM_BLOCK_SIZE);
        uc5 uc5Var3 = uc5.RECOMMENDED;
        m = new j22("A128GCM", uc5Var3, 128);
        n = new j22("A192GCM", uc5Var2, 192);
        o = new j22("A256GCM", uc5Var3, 256);
        p = new j22("XC20P", uc5Var2, 256);
    }

    public j22(String str, uc5 uc5Var, int i2) {
        super(str, uc5Var);
        this.g = i2;
    }

    public int b() {
        return this.g;
    }
}
