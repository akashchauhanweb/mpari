package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class x46 implements wy0 {
    public zd6 a;
    public r76 b;
    public c96 c;
    public iz5 d;
    public bc2 e;

    public x46(r76 r76Var, c96 c96Var, iz5 iz5Var) {
        ae6 ae6Var = new ae6(this, c96Var);
        this.e = ae6Var;
        this.a = new zd6(ae6Var);
        this.b = r76Var;
        this.c = c96Var;
        this.d = iz5Var;
    }

    @Override // com.zepto.wy0
    public boolean a() {
        return this.d.a();
    }

    @Override // com.zepto.wy0
    public Class b(lo6 lo6Var, Object obj) {
        return obj != null ? obj.getClass() : lo6Var.getType();
    }

    @Override // com.zepto.wy0
    public we1 c(Class cls) {
        return p(cls).j();
    }

    @Override // com.zepto.wy0
    public b03 d(Class cls) {
        return this.c.g(cls);
    }

    @Override // com.zepto.wy0
    public Object e(Object obj) {
        return this.d.get(obj);
    }

    @Override // com.zepto.wy0
    public c96 f() {
        return this.c;
    }

    @Override // com.zepto.wy0
    public ma0 g(Class cls) {
        return p(cls).i(this);
    }

    @Override // com.zepto.wy0
    public String getProperty(String str) {
        return this.a.d(str);
    }

    @Override // com.zepto.wy0
    public cp5 h(Class cls) throws ir4 {
        no5 no5VarP = p(cls);
        if (no5VarP != null) {
            return new bq0(no5VarP, this);
        }
        throw new ir4("Invalid schema class %s", cls);
    }

    @Override // com.zepto.wy0
    public String i(Class cls) {
        return this.c.k(cls);
    }

    @Override // com.zepto.wy0
    public im7 j(lo6 lo6Var, cz2 cz2Var) throws ir4 {
        w94 w94VarC = cz2Var.c();
        if (w94VarC != null) {
            return this.b.a(lo6Var, w94VarC, this.d);
        }
        throw new ir4("No attributes for %s", cz2Var);
    }

    @Override // com.zepto.wy0
    public iz5 k() {
        return this.d;
    }

    @Override // com.zepto.wy0
    public n86 l() {
        return this.c.n();
    }

    @Override // com.zepto.wy0
    public boolean m(lo6 lo6Var, Object obj, oj4 oj4Var) throws ir4 {
        w94 w94VarC = oj4Var.c();
        if (w94VarC != null) {
            return this.b.b(lo6Var, obj, w94VarC, this.d);
        }
        throw new ir4("No attributes for %s", oj4Var);
    }

    @Override // com.zepto.wy0
    public ip7 n(Class cls) {
        return p(cls).e();
    }

    @Override // com.zepto.wy0
    public boolean o(Class cls) {
        return this.c.q(cls);
    }

    public final no5 p(Class cls) {
        return this.c.m(cls);
    }
}
