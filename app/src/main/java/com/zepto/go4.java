package com.zepto;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class go4 extends uo4 {
    public pq4 m;
    public HashSet n = new HashSet();
    public ko4 o = new ko4();
    public ko4 p = new ko4();
    public int q = 0;

    public go4(pq4 pq4Var) {
        this.m = pq4Var;
    }

    public void v(gp4 gp4Var) {
        this.o.m(gp4Var);
    }

    public void w(HashSet hashSet) {
        this.n.addAll(hashSet);
    }

    public boolean x() {
        if (this.o.t() == 0) {
            return false;
        }
        r(lp4.Y2, this.o);
        int i = this.q;
        if (i != 0) {
            r(lp4.R8, new op4(i));
        }
        if (this.p.t() > 0) {
            r(lp4.Y0, this.p);
        }
        if (this.n.isEmpty()) {
            return true;
        }
        uo4 uo4Var = new uo4();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            cp4.G(uo4Var, (uo4) ((jq4) it.next()).i0());
        }
        r(lp4.m2, uo4Var);
        r(lp4.E1, new hq4("/Helv 0 Tf 0 g "));
        uo4 uo4Var2 = (uo4) uo4Var.m(lp4.u3);
        if (uo4Var2 != null) {
            this.m.r(uo4Var2);
        }
        return true;
    }
}
