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
public final class hm extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(fm fmVar) {
            return new f22((iy2) new lm().e(fmVar.Y(), iy2.class), (to3) new en2().e(fmVar.Z(), to3.class), fmVar.Z().a0().Z());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        public Map c() {
            HashMap map = new HashMap();
            il2 il2Var = il2.SHA256;
            r63.b bVar = r63.b.TINK;
            map.put("AES128_CTR_HMAC_SHA256", hm.m(16, 16, 32, 16, il2Var, bVar));
            r63.b bVar2 = r63.b.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", hm.m(16, 16, 32, 16, il2Var, bVar2));
            map.put("AES256_CTR_HMAC_SHA256", hm.m(32, 16, 32, 32, il2Var, bVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", hm.m(32, 16, 32, 32, il2Var, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public fm a(gm gmVar) {
            jm jmVar = (jm) new lm().f().a(gmVar.X());
            return (fm) fm.b0().t(jmVar).u((bn2) new en2().f().a(gmVar.Y())).v(hm.this.n()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public gm d(s80 s80Var) {
            return gm.a0(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(gm gmVar) throws InvalidAlgorithmParameterException {
            new lm().f().e(gmVar.X());
            new en2().f().e(gmVar.Y());
            hm7.a(gmVar.X().Y());
        }
    }

    public hm() {
        super(fm.class, new a(rl.class));
    }

    public static gm l(int i, int i2, int i3, int i4, il2 il2Var) {
        km kmVar = (km) km.a0().u((mm) mm.Y().t(i2).h()).t(i).h();
        return (gm) gm.Z().t(kmVar).u((cn2) cn2.a0().u((gn2) gn2.a0().t(il2Var).u(i4).h()).t(i3).h()).h();
    }

    public static v63.a.C0125a m(int i, int i2, int i3, int i4, il2 il2Var, r63.b bVar) {
        return new v63.a.C0125a(l(i, i2, i3, i4, il2Var), bVar);
    }

    public static void p(boolean z) {
        u75.l(new hm(), z);
    }

    @Override // com.zepto.v63
    public hg6.b a() {
        return hg6.b.e;
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(gm.class);
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
    public fm h(s80 s80Var) {
        return fm.c0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(fm fmVar) throws GeneralSecurityException {
        hm7.c(fmVar.a0(), n());
        new lm().j(fmVar.Y());
        new en2().j(fmVar.Z());
    }
}
