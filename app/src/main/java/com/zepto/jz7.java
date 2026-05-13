package com.zepto;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class jz7 implements Runnable {
    public static final String v = rn3.i("WorkerWrapper");
    public Context c;
    public final String e;
    public WorkerParameters.a f;
    public yy7 g;
    public androidx.work.c h;
    public uc6 i;
    public androidx.work.a k;
    public xq0 l;
    public re2 m;
    public WorkDatabase n;
    public zy7 o;
    public ki1 p;
    public List q;
    public String r;
    public c.a j = c.a.a();
    public nz5 s = nz5.t();
    public final nz5 t = nz5.t();
    public volatile int u = -256;

    public class a implements Runnable {
        public final /* synthetic */ xf3 c;

        public a(xf3 xf3Var) {
            this.c = xf3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jz7.this.t.isCancelled()) {
                return;
            }
            try {
                this.c.get();
                rn3.e().a(jz7.v, "Starting work for " + jz7.this.g.c);
                jz7 jz7Var = jz7.this;
                jz7Var.t.r(jz7Var.h.n());
            } catch (Throwable th) {
                jz7.this.t.q(th);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String c;

        public b(String str) {
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = (c.a) jz7.this.t.get();
                    if (aVar == null) {
                        rn3.e().c(jz7.v, jz7.this.g.c + " returned a null result. Treating it as a failure.");
                    } else {
                        rn3.e().a(jz7.v, jz7.this.g.c + " returned a " + aVar + ".");
                        jz7.this.j = aVar;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    rn3.e().d(jz7.v, this.c + " failed because it threw an exception/error", e);
                } catch (CancellationException e2) {
                    rn3.e().g(jz7.v, this.c + " was cancelled", e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    rn3.e().d(jz7.v, this.c + " failed because it threw an exception/error", e);
                }
                jz7.this.j();
            } catch (Throwable th) {
                jz7.this.j();
                throw th;
            }
        }
    }

    public static class c {
        public Context a;
        public androidx.work.c b;
        public re2 c;
        public uc6 d;
        public androidx.work.a e;
        public WorkDatabase f;
        public yy7 g;
        public final List h;
        public WorkerParameters.a i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, uc6 uc6Var, re2 re2Var, WorkDatabase workDatabase, yy7 yy7Var, List list) {
            this.a = context.getApplicationContext();
            this.d = uc6Var;
            this.c = re2Var;
            this.e = aVar;
            this.f = workDatabase;
            this.g = yy7Var;
            this.h = list;
        }

        public jz7 b() {
            return new jz7(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.i = aVar;
            }
            return this;
        }
    }

    public jz7(c cVar) {
        this.c = cVar.a;
        this.i = cVar.d;
        this.m = cVar.c;
        yy7 yy7Var = cVar.g;
        this.g = yy7Var;
        this.e = yy7Var.a;
        this.f = cVar.i;
        this.h = cVar.b;
        androidx.work.a aVar = cVar.e;
        this.k = aVar;
        this.l = aVar.a();
        WorkDatabase workDatabase = cVar.f;
        this.n = workDatabase;
        this.o = workDatabase.H();
        this.p = this.n.C();
        this.q = cVar.h;
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.e);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public xf3 c() {
        return this.s;
    }

    public ay7 d() {
        return bz7.a(this.g);
    }

    public yy7 e() {
        return this.g;
    }

    public final void f(c.a aVar) {
        if (aVar instanceof c.a.C0029c) {
            rn3.e().f(v, "Worker result SUCCESS for " + this.r);
            if (this.g.k()) {
                l();
                return;
            } else {
                q();
                return;
            }
        }
        if (aVar instanceof c.a.b) {
            rn3.e().f(v, "Worker result RETRY for " + this.r);
            k();
            return;
        }
        rn3.e().f(v, "Worker result FAILURE for " + this.r);
        if (this.g.k()) {
            l();
        } else {
            p();
        }
    }

    public void g(int i) {
        this.u = i;
        r();
        this.t.cancel(true);
        if (this.h != null && this.t.isCancelled()) {
            this.h.o(i);
            return;
        }
        rn3.e().a(v, "WorkSpec " + this.g + " is already done. Not interrupting.");
    }

    public final void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.o.k(str2) != by7.CANCELLED) {
                this.o.y(by7.FAILED, str2);
            }
            linkedList.addAll(this.p.d(str2));
        }
    }

    public final /* synthetic */ void i(xf3 xf3Var) {
        if (this.t.isCancelled()) {
            xf3Var.cancel(true);
        }
    }

    public void j() {
        if (r()) {
            return;
        }
        this.n.e();
        try {
            by7 by7VarK = this.o.k(this.e);
            this.n.G().a(this.e);
            if (by7VarK == null) {
                m(false);
            } else if (by7VarK == by7.RUNNING) {
                f(this.j);
            } else if (!by7VarK.b()) {
                this.u = -512;
                k();
            }
            this.n.A();
            this.n.i();
        } catch (Throwable th) {
            this.n.i();
            throw th;
        }
    }

    public final void k() {
        this.n.e();
        try {
            this.o.y(by7.ENQUEUED, this.e);
            this.o.b(this.e, this.l.a());
            this.o.t(this.e, this.g.f());
            this.o.f(this.e, -1L);
            this.n.A();
        } finally {
            this.n.i();
            m(true);
        }
    }

    public final void l() {
        this.n.e();
        try {
            this.o.b(this.e, this.l.a());
            this.o.y(by7.ENQUEUED, this.e);
            this.o.o(this.e);
            this.o.t(this.e, this.g.f());
            this.o.d(this.e);
            this.o.f(this.e, -1L);
            this.n.A();
        } finally {
            this.n.i();
            m(false);
        }
    }

    public final void m(boolean z) {
        this.n.e();
        try {
            if (!this.n.H().e()) {
                wk4.c(this.c, RescheduleReceiver.class, false);
            }
            if (z) {
                this.o.y(by7.ENQUEUED, this.e);
                this.o.n(this.e, this.u);
                this.o.f(this.e, -1L);
            }
            this.n.A();
            this.n.i();
            this.s.p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.n.i();
            throw th;
        }
    }

    public final void n() {
        by7 by7VarK = this.o.k(this.e);
        if (by7VarK == by7.RUNNING) {
            rn3.e().a(v, "Status for " + this.e + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        rn3.e().a(v, "Status for " + this.e + " is " + by7VarK + " ; not doing any work");
        m(false);
    }

    public final void o() {
        androidx.work.b bVarA;
        if (r()) {
            return;
        }
        this.n.e();
        try {
            yy7 yy7Var = this.g;
            if (yy7Var.b != by7.ENQUEUED) {
                n();
                this.n.A();
                rn3.e().a(v, this.g.c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((yy7Var.k() || this.g.j()) && this.l.a() < this.g.c()) {
                rn3.e().a(v, String.format("Delaying execution for %s because it is being executed before schedule.", this.g.c));
                m(true);
                this.n.A();
                return;
            }
            this.n.A();
            this.n.i();
            if (this.g.k()) {
                bVarA = this.g.e;
            } else {
                zy2 zy2VarB = this.k.f().b(this.g.d);
                if (zy2VarB == null) {
                    rn3.e().c(v, "Could not create Input Merger " + this.g.d);
                    p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.g.e);
                arrayList.addAll(this.o.q(this.e));
                bVarA = zy2VarB.a(arrayList);
            }
            androidx.work.b bVar = bVarA;
            UUID uuidFromString = UUID.fromString(this.e);
            List list = this.q;
            WorkerParameters.a aVar = this.f;
            yy7 yy7Var2 = this.g;
            WorkerParameters workerParameters = new WorkerParameters(uuidFromString, bVar, list, aVar, yy7Var2.k, yy7Var2.d(), this.k.d(), this.i, this.k.n(), new sy7(this.n, this.i), new zx7(this.n, this.m, this.i));
            if (this.h == null) {
                this.h = this.k.n().b(this.c, this.g.c, workerParameters);
            }
            androidx.work.c cVar = this.h;
            if (cVar == null) {
                rn3.e().c(v, "Could not create Worker " + this.g.c);
                p();
                return;
            }
            if (cVar.k()) {
                rn3.e().c(v, "Received an already-used Worker " + this.g.c + "; Worker Factory should return new instances");
                p();
                return;
            }
            this.h.m();
            if (!s()) {
                n();
                return;
            }
            if (r()) {
                return;
            }
            yx7 yx7Var = new yx7(this.c, this.g, this.h, workerParameters.b(), this.i);
            this.i.a().execute(yx7Var);
            final xf3 xf3VarB = yx7Var.b();
            this.t.a(new Runnable() { // from class: com.zepto.iz7
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.i(xf3VarB);
                }
            }, new x96());
            xf3VarB.a(new a(xf3VarB), this.i.a());
            this.t.a(new b(this.r), this.i.b());
        } finally {
            this.n.i();
        }
    }

    public void p() {
        this.n.e();
        try {
            h(this.e);
            androidx.work.b bVarE = ((c.a.C0028a) this.j).e();
            this.o.t(this.e, this.g.f());
            this.o.w(this.e, bVarE);
            this.n.A();
        } finally {
            this.n.i();
            m(false);
        }
    }

    public final void q() {
        this.n.e();
        try {
            this.o.y(by7.SUCCEEDED, this.e);
            this.o.w(this.e, ((c.a.C0029c) this.j).e());
            long jA = this.l.a();
            for (String str : this.p.d(this.e)) {
                if (this.o.k(str) == by7.BLOCKED && this.p.a(str)) {
                    rn3.e().f(v, "Setting status to enqueued for " + str);
                    this.o.y(by7.ENQUEUED, str);
                    this.o.b(str, jA);
                }
            }
            this.n.A();
            this.n.i();
            m(false);
        } catch (Throwable th) {
            this.n.i();
            m(false);
            throw th;
        }
    }

    public final boolean r() {
        if (this.u == -256) {
            return false;
        }
        rn3.e().a(v, "Work interrupted for " + this.r);
        if (this.o.k(this.e) == null) {
            m(false);
        } else {
            m(!r0.b());
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.r = b(this.q);
        o();
    }

    public final boolean s() {
        boolean z;
        this.n.e();
        try {
            if (this.o.k(this.e) == by7.ENQUEUED) {
                this.o.y(by7.RUNNING, this.e);
                this.o.r(this.e);
                this.o.n(this.e, -256);
                z = true;
            } else {
                z = false;
            }
            this.n.A();
            this.n.i();
            return z;
        } catch (Throwable th) {
            this.n.i();
            throw th;
        }
    }
}
