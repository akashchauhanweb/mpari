package com.zepto;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class zl2 extends jx0 implements xl2 {
    public jx0[] L0 = new jx0[4];
    public int M0 = 0;

    public void a(kx0 kx0Var) {
    }

    @Override // com.zepto.xl2
    public void b(jx0 jx0Var) {
        if (jx0Var == this || jx0Var == null) {
            return;
        }
        int i = this.M0 + 1;
        jx0[] jx0VarArr = this.L0;
        if (i > jx0VarArr.length) {
            this.L0 = (jx0[]) Arrays.copyOf(jx0VarArr, jx0VarArr.length * 2);
        }
        jx0[] jx0VarArr2 = this.L0;
        int i2 = this.M0;
        jx0VarArr2[i2] = jx0Var;
        this.M0 = i2 + 1;
    }

    @Override // com.zepto.xl2
    public void c() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    public void r1(ArrayList arrayList, int i, wu7 wu7Var) {
        for (int i2 = 0; i2 < this.M0; i2++) {
            wu7Var.a(this.L0[i2]);
        }
        for (int i3 = 0; i3 < this.M0; i3++) {
            nk2.a(this.L0[i3], i, arrayList, wu7Var);
        }
    }

    public int s1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.M0; i4++) {
            jx0 jx0Var = this.L0[i4];
            if (i == 0 && (i3 = jx0Var.I0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = jx0Var.J0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
