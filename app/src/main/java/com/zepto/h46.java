package com.zepto;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class h46 implements Comparable {
    public static int u = 1;
    public boolean c;
    public String e;
    public float i;
    public a m;
    public int f = -1;
    public int g = -1;
    public int h = 0;
    public boolean j = false;
    public float[] k = new float[9];
    public float[] l = new float[9];
    public px[] n = new px[16];
    public int o = 0;
    public int p = 0;
    public boolean q = false;
    public int r = -1;
    public float s = 0.0f;
    public HashSet t = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public h46(a aVar, String str) {
        this.m = aVar;
    }

    public static void c() {
        u++;
    }

    public final void a(px pxVar) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            if (i >= i2) {
                px[] pxVarArr = this.n;
                if (i2 >= pxVarArr.length) {
                    this.n = (px[]) Arrays.copyOf(pxVarArr, pxVarArr.length * 2);
                }
                px[] pxVarArr2 = this.n;
                int i3 = this.o;
                pxVarArr2[i3] = pxVar;
                this.o = i3 + 1;
                return;
            }
            if (this.n[i] == pxVar) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(h46 h46Var) {
        return this.f - h46Var.f;
    }

    public final void d(px pxVar) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == pxVar) {
                while (i2 < i - 1) {
                    px[] pxVarArr = this.n;
                    int i3 = i2 + 1;
                    pxVarArr[i2] = pxVarArr[i3];
                    i2 = i3;
                }
                this.o--;
                return;
            }
            i2++;
        }
    }

    public void e() {
        this.e = null;
        this.m = a.UNKNOWN;
        this.h = 0;
        this.f = -1;
        this.g = -1;
        this.i = 0.0f;
        this.j = false;
        this.q = false;
        this.r = -1;
        this.s = 0.0f;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2] = null;
        }
        this.o = 0;
        this.p = 0;
        this.c = false;
        Arrays.fill(this.l, 0.0f);
    }

    public void f(nf3 nf3Var, float f) {
        this.i = f;
        this.j = true;
        this.q = false;
        this.r = -1;
        this.s = 0.0f;
        int i = this.o;
        this.g = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].A(nf3Var, this, false);
        }
        this.o = 0;
    }

    public void g(a aVar, String str) {
        this.m = aVar;
    }

    public final void h(nf3 nf3Var, px pxVar) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].B(nf3Var, pxVar, false);
        }
        this.o = 0;
    }

    public String toString() {
        if (this.e != null) {
            return "" + this.e;
        }
        return "" + this.f;
    }
}
