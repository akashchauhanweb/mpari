package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cd6 {
    public static final Logger i;
    public int a;
    public boolean b;
    public long c;
    public final List d;
    public final List e;
    public final Runnable f;
    public final a g;
    public static final b j = new b(null);
    public static final cd6 h = new cd6(new c(et6.K(et6.i + " TaskRunner", true)));

    public interface a {
        void a(cd6 cd6Var);

        void b(cd6 cd6Var, long j);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return cd6.i;
        }
    }

    public static final class c implements a {
        public final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.zepto.cd6.a
        public void a(cd6 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // com.zepto.cd6.a
        public void b(cd6 taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // com.zepto.cd6.a
        public long c() {
            return System.nanoTime();
        }

        @Override // com.zepto.cd6.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oc6 oc6VarD;
            long jC;
            while (true) {
                synchronized (cd6.this) {
                    oc6VarD = cd6.this.d();
                }
                if (oc6VarD == null) {
                    return;
                }
                bd6 bd6VarD = oc6VarD.d();
                Intrinsics.checkNotNull(bd6VarD);
                boolean zIsLoggable = cd6.j.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jC = bd6VarD.h().g().c();
                    zc6.c(oc6VarD, bd6VarD, "starting");
                } else {
                    jC = -1;
                }
                try {
                    try {
                        cd6.this.j(oc6VarD);
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            zc6.c(oc6VarD, bd6VarD, "finished run in " + zc6.b(bd6VarD.h().g().c() - jC));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        zc6.c(oc6VarD, bd6VarD, "failed a run in " + zc6.b(bd6VarD.h().g().c() - jC));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(cd6.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public cd6(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.g = backend;
        this.a = 10000;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new d();
    }

    public final void c(oc6 oc6Var, long j2) {
        if (et6.h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        bd6 bd6VarD = oc6Var.d();
        Intrinsics.checkNotNull(bd6VarD);
        if (!(bd6VarD.c() == oc6Var)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zD = bd6VarD.d();
        bd6VarD.m(false);
        bd6VarD.l(null);
        this.d.remove(bd6VarD);
        if (j2 != -1 && !zD && !bd6VarD.g()) {
            bd6VarD.k(oc6Var, j2, true);
        }
        if (!bd6VarD.e().isEmpty()) {
            this.e.add(bd6VarD);
        }
    }

    public final oc6 d() {
        boolean z;
        if (et6.h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.e.isEmpty()) {
            long jC = this.g.c();
            Iterator it = this.e.iterator();
            long jMin = LongCompanionObject.MAX_VALUE;
            oc6 oc6Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                oc6 oc6Var2 = (oc6) ((bd6) it.next()).e().get(0);
                long jMax = Math.max(0L, oc6Var2.c() - jC);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (oc6Var != null) {
                        z = true;
                        break;
                    }
                    oc6Var = oc6Var2;
                }
            }
            if (oc6Var != null) {
                e(oc6Var);
                if (z || (!this.b && (!this.e.isEmpty()))) {
                    this.g.execute(this.f);
                }
                return oc6Var;
            }
            if (this.b) {
                if (jMin < this.c - jC) {
                    this.g.a(this);
                }
                return null;
            }
            this.b = true;
            this.c = jC + jMin;
            try {
                try {
                    this.g.b(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.b = false;
            }
        }
        return null;
    }

    public final void e(oc6 oc6Var) {
        if (!et6.h || Thread.holdsLock(this)) {
            oc6Var.g(-1L);
            bd6 bd6VarD = oc6Var.d();
            Intrinsics.checkNotNull(bd6VarD);
            bd6VarD.e().remove(oc6Var);
            this.e.remove(bd6VarD);
            bd6VarD.l(oc6Var);
            this.d.add(bd6VarD);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void f() {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            ((bd6) this.d.get(size)).b();
        }
        for (int size2 = this.e.size() - 1; size2 >= 0; size2--) {
            bd6 bd6Var = (bd6) this.e.get(size2);
            bd6Var.b();
            if (bd6Var.e().isEmpty()) {
                this.e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.g;
    }

    public final void h(bd6 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (et6.h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.c() == null) {
            if (!taskQueue.e().isEmpty()) {
                et6.a(this.e, taskQueue);
            } else {
                this.e.remove(taskQueue);
            }
        }
        if (this.b) {
            this.g.a(this);
        } else {
            this.g.execute(this.f);
        }
    }

    public final bd6 i() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new bd6(this, sb.toString());
    }

    public final void j(oc6 oc6Var) {
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
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(oc6Var.b());
        try {
            long jF = oc6Var.f();
            synchronized (this) {
                c(oc6Var, jF);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(oc6Var, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }
}
