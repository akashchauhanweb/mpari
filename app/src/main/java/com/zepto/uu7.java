package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class uu7 extends jx0 {
    public ArrayList L0 = new ArrayList();

    public void b(jx0 jx0Var) {
        this.L0.add(jx0Var);
        if (jx0Var.K() != null) {
            ((uu7) jx0Var.K()).t1(jx0Var);
        }
        jx0Var.c1(this);
    }

    public ArrayList r1() {
        return this.L0;
    }

    public abstract void s1();

    @Override // com.zepto.jx0
    public void t0() {
        this.L0.clear();
        super.t0();
    }

    public void t1(jx0 jx0Var) {
        this.L0.remove(jx0Var);
        jx0Var.t0();
    }

    public void u1() {
        this.L0.clear();
    }

    @Override // com.zepto.jx0
    public void w0(j90 j90Var) {
        super.w0(j90Var);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            ((jx0) this.L0.get(i)).w0(j90Var);
        }
    }
}
