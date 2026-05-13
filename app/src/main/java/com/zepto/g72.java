package com.zepto;

import com.zepto.ri2;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g72 {
    public static boolean b = true;
    public static volatile g72 c;
    public static final g72 d = new g72(true);
    public final Map a = Collections.emptyMap();

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public g72(boolean z) {
    }

    public static g72 b() {
        g72 g72VarA = c;
        if (g72VarA == null) {
            synchronized (g72.class) {
                try {
                    g72VarA = c;
                    if (g72VarA == null) {
                        g72VarA = b ? f72.a() : d;
                        c = g72VarA;
                    }
                } finally {
                }
            }
        }
        return g72VarA;
    }

    public ri2.c a(at3 at3Var, int i) {
        wb0.a(this.a.get(new a(at3Var, i)));
        return null;
    }
}
