package com.zepto;

import java.io.OutputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class uo4 extends rp4 {
    public static final lp4 h = lp4.u3;
    public static final lp4 i = lp4.N6;
    public static final lp4 j = lp4.T6;
    public static final lp4 k = lp4.Y6;
    public static final lp4 l = lp4.F0;
    public lp4 f;
    public HashMap g;

    public uo4() {
        super(6);
        this.f = null;
        this.g = new HashMap();
    }

    @Override // com.zepto.rp4
    public void k(pq4 pq4Var, OutputStream outputStream) {
        outputStream.write(60);
        outputStream.write(60);
        for (lp4 lp4Var : this.g.keySet()) {
            rp4 rp4Var = (rp4) this.g.get(lp4Var);
            lp4Var.k(pq4Var, outputStream);
            int iL = rp4Var.l();
            if (iL != 5 && iL != 6 && iL != 4 && iL != 3) {
                outputStream.write(32);
            }
            rp4Var.k(pq4Var, outputStream);
        }
        outputStream.write(62);
        outputStream.write(62);
    }

    public rp4 m(lp4 lp4Var) {
        return (rp4) this.g.get(lp4Var);
    }

    public uo4 n(lp4 lp4Var) {
        rp4 rp4VarO = o(lp4Var);
        if (rp4VarO == null || !rp4VarO.e()) {
            return null;
        }
        return (uo4) rp4VarO;
    }

    public rp4 o(lp4 lp4Var) {
        return bq4.a(m(lp4Var));
    }

    public void p(uo4 uo4Var) {
        this.g.putAll(uo4Var.g);
    }

    public void q(uo4 uo4Var) {
        for (lp4 lp4Var : uo4Var.g.keySet()) {
            if (!this.g.containsKey(lp4Var)) {
                this.g.put(lp4Var, uo4Var.g.get(lp4Var));
            }
        }
    }

    public void r(lp4 lp4Var, rp4 rp4Var) {
        if (rp4Var == null || rp4Var.h()) {
            this.g.remove(lp4Var);
        } else {
            this.g.put(lp4Var, rp4Var);
        }
    }

    public void s(uo4 uo4Var) {
        this.g.putAll(uo4Var.g);
    }

    public void t(lp4 lp4Var) {
        this.g.remove(lp4Var);
    }

    @Override // com.zepto.rp4
    public String toString() {
        lp4 lp4Var = lp4.sa;
        if (m(lp4Var) == null) {
            return "Dictionary";
        }
        return "Dictionary of type: " + m(lp4Var);
    }

    public int u() {
        return this.g.size();
    }

    public uo4(lp4 lp4Var) {
        this();
        this.f = lp4Var;
        r(lp4.sa, lp4Var);
    }
}
