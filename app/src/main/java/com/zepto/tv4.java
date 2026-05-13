package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tv4 {
    public static sv4 a(gy gyVar, z0 z0Var) throws IOException {
        if (gyVar instanceof gy4) {
            gy4 gy4Var = (gy4) gyVar;
            return new sv4(qt6.d(gy4Var.b()), new z41(gy4Var.a()), z0Var);
        }
        if (gyVar instanceof pg5) {
            pg5 pg5Var = (pg5) gyVar;
            return new sv4(new eo(hk4.r, new ng5(qt6.f(pg5Var.a()))), new z41(pg5Var.b()));
        }
        if (gyVar instanceof j14) {
            eo eoVar = new eo(hk4.v);
            short[] sArrA = ((j14) gyVar).a();
            byte[] bArr = new byte[sArrA.length * 2];
            for (int i = 0; i != sArrA.length; i++) {
                vk4.n(sArrA[i], bArr, i * 2);
            }
            return new sv4(eoVar, new z41(bArr));
        }
        if (gyVar instanceof ga3) {
            ga3 ga3Var = (ga3) gyVar;
            byte[] bArrB = vu0.f().i(1).c(ga3Var).b();
            return new sv4(new eo(gk4.I0), new z41(bArrB), z0Var, vu0.f().i(1).c(ga3Var.i()).b());
        }
        if (gyVar instanceof xk2) {
            xk2 xk2Var = (xk2) gyVar;
            byte[] bArrB2 = vu0.f().i(xk2Var.c()).c(xk2Var).b();
            return new sv4(new eo(gk4.I0), new z41(bArrB2), z0Var, vu0.f().i(xk2Var.c()).c(xk2Var.d().c()).b());
        }
        if (gyVar instanceof s08) {
            s08 s08Var = (s08) gyVar;
            return new sv4(new eo(hk4.w, new e08(s08Var.b().b(), qt6.h(s08Var.a()))), b(s08Var), z0Var);
        }
        if (gyVar instanceof k08) {
            k08 k08Var = (k08) gyVar;
            return new sv4(new eo(hk4.F, new h08(k08Var.b().a(), k08Var.b().b(), qt6.h(k08Var.a()))), c(k08Var), z0Var);
        }
        if (!(gyVar instanceof nr3)) {
            throw new IOException("key parameters not recognized");
        }
        nr3 nr3Var = (nr3) gyVar;
        return new sv4(new eo(hk4.n), new mr3(nr3Var.f(), nr3Var.e(), nr3Var.b(), nr3Var.c(), nr3Var.g(), qt6.a(nr3Var.a())));
    }

    public static r08 b(s08 s08Var) throws IOException {
        byte[] encoded = s08Var.getEncoded();
        int iH = s08Var.b().h();
        int iB = s08Var.b().b();
        int iA = (int) v08.a(encoded, 0, 4);
        if (!v08.l(iB, iA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = v08.g(encoded, 4, iH);
        int i = 4 + iH;
        byte[] bArrG2 = v08.g(encoded, i, iH);
        int i2 = i + iH;
        byte[] bArrG3 = v08.g(encoded, i2, iH);
        int i3 = i2 + iH;
        byte[] bArrG4 = v08.g(encoded, i3, iH);
        int i4 = i3 + iH;
        byte[] bArrG5 = v08.g(encoded, i4, encoded.length - i4);
        try {
            x20 x20Var = (x20) v08.f(bArrG5, x20.class);
            return x20Var.c() != (1 << iB) - 1 ? new r08(iA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5, x20Var.c()) : new r08(iA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5);
        } catch (ClassNotFoundException e) {
            throw new IOException("cannot parse BDS: " + e.getMessage());
        }
    }

    public static j08 c(k08 k08Var) throws IOException {
        byte[] encoded = k08Var.getEncoded();
        int iF = k08Var.b().f();
        int iA = k08Var.b().a();
        int i = (iA + 7) / 8;
        long jA = (int) v08.a(encoded, 0, i);
        if (!v08.l(iA, jA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = v08.g(encoded, i, iF);
        int i2 = i + iF;
        byte[] bArrG2 = v08.g(encoded, i2, iF);
        int i3 = i2 + iF;
        byte[] bArrG3 = v08.g(encoded, i3, iF);
        int i4 = i3 + iF;
        byte[] bArrG4 = v08.g(encoded, i4, iF);
        int i5 = i4 + iF;
        byte[] bArrG5 = v08.g(encoded, i5, encoded.length - i5);
        try {
            y20 y20Var = (y20) v08.f(bArrG5, y20.class);
            return y20Var.b() != (1 << iA) - 1 ? new j08(jA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5, y20Var.b()) : new j08(jA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5);
        } catch (ClassNotFoundException e) {
            throw new IOException("cannot parse BDSStateMap: " + e.getMessage());
        }
    }
}
