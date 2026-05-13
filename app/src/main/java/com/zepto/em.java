package com.zepto;

import com.zepto.bm;
import com.zepto.n63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class em {
    public static final x80 a;
    public static final ll4 b;
    public static final kl4 c;
    public static final o63 d;
    public static final n63 e;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qj4.values().length];
            a = iArr;
            try {
                iArr[qj4.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[qj4.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[qj4.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[qj4.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        x80 x80VarE = ft6.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = x80VarE;
        b = ll4.a(new um(), bm.class, ax4.class);
        c = kl4.a(new vm(), x80VarE, ax4.class);
        d = o63.a(new wm(), wl.class, zw4.class);
        e = n63.a(new n63.b() { // from class: com.zepto.dm
            @Override // com.zepto.n63.b
            public final e63 a(sy5 sy5Var, pu5 pu5Var) {
                return em.b((zw4) sy5Var, pu5Var);
            }
        }, x80VarE, zw4.class);
    }

    public static wl b(zw4 zw4Var, pu5 pu5Var) throws GeneralSecurityException {
        if (!zw4Var.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            xl xlVarC0 = xl.c0(zw4Var.g(), g72.b());
            if (xlVarC0.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return wl.c().e(bm.a().b(xlVarC0.Y().size()).c(xlVarC0.Z().X()).d(e(zw4Var.e())).a()).c(ou5.a(xlVarC0.Y().g0(), pu5.b(pu5Var))).d(zw4Var.c()).a();
        } catch (b13 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(ry3.a());
    }

    public static void d(ry3 ry3Var) {
        ry3Var.h(b);
        ry3Var.g(c);
        ry3Var.f(d);
        ry3Var.e(e);
    }

    public static bm.c e(qj4 qj4Var) throws GeneralSecurityException {
        int i = a.a[qj4Var.ordinal()];
        if (i == 1) {
            return bm.c.b;
        }
        if (i == 2) {
            return bm.c.c;
        }
        if (i == 3) {
            return bm.c.d;
        }
        if (i == 4) {
            return bm.c.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + qj4Var.b());
    }
}
