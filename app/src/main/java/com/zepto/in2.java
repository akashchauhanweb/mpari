package com.zepto;

import com.zepto.fn2;
import com.zepto.n63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class in2 {
    public static final x80 a;
    public static final ll4 b;
    public static final kl4 c;
    public static final o63 d;
    public static final n63 e;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[qj4.values().length];
            b = iArr;
            try {
                iArr[qj4.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[qj4.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[qj4.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[qj4.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[il2.values().length];
            a = iArr2;
            try {
                iArr2[il2.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[il2.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[il2.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[il2.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[il2.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        x80 x80VarE = ft6.e("type.googleapis.com/google.crypto.tink.HmacKey");
        a = x80VarE;
        b = ll4.a(new um(), fn2.class, ax4.class);
        c = kl4.a(new vm(), x80VarE, ax4.class);
        d = o63.a(new wm(), an2.class, zw4.class);
        e = n63.a(new n63.b() { // from class: com.zepto.hn2
            @Override // com.zepto.n63.b
            public final e63 a(sy5 sy5Var, pu5 pu5Var) {
                return in2.b((zw4) sy5Var, pu5Var);
            }
        }, x80VarE, zw4.class);
    }

    public static an2 b(zw4 zw4Var, pu5 pu5Var) throws GeneralSecurityException {
        if (!zw4Var.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            bn2 bn2VarD0 = bn2.d0(zw4Var.g(), g72.b());
            if (bn2VarD0.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return an2.c().e(fn2.a().c(bn2VarD0.Z().size()).d(bn2VarD0.a0().Z()).b(e(bn2VarD0.a0().Y())).e(f(zw4Var.e())).a()).d(ou5.a(bn2VarD0.Z().g0(), pu5.b(pu5Var))).c(zw4Var.c()).a();
        } catch (b13 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
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

    public static fn2.c e(il2 il2Var) throws GeneralSecurityException {
        int i = a.a[il2Var.ordinal()];
        if (i == 1) {
            return fn2.c.b;
        }
        if (i == 2) {
            return fn2.c.c;
        }
        if (i == 3) {
            return fn2.c.d;
        }
        if (i == 4) {
            return fn2.c.e;
        }
        if (i == 5) {
            return fn2.c.f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + il2Var.b());
    }

    public static fn2.d f(qj4 qj4Var) throws GeneralSecurityException {
        int i = a.b[qj4Var.ordinal()];
        if (i == 1) {
            return fn2.d.b;
        }
        if (i == 2) {
            return fn2.d.c;
        }
        if (i == 3) {
            return fn2.d.d;
        }
        if (i == 4) {
            return fn2.d.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + qj4Var.b());
    }
}
