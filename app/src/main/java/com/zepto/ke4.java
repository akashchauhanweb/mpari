package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ke4 extends mo6 {
    public static final oo6 b = e(fi6.e);
    public final gi6 a;

    public class a implements oo6 {
        public a() {
        }

        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            if (uo6Var.c() == Number.class) {
                return ke4.this;
            }
            return null;
        }
    }

    public ke4(gi6 gi6Var) {
        this.a = gi6Var;
    }

    public static oo6 d(gi6 gi6Var) {
        return gi6Var == fi6.e ? b : e(gi6Var);
    }

    public static oo6 e(gi6 gi6Var) {
        return new ke4(gi6Var).new a();
    }

    @Override // com.zepto.mo6
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(a63 a63Var, Number number) throws IOException {
        a63Var.I0(number);
    }
}
