package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class hu7 {
    public final p08 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final p0 g;

    public hu7(p0 p0Var) {
        if (p0Var == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.g = p0Var;
        wj1 wj1VarA = yj1.a(p0Var);
        int iH = v08.h(wj1VarA);
        this.b = iH;
        this.c = 16;
        int iCeil = (int) Math.ceil(((double) (iH * 8)) / ((double) v08.o(16)));
        this.e = iCeil;
        int iFloor = ((int) Math.floor(v08.o((16 - 1) * iCeil) / v08.o(16))) + 1;
        this.f = iFloor;
        int i = iCeil + iFloor;
        this.d = i;
        gu7 gu7VarC = gu7.c(wj1VarA.b(), iH, 16, i);
        this.a = gu7VarC;
        if (gu7VarC != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + wj1VarA.b());
    }

    public int a() {
        return this.d;
    }

    public p0 b() {
        return this.g;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }
}
