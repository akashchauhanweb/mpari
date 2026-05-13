package com.zepto;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b51 extends c91 {
    public b51(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.zepto.s0
    public b51 d() {
        return this;
    }

    @Override // com.zepto.c91, com.zepto.s0
    public void l(a0[] a0VarArr) {
        for (a0 a0Var : a0VarArr) {
            a0Var.m().e0().B(this, true);
        }
    }

    @Override // com.zepto.c91, com.zepto.s0
    public void u(u0 u0Var, boolean z) {
        u0Var.e0().B(this, z);
    }

    @Override // com.zepto.c91, com.zepto.s0
    public void v(u0[] u0VarArr) {
        for (u0 u0Var : u0VarArr) {
            u0Var.e0().B(this, true);
        }
    }
}
