package com.zepto;

import android.content.Context;
import android.text.TextUtils;
import com.zepto.nx0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kk2 implements ro5, mg4, x52 {
    public static final String o = rn3.i("GreedyScheduler");
    public final Context a;
    public eh1 c;
    public boolean d;
    public final bw4 g;
    public final gy7 h;
    public final androidx.work.a i;
    public Boolean k;
    public final jx7 l;
    public final uc6 m;
    public final tf6 n;
    public final Map b = new HashMap();
    public final Object e = new Object();
    public final p66 f = new p66();
    public final Map j = new HashMap();

    public static class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public kk2(Context context, androidx.work.a aVar, ej6 ej6Var, bw4 bw4Var, gy7 gy7Var, uc6 uc6Var) {
        this.a = context;
        lf5 lf5VarK = aVar.k();
        this.c = new eh1(this, lf5VarK, aVar.a());
        this.n = new tf6(lf5VarK, gy7Var);
        this.m = uc6Var;
        this.l = new jx7(ej6Var);
        this.i = aVar;
        this.g = bw4Var;
        this.h = gy7Var;
    }

    @Override // com.zepto.ro5
    public void a(String str) {
        if (this.k == null) {
            f();
        }
        if (!this.k.booleanValue()) {
            rn3.e().f(o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        rn3.e().a(o, "Cancelling work ID " + str);
        eh1 eh1Var = this.c;
        if (eh1Var != null) {
            eh1Var.b(str);
        }
        for (o66 o66Var : this.f.c(str)) {
            this.n.b(o66Var);
            this.h.e(o66Var);
        }
    }

    @Override // com.zepto.mg4
    public void b(yy7 yy7Var, nx0 nx0Var) {
        ay7 ay7VarA = bz7.a(yy7Var);
        if (nx0Var instanceof nx0.a) {
            if (this.f.a(ay7VarA)) {
                return;
            }
            rn3.e().a(o, "Constraints met: Scheduling work ID " + ay7VarA);
            o66 o66VarD = this.f.d(ay7VarA);
            this.n.c(o66VarD);
            this.h.c(o66VarD);
            return;
        }
        rn3.e().a(o, "Constraints not met: Cancelling work ID " + ay7VarA);
        o66 o66VarB = this.f.b(ay7VarA);
        if (o66VarB != null) {
            this.n.b(o66VarB);
            this.h.a(o66VarB, ((nx0.b) nx0Var).a());
        }
    }

    @Override // com.zepto.ro5
    public void c(yy7... yy7VarArr) {
        if (this.k == null) {
            f();
        }
        if (!this.k.booleanValue()) {
            rn3.e().f(o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<yy7> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (yy7 yy7Var : yy7VarArr) {
            if (!this.f.a(bz7.a(yy7Var))) {
                long jMax = Math.max(yy7Var.c(), i(yy7Var));
                long jA = this.i.a().a();
                if (yy7Var.b == by7.ENQUEUED) {
                    if (jA < jMax) {
                        eh1 eh1Var = this.c;
                        if (eh1Var != null) {
                            eh1Var.a(yy7Var, jMax);
                        }
                    } else if (yy7Var.i()) {
                        if (yy7Var.j.h()) {
                            rn3.e().a(o, "Ignoring " + yy7Var + ". Requires device idle.");
                        } else if (yy7Var.j.e()) {
                            rn3.e().a(o, "Ignoring " + yy7Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(yy7Var);
                            hashSet2.add(yy7Var.a);
                        }
                    } else if (!this.f.a(bz7.a(yy7Var))) {
                        rn3.e().a(o, "Starting work for " + yy7Var.a);
                        o66 o66VarE = this.f.e(yy7Var);
                        this.n.c(o66VarE);
                        this.h.c(o66VarE);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    rn3.e().a(o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (yy7 yy7Var2 : hashSet) {
                        ay7 ay7VarA = bz7.a(yy7Var2);
                        if (!this.b.containsKey(ay7VarA)) {
                            this.b.put(ay7VarA, kx7.b(this.l, yy7Var2, this.m.d(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.x52
    public void d(ay7 ay7Var, boolean z) {
        o66 o66VarB = this.f.b(ay7Var);
        if (o66VarB != null) {
            this.n.b(o66VarB);
        }
        h(ay7Var);
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(ay7Var);
        }
    }

    @Override // com.zepto.ro5
    public boolean e() {
        return false;
    }

    public final void f() {
        this.k = Boolean.valueOf(xv4.b(this.a, this.i));
    }

    public final void g() {
        if (this.d) {
            return;
        }
        this.g.e(this);
        this.d = true;
    }

    public final void h(ay7 ay7Var) {
        e43 e43Var;
        synchronized (this.e) {
            e43Var = (e43) this.b.remove(ay7Var);
        }
        if (e43Var != null) {
            rn3.e().a(o, "Stopping tracking for " + ay7Var);
            e43Var.d(null);
        }
    }

    public final long i(yy7 yy7Var) {
        long jMax;
        synchronized (this.e) {
            try {
                ay7 ay7VarA = bz7.a(yy7Var);
                b bVar = (b) this.j.get(ay7VarA);
                if (bVar == null) {
                    bVar = new b(yy7Var.k, this.i.a().a());
                    this.j.put(ay7VarA, bVar);
                }
                jMax = bVar.b + (((long) Math.max((yy7Var.k - bVar.a) - 5, 0)) * 30000);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }
}
