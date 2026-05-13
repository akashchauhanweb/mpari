package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class up6 {
    public abstract void a(Object obj, int i, int i2);

    public abstract void b(Object obj, int i, long j);

    public abstract void c(Object obj, int i, Object obj2);

    public abstract void d(Object obj, int i, s80 s80Var);

    public abstract void e(Object obj, int i, long j);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, d55 d55Var) {
        while (d55Var.o() != Integer.MAX_VALUE && m(obj, d55Var)) {
        }
    }

    public final boolean m(Object obj, d55 d55Var) throws b13 {
        int tag = d55Var.getTag();
        int iA = zw7.a(tag);
        int iB = zw7.b(tag);
        if (iB == 0) {
            e(obj, iA, d55Var.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, d55Var.e());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, d55Var.u());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw b13.e();
            }
            a(obj, iA, d55Var.m());
            return true;
        }
        Object objN = n();
        int iC = zw7.c(iA, 4);
        l(objN, d55Var);
        if (iC != d55Var.getTag()) {
            throw b13.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(d55 d55Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, nz7 nz7Var);

    public abstract void t(Object obj, nz7 nz7Var);
}
