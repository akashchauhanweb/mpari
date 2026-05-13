package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class lb3 implements nx4 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile nx4 b;

    public lb3(nx4 nx4Var) {
        this.b = nx4Var;
    }

    @Override // com.zepto.nx4
    public Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
