package com.zepto;

import com.zepto.f63;
import com.zepto.r63;
import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rm extends v63 {

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rl a(pm pmVar) {
            return new nm(pmVar.Y().g0(), pmVar.Z().X());
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
            map.put("AES128_EAX", rm.l(16, 16, bVar));
            r63.b bVar2 = r63.b.RAW;
            map.put("AES128_EAX_RAW", rm.l(16, 16, bVar2));
            map.put("AES256_EAX", rm.l(32, 16, bVar));
            map.put("AES256_EAX_RAW", rm.l(32, 16, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public pm a(qm qmVar) {
            return (pm) pm.b0().t(s80.u(h45.c(qmVar.X()))).u(qmVar.Y()).v(rm.this.m()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public qm d(s80 s80Var) {
            return qm.a0(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(qm qmVar) throws GeneralSecurityException {
            hm7.a(qmVar.X());
            if (qmVar.Y().X() != 12 && qmVar.Y().X() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public rm() {
        super(pm.class, new a(rl.class));
    }

    public static v63.a.C0125a l(int i, int i2, r63.b bVar) {
        return new v63.a.C0125a((qm) qm.Z().t(i).u((tm) tm.Y().t(i2).h()).h(), bVar);
    }

    public static void o(boolean z) {
        u75.l(new rm(), z);
        ym.c();
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(qm.class);
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
    public pm h(s80 s80Var) {
        return pm.c0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(pm pmVar) throws GeneralSecurityException {
        hm7.c(pmVar.a0(), m());
        hm7.a(pmVar.Y().size());
        if (pmVar.Z().X() != 12 && pmVar.Z().X() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
