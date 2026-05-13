package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class iu1 implements lx4 {
    public static final Object c = new Object();
    public volatile lx4 a;
    public volatile Object b = c;

    public iu1(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static lx4 a(lx4 lx4Var) {
        hu4.b(lx4Var);
        return lx4Var instanceof iu1 ? lx4Var : new iu1(lx4Var);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.zepto.lx4
    public Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.get();
                        this.b = b(this.b, obj);
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
