package com.zepto;

import java.util.HashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class nw1 {
    public nv4 a;
    public Object b;
    public String c;
    public String d;
    public String e;
    public int f;
    public Future g;
    public long h;
    public long i;
    public int j;
    public int k;
    public String l;
    public pg4 m;
    public int n;
    public HashMap o;
    public h76 p;

    public class a implements Runnable {
        public final /* synthetic */ x22 c;

        public a(x22 x22Var) {
            this.c = x22Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (nw1.this.m != null) {
                nw1.this.m.b(this.c);
            }
            nw1.this.j();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (nw1.this.m != null) {
                nw1.this.m.a();
            }
            nw1.this.j();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nw1.c(nw1.this);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nw1.d(nw1.this);
        }
    }

    public nw1(ow1 ow1Var) {
        this.c = ow1Var.a;
        this.d = ow1Var.b;
        this.e = ow1Var.c;
        this.o = ow1Var.i;
        this.a = ow1Var.d;
        this.b = ow1Var.e;
        int i = ow1Var.f;
        this.j = i == 0 ? u() : i;
        int i2 = ow1Var.g;
        this.k = i2 == 0 ? l() : i2;
        this.l = ow1Var.h;
    }

    public static /* synthetic */ ch4 c(nw1 nw1Var) {
        nw1Var.getClass();
        return null;
    }

    public static /* synthetic */ wg4 d(nw1 nw1Var) {
        nw1Var.getClass();
        return null;
    }

    public void A(long j) {
        this.h = j;
    }

    public void B(Future future) {
        this.g = future;
    }

    public void C(int i) {
        this.f = i;
    }

    public void D(h76 h76Var) {
        this.p = h76Var;
    }

    public void E(long j) {
        this.i = j;
    }

    public void F(String str) {
        this.c = str;
    }

    public int G(pg4 pg4Var) {
        this.m = pg4Var;
        this.n = ot6.e(this.c, this.d, this.e);
        pw1.c().a(this);
        return this.n;
    }

    public void e(x22 x22Var) {
        if (this.p != h76.CANCELLED) {
            D(h76.FAILED);
            nz0.b().a().a().execute(new a(x22Var));
        }
    }

    public void f() {
        if (this.p != h76.CANCELLED) {
            nz0.b().a().a().execute(new d());
        }
    }

    public void g() {
        if (this.p != h76.CANCELLED) {
            nz0.b().a().a().execute(new c());
        }
    }

    public void h() {
        if (this.p != h76.CANCELLED) {
            D(h76.COMPLETED);
            nz0.b().a().a().execute(new b());
        }
    }

    public final void i() {
        this.m = null;
    }

    public final void j() {
        i();
        pw1.c().b(this);
    }

    public int k() {
        return this.k;
    }

    public final int l() {
        return ju0.d().a();
    }

    public String m() {
        return this.d;
    }

    public int n() {
        return this.n;
    }

    public long o() {
        return this.h;
    }

    public String p() {
        return this.e;
    }

    public HashMap q() {
        return this.o;
    }

    public yg4 r() {
        return null;
    }

    public nv4 s() {
        return this.a;
    }

    public int t() {
        return this.j;
    }

    public final int u() {
        return ju0.d().e();
    }

    public int v() {
        return this.f;
    }

    public h76 w() {
        return this.p;
    }

    public long x() {
        return this.i;
    }

    public String y() {
        return this.c;
    }

    public String z() {
        if (this.l == null) {
            this.l = ju0.d().f();
        }
        return this.l;
    }
}
