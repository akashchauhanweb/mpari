package com.zepto;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nr0 implements oo6 {
    public final qx0 c;

    public static final class a extends mo6 {
        public final mo6 a;
        public final se4 b;

        public a(pk2 pk2Var, Type type, mo6 mo6Var, se4 se4Var) {
            this.a = new qo6(pk2Var, mo6Var, type);
            this.b = se4Var;
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Collection collection) throws IOException {
            if (collection == null) {
                a63Var.m0();
                return;
            }
            a63Var.j();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.a.c(a63Var, it.next());
            }
            a63Var.w();
        }
    }

    public nr0(qx0 qx0Var) {
        this.c = qx0Var;
    }

    @Override // com.zepto.oo6
    public mo6 a(pk2 pk2Var, uo6 uo6Var) {
        Type typeD = uo6Var.d();
        Class clsC = uo6Var.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = d.h(typeD, clsC);
        return new a(pk2Var, typeH, pk2Var.f(uo6.b(typeH)), this.c.b(uo6Var));
    }
}
