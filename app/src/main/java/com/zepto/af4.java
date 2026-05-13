package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class af4 implements b03 {
    public final wy0 a;
    public final im7 b;
    public final Class c;

    public af4(wy0 wy0Var, im7 im7Var) {
        this.c = im7Var.getType();
        this.a = wy0Var;
        this.b = im7Var;
    }

    @Override // com.zepto.b03
    public boolean a() {
        return this.b.a();
    }

    @Override // com.zepto.b03
    public Object b(Object obj) {
        im7 im7Var = this.b;
        if (im7Var != null) {
            im7Var.setValue(obj);
        }
        return obj;
    }

    @Override // com.zepto.b03
    public Object c() {
        if (this.b.a()) {
            return this.b.getValue();
        }
        Object objD = d(this.c);
        im7 im7Var = this.b;
        if (im7Var != null) {
            im7Var.setValue(objD);
        }
        return objD;
    }

    public Object d(Class cls) {
        return this.a.d(cls).c();
    }

    @Override // com.zepto.b03
    public Class getType() {
        return this.c;
    }
}
