package com.zepto;

import com.zepto.f63;
import com.zepto.v63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class lm extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public iy2 a(jm jmVar) {
            return new im(jmVar.Z().g0(), jmVar.a0().X());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public jm a(km kmVar) {
            return (jm) jm.c0().u(kmVar.Z()).t(s80.u(h45.c(kmVar.Y()))).v(lm.this.l()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public km d(s80 s80Var) {
            return km.b0(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(km kmVar) throws GeneralSecurityException {
            hm7.a(kmVar.Y());
            lm.this.o(kmVar.Z());
        }
    }

    public lm() {
        super(jm.class, new a(iy2.class));
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(km.class);
    }

    @Override // com.zepto.v63
    public f63.c g() {
        return f63.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public jm h(s80 s80Var) {
        return jm.d0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(jm jmVar) throws GeneralSecurityException {
        hm7.c(jmVar.b0(), l());
        hm7.a(jmVar.Z().size());
        o(jmVar.a0());
    }

    public final void o(mm mmVar) throws GeneralSecurityException {
        if (mmVar.X() < 12 || mmVar.X() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
