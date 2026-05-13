package com.zepto;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class jo4 {
    public go4 a;
    public ArrayList b;
    public ArrayList c = new ArrayList();

    public jo4(pq4 pq4Var) {
        this.a = new go4(pq4Var);
    }

    public static io4 d(pq4 pq4Var, vp vpVar, i65 i65Var) {
        switch (vpVar.a()) {
            case 1:
                return new io4(pq4Var, vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k(), new ho4((URL) vpVar.b().get("url")));
            case 2:
                return new io4(pq4Var, vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k(), new ho4((String) vpVar.b().get("file")));
            case 3:
                return new io4(pq4Var, vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k(), new ho4((String) vpVar.b().get("file"), (String) vpVar.b().get("destination")));
            case 4:
                return new io4(pq4Var, vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k(), new ho4((String) vpVar.b().get("file"), ((Integer) vpVar.b().get("page")).intValue()));
            case 5:
                return new io4(pq4Var, vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k(), new ho4(((Integer) vpVar.b().get("named")).intValue()));
            case 6:
                return new io4(pq4Var, vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k(), new ho4((String) vpVar.b().get("application"), (String) vpVar.b().get("parameters"), (String) vpVar.b().get("operation"), (String) vpVar.b().get("defaultdir")));
            case 7:
                boolean[] zArr = (boolean[]) vpVar.b().get("parameters");
                String str = (String) vpVar.b().get("file");
                return io4.v(pq4Var, new i65(vpVar.d(), vpVar.f(), vpVar.i(), vpVar.k()), str, zArr[0] ? ap4.v(pq4Var, str, str, null) : ap4.y(pq4Var, str), (String) vpVar.b().get("mime"), zArr[1]);
            default:
                return new io4(pq4Var, i65Var.p(), i65Var.m(), i65Var.s(), i65Var.w(), new hq4(vpVar.h(), "UnicodeBig"), new hq4(vpVar.c(), "UnicodeBig"));
        }
    }

    public void a(io4 io4Var) {
        if (!io4Var.A()) {
            this.b.add(io4Var);
            return;
        }
        cp4 cp4Var = (cp4) io4Var;
        if (cp4Var.F() == null) {
            b(cp4Var);
        }
    }

    public void b(cp4 cp4Var) {
        this.b.add(cp4Var);
        ArrayList arrayListE = cp4Var.E();
        if (arrayListE != null) {
            for (int i = 0; i < arrayListE.size(); i++) {
                b((cp4) arrayListE.get(i));
            }
        }
    }

    public void c(io4 io4Var) {
        this.b.add(io4Var);
    }

    public go4 e() {
        return this.a;
    }

    public boolean f() {
        return !this.b.isEmpty();
    }

    public boolean g() {
        return this.a.x();
    }

    public void h() {
        this.b = this.c;
        this.c = new ArrayList();
    }

    public ko4 i(pq4 pq4Var, i65 i65Var) {
        HashSet hashSetY;
        ko4 ko4Var = new ko4();
        int iV = i65Var.v() % 360;
        int iW = pq4Var.w();
        for (int i = 0; i < this.b.size(); i++) {
            io4 io4Var = (io4) this.b.get(i);
            if (io4Var.x() > iW) {
                this.c.add(io4Var);
            } else {
                if (io4Var.A()) {
                    if (!io4Var.B() && (hashSetY = io4Var.y()) != null) {
                        this.a.w(hashSetY);
                    }
                    cp4 cp4Var = (cp4) io4Var;
                    if (cp4Var.F() == null) {
                        this.a.v(cp4Var.w());
                    }
                }
                if (io4Var.z()) {
                    ko4Var.m(io4Var.w());
                    if (!io4Var.B()) {
                        lp4 lp4Var = lp4.a8;
                        cq4 cq4Var = (cq4) io4Var.m(lp4Var);
                        if (cq4Var != null) {
                            if (iV == 90) {
                                io4Var.r(lp4Var, new cq4(i65Var.w() - cq4Var.u(), cq4Var.v(), i65Var.w() - cq4Var.x(), cq4Var.w()));
                            } else if (iV == 180) {
                                io4Var.r(lp4Var, new cq4(i65Var.s() - cq4Var.v(), i65Var.w() - cq4Var.u(), i65Var.s() - cq4Var.w(), i65Var.w() - cq4Var.x()));
                            } else if (iV == 270) {
                                io4Var.r(lp4Var, new cq4(cq4Var.u(), i65Var.s() - cq4Var.v(), cq4Var.x(), i65Var.s() - cq4Var.w()));
                            }
                        }
                    }
                }
                if (io4Var.B()) {
                    continue;
                } else {
                    io4Var.D();
                    try {
                        pq4Var.o(io4Var, io4Var.w());
                    } catch (IOException e) {
                        throw new p52(e);
                    }
                }
            }
        }
        return ko4Var;
    }
}
