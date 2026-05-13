package com.zepto;

import com.zepto.f63;
import com.zepto.hg6;
import com.zepto.r63;
import com.zepto.v63;
import com.zepto.wu4;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class en2 extends v63 {
    public static final wu4 d = wu4.b(new wu4.b() { // from class: com.zepto.dn2
        @Override // com.zepto.wu4.b
        public final Object a(e63 e63Var) {
            return new ik0((an2) e63Var);
        }
    }, an2.class, jk0.class);

    public class a extends yu4 {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.zepto.yu4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public to3 a(bn2 bn2Var) throws GeneralSecurityException {
            il2 il2VarY = bn2Var.a0().Y();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bn2Var.Z().g0(), "HMAC");
            int iZ = bn2Var.a0().Z();
            int i = c.a[il2VarY.ordinal()];
            if (i == 1) {
                return new uu4(new tu4("HMACSHA1", secretKeySpec), iZ);
            }
            if (i == 2) {
                return new uu4(new tu4("HMACSHA224", secretKeySpec), iZ);
            }
            if (i == 3) {
                return new uu4(new tu4("HMACSHA256", secretKeySpec), iZ);
            }
            if (i == 4) {
                return new uu4(new tu4("HMACSHA384", secretKeySpec), iZ);
            }
            if (i == 5) {
                return new uu4(new tu4("HMACSHA512", secretKeySpec), iZ);
            }
            throw new GeneralSecurityException("unknown hash");
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
            map.put("HMAC_SHA256_128BITTAG", en2.m(32, 16, il2Var, bVar));
            r63.b bVar2 = r63.b.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", en2.m(32, 16, il2Var, bVar2));
            map.put("HMAC_SHA256_256BITTAG", en2.m(32, 32, il2Var, bVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", en2.m(32, 32, il2Var, bVar2));
            il2 il2Var2 = il2.SHA512;
            map.put("HMAC_SHA512_128BITTAG", en2.m(64, 16, il2Var2, bVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", en2.m(64, 16, il2Var2, bVar2));
            map.put("HMAC_SHA512_256BITTAG", en2.m(64, 32, il2Var2, bVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", en2.m(64, 32, il2Var2, bVar2));
            map.put("HMAC_SHA512_512BITTAG", en2.m(64, 64, il2Var2, bVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", en2.m(64, 64, il2Var2, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public bn2 a(cn2 cn2Var) {
            return (bn2) bn2.c0().v(en2.this.n()).u(cn2Var.Z()).t(s80.u(h45.c(cn2Var.Y()))).h();
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public cn2 d(s80 s80Var) {
            return cn2.b0(s80Var, g72.b());
        }

        @Override // com.zepto.v63.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(cn2 cn2Var) throws GeneralSecurityException {
            if (cn2Var.Y() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            en2.r(cn2Var.Z());
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[il2.values().length];
            a = iArr;
            try {
                iArr[il2.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[il2.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[il2.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[il2.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[il2.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public en2() {
        super(bn2.class, new a(to3.class));
    }

    public static v63.a.C0125a m(int i, int i2, il2 il2Var, r63.b bVar) {
        return new v63.a.C0125a((cn2) cn2.a0().u((gn2) gn2.a0().t(il2Var).u(i2).h()).t(i).h(), bVar);
    }

    public static void p(boolean z) {
        u75.l(new en2(), z);
        in2.c();
        qy3.c().d(d);
    }

    public static void r(gn2 gn2Var) throws GeneralSecurityException {
        if (gn2Var.Z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = c.a[gn2Var.Y().ordinal()];
        if (i == 1) {
            if (gn2Var.Z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i == 2) {
            if (gn2Var.Z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i == 3) {
            if (gn2Var.Z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 4) {
            if (gn2Var.Z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (gn2Var.Z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.zepto.v63
    public hg6.b a() {
        return hg6.b.e;
    }

    @Override // com.zepto.v63
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.zepto.v63
    public v63.a f() {
        return new b(cn2.class);
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
    public bn2 h(s80 s80Var) {
        return bn2.d0(s80Var, g72.b());
    }

    @Override // com.zepto.v63
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(bn2 bn2Var) throws GeneralSecurityException {
        hm7.c(bn2Var.b0(), n());
        if (bn2Var.Z().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(bn2Var.a0());
    }
}
