package com.zepto;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class f45 implements KeySpec {
    public short[][] a;
    public short[][] b;
    public short[] c;
    public int d;

    public f45(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public short[][] a() {
        return this.a;
    }

    public short[] b() {
        return this.c;
    }

    public short[][] c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }
}
