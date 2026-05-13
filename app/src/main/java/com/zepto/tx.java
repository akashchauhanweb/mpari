package com.zepto;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class tx extends mo6 {
    public static final oo6 c = new a();
    public final Class a;
    public final mo6 b;

    public class a implements oo6 {
        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            Type typeD = uo6Var.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = d.g(typeD);
            return new tx(pk2Var, pk2Var.f(uo6.b(typeG)), d.k(typeG));
        }
    }

    public tx(pk2 pk2Var, mo6 mo6Var, Class cls) {
        this.b = new qo6(pk2Var, mo6Var, cls);
        this.a = cls;
    }

    @Override // com.zepto.mo6
    public void c(a63 a63Var, Object obj) throws IOException {
        if (obj == null) {
            a63Var.m0();
            return;
        }
        a63Var.j();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(a63Var, Array.get(obj, i));
        }
        a63Var.w();
    }
}
