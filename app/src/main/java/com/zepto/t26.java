package com.zepto;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class t26 implements i31 {
    public final List a;
    public final q26 b;
    public final Class c;

    public t26(q26 q26Var) {
        this.c = q26Var.w();
        this.a = q26Var.u();
        this.b = q26Var;
    }

    @Override // com.zepto.i31
    public Object a(k31 k31Var) {
        Object[] array = this.a.toArray();
        for (int i = 0; i < this.a.size(); i++) {
            array[i] = d(k31Var, i);
        }
        return this.b.n(array);
    }

    public final double b(double d) {
        return d > 0.0d ? (((double) this.a.size()) / 1000.0d) + (d / ((double) this.a.size())) : d / ((double) this.a.size());
    }

    public final double c(k31 k31Var) {
        double d = 0.0d;
        for (gl4 gl4Var : this.a) {
            if (k31Var.get(gl4Var.getKey()) != null) {
                d += 1.0d;
            } else if (gl4Var.e() || gl4Var.c()) {
                return -1.0d;
            }
        }
        return b(d);
    }

    public final Object d(k31 k31Var, int i) {
        mm7 mm7VarRemove = k31Var.remove(((gl4) this.a.get(i)).getKey());
        if (mm7VarRemove != null) {
            return mm7VarRemove.c();
        }
        return null;
    }

    @Override // com.zepto.i31
    public q26 f() {
        return this.b;
    }

    @Override // com.zepto.i31
    public double g(k31 k31Var) {
        q26 q26VarM = this.b.m();
        for (Object obj : k31Var) {
            gl4 gl4VarR = q26VarM.r(obj);
            mm7 mm7Var = k31Var.get(obj);
            vx0 vx0VarO = mm7Var.o();
            if (gl4VarR != null && !c96.o(mm7Var.c().getClass(), gl4VarR.getType())) {
                return -1.0d;
            }
            if (vx0VarO.d() && gl4VarR == null) {
                return -1.0d;
            }
        }
        return c(k31Var);
    }

    public String toString() {
        return this.b.toString();
    }
}
