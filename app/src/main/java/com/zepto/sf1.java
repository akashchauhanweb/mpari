package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class sf1 implements eq3 {
    public eq3 b;
    public eq3 a = new zu4();
    public eq3 c = new yk4();
    public eq3 d = new ox(this);

    public sf1(eq3 eq3Var) {
        this.b = eq3Var;
    }

    @Override // com.zepto.eq3
    public xm6 a(Class cls) {
        xm6 xm6VarA = this.b.a(cls);
        return xm6VarA != null ? xm6VarA : b(cls);
    }

    public final xm6 b(Class cls) {
        return cls.isArray() ? this.d.a(cls) : cls.isPrimitive() ? this.a.a(cls) : this.c.a(cls);
    }
}
