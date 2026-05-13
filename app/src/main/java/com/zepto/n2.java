package com.zepto;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2 implements xf3 {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(n2.class.getName());
    public static final b i;
    public static final Object j;
    public volatile Object c;
    public volatile e e;
    public volatile h f;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(n2 n2Var, e eVar, e eVar2);

        public abstract boolean b(n2 n2Var, Object obj, Object obj2);

        public abstract boolean c(n2 n2Var, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (n2.g) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.a = (Throwable) n2.e(th);
        }
    }

    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    public static final class f extends b {
        public final AtomicReferenceFieldUpdater a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.zepto.n2.b
        public boolean a(n2 n2Var, e eVar, e eVar2) {
            return o2.a(this.d, n2Var, eVar, eVar2);
        }

        @Override // com.zepto.n2.b
        public boolean b(n2 n2Var, Object obj, Object obj2) {
            return o2.a(this.e, n2Var, obj, obj2);
        }

        @Override // com.zepto.n2.b
        public boolean c(n2 n2Var, h hVar, h hVar2) {
            return o2.a(this.c, n2Var, hVar, hVar2);
        }

        @Override // com.zepto.n2.b
        public void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // com.zepto.n2.b
        public void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // com.zepto.n2.b
        public boolean a(n2 n2Var, e eVar, e eVar2) {
            synchronized (n2Var) {
                try {
                    if (n2Var.e != eVar) {
                        return false;
                    }
                    n2Var.e = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.n2.b
        public boolean b(n2 n2Var, Object obj, Object obj2) {
            synchronized (n2Var) {
                try {
                    if (n2Var.c != obj) {
                        return false;
                    }
                    n2Var.c = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.n2.b
        public boolean c(n2 n2Var, h hVar, h hVar2) {
            synchronized (n2Var) {
                try {
                    if (n2Var.f != hVar) {
                        return false;
                    }
                    n2Var.f = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.n2.b
        public void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // com.zepto.n2.b
        public void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    public static final class h {
        public static final h c = new h(false);
        public volatile Thread a;
        public volatile h b;

        public h(boolean z) {
        }

        public void a(h hVar) {
            n2.i.d(this, hVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            n2.i.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n2.class, h.class, "f"), AtomicReferenceFieldUpdater.newUpdater(n2.class, e.class, "e"), AtomicReferenceFieldUpdater.newUpdater(n2.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        i = gVar;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void g(n2 n2Var) {
        n2Var.m();
        n2Var.c();
        e eVarF = n2Var.f(null);
        while (eVarF != null) {
            e eVar = eVarF.c;
            h(eVarF.a, eVarF.b);
            eVarF = eVar;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object j(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.zepto.xf3
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.e;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (i.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.e;
                }
            } while (eVar != e.d);
        }
        h(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(q(objJ));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.c;
        if (obj == null) {
            if (i.b(this, obj, g ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.c : c.d)) {
                if (z) {
                    k();
                }
                g(this);
                return true;
            }
        }
        return false;
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.e;
        } while (!i.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        if ((obj != null) && true) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (i.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if ((obj2 != null) && true) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(hVar2);
                    } else {
                        hVar = this.f;
                    }
                } while (hVar != h.c);
            }
            return i(this.c);
        }
        while (nanos > 0) {
            Object obj3 = this.c;
            if ((obj3 != null) && true) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    public final Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.c != null) & true;
    }

    public void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m() {
        h hVar;
        do {
            hVar = this.f;
        } while (!i.c(this, hVar, h.c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.b;
        }
    }

    public final void n(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.f;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!i.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = j;
        }
        if (!i.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean p(Throwable th) {
        if (!i.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public final String q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean r() {
        Object obj = this.c;
        return (obj instanceof c) && ((c) obj).a;
    }

    public String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e2) {
                strL = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strL);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.c;
        if ((obj2 != null) & true) {
            return i(obj2);
        }
        h hVar = this.f;
        if (hVar != h.c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (i.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            n(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.c;
                    } while (!((obj != null) & true));
                    return i(obj);
                }
                hVar = this.f;
            } while (hVar != h.c);
        }
        return i(this.c);
    }
}
