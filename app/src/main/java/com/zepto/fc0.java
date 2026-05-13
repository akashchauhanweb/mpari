package com.zepto;

import com.zepto.dc0;
import com.zepto.n63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class fc0 {
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
        x80 x80VarE = ft6.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = x80VarE;
        b = ll4.a(new um(), dc0.class, ax4.class);
        c = kl4.a(new vm(), x80VarE, ax4.class);
        d = o63.a(new wm(), ac0.class, zw4.class);
        e = n63.a(new n63.b() { // from class: com.zepto.ec0
            @Override // com.zepto.n63.b
            public final e63 a(sy5 sy5Var, pu5 pu5Var) {
                return fc0.b((zw4) sy5Var, pu5Var);
            }
        }, x80VarE, zw4.class);
    }

    public static ac0 b(zw4 zw4Var, pu5 pu5Var) throws GeneralSecurityException {
        if (!zw4Var.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            zb0 zb0VarA0 = zb0.a0(zw4Var.g(), g72.b());
            if (zb0VarA0.Y() == 0) {
                return ac0.a(e(zw4Var.e()), ou5.a(zb0VarA0.X().g0(), pu5.b(pu5Var)), zw4Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (b13 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
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

    public static dc0.a e(qj4 qj4Var) throws GeneralSecurityException {
        int i = a.a[qj4Var.ordinal()];
        if (i == 1) {
            return dc0.a.b;
        }
        if (i == 2 || i == 3) {
            return dc0.a.c;
        }
        if (i == 4) {
            return dc0.a.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + qj4Var.b());
    }
}
