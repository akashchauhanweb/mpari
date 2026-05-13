package com.zepto;

import com.zepto.i55;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pk1 {
    public Runnable c;
    public ExecutorService d;
    public int a = 64;
    public int b = 5;
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public final synchronized void a() {
        try {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((i55.a) it.next()).b().cancel();
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ((i55.a) it2.next()).b().cancel();
            }
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ((i55) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(i55.a call) {
        i55.a aVarE;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.e.add(call);
                if (!call.b().p() && (aVarE = e(call.d())) != null) {
                    call.e(aVarE);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
    }

    public final synchronized void c(i55 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.g.add(call);
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        try {
            if (this.d == null) {
                this.d = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), et6.K(et6.i + " Dispatcher", false));
            }
            executorService = this.d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final i55.a e(String str) {
        for (i55.a aVar : this.f) {
            if (Intrinsics.areEqual(aVar.d(), str)) {
                return aVar;
            }
        }
        for (i55.a aVar2 : this.e) {
            if (Intrinsics.areEqual(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void f(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.c;
            Unit unit = Unit.INSTANCE;
        }
        if (i() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void g(i55.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.c().decrementAndGet();
        f(this.f, call);
    }

    public final void h(i55 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        f(this.g, call);
    }

    public final boolean i() {
        int i;
        boolean z;
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
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    i55.a asyncCall = (i55.a) it.next();
                    if (this.f.size() >= this.a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f.add(asyncCall);
                    }
                }
                z = j() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((i55.a) arrayList.get(i)).a(d());
        }
        return z;
    }

    public final synchronized int j() {
        return this.f.size() + this.g.size();
    }
}
