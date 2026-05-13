package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fl4 extends cs4 {
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;

    public fl4() {
        this.f = -1;
        this.g = 0.0f;
        this.j = 0.0f;
        this.m = 0.0f;
        this.n = false;
    }

    public void A0(float f) {
        this.h = f;
    }

    public void B0(float f) {
        this.i = f;
    }

    public void C0(float f) {
        this.c = f;
        this.g = 0.0f;
    }

    public void D0(float f, float f2) {
        this.c = f;
        this.g = f2;
    }

    public void E0(float f) {
        this.l = f;
    }

    public void F0(float f) {
        this.k = f;
    }

    public float G0() {
        return this.l;
    }

    public float H0() {
        return v0();
    }

    @Override // com.zepto.cs4, java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g0 */
    public boolean add(f02 f02Var) {
        if (f02Var instanceof qf3) {
            qf3 qf3Var = (qf3) f02Var;
            qf3Var.g(qf3Var.b() + this.h);
            qf3Var.h(this.i);
            return super.add(qf3Var);
        }
        if (!(f02Var instanceof fl4)) {
            return super.add(f02Var);
        }
        super.add(f02Var);
        ArrayList arrayListA0 = a0();
        if (arrayListA0.isEmpty()) {
            super.add(fk0.g);
        } else {
            super.add(new fk0("\n", ((fk0) arrayListA0.get(arrayListA0.size() - 1)).d()));
        }
        return true;
    }

    public int n0() {
        return this.f;
    }

    public float o0() {
        return this.m;
    }

    public float p0() {
        return this.j;
    }

    public float q0() {
        return this.h;
    }

    public float r0() {
        return this.i;
    }

    public boolean s0() {
        return this.n;
    }

    public float t0() {
        return this.g;
    }

    public float u0() {
        return this.l;
    }

    public float v0() {
        return this.k;
    }

    public float w0() {
        zd2 zd2Var = this.e;
        float fE = zd2Var == null ? this.g * 12.0f : zd2Var.e(this.g);
        return (fE <= 0.0f || l0()) ? k0() + fE : fE;
    }

    public void x0(int i) {
        this.f = i;
    }

    public void y0(float f) {
        this.m = f;
    }

    @Override // com.zepto.cs4, com.zepto.f02
    public int z() {
        return 12;
    }

    public void z0(float f) {
        this.j = f;
    }

    public fl4(fk0 fk0Var) {
        super(fk0Var);
        this.f = -1;
        this.g = 0.0f;
        this.j = 0.0f;
        this.m = 0.0f;
        this.n = false;
    }

    public fl4(String str) {
        super(str);
        this.f = -1;
        this.g = 0.0f;
        this.j = 0.0f;
        this.m = 0.0f;
        this.n = false;
    }

    public fl4(String str, zd2 zd2Var) {
        super(str, zd2Var);
        this.f = -1;
        this.g = 0.0f;
        this.j = 0.0f;
        this.m = 0.0f;
        this.n = false;
    }

    public fl4(cs4 cs4Var) {
        super(cs4Var);
        this.f = -1;
        this.g = 0.0f;
        this.j = 0.0f;
        this.m = 0.0f;
        this.n = false;
        if (cs4Var instanceof fl4) {
            fl4 fl4Var = (fl4) cs4Var;
            x0(fl4Var.f);
            D0(cs4Var.k0(), fl4Var.g);
            A0(fl4Var.q0());
            B0(fl4Var.r0());
            z0(fl4Var.p0());
            E0(fl4Var.G0());
            F0(fl4Var.H0());
            y0(fl4Var.o0());
        }
    }
}
