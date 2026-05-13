package com.zepto;

import com.zepto.jx0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ph4 {
    public static boolean[] a = new boolean[3];

    public static void a(kx0 kx0Var, nf3 nf3Var, jx0 jx0Var) {
        jx0Var.t = -1;
        jx0Var.u = -1;
        jx0.b bVar = kx0Var.Z[0];
        jx0.b bVar2 = jx0.b.WRAP_CONTENT;
        if (bVar != bVar2 && jx0Var.Z[0] == jx0.b.MATCH_PARENT) {
            int i = jx0Var.O.g;
            int iW = kx0Var.W() - jx0Var.Q.g;
            yw0 yw0Var = jx0Var.O;
            yw0Var.i = nf3Var.q(yw0Var);
            yw0 yw0Var2 = jx0Var.Q;
            yw0Var2.i = nf3Var.q(yw0Var2);
            nf3Var.f(jx0Var.O.i, i);
            nf3Var.f(jx0Var.Q.i, iW);
            jx0Var.t = 2;
            jx0Var.O0(i, iW);
        }
        if (kx0Var.Z[1] == bVar2 || jx0Var.Z[1] != jx0.b.MATCH_PARENT) {
            return;
        }
        int i2 = jx0Var.P.g;
        int iX = kx0Var.x() - jx0Var.R.g;
        yw0 yw0Var3 = jx0Var.P;
        yw0Var3.i = nf3Var.q(yw0Var3);
        yw0 yw0Var4 = jx0Var.R;
        yw0Var4.i = nf3Var.q(yw0Var4);
        nf3Var.f(jx0Var.P.i, i2);
        nf3Var.f(jx0Var.R.i, iX);
        if (jx0Var.l0 > 0 || jx0Var.V() == 8) {
            yw0 yw0Var5 = jx0Var.S;
            yw0Var5.i = nf3Var.q(yw0Var5);
            nf3Var.f(jx0Var.S.i, jx0Var.l0 + i2);
        }
        jx0Var.u = 2;
        jx0Var.f1(i2, iX);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
