package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class rq4 {
    public int a = 0;

    public static void a(pq4 pq4Var, int i, Object obj) {
        rp4 rp4VarM;
        if (pq4Var == null || !pq4Var.R()) {
            return;
        }
        int iG = pq4Var.G();
        if (i == 1) {
            if (iG != 1) {
                return;
            }
            if (!(obj instanceof b72)) {
                if (obj instanceof p40) {
                    throw new qq4(dt3.b("colorspace.rgb.is.not.allowed", new Object[0]));
                }
                return;
            }
            b72 b72Var = (b72) obj;
            int iF = b72Var.f();
            if (iF == 0) {
                throw new qq4(dt3.b("colorspace.rgb.is.not.allowed", new Object[0]));
            }
            if (iF == 3) {
                wb0.a(b72Var);
                throw null;
            }
            if (iF == 4) {
                wb0.a(b72Var);
                throw null;
            }
            if (iF != 5) {
                return;
            }
            wb0.a(b72Var);
            throw null;
        }
        if (i == 3) {
            if (iG == 1) {
                throw new qq4(dt3.b("colorspace.rgb.is.not.allowed", new Object[0]));
            }
            return;
        }
        if (i == 4) {
            s40 s40Var = (s40) obj;
            if (!s40Var.y()) {
                throw new qq4(dt3.b("all.the.fonts.must.be.embedded.this.one.isn.t.1", s40Var.n()));
            }
            return;
        }
        if (i == 5) {
            ep4 ep4Var = (ep4) obj;
            if (ep4Var.m(lp4.W8) != null) {
                throw new qq4(dt3.b("the.smask.key.is.not.allowed.in.images", new Object[0]));
            }
            if (iG == 1 && (rp4VarM = ep4Var.m(lp4.b1)) != null) {
                if (rp4VarM.g()) {
                    if (lp4.X1.equals(rp4VarM)) {
                        throw new qq4(dt3.b("colorspace.rgb.is.not.allowed", new Object[0]));
                    }
                    return;
                } else {
                    if (rp4VarM.d() && lp4.C0.equals(((ko4) rp4VarM).s(0))) {
                        throw new qq4(dt3.b("colorspace.calrgb.is.not.allowed", new Object[0]));
                    }
                    return;
                }
            }
            return;
        }
        if (i != 6) {
            if (i == 7) {
                throw new qq4(dt3.b("layers.are.not.allowed", new Object[0]));
            }
            return;
        }
        uo4 uo4Var = (uo4) obj;
        rp4 rp4VarM2 = uo4Var.m(lp4.p0);
        if (rp4VarM2 != null && !dp4.m.equals(rp4VarM2) && !dp4.n.equals(rp4VarM2)) {
            throw new qq4(dt3.b("blend.mode.1.not.allowed", rp4VarM2.toString()));
        }
        rp4 rp4VarM3 = uo4Var.m(lp4.z0);
        if (rp4VarM3 != null) {
            double dM = ((op4) rp4VarM3).m();
            if (dM != 1.0d) {
                throw new qq4(dt3.b("transparency.is.not.allowed.ca.eq.1", String.valueOf(dM)));
            }
        }
        rp4 rp4VarM4 = uo4Var.m(lp4.A0);
        if (rp4VarM4 != null) {
            double dM2 = ((op4) rp4VarM4).m();
            if (dM2 != 1.0d) {
                throw new qq4(dt3.b("transparency.is.not.allowed.ca.eq.1", String.valueOf(dM2)));
            }
        }
    }

    public void b(uo4 uo4Var) {
        if (!f() || e()) {
            return;
        }
        lp4 lp4Var = lp4.R6;
        if (uo4Var.m(lp4Var) == null) {
            uo4 uo4Var2 = new uo4(lp4.Q6);
            uo4Var2.r(lp4.O6, new hq4("SWOP CGATS TR 001-1995"));
            uo4Var2.r(lp4.P6, new hq4("CGATS TR 001"));
            uo4Var2.r(lp4.d8, new hq4("http://www.color.org"));
            uo4Var2.r(lp4.H4, new hq4(""));
            uo4Var2.r(lp4.E8, lp4.W3);
            uo4Var.r(lp4Var, new ko4(uo4Var2));
        }
    }

    public void c(uo4 uo4Var) {
        if (!f() || e()) {
            return;
        }
        lp4 lp4Var = lp4.X3;
        if (uo4Var.m(lp4Var) == null) {
            if (g()) {
                uo4Var.r(lp4Var, new hq4("PDF/X-1:2001"));
                uo4Var.r(new lp4("GTS_PDFXConformance"), new hq4("PDF/X-1a:2001"));
            } else if (h()) {
                uo4Var.r(lp4Var, new hq4("PDF/X-3:2002"));
            }
        }
        lp4 lp4Var2 = lp4.T9;
        if (uo4Var.m(lp4Var2) == null) {
            uo4Var.r(lp4Var2, new hq4("Pdf document"));
        }
        lp4 lp4Var3 = lp4.w1;
        if (uo4Var.m(lp4Var3) == null) {
            uo4Var.r(lp4Var3, new hq4("Unknown"));
        }
        lp4 lp4Var4 = lp4.ia;
        if (uo4Var.m(lp4Var4) == null) {
            uo4Var.r(lp4Var4, new lp4("False"));
        }
    }

    public int d() {
        return this.a;
    }

    public boolean e() {
        int i = this.a;
        return i == 3 || i == 4;
    }

    public boolean f() {
        return this.a != 0;
    }

    public boolean g() {
        return this.a == 1;
    }

    public boolean h() {
        return this.a == 2;
    }
}
