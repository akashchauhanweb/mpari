package com.zepto;

import com.zepto.f63;
import com.zepto.r63;
import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cc0 extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(zb0 zb0Var) {
            return new yb0(zb0Var.X().g0());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        public Map c() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new v63.a.C0125a(bc0.V(), r63.b.TINK));
            map.put("CHACHA20_POLY1305_RAW", new v63.a.C0125a(bc0.V(), r63.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public zb0 a(bc0 bc0Var) {
            return (zb0) zb0.Z().u(cc0.this.k()).t(s80.u(h45.c(32))).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public bc0 d(s80 s80Var) {
            return bc0.W(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(bc0 bc0Var) {
        }
    }

    public cc0() {
        super(zb0.class, new a(rl.class));
    }

    public static void m(boolean z) {
        u75.l(new cc0(), z);
        fc0.c();
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(bc0.class);
    }

    @Override // com.zepto.v63
    public f63.c g() {
        return f63.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public zb0 h(s80 s80Var) {
        return zb0.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(zb0 zb0Var) throws GeneralSecurityException {
        hm7.c(zb0Var.Y(), k());
        if (zb0Var.X().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
