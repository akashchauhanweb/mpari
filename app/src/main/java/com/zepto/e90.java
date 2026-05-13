package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class e90 extends b72 {
    public float p;
    public float q;
    public float r;
    public float s;

    public e90(int i, int i2, int i3, int i4) {
        this(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
    }

    @Override // com.zepto.p40
    public boolean equals(Object obj) {
        if (!(obj instanceof e90)) {
            return false;
        }
        e90 e90Var = (e90) obj;
        return this.p == e90Var.p && this.q == e90Var.q && this.r == e90Var.r && this.s == e90Var.s;
    }

    @Override // com.zepto.p40
    public int hashCode() {
        return ((Float.floatToIntBits(this.p) ^ Float.floatToIntBits(this.q)) ^ Float.floatToIntBits(this.r)) ^ Float.floatToIntBits(this.s);
    }

    public float i() {
        return this.s;
    }

    public float j() {
        return this.p;
    }

    public float k() {
        return this.q;
    }

    public float l() {
        return this.r;
    }

    public e90(float f, float f2, float f3, float f4) {
        super(2, (1.0f - f) - f4, (1.0f - f2) - f4, (1.0f - f3) - f4);
        this.p = b72.h(f);
        this.q = b72.h(f2);
        this.r = b72.h(f3);
        this.s = b72.h(f4);
    }
}
