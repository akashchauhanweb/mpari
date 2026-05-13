package com.zepto;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c91 extends s0 {
    public c91(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.zepto.s0
    public c91 e() {
        return this;
    }

    @Override // com.zepto.s0
    public void l(a0[] a0VarArr) {
        for (a0 a0Var : a0VarArr) {
            a0Var.m().f0().B(this, true);
        }
    }

    @Override // com.zepto.s0
    public void u(u0 u0Var, boolean z) {
        u0Var.f0().B(this, z);
    }

    @Override // com.zepto.s0
    public void v(u0[] u0VarArr) {
        for (u0 u0Var : u0VarArr) {
            u0Var.f0().B(this, true);
        }
    }
}
