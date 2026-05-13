package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class wp6 extends up6 {
    @Override // com.zepto.up6
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public vp6 g(Object obj) {
        return ((ri2) obj).unknownFields;
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(vp6 vp6Var) {
        return vp6Var.d();
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(vp6 vp6Var) {
        return vp6Var.e();
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public vp6 k(vp6 vp6Var, vp6 vp6Var2) {
        return vp6.c().equals(vp6Var2) ? vp6Var : vp6.c().equals(vp6Var) ? vp6.j(vp6Var, vp6Var2) : vp6Var.i(vp6Var2);
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public vp6 n() {
        return vp6.k();
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, vp6 vp6Var) {
        p(obj, vp6Var);
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, vp6 vp6Var) {
        ((ri2) obj).unknownFields = vp6Var;
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public vp6 r(vp6 vp6Var) {
        vp6Var.h();
        return vp6Var;
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(vp6 vp6Var, nz7 nz7Var) {
        vp6Var.p(nz7Var);
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(vp6 vp6Var, nz7 nz7Var) {
        vp6Var.r(nz7Var);
    }

    @Override // com.zepto.up6
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.zepto.up6
    public boolean q(d55 d55Var) {
        return false;
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(vp6 vp6Var, int i, int i2) {
        vp6Var.n(zw7.c(i, 5), Integer.valueOf(i2));
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(vp6 vp6Var, int i, long j) {
        vp6Var.n(zw7.c(i, 1), Long.valueOf(j));
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(vp6 vp6Var, int i, vp6 vp6Var2) {
        vp6Var.n(zw7.c(i, 3), vp6Var2);
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(vp6 vp6Var, int i, s80 s80Var) {
        vp6Var.n(zw7.c(i, 2), s80Var);
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(vp6 vp6Var, int i, long j) {
        vp6Var.n(zw7.c(i, 0), Long.valueOf(j));
    }

    @Override // com.zepto.up6
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public vp6 f(Object obj) {
        vp6 vp6VarG = g(obj);
        if (vp6VarG != vp6.c()) {
            return vp6VarG;
        }
        vp6 vp6VarK = vp6.k();
        p(obj, vp6VarK);
        return vp6VarK;
    }
}
