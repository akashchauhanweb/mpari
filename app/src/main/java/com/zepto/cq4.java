package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class cq4 extends ko4 {
    public float g;
    public float h;
    public float i;
    public float j;

    public cq4(float f, float f2, float f3, float f4, int i) {
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        if (i == 90 || i == 270) {
            this.g = f2;
            this.h = f;
            this.i = f4;
            this.j = f3;
        } else {
            this.g = f;
            this.h = f2;
            this.i = f3;
            this.j = f4;
        }
        super.m(new op4(this.g));
        super.m(new op4(this.h));
        super.m(new op4(this.i));
        super.m(new op4(this.j));
    }

    @Override // com.zepto.ko4
    public boolean m(rp4 rp4Var) {
        return false;
    }

    @Override // com.zepto.ko4
    public boolean n(float[] fArr) {
        return false;
    }

    @Override // com.zepto.ko4
    public boolean o(int[] iArr) {
        return false;
    }

    public float u() {
        return this.h;
    }

    public float v() {
        return this.g;
    }

    public float w() {
        return this.i;
    }

    public float x() {
        return this.j;
    }

    public cq4(float f, float f2, float f3, float f4) {
        this(f, f2, f3, f4, 0);
    }

    public cq4(i65 i65Var, int i) {
        this(i65Var.p(), i65Var.m(), i65Var.s(), i65Var.w(), i);
    }

    public cq4(i65 i65Var) {
        this(i65Var.p(), i65Var.m(), i65Var.s(), i65Var.w(), 0);
    }
}
