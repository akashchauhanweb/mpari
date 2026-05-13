package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bd6 {
    public boolean a;
    public oc6 b;
    public final List c;
    public boolean d;
    public final cd6 e;
    public final String f;

    public bd6(cd6 taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.e = taskRunner;
        this.f = name;
        this.c = new ArrayList();
    }

    public static /* synthetic */ void j(bd6 bd6Var, oc6 oc6Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        bd6Var.i(oc6Var, j);
    }

    public final void a() {
        if (et6.h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.e) {
            try {
                if (b()) {
                    this.e.h(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        oc6 oc6Var = this.b;
        if (oc6Var != null) {
            Intrinsics.checkNotNull(oc6Var);
            if (oc6Var.a()) {
                this.d = true;
            }
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (((oc6) this.c.get(size)).a()) {
                oc6 oc6Var2 = (oc6) this.c.get(size);
                if (cd6.j.a().isLoggable(Level.FINE)) {
                    zc6.c(oc6Var2, this, "canceled");
                }
                this.c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final oc6 c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final List e() {
        return this.c;
    }

    public final String f() {
        return this.f;
    }

    public final boolean g() {
        return this.a;
    }

    public final cd6 h() {
        return this.e;
    }

    public final void i(oc6 task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.e) {
            if (!this.a) {
                if (k(task, j, false)) {
                    this.e.h(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.a()) {
                if (cd6.j.a().isLoggable(Level.FINE)) {
                    zc6.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (cd6.j.a().isLoggable(Level.FINE)) {
                    zc6.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(oc6 task, long j, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long jC = this.e.g().c();
        long j2 = jC + j;
        int iIndexOf = this.c.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j2) {
                if (cd6.j.a().isLoggable(Level.FINE)) {
                    zc6.c(task, this, "already scheduled");
                }
                return false;
            }
            this.c.remove(iIndexOf);
        }
        task.g(j2);
        if (cd6.j.a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + zc6.b(j2 - jC);
            } else {
                str = "scheduled after " + zc6.b(j2 - jC);
            }
            zc6.c(task, this, str);
        }
        Iterator it = this.c.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((oc6) it.next()).c() - jC > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.c.size();
        }
        this.c.add(size, task);
        return size == 0;
    }

    public final void l(oc6 oc6Var) {
        this.b = oc6Var;
    }

    public final void m(boolean z) {
        this.d = z;
    }

    public final void n() {
        if (et6.h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.e) {
            try {
                this.a = true;
                if (b()) {
                    this.e.h(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f;
    }
}
