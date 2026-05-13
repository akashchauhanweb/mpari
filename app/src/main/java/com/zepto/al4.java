package com.zepto;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class al4 {
    public HashSet h;
    public uo4 i;
    public HashMap k;
    public uo4 a = new uo4();
    public uo4 b = new uo4();
    public uo4 c = new uo4();
    public uo4 d = new uo4();
    public uo4 e = new uo4();
    public uo4 f = new uo4();
    public uo4 g = new uo4();
    public int[] j = {0};

    public void a(uo4 uo4Var) {
        this.c.q(uo4Var);
    }

    public lp4 b(lp4 lp4Var, gp4 gp4Var) {
        lp4 lp4VarD = d(lp4Var);
        this.a.r(lp4VarD, gp4Var);
        return lp4VarD;
    }

    public uo4 c() {
        eq4 eq4Var = new eq4();
        uo4 uo4Var = this.i;
        if (uo4Var != null) {
            eq4Var.s(uo4Var);
        }
        eq4Var.r(lp4.K7, new jp4("[/PDF /Text /ImageB /ImageC /ImageI]"));
        eq4Var.v(lp4.u3, this.a);
        eq4Var.v(lp4.xb, this.b);
        eq4Var.v(lp4.b1, this.c);
        eq4Var.v(lp4.h7, this.d);
        eq4Var.v(lp4.N8, this.e);
        eq4Var.v(lp4.M2, this.f);
        eq4Var.v(lp4.M7, this.g);
        return eq4Var;
    }

    public lp4 d(lp4 lp4Var) {
        if (this.h == null) {
            return lp4Var;
        }
        lp4 lp4Var2 = (lp4) this.k.get(lp4Var);
        if (lp4Var2 == null) {
            do {
                StringBuilder sb = new StringBuilder();
                sb.append("Xi");
                int[] iArr = this.j;
                int i = iArr[0];
                iArr[0] = i + 1;
                sb.append(i);
                lp4Var2 = new lp4(sb.toString());
            } while (this.h.contains(lp4Var2));
            this.k.put(lp4Var, lp4Var2);
        }
        return lp4Var2;
    }
}
