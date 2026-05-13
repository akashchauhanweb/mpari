package com.zepto;

import com.zepto.f63;
import com.zepto.r63;
import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sn extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public wi1 a(qn qnVar) {
            return new pn(qnVar.X().g0());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        public Map c() {
            HashMap map = new HashMap();
            map.put("AES256_SIV", new v63.a.C0125a((rn) rn.X().t(64).h(), r63.b.TINK));
            map.put("AES256_SIV_RAW", new v63.a.C0125a((rn) rn.X().t(64).h(), r63.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public qn a(rn rnVar) {
            return (qn) qn.Z().t(s80.u(h45.c(rnVar.W()))).u(sn.this.k()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public rn d(s80 s80Var) {
            return rn.Y(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(rn rnVar) throws InvalidAlgorithmParameterException {
            if (rnVar.W() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + rnVar.W() + ". Valid keys must have 64 bytes.");
        }
    }

    public sn() {
        super(qn.class, new a(wi1.class));
    }

    public static void m(boolean z) {
        u75.l(new sn(), z);
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(rn.class);
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
    public qn h(s80 s80Var) {
        return qn.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(qn qnVar) throws GeneralSecurityException {
        hm7.c(qnVar.Y(), k());
        if (qnVar.X().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + qnVar.X().size() + ". Valid keys must have 64 bytes.");
    }
}
