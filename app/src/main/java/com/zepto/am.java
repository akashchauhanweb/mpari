package com.zepto;

import com.zepto.f63;
import com.zepto.r63;
import com.zepto.v63;
import com.zepto.wu4;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class am extends v63 {
    public static final wu4 d = wu4.b(new wu4.b() { // from class: com.zepto.zl
        @Override // com.zepto.wu4.b
        public final Object a(e63 e63Var) {
            return new hk0((wl) e63Var);
        }
    }, wl.class, jk0.class);

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public to3 a(xl xlVar) {
            return new uu4(new su4(xlVar.Y().g0()), xlVar.Z().X());
        }
    }

    public class b extends v63.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.zepto.v63.a
        public Map c() {
            HashMap map = new HashMap();
            yl ylVar = (yl) yl.Z().t(32).u((cm) cm.Y().t(16).h()).h();
            r63.b bVar = r63.b.TINK;
            map.put("AES_CMAC", new v63.a.C0125a(ylVar, bVar));
            map.put("AES256_CMAC", new v63.a.C0125a((yl) yl.Z().t(32).u((cm) cm.Y().t(16).h()).h(), bVar));
            map.put("AES256_CMAC_RAW", new v63.a.C0125a((yl) yl.Z().t(32).u((cm) cm.Y().t(16).h()).h(), r63.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public xl a(yl ylVar) {
            return (xl) xl.b0().v(0).t(s80.u(h45.c(ylVar.X()))).u(ylVar.Y()).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public yl d(s80 s80Var) {
            return yl.a0(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(yl ylVar) throws GeneralSecurityException {
            am.q(ylVar.Y());
            am.r(ylVar.X());
        }
    }

    public am() {
        super(xl.class, new a(to3.class));
    }

    public static void o(boolean z) {
        u75.l(new am(), z);
        em.c();
        qy3.c().d(d);
    }

    public static void q(cm cmVar) throws GeneralSecurityException {
        if (cmVar.X() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cmVar.X() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void r(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(yl.class);
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
    public xl h(s80 s80Var) {
        return xl.c0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(xl xlVar) throws GeneralSecurityException {
        hm7.c(xlVar.a0(), m());
        r(xlVar.Y().size());
        q(xlVar.Z());
    }
}
