package com.zepto;

import com.zepto.f63;
import com.zepto.v63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class o73 extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(m73 m73Var) {
            String strX = m73Var.X().X();
            return new l73(m73Var.X().W(), k73.a(strX).a(strX));
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public m73 a(n73 n73Var) {
            return (m73) m73.Z().t(n73Var).u(o73.this.k()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public n73 d(s80 s80Var) {
            return n73.Z(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(n73 n73Var) throws GeneralSecurityException {
            if (n73Var.X().isEmpty() || !n73Var.Y()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public o73() {
        super(m73.class, new a(rl.class));
    }

    public static void m(boolean z) {
        u75.l(new o73(), z);
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(n73.class);
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
    public m73 h(s80 s80Var) {
        return m73.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(m73 m73Var) throws GeneralSecurityException {
        hm7.c(m73Var.Y(), k());
    }
}
