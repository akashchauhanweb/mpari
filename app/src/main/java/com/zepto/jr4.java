package com.zepto;

import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jr4 implements yy5 {
    public final kz5 a;
    public final r76 b;
    public final c96 c;
    public final hf2 d;

    public jr4() {
        this(new HashMap());
    }

    @Override // com.zepto.yy5
    public Object a(Class cls, Reader reader, boolean z) {
        return e(cls, s94.b(reader), z);
    }

    @Override // com.zepto.yy5
    public void b(Object obj, Writer writer) throws ir4 {
        f(obj, s94.c(writer, this.d));
    }

    public final Object c(Class cls, cz2 cz2Var, wy0 wy0Var) {
        return new bo6(wy0Var).e(cz2Var, cls);
    }

    public final Object d(Class cls, cz2 cz2Var, iz5 iz5Var) {
        return c(cls, cz2Var, new x46(this.b, this.c, iz5Var));
    }

    public Object e(Class cls, cz2 cz2Var, boolean z) throws ir4 {
        try {
            return d(cls, cz2Var, this.a.d(z));
        } finally {
            this.a.a();
        }
    }

    public void f(Object obj, oj4 oj4Var) throws ir4 {
        try {
            h(obj, oj4Var, this.a.c());
        } finally {
            this.a.a();
        }
    }

    public final void g(Object obj, oj4 oj4Var, wy0 wy0Var) throws qe5 {
        new bo6(wy0Var).g(oj4Var, obj);
    }

    public final void h(Object obj, oj4 oj4Var, iz5 iz5Var) throws qe5 {
        g(obj, oj4Var, new x46(this.b, this.c, iz5Var));
    }

    public jr4(Map map) {
        this(new ks4(map));
    }

    public jr4(bc2 bc2Var) {
        this(new do6(), bc2Var);
    }

    public jr4(r76 r76Var, bc2 bc2Var) {
        this(r76Var, bc2Var, new hf2());
    }

    public jr4(r76 r76Var, bc2 bc2Var, hf2 hf2Var) {
        this(r76Var, bc2Var, new r12(), hf2Var);
    }

    public jr4(r76 r76Var, bc2 bc2Var, eq3 eq3Var, hf2 hf2Var) {
        this.c = new c96(bc2Var, eq3Var, hf2Var);
        this.a = new kz5();
        this.b = r76Var;
        this.d = hf2Var;
    }
}
