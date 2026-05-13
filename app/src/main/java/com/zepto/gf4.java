package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class gf4 implements im7 {
    public Object a;
    public Class b;

    public gf4(Class cls) {
        this.b = cls;
    }

    @Override // com.zepto.im7
    public boolean a() {
        return false;
    }

    @Override // com.zepto.im7
    public Class getType() {
        return this.b;
    }

    @Override // com.zepto.im7
    public Object getValue() {
        return this.a;
    }

    @Override // com.zepto.im7
    public void setValue(Object obj) {
        this.a = obj;
    }
}
