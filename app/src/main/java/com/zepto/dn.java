package com.zepto;

import com.zepto.f63;
import com.zepto.hg6;
import com.zepto.r63;
import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dn extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(bn bnVar) {
            return new zm(bnVar.X().g0());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        public Map c() {
            HashMap map = new HashMap();
            r63.b bVar = r63.b.TINK;
            map.put("AES128_GCM", dn.l(16, bVar));
            r63.b bVar2 = r63.b.RAW;
            map.put("AES128_GCM_RAW", dn.l(16, bVar2));
            map.put("AES256_GCM", dn.l(32, bVar));
            map.put("AES256_GCM_RAW", dn.l(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public bn a(cn cnVar) {
            return (bn) bn.Z().t(s80.u(h45.c(cnVar.W()))).u(dn.this.m()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public cn d(s80 s80Var) {
            return cn.Y(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(cn cnVar) throws InvalidAlgorithmParameterException {
            hm7.a(cnVar.W());
        }
    }

    public dn() {
        super(bn.class, new a(rl.class));
    }

    public static v63.a.C0125a l(int i, r63.b bVar) {
        return new v63.a.C0125a((cn) cn.X().t(i).h(), bVar);
    }

    public static void o(boolean z) {
        u75.l(new dn(), z);
        gn.c();
    }

    @Override // com.zepto.v63
    public hg6.b a() {
        return hg6.b.e;
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(cn.class);
    }

    @Override // com.zepto.v63
    public f63.c g() {
        return f63.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public bn h(s80 s80Var) {
        return bn.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(bn bnVar) throws GeneralSecurityException {
        hm7.c(bnVar.Y(), m());
        hm7.a(bnVar.X().size());
    }
}
