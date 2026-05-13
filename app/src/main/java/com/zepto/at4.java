package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class at4 extends ys4 {
    public final Object c;

    public at4(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // com.zepto.ys4, com.zepto.ws4
    public boolean a(Object obj) {
        boolean zA;
        synchronized (this.c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // com.zepto.ys4, com.zepto.ws4
    public Object b() {
        Object objB;
        synchronized (this.c) {
            objB = super.b();
        }
        return objB;
    }
}
