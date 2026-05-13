package com.zepto;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class yp4 extends uo4 {
    public static final String[] n = {"crop", "trim", "art", "bleed"};
    public static final lp4[] o = {lp4.y1, lp4.ja, lp4.M, lp4.n0};
    public static final op4 p = new op4(0);
    public static final op4 q = new op4(90);
    public static final op4 r = new op4(180);
    public static final op4 s = new op4(270);
    public cq4 m;

    public yp4(cq4 cq4Var, HashMap map, uo4 uo4Var, int i) {
        super(uo4.j);
        this.m = cq4Var;
        r(lp4.I5, cq4Var);
        r(lp4.h8, uo4Var);
        if (i != 0) {
            r(lp4.z8, new op4(i));
        }
        int i2 = 0;
        while (true) {
            String[] strArr = n;
            if (i2 >= strArr.length) {
                return;
            }
            rp4 rp4Var = (rp4) map.get(strArr[i2]);
            if (rp4Var != null) {
                r(o[i2], rp4Var);
            }
            i2++;
        }
    }

    public void v(gp4 gp4Var) {
        r(lp4.o1, gp4Var);
    }
}
