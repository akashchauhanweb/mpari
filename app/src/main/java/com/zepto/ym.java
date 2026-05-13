package com.zepto;

import com.zepto.n63;
import com.zepto.sm;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ym {
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
        x80 x80VarE = ft6.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = x80VarE;
        b = ll4.a(new um(), sm.class, ax4.class);
        c = kl4.a(new vm(), x80VarE, ax4.class);
        d = o63.a(new wm(), om.class, zw4.class);
        e = n63.a(new n63.b() { // from class: com.zepto.xm
            @Override // com.zepto.n63.b
            public final e63 a(sy5 sy5Var, pu5 pu5Var) {
                return ym.b((zw4) sy5Var, pu5Var);
            }
        }, x80VarE, zw4.class);
    }

    public static om b(zw4 zw4Var, pu5 pu5Var) throws GeneralSecurityException {
        if (!zw4Var.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            pm pmVarC0 = pm.c0(zw4Var.g(), g72.b());
            if (pmVarC0.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return om.a().e(sm.a().c(pmVarC0.Y().size()).b(pmVarC0.Z().X()).d(16).e(e(zw4Var.e())).a()).d(ou5.a(pmVarC0.Y().g0(), pu5.b(pu5Var))).c(zw4Var.c()).a();
        } catch (b13 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
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

    public static sm.c e(qj4 qj4Var) throws GeneralSecurityException {
        int i = a.a[qj4Var.ordinal()];
        if (i == 1) {
            return sm.c.b;
        }
        if (i == 2 || i == 3) {
            return sm.c.c;
        }
        if (i == 4) {
            return sm.c.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + qj4Var.b());
    }
}
