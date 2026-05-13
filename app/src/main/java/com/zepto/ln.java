package com.zepto;

import com.zepto.f63;
import com.zepto.r63;
import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class ln extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(jn jnVar) {
            return new hn(jnVar.X().g0());
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
            map.put("AES128_GCM_SIV", ln.m(16, bVar));
            r63.b bVar2 = r63.b.RAW;
            map.put("AES128_GCM_SIV_RAW", ln.m(16, bVar2));
            map.put("AES256_GCM_SIV", ln.m(32, bVar));
            map.put("AES256_GCM_SIV_RAW", ln.m(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public jn a(kn knVar) {
            return (jn) jn.Z().t(s80.u(h45.c(knVar.W()))).u(ln.this.n()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public kn d(s80 s80Var) {
            return kn.Y(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(kn knVar) throws InvalidAlgorithmParameterException {
            hm7.a(knVar.W());
        }
    }

    public ln() {
        super(jn.class, new a(rl.class));
    }

    public static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v63.a.C0125a m(int i, r63.b bVar) {
        return new v63.a.C0125a((kn) kn.X().t(i).h(), bVar);
    }

    public static void p(boolean z) {
        if (l()) {
            u75.l(new ln(), z);
            on.c();
        }
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(kn.class);
    }

    @Override // com.zepto.v63
    public f63.c g() {
        return f63.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public jn h(s80 s80Var) {
        return jn.a0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(jn jnVar) throws GeneralSecurityException {
        hm7.c(jnVar.Y(), n());
        hm7.a(jnVar.X().size());
    }
}
