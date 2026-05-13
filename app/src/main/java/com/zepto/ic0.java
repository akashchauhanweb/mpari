package com.zepto;

import com.zepto.jx0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ic0 {
    public jx0 a;
    public jx0 b;
    public jx0 c;
    public jx0 d;
    public jx0 e;
    public jx0 f;
    public jx0 g;
    public ArrayList h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public ic0(jx0 jx0Var, int i, boolean z) {
        this.a = jx0Var;
        this.p = i;
        this.q = z;
    }

    public static boolean c(jx0 jx0Var, int i) {
        int i2;
        return jx0Var.V() != 8 && jx0Var.Z[i] == jx0.b.MATCH_CONSTRAINT && ((i2 = jx0Var.y[i]) == 0 || i2 == 3);
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i = this.p * 2;
        jx0 jx0Var = this.a;
        this.o = true;
        jx0 jx0Var2 = jx0Var;
        boolean z = false;
        while (!z) {
            this.i++;
            jx0[] jx0VarArr = jx0Var.F0;
            int i2 = this.p;
            jx0 jx0Var3 = null;
            jx0VarArr[i2] = null;
            jx0Var.E0[i2] = null;
            if (jx0Var.V() != 8) {
                this.l++;
                jx0.b bVarU = jx0Var.u(this.p);
                jx0.b bVar = jx0.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.m += jx0Var.E(this.p);
                }
                int iF = this.m + jx0Var.W[i].f();
                this.m = iF;
                int i3 = i + 1;
                this.m = iF + jx0Var.W[i3].f();
                int iF2 = this.n + jx0Var.W[i].f();
                this.n = iF2;
                this.n = iF2 + jx0Var.W[i3].f();
                if (this.b == null) {
                    this.b = jx0Var;
                }
                this.d = jx0Var;
                jx0.b[] bVarArr = jx0Var.Z;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int i5 = jx0Var.y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f = jx0Var.D0[i4];
                        if (f > 0.0f) {
                            this.k += f;
                        }
                        if (c(jx0Var, i4)) {
                            if (f < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList();
                            }
                            this.h.add(jx0Var);
                        }
                        if (this.f == null) {
                            this.f = jx0Var;
                        }
                        jx0 jx0Var4 = this.g;
                        if (jx0Var4 != null) {
                            jx0Var4.E0[this.p] = jx0Var;
                        }
                        this.g = jx0Var;
                    }
                    if (this.p == 0) {
                        if (jx0Var.w != 0 || jx0Var.z != 0 || jx0Var.A != 0) {
                            this.o = false;
                        }
                    } else if (jx0Var.x != 0 || jx0Var.C != 0 || jx0Var.D != 0) {
                        this.o = false;
                    }
                    if (jx0Var.d0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (jx0Var2 != jx0Var) {
                jx0Var2.F0[this.p] = jx0Var;
            }
            yw0 yw0Var = jx0Var.W[i + 1].f;
            if (yw0Var != null) {
                jx0 jx0Var5 = yw0Var.d;
                yw0 yw0Var2 = jx0Var5.W[i].f;
                if (yw0Var2 != null && yw0Var2.d == jx0Var) {
                    jx0Var3 = jx0Var5;
                }
            }
            if (jx0Var3 == null) {
                jx0Var3 = jx0Var;
                z = true;
            }
            jx0Var2 = jx0Var;
            jx0Var = jx0Var3;
        }
        jx0 jx0Var6 = this.b;
        if (jx0Var6 != null) {
            this.m -= jx0Var6.W[i].f();
        }
        jx0 jx0Var7 = this.d;
        if (jx0Var7 != null) {
            this.m -= jx0Var7.W[i + 1].f();
        }
        this.c = jx0Var;
        if (this.p == 0 && this.q) {
            this.e = jx0Var;
        } else {
            this.e = this.a;
        }
        this.t = this.s && this.r;
    }
}
