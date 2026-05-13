package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class cp4 extends io4 {
    public static final lp4 N;
    public static final lp4 O;
    public static final lp4 P;
    public static final lp4 Q;
    public static final lp4 R;
    public static final lp4 S;
    public static lp4[] T;
    public cp4 L;
    public ArrayList M;

    static {
        lp4 lp4Var = lp4.h;
        N = lp4Var;
        O = lp4.V;
        P = lp4.E8;
        Q = lp4.R5;
        R = lp4Var;
        S = lp4.S6;
        T = new lp4[]{lp4.u3, lp4.xb, lp4.b1, lp4.h7};
    }

    public cp4(pq4 pq4Var) {
        super(pq4Var, null);
        this.p = true;
        this.q = false;
    }

    public static void G(uo4 uo4Var, uo4 uo4Var2) {
        H(uo4Var, uo4Var2, null);
    }

    public static void H(uo4 uo4Var, uo4 uo4Var2, fq4 fq4Var) {
        int i = 0;
        while (true) {
            lp4[] lp4VarArr = T;
            if (i >= lp4VarArr.length) {
                return;
            }
            lp4 lp4Var = lp4VarArr[i];
            uo4 uo4VarN = uo4Var2.n(lp4Var);
            if (uo4VarN != null) {
                uo4 uo4Var3 = (uo4) bq4.b(uo4Var.m(lp4Var), uo4Var);
                if (uo4Var3 == null) {
                    uo4Var3 = new uo4();
                }
                uo4Var3.q(uo4VarN);
                uo4Var.r(lp4Var, uo4Var3);
            }
            i++;
        }
    }

    public static io4 I(io4 io4Var) {
        io4 io4Var2;
        if (io4Var.A()) {
            cp4 cp4Var = new cp4(io4Var.m);
            cp4 cp4Var2 = (cp4) io4Var;
            cp4Var.L = cp4Var2.L;
            cp4Var.M = cp4Var2.M;
            io4Var2 = cp4Var;
        } else {
            io4Var2 = new io4(io4Var.m, null);
        }
        io4Var2.p(io4Var);
        io4Var2.p = io4Var.p;
        io4Var2.q = io4Var.q;
        io4Var2.o = io4Var.o;
        return io4Var2;
    }

    @Override // com.zepto.io4
    public void D() {
        this.r = true;
        cp4 cp4Var = this.L;
        if (cp4Var != null) {
            r(lp4.c7, cp4Var.w());
        }
        if (this.M != null) {
            ko4 ko4Var = new ko4();
            for (int i = 0; i < this.M.size(); i++) {
                ko4Var.m(((cp4) this.M.get(i)).w());
            }
            r(lp4.a5, ko4Var);
        }
        if (this.o == null) {
            return;
        }
        uo4 uo4Var = new uo4();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            G(uo4Var, (uo4) ((jq4) it.next()).i0());
        }
        r(lp4.m2, uo4Var);
    }

    public ArrayList E() {
        return this.M;
    }

    public cp4 F() {
        return this.L;
    }
}
