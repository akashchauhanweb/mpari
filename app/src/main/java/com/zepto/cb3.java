package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class cb3 {
    public int a;
    public int b;
    public int c;
    public short[][][] d;
    public short[][][] e;
    public short[][] f;
    public short[] g;

    public cb3(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & UByte.MAX_VALUE;
        this.a = i;
        int i2 = b2 & UByte.MAX_VALUE;
        this.b = i2;
        this.c = i2 - i;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public short[][][] a() {
        return this.d;
    }

    public short[][][] b() {
        return this.e;
    }

    public short[] c() {
        return this.g;
    }

    public short[][] d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof cb3)) {
            return false;
        }
        cb3 cb3Var = (cb3) obj;
        return this.a == cb3Var.f() && this.b == cb3Var.g() && this.c == cb3Var.e() && g45.k(this.d, cb3Var.a()) && g45.k(this.e, cb3Var.b()) && g45.j(this.f, cb3Var.d()) && g45.i(this.g, cb3Var.c());
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((this.a * 37) + this.b) * 37) + this.c) * 37) + wx.q(this.d)) * 37) + wx.q(this.e)) * 37) + wx.p(this.f)) * 37) + wx.o(this.g);
    }
}
