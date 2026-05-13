package com.zepto;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class d45 implements KeySpec {
    public short[][] a;
    public short[] b;
    public short[][] c;
    public short[] d;
    public int[] e;
    public cb3[] f;

    public d45(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, cb3[] cb3VarArr) {
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
        this.d = sArr4;
        this.e = iArr;
        this.f = cb3VarArr;
    }

    public short[] a() {
        return this.b;
    }

    public short[] b() {
        return this.d;
    }

    public short[][] c() {
        return this.a;
    }

    public short[][] d() {
        return this.c;
    }

    public cb3[] e() {
        return this.f;
    }

    public int[] f() {
        return this.e;
    }
}
