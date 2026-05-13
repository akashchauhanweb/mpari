package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class bp4 implements Comparable {
    public s40 c;
    public float e;
    public float f = 1.0f;

    public bp4(s40 s40Var, float f) {
        this.e = f;
        this.c = s40Var;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(bp4 bp4Var) {
        if (bp4Var == null) {
            return -1;
        }
        try {
            if (this.c != bp4Var.c) {
                return 1;
            }
            return e() != bp4Var.e() ? 2 : 0;
        } catch (ClassCastException unused) {
            return -2;
        }
    }

    public s40 b() {
        return this.c;
    }

    public void c(float f) {
        this.f = f;
    }

    public void d(hx2 hx2Var) {
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return g(32);
    }

    public float g(int i) {
        return this.c.w(i, this.e) * this.f;
    }

    public float h(String str) {
        return this.c.x(str, this.e) * this.f;
    }
}
