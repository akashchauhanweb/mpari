package com.zepto;

import com.zepto.f63;
import com.zepto.v63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class i73 extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(g73 g73Var) {
            String strW = g73Var.X().W();
            return k73.a(strW).a(strW);
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g73 a(h73 h73Var) {
            return (g73) g73.Z().t(h73Var).u(i73.this.k()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h73 d(s80 s80Var) {
            return h73.X(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(h73 h73Var) {
        }
    }

    public i73() {
        super(g73.class, new a(rl.class));
    }

    public static void m(boolean z) {
        u75.l(new i73(), z);
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(h73.class);
    }

    @Override // com.zepto.v63
    public f63.c g() {
        return f63.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g73 h(s80 s80Var) {
        return g73.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(g73 g73Var) throws GeneralSecurityException {
        hm7.c(g73Var.Y(), k());
    }
}
