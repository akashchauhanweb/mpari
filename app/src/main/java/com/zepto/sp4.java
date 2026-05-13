package com.zepto;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class sp4 extends uo4 {
    public gp4 m;
    public int n;
    public sp4 o;
    public to4 p;
    public ho4 q;
    public ArrayList r;
    public pq4 s;
    public boolean t;
    public p40 u;
    public int v;

    public sp4(pq4 pq4Var) {
        super(uo4.i);
        this.n = 0;
        this.r = new ArrayList();
        this.v = 0;
        this.t = true;
        this.o = null;
        this.s = pq4Var;
    }

    public void A(int i) {
        this.n = i;
    }

    public void B(gp4 gp4Var) {
        this.m = gp4Var;
    }

    @Override // com.zepto.uo4, com.zepto.rp4
    public void k(pq4 pq4Var, OutputStream outputStream) {
        p40 p40Var = this.u;
        if (p40Var != null && !p40Var.equals(p40.f)) {
            r(lp4.w0, new ko4(new float[]{this.u.d() / 255.0f, this.u.b() / 255.0f, this.u.a() / 255.0f}));
        }
        int i = this.v;
        int i2 = (i & 1) != 0 ? 2 : 0;
        if ((i & 2) != 0) {
            i2 |= 1;
        }
        if (i2 != 0) {
            r(lp4.Q2, new op4(i2));
        }
        sp4 sp4Var = this.o;
        if (sp4Var != null) {
            r(lp4.c7, sp4Var.x());
        }
        to4 to4Var = this.p;
        if (to4Var != null && to4Var.v()) {
            r(lp4.T1, this.p);
        }
        ho4 ho4Var = this.q;
        if (ho4Var != null) {
            r(lp4.h, ho4Var);
        }
        int i3 = this.n;
        if (i3 != 0) {
            r(lp4.q1, new op4(i3));
        }
        super.k(pq4Var, outputStream);
    }

    public int v() {
        return this.n;
    }

    public ArrayList w() {
        return this.r;
    }

    public gp4 x() {
        return this.m;
    }

    public boolean y() {
        return this.t;
    }

    public sp4 z() {
        return this.o;
    }
}
