package com.zepto;

import com.zepto.f63;
import com.zepto.r63;
import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wz7 extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(tz7 tz7Var) {
            return new sz7(tz7Var.X().g0());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        public Map c() {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new v63.a.C0125a(vz7.V(), r63.b.TINK));
            map.put("XCHACHA20_POLY1305_RAW", new v63.a.C0125a(vz7.V(), r63.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public tz7 a(vz7 vz7Var) {
            return (tz7) tz7.Z().u(wz7.this.k()).t(s80.u(h45.c(32))).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public vz7 d(s80 s80Var) {
            return vz7.W(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(vz7 vz7Var) {
        }
    }

    public wz7() {
        super(tz7.class, new a(rl.class));
    }

    public static void m(boolean z) {
        u75.l(new wz7(), z);
        zz7.c();
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(vz7.class);
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
    public tz7 h(s80 s80Var) {
        return tz7.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(tz7 tz7Var) throws GeneralSecurityException {
        hm7.c(tz7Var.Y(), k());
        if (tz7Var.X().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
