package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i65 implements f02 {
    public float c;
    public float e;
    public float f;
    public float g;
    public int h;
    public p40 i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public p40 q;
    public p40 r;
    public p40 s;
    public p40 t;
    public p40 u;

    public i65(float f, float f2, float f3, float f4) {
        this.h = 0;
        this.i = null;
        this.j = -1;
        this.k = false;
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        this.o = -1.0f;
        this.p = -1.0f;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.c = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public float A() {
        return this.f - this.c;
    }

    public boolean B(int i) {
        int i2 = this.j;
        return i2 != -1 && (i2 & i) == i;
    }

    public boolean C() {
        int i = this.j;
        if (i == -1 || i == 0) {
            return false;
        }
        return this.l > 0.0f || this.m > 0.0f || this.n > 0.0f || this.o > 0.0f || this.p > 0.0f;
    }

    public boolean D() {
        return this.k;
    }

    public void E(p40 p40Var) {
        this.i = p40Var;
    }

    public void F(int i) {
        this.j = i;
    }

    public void G(p40 p40Var) {
        this.q = p40Var;
    }

    public void H(float f) {
        this.e = f;
    }

    public void I(float f) {
        this.c = f;
    }

    public void J(float f) {
        this.f = f;
    }

    public void K(int i) {
        int i2 = i % 360;
        this.h = i2;
        if (i2 == 90 || i2 == 180 || i2 == 270) {
            return;
        }
        this.h = 0;
    }

    public void L(float f) {
        this.g = f;
    }

    @Override // com.zepto.f02
    public boolean O() {
        return true;
    }

    public void a(i65 i65Var) {
        this.h = i65Var.h;
        this.i = i65Var.i;
        this.j = i65Var.j;
        this.k = i65Var.k;
        this.l = i65Var.l;
        this.m = i65Var.m;
        this.n = i65Var.n;
        this.o = i65Var.o;
        this.p = i65Var.p;
        this.q = i65Var.q;
        this.r = i65Var.r;
        this.s = i65Var.s;
        this.t = i65Var.t;
        this.u = i65Var.u;
    }

    @Override // com.zepto.f02
    public ArrayList a0() {
        return new ArrayList();
    }

    public p40 b() {
        return this.i;
    }

    public p40 c() {
        return this.q;
    }

    public p40 d() {
        p40 p40Var = this.u;
        return p40Var == null ? this.q : p40Var;
    }

    public p40 e() {
        p40 p40Var = this.r;
        return p40Var == null ? this.q : p40Var;
    }

    public p40 f() {
        p40 p40Var = this.s;
        return p40Var == null ? this.q : p40Var;
    }

    public p40 g() {
        p40 p40Var = this.t;
        return p40Var == null ? this.q : p40Var;
    }

    public float h() {
        return this.l;
    }

    public float i() {
        return y(this.p, 2);
    }

    public float j() {
        return y(this.m, 4);
    }

    public float k() {
        return y(this.n, 8);
    }

    public float l() {
        return y(this.o, 1);
    }

    public float m() {
        return this.e;
    }

    public float n(float f) {
        return this.e + f;
    }

    public float o() {
        return this.g - this.e;
    }

    public float p() {
        return this.c;
    }

    public float q(float f) {
        return this.c + f;
    }

    public float s() {
        return this.f;
    }

    public float t(float f) {
        return this.f - f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Rectangle: ");
        stringBuffer.append(A());
        stringBuffer.append('x');
        stringBuffer.append(o());
        stringBuffer.append(" (rot: ");
        stringBuffer.append(this.h);
        stringBuffer.append(" degrees)");
        return stringBuffer.toString();
    }

    @Override // com.zepto.f02
    public boolean u(r02 r02Var) {
        try {
            return r02Var.d(this);
        } catch (cu1 unused) {
            return false;
        }
    }

    public int v() {
        return this.h;
    }

    public float w() {
        return this.g;
    }

    public float x(float f) {
        return this.g - f;
    }

    public final float y(float f, int i) {
        if ((i & this.j) != 0) {
            return f != -1.0f ? f : this.l;
        }
        return 0.0f;
    }

    @Override // com.zepto.f02
    public int z() {
        return 30;
    }

    public i65(float f, float f2) {
        this(0.0f, 0.0f, f, f2);
    }

    public i65(i65 i65Var) {
        this(i65Var.c, i65Var.e, i65Var.f, i65Var.g);
        a(i65Var);
    }
}
