package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class tk2 extends xu7 {
    public tk2(jx0 jx0Var) {
        super(jx0Var);
        jx0Var.e.f();
        jx0Var.f.f();
        this.f = ((sk2) jx0Var).s1();
    }

    @Override // com.zepto.xu7, com.zepto.ii1
    public void a(ii1 ii1Var) {
        oi1 oi1Var = this.h;
        if (oi1Var.c && !oi1Var.j) {
            this.h.d((int) ((((oi1) oi1Var.l.get(0)).g * ((sk2) this.b).v1()) + 0.5f));
        }
    }

    @Override // com.zepto.xu7
    public void d() {
        sk2 sk2Var = (sk2) this.b;
        int iT1 = sk2Var.t1();
        int iU1 = sk2Var.u1();
        sk2Var.v1();
        if (sk2Var.s1() == 1) {
            if (iT1 != -1) {
                this.h.l.add(this.b.a0.e.h);
                this.b.a0.e.h.k.add(this.h);
                this.h.f = iT1;
            } else if (iU1 != -1) {
                this.h.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
                this.h.f = -iU1;
            } else {
                oi1 oi1Var = this.h;
                oi1Var.b = true;
                oi1Var.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (iT1 != -1) {
            this.h.l.add(this.b.a0.f.h);
            this.b.a0.f.h.k.add(this.h);
            this.h.f = iT1;
        } else if (iU1 != -1) {
            this.h.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
            this.h.f = -iU1;
        } else {
            oi1 oi1Var2 = this.h;
            oi1Var2.b = true;
            oi1Var2.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // com.zepto.xu7
    public void e() {
        if (((sk2) this.b).s1() == 1) {
            this.b.m1(this.h.g);
        } else {
            this.b.n1(this.h.g);
        }
    }

    @Override // com.zepto.xu7
    public void f() {
        this.h.c();
    }

    @Override // com.zepto.xu7
    public boolean m() {
        return false;
    }

    public final void q(oi1 oi1Var) {
        this.h.k.add(oi1Var);
        oi1Var.l.add(this.h);
    }
}
