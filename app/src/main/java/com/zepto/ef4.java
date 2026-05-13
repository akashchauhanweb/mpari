package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ef4 extends mo6 {
    public static final oo6 c = e(fi6.c);
    public final pk2 a;
    public final gi6 b;

    public class a implements oo6 {
        public final /* synthetic */ gi6 c;

        public a(gi6 gi6Var) {
            this.c = gi6Var;
        }

        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            a aVar = null;
            if (uo6Var.c() == Object.class) {
                return new ef4(pk2Var, this.c, aVar);
            }
            return null;
        }
    }

    public /* synthetic */ ef4(pk2 pk2Var, gi6 gi6Var, a aVar) {
        this(pk2Var, gi6Var);
    }

    public static oo6 d(gi6 gi6Var) {
        return gi6Var == fi6.c ? c : e(gi6Var);
    }

    private static oo6 e(gi6 gi6Var) {
        return new a(gi6Var);
    }

    @Override // com.zepto.mo6
    public void c(a63 a63Var, Object obj) throws IOException {
        if (obj == null) {
            a63Var.m0();
            return;
        }
        mo6 mo6VarG = this.a.g(obj.getClass());
        if (!(mo6VarG instanceof ef4)) {
            mo6VarG.c(a63Var, obj);
        } else {
            a63Var.m();
            a63Var.B();
        }
    }

    public ef4(pk2 pk2Var, gi6 gi6Var) {
        this.a = pk2Var;
        this.b = gi6Var;
    }
}
