package com.zepto;

import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class oq4 {
    public static final lp4[] c = {lp4.q4, lp4.p4, lp4.r4, lp4.n3, lp4.J0, lp4.d2, lp4.j6, lp4.c2, lp4.Xa, lp4.Ya, lp4.E7, lp4.F7, lp4.H7, lp4.p2, lp4.q7, lp4.G7, lp4.n6};
    public static final lp4[] d = {lp4.Ga, lp4.Ia, lp4.Ma, lp4.Ha};
    public static final lp4[] e = {lp4.c5, lp4.U7};
    public static final lp4[] f = {lp4.I5, lp4.y1, lp4.n0, lp4.ja, lp4.M};
    public static final lp4[] g = {lp4.K, lp4.i6};
    public static final lp4[] h = {lp4.T8, lp4.q2, lp4.r2};
    public int a = 0;
    public uo4 b = new uo4();

    public void a(uo4 uo4Var) {
        lp4 lp4Var = lp4.W6;
        uo4Var.t(lp4Var);
        int i = this.a;
        if ((i & 1) != 0) {
            uo4Var.r(lp4Var, lp4.U8);
        } else if ((i & 2) != 0) {
            uo4Var.r(lp4Var, lp4.B6);
        } else if ((i & 4) != 0) {
            uo4Var.r(lp4Var, lp4.na);
        } else if ((i & 8) != 0) {
            uo4Var.r(lp4Var, lp4.oa);
        } else if ((i & 16) != 0) {
            uo4Var.r(lp4Var, lp4.pa);
        } else if ((i & 32) != 0) {
            uo4Var.r(lp4Var, lp4.qa);
        }
        lp4 lp4Var2 = lp4.X6;
        uo4Var.t(lp4Var2);
        int i2 = this.a;
        if ((i2 & 64) != 0) {
            uo4Var.r(lp4Var2, lp4.Ga);
        } else if ((i2 & 128) != 0) {
            uo4Var.r(lp4Var2, lp4.Ia);
        } else if ((i2 & 256) != 0) {
            uo4Var.r(lp4Var2, lp4.Ma);
        } else if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            uo4Var.r(lp4Var2, lp4.K3);
        } else if ((i2 & 1024) != 0) {
            uo4Var.r(lp4Var2, lp4.Ha);
        } else if ((i2 & 2048) != 0) {
            uo4Var.r(lp4Var2, lp4.Fa);
        }
        lp4 lp4Var3 = lp4.Za;
        uo4Var.t(lp4Var3);
        if (this.b.u() > 0) {
            uo4Var.r(lp4Var3, this.b);
        }
    }
}
