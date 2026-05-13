package com.zepto;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class iq4 extends uo4 {
    public HashMap m;
    public gp4 n;
    public pq4 o;

    public iq4(pq4 pq4Var) {
        super(lp4.q9);
        this.m = new HashMap();
        this.o = pq4Var;
        this.n = pq4Var.K();
    }

    public void v() {
        HashMap map = new HashMap();
        for (Integer num : this.m.keySet()) {
            map.put(num, this.o.n((ko4) this.m.get(num)).a());
        }
        uo4 uo4VarA = pp4.a(map, this.o);
        if (uo4VarA != null) {
            r(lp4.d7, this.o.n(uo4VarA).a());
        }
        x(this, this.n);
    }

    public gp4 w() {
        return this.n;
    }

    public final void x(uo4 uo4Var, gp4 gp4Var) {
        rp4 rp4VarM = uo4Var.m(lp4.Y4);
        if (rp4VarM != null && rp4VarM.d()) {
            ko4 ko4Var = (ko4) rp4VarM;
            if (!((rp4) ko4Var.r().get(0)).i()) {
                ArrayList arrayListR = ko4Var.r();
                if (arrayListR.size() > 0) {
                    wb0.a(arrayListR.get(0));
                    throw null;
                }
            }
        }
        if (gp4Var != null) {
            this.o.o(uo4Var, gp4Var);
        }
    }
}
