package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class rc8 implements wc8, lc8 {
    public static final Object c = new Object();
    public volatile wc8 a;
    public volatile Object b = c;

    public rc8(wc8 wc8Var) {
        this.a = wc8Var;
    }

    public static lc8 b(wc8 wc8Var) {
        if (wc8Var instanceof lc8) {
            return (lc8) wc8Var;
        }
        wc8Var.getClass();
        return new rc8(wc8Var);
    }

    public static wc8 c(wc8 wc8Var) {
        wc8Var.getClass();
        return wc8Var instanceof rc8 ? wc8Var : new rc8(wc8Var);
    }

    @Override // com.zepto.wc8
    public final Object a() {
        Object objA = this.b;
        Object obj = c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.b;
                    if (objA == obj) {
                        objA = this.a.a();
                        Object obj2 = this.b;
                        if (obj2 != obj && obj2 != objA) {
                            String strValueOf = String.valueOf(obj2);
                            String strValueOf2 = String.valueOf(objA);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(strValueOf);
                            sb.append(" & ");
                            sb.append(strValueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                        this.b = objA;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
