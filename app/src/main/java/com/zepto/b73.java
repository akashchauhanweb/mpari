package com.zepto;

import com.zepto.a73;
import com.zepto.dv4;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b73 {
    public final a73 a;
    public final List b;
    public final sw3 c = sw3.b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q63.values().length];
            a = iArr;
            try {
                iArr[q63.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[q63.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[q63.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {
        public final e63 a;
        public final p63 b;
        public final int c;
        public final boolean d;

        public /* synthetic */ b(e63 e63Var, p63 p63Var, int i, boolean z, a aVar) {
            this(e63Var, p63Var, i, z);
        }

        public e63 a() {
            return this.a;
        }

        public b(e63 e63Var, p63 p63Var, int i, boolean z) {
            this.a = e63Var;
            this.b = p63Var;
            this.c = i;
            this.d = z;
        }
    }

    public b73(a73 a73Var, List list) {
        this.a = a73Var;
        this.b = list;
    }

    public static void a(g22 g22Var) throws GeneralSecurityException {
        if (g22Var == null || g22Var.X().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(a73 a73Var) throws GeneralSecurityException {
        if (a73Var == null || a73Var.a0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static a73 c(g22 g22Var, rl rlVar, byte[] bArr) throws GeneralSecurityException {
        try {
            a73 a73VarF0 = a73.f0(rlVar.b(g22Var.X().g0(), bArr), g72.b());
            b(a73VarF0);
            return a73VarF0;
        } catch (b13 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static g22 d(a73 a73Var, rl rlVar, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrA = rlVar.a(a73Var.d(), bArr);
        try {
            if (a73.f0(rlVar.b(bArrA, bArr), g72.b()).equals(a73Var)) {
                return (g22) g22.Y().t(s80.u(bArrA)).u(gt6.b(a73Var)).h();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (b13 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final b73 e(a73 a73Var) throws GeneralSecurityException {
        b(a73Var);
        return new b73(a73Var, f(a73Var));
    }

    public static List f(a73 a73Var) {
        ArrayList arrayList = new ArrayList(a73Var.a0());
        for (a73.c cVar : a73Var.b0()) {
            int iA0 = cVar.a0();
            try {
                arrayList.add(new b(ry3.a().d(q(cVar), pz2.a()), m(cVar.c0()), iA0, iA0 == a73Var.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Object j(a73.c cVar, Class cls) throws GeneralSecurityException {
        try {
            return u75.e(cVar.Z(), cls);
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    public static p63 m(q63 q63Var) throws GeneralSecurityException {
        int i = a.a[q63Var.ordinal()];
        if (i == 1) {
            return p63.b;
        }
        if (i == 2) {
            return p63.c;
        }
        if (i == 3) {
            return p63.d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final b73 n(e73 e73Var, rl rlVar) {
        return o(e73Var, rlVar, new byte[0]);
    }

    public static final b73 o(e73 e73Var, rl rlVar, byte[] bArr) throws GeneralSecurityException {
        g22 g22VarA = e73Var.a();
        a(g22VarA);
        return e(c(g22VarA, rlVar, bArr));
    }

    public static zw4 q(a73.c cVar) {
        try {
            return zw4.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), cVar.b0() == qj4.RAW ? null : Integer.valueOf(cVar.a0()));
        } catch (GeneralSecurityException e) {
            throw new eg6("Creating a protokey serialization failed", e);
        }
    }

    public final Object g(e63 e63Var, Class cls) {
        try {
            return u75.c(e63Var, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public a73 h() {
        return this.a;
    }

    public c73 i() {
        return gt6.b(this.a);
    }

    public Object k(Class cls) throws GeneralSecurityException {
        Class clsD = u75.d(cls);
        if (clsD != null) {
            return l(cls, clsD);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public final Object l(Class cls, Class cls2) throws GeneralSecurityException {
        gt6.d(this.a);
        dv4.b bVarJ = dv4.j(cls2);
        bVarJ.e(this.c);
        for (int i = 0; i < p(); i++) {
            a73.c cVarZ = this.a.Z(i);
            if (cVarZ.c0().equals(q63.ENABLED)) {
                Object objJ = j(cVarZ, cls2);
                Object objG = this.b.get(i) != null ? g(((b) this.b.get(i)).a(), cls2) : null;
                if (cVarZ.a0() == this.a.c0()) {
                    bVarJ.b(objG, objJ, cVarZ);
                } else {
                    bVarJ.a(objG, objJ, cVarZ);
                }
            }
        }
        return u75.o(bVarJ.d(), cls);
    }

    public int p() {
        return this.a.a0();
    }

    public void r(f73 f73Var, rl rlVar) {
        s(f73Var, rlVar, new byte[0]);
    }

    public void s(f73 f73Var, rl rlVar, byte[] bArr) {
        f73Var.b(d(this.a, rlVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
