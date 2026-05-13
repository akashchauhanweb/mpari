package com.zepto;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.zepto.jz7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class bw4 implements re2 {
    public static final String l = rn3.i("Processor");
    public Context b;
    public androidx.work.a c;
    public uc6 d;
    public WorkDatabase e;
    public Map g = new HashMap();
    public Map f = new HashMap();
    public Set i = new HashSet();
    public final List j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public Map h = new HashMap();

    public bw4(Context context, androidx.work.a aVar, uc6 uc6Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = aVar;
        this.d = uc6Var;
        this.e = workDatabase;
    }

    public static boolean i(String str, jz7 jz7Var, int i) {
        if (jz7Var == null) {
            rn3.e().a(l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        jz7Var.g(i);
        rn3.e().a(l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // com.zepto.re2
    public void a(String str, pe2 pe2Var) {
        synchronized (this.k) {
            try {
                rn3.e().f(l, "Moving WorkSpec (" + str + ") to the foreground");
                jz7 jz7Var = (jz7) this.g.remove(str);
                if (jz7Var != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockB = pu7.b(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f.put(str, jz7Var);
                    yy0.n(this.b, androidx.work.impl.foreground.a.f(this.b, jz7Var.d(), pe2Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(x52 x52Var) {
        synchronized (this.k) {
            this.j.add(x52Var);
        }
    }

    public final jz7 f(String str) {
        jz7 jz7Var = (jz7) this.f.remove(str);
        boolean z = jz7Var != null;
        if (!z) {
            jz7Var = (jz7) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            u();
        }
        return jz7Var;
    }

    public yy7 g(String str) {
        synchronized (this.k) {
            try {
                jz7 jz7VarH = h(str);
                if (jz7VarH == null) {
                    return null;
                }
                return jz7VarH.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final jz7 h(String str) {
        jz7 jz7Var = (jz7) this.f.get(str);
        return jz7Var == null ? (jz7) this.g.get(str) : jz7Var;
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.k) {
            zContains = this.i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z;
        synchronized (this.k) {
            z = h(str) != null;
        }
        return z;
    }

    public final /* synthetic */ void l(ay7 ay7Var, boolean z) {
        synchronized (this.k) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ((x52) it.next()).d(ay7Var, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ yy7 m(ArrayList arrayList, String str) {
        arrayList.addAll(this.e.I().d(str));
        return this.e.H().m(str);
    }

    public final /* synthetic */ void n(xf3 xf3Var, jz7 jz7Var) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) xf3Var.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        o(jz7Var, zBooleanValue);
    }

    public final void o(jz7 jz7Var, boolean z) {
        synchronized (this.k) {
            try {
                ay7 ay7VarD = jz7Var.d();
                String strB = ay7VarD.b();
                if (h(strB) == jz7Var) {
                    f(strB);
                }
                rn3.e().a(l, getClass().getSimpleName() + " " + strB + " executed; reschedule = " + z);
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ((x52) it.next()).d(ay7VarD, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(x52 x52Var) {
        synchronized (this.k) {
            this.j.remove(x52Var);
        }
    }

    public final void q(final ay7 ay7Var, final boolean z) {
        this.d.a().execute(new Runnable() { // from class: com.zepto.aw4
            @Override // java.lang.Runnable
            public final void run() {
                this.c.l(ay7Var, z);
            }
        });
    }

    public boolean r(o66 o66Var) {
        return s(o66Var, null);
    }

    public boolean s(o66 o66Var, WorkerParameters.a aVar) {
        ay7 ay7VarA = o66Var.a();
        final String strB = ay7VarA.b();
        final ArrayList arrayList = new ArrayList();
        yy7 yy7Var = (yy7) this.e.z(new Callable() { // from class: com.zepto.yv4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.m(arrayList, strB);
            }
        });
        if (yy7Var == null) {
            rn3.e().k(l, "Didn't find WorkSpec for id " + ay7VarA);
            q(ay7VarA, false);
            return false;
        }
        synchronized (this.k) {
            try {
                if (k(strB)) {
                    Set set = (Set) this.h.get(strB);
                    if (((o66) set.iterator().next()).a().a() == ay7VarA.a()) {
                        set.add(o66Var);
                        rn3.e().a(l, "Work " + ay7VarA + " is already enqueued for processing");
                    } else {
                        q(ay7VarA, false);
                    }
                    return false;
                }
                if (yy7Var.d() != ay7VarA.a()) {
                    q(ay7VarA, false);
                    return false;
                }
                final jz7 jz7VarB = new jz7.c(this.b, this.c, this.d, this, this.e, yy7Var, arrayList).c(aVar).b();
                final xf3 xf3VarC = jz7VarB.c();
                xf3VarC.a(new Runnable() { // from class: com.zepto.zv4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.c.n(xf3VarC, jz7VarB);
                    }
                }, this.d.a());
                this.g.put(strB, jz7VarB);
                HashSet hashSet = new HashSet();
                hashSet.add(o66Var);
                this.h.put(strB, hashSet);
                this.d.b().execute(jz7VarB);
                rn3.e().a(l, getClass().getSimpleName() + ": processing " + ay7VarA);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(String str, int i) {
        jz7 jz7VarF;
        synchronized (this.k) {
            rn3.e().a(l, "Processor cancelling " + str);
            this.i.add(str);
            jz7VarF = f(str);
        }
        return i(str, jz7VarF, i);
    }

    public final void u() {
        synchronized (this.k) {
            try {
                if (!(!this.f.isEmpty())) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.g(this.b));
                    } catch (Throwable th) {
                        rn3.e().d(l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean v(o66 o66Var, int i) {
        jz7 jz7VarF;
        String strB = o66Var.a().b();
        synchronized (this.k) {
            jz7VarF = f(strB);
        }
        return i(strB, jz7VarF, i);
    }

    public boolean w(o66 o66Var, int i) {
        String strB = o66Var.a().b();
        synchronized (this.k) {
            try {
                if (this.f.get(strB) == null) {
                    Set set = (Set) this.h.get(strB);
                    if (set != null && set.contains(o66Var)) {
                        return i(strB, f(strB), i);
                    }
                    return false;
                }
                rn3.e().a(l, "Ignored stopWork. WorkerWrapper " + strB + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
