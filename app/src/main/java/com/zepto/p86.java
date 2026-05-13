package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p86 {
    public static o86 a(gy gyVar) throws IOException {
        if (gyVar instanceof hy4) {
            hy4 hy4Var = (hy4) gyVar;
            return new o86(qt6.d(hy4Var.b()), hy4Var.a());
        }
        if (gyVar instanceof qg5) {
            qg5 qg5Var = (qg5) gyVar;
            return new o86(new eo(hk4.r, new ng5(qt6.f(qg5Var.a()))), qg5Var.b());
        }
        if (gyVar instanceof k14) {
            return new o86(new eo(hk4.v), ((k14) gyVar).a());
        }
        if (gyVar instanceof ha3) {
            return new o86(new eo(gk4.I0), new z41(vu0.f().i(1).c((ha3) gyVar).b()));
        }
        if (gyVar instanceof yk2) {
            yk2 yk2Var = (yk2) gyVar;
            return new o86(new eo(gk4.I0), new z41(vu0.f().i(yk2Var.b()).c(yk2Var.c()).b()));
        }
        if (gyVar instanceof u08) {
            u08 u08Var = (u08) gyVar;
            byte[] bArrC = u08Var.c();
            byte[] bArrD = u08Var.d();
            byte[] encoded = u08Var.getEncoded();
            return encoded.length > bArrC.length + bArrD.length ? new o86(new eo(k13.a), new z41(encoded)) : new o86(new eo(hk4.w, new e08(u08Var.b().b(), qt6.h(u08Var.a()))), new t08(bArrC, bArrD));
        }
        if (!(gyVar instanceof m08)) {
            if (!(gyVar instanceof pr3)) {
                throw new IOException("key parameters not recognized");
            }
            pr3 pr3Var = (pr3) gyVar;
            return new o86(new eo(hk4.n), new or3(pr3Var.c(), pr3Var.d(), pr3Var.b(), qt6.a(pr3Var.a())));
        }
        m08 m08Var = (m08) gyVar;
        byte[] bArrC2 = m08Var.c();
        byte[] bArrD2 = m08Var.d();
        byte[] encoded2 = m08Var.getEncoded();
        return encoded2.length > bArrC2.length + bArrD2.length ? new o86(new eo(k13.b), new z41(encoded2)) : new o86(new eo(hk4.F, new h08(m08Var.b().a(), m08Var.b().b(), qt6.h(m08Var.a()))), new l08(m08Var.c(), m08Var.d()));
    }
}
