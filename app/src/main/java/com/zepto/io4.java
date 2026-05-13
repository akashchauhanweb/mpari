package com.zepto;

import java.util.HashSet;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class io4 extends uo4 {
    public static final lp4 A;
    public static final lp4 B;
    public static final lp4 C;
    public static final lp4 D;
    public static final lp4 E;
    public static final lp4 F;
    public static final lp4 G;
    public static final lp4 H;
    public static final lp4 I;
    public static final lp4 J;
    public static final lp4 K;
    public static final lp4 t;
    public static final lp4 u;
    public static final lp4 v;
    public static final lp4 w;
    public static final lp4 x;
    public static final lp4 y;
    public static final lp4 z;
    public pq4 m;
    public gp4 n;
    public HashSet o;
    public boolean p = false;
    public boolean q = true;
    public boolean r = false;
    public int s = -1;

    static {
        lp4 lp4Var = lp4.R5;
        t = lp4Var;
        u = lp4.u4;
        v = lp4.p6;
        w = lp4.S6;
        x = lp4.A9;
        y = lp4Var;
        z = lp4.T7;
        lp4 lp4Var2 = lp4.D1;
        A = lp4Var2;
        B = lp4.u2;
        C = lp4.sb;
        D = lp4Var2;
        E = lp4.wa;
        F = lp4.t3;
        G = lp4.j0;
        H = lp4.Y4;
        I = lp4.Q2;
        J = lp4.Na;
        K = lp4.w0;
    }

    public io4(pq4 pq4Var, i65 i65Var) {
        this.m = pq4Var;
        if (i65Var != null) {
            r(lp4.a8, new cq4(i65Var));
        }
    }

    public static io4 v(pq4 pq4Var, i65 i65Var, String str, ap4 ap4Var, String str2, boolean z2) {
        io4 io4Var = new io4(pq4Var, i65Var);
        io4Var.r(lp4.v9, lp4.H8);
        io4Var.r(lp4.Q2, new op4(4));
        io4Var.r(lp4.sa, lp4.G);
        io4Var.C();
        gp4 gp4VarA = pq4Var.n(ho4.v(str, ap4Var, str2, io4Var.w())).a();
        if (z2) {
            uo4 uo4Var = new uo4();
            uo4Var.r(new lp4("PV"), gp4VarA);
            io4Var.r(lp4.j, uo4Var);
        }
        io4Var.r(lp4.h, gp4VarA);
        return io4Var;
    }

    public boolean A() {
        return this.p;
    }

    public boolean B() {
        return this.r;
    }

    public void C() {
        r(lp4.S6, this.m.v());
    }

    public void D() {
        this.r = true;
    }

    public gp4 w() {
        if (this.n == null) {
            this.n = this.m.K();
        }
        return this.n;
    }

    public int x() {
        return this.s;
    }

    public HashSet y() {
        return this.o;
    }

    public boolean z() {
        return this.q;
    }

    public io4(pq4 pq4Var, float f, float f2, float f3, float f4, hq4 hq4Var, hq4 hq4Var2) {
        this.m = pq4Var;
        r(lp4.v9, lp4.G9);
        r(lp4.A9, hq4Var);
        r(lp4.a8, new cq4(f, f2, f3, f4));
        r(lp4.o1, hq4Var2);
    }

    public io4(pq4 pq4Var, float f, float f2, float f3, float f4, ho4 ho4Var) {
        this.m = pq4Var;
        r(lp4.v9, lp4.r5);
        r(lp4.a8, new cq4(f, f2, f3, f4));
        r(lp4.h, ho4Var);
        r(lp4.q0, new mo4(0.0f, 0.0f, 0.0f));
        r(lp4.w0, new oo4(0, 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }
}
