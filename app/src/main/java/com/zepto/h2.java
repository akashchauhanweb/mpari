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
public abstract class h2 implements xf3 {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(h2.class.getName());
    public static final b i;
    public static final Object j;
    public volatile Object c;
    public volatile e e;
    public volatile i f;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(h2 h2Var, e eVar, e eVar2);

        public abstract boolean b(h2 h2Var, Object obj, Object obj2);

        public abstract boolean c(h2 h2Var, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (h2.g) {
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
            this.a = (Throwable) h2.e(th);
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

        @Override // com.zepto.h2.b
        public boolean a(h2 h2Var, e eVar, e eVar2) {
            return o2.a(this.d, h2Var, eVar, eVar2);
        }

        @Override // com.zepto.h2.b
        public boolean b(h2 h2Var, Object obj, Object obj2) {
            return o2.a(this.e, h2Var, obj, obj2);
        }

        @Override // com.zepto.h2.b
        public boolean c(h2 h2Var, i iVar, i iVar2) {
            return o2.a(this.c, h2Var, iVar, iVar2);
        }

        @Override // com.zepto.h2.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // com.zepto.h2.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    public static final class g implements Runnable {
        public final h2 c;
        public final xf3 e;

        public g(h2 h2Var, xf3 xf3Var) {
            this.c = h2Var;
            this.e = xf3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.c != this) {
                return;
            }
            if (h2.i.b(this.c, this, h2.j(this.e))) {
                h2.g(this.c);
            }
        }
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.zepto.h2.b
        public boolean a(h2 h2Var, e eVar, e eVar2) {
            synchronized (h2Var) {
                try {
                    if (h2Var.e != eVar) {
                        return false;
                    }
                    h2Var.e = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.h2.b
        public boolean b(h2 h2Var, Object obj, Object obj2) {
            synchronized (h2Var) {
                try {
                    if (h2Var.c != obj) {
                        return false;
                    }
                    h2Var.c = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.h2.b
        public boolean c(h2 h2Var, i iVar, i iVar2) {
            synchronized (h2Var) {
                try {
                    if (h2Var.f != iVar) {
                        return false;
                    }
                    h2Var.f = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.h2.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // com.zepto.h2.b
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;
        public volatile i b;

        public i(boolean z) {
        }

        public void a(i iVar) {
            h2.i.d(this, iVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            h2.i.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h2.class, i.class, "f"), AtomicReferenceFieldUpdater.newUpdater(h2.class, e.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h2.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        i = hVar;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    private void b(StringBuilder sb) {
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
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

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void g(h2 h2Var) {
        e eVar = null;
        while (true) {
            h2Var.n();
            h2Var.c();
            e eVarF = h2Var.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.c;
                Runnable runnable = eVarF.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    h2Var = gVar.c;
                    if (h2Var.c == gVar) {
                        if (i.b(h2Var, gVar, j(gVar.e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarF.b);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private Object i(Object obj) throws ExecutionException {
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

    public static Object j(xf3 xf3Var) {
        if (xf3Var instanceof h2) {
            Object obj = ((h2) xf3Var).c;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.a ? cVar.b != null ? new c(false, cVar.b) : c.d : obj;
        }
        boolean zIsCancelled = xf3Var.isCancelled();
        if ((!g) && zIsCancelled) {
            return c.d;
        }
        try {
            Object objK = k(xf3Var);
            return objK == null ? j : objK;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + xf3Var, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f;
        } while (!i.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.c;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = g ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.c : c.d;
        h2 h2Var = this;
        boolean z2 = false;
        while (true) {
            if (i.b(h2Var, obj, cVar)) {
                if (z) {
                    h2Var.l();
                }
                g(h2Var);
                if (!(obj instanceof g)) {
                    return true;
                }
                xf3 xf3Var = ((g) obj).e;
                if (!(xf3Var instanceof h2)) {
                    xf3Var.cancel(z);
                    return true;
                }
                h2Var = (h2) xf3Var;
                obj = h2Var.c;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = h2Var.c;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
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
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (i.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f;
                    }
                } while (iVar != i.c);
            }
            return i(this.c);
        }
        while (nanos > 0) {
            Object obj3 = this.c;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.c != null);
    }

    public void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String m() {
        Object obj = this.c;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).e) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.f;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!i.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = j;
        }
        if (!i.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean q(Throwable th) {
        if (!i.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean r(xf3 xf3Var) {
        d dVar;
        e(xf3Var);
        Object obj = this.c;
        if (obj == null) {
            if (xf3Var.isDone()) {
                if (!i.b(this, null, j(xf3Var))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, xf3Var);
            if (i.b(this, null, gVar)) {
                try {
                    xf3Var.a(gVar, dk1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    i.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.c;
        }
        if (obj instanceof c) {
            xf3Var.cancel(((c) obj).a);
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e2) {
                strM = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (i.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            obj = this.c;
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f;
                } while (iVar != i.c);
            }
            return i(this.c);
        }
        throw new InterruptedException();
    }
}
