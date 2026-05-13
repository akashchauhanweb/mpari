package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class xj4 implements im7 {
    public final im7 a;
    public final Class b;

    public xj4(im7 im7Var, Class cls) {
        this.a = im7Var;
        this.b = cls;
    }

    @Override // com.zepto.im7
    public boolean a() {
        return this.a.a();
    }

    @Override // com.zepto.im7
    public Class getType() {
        return this.b;
    }

    @Override // com.zepto.im7
    public Object getValue() {
        return this.a.getValue();
    }

    @Override // com.zepto.im7
    public void setValue(Object obj) {
        this.a.setValue(obj);
    }
}
