package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class vx implements im7 {
    public Object a;
    public Class b;
    public int c;

    public vx(Class cls, int i) {
        this.b = cls;
        this.c = i;
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
