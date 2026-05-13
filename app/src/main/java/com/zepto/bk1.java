package com.zepto;

import com.zepto.oi1;

/* JADX INFO: loaded from: classes.dex */
public class bk1 extends oi1 {
    public int m;

    public bk1(xu7 xu7Var) {
        super(xu7Var);
        if (xu7Var instanceof gr2) {
            this.e = oi1.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = oi1.a.VERTICAL_DIMENSION;
        }
    }

    @Override // com.zepto.oi1
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (ii1 ii1Var : this.k) {
            ii1Var.a(ii1Var);
        }
    }
}
