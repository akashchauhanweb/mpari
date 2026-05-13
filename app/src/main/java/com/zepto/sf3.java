package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class sf3 extends fl4 {
    public fk0 o;

    public sf3(String str) {
        super(str);
    }

    public fk0 I0() {
        return this.o;
    }

    public void J0(float f, boolean z) {
        if (z) {
            A0(I0().h());
        } else {
            A0(f);
        }
    }

    public void K0(fk0 fk0Var) {
        if (this.o == null) {
            this.o = fk0Var;
            if (fk0Var.d().l()) {
                this.o.m(this.e);
            }
        }
    }

    @Override // com.zepto.fl4, com.zepto.cs4, com.zepto.f02
    public int z() {
        return 15;
    }
}
