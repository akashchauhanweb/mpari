package com.zepto;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class hy extends cg6 {
    public static final long i;
    public static final long j;
    public static hy k;
    public static final a l = new a(null);
    public boolean f;
    public hy g;
    public long h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hy c() throws InterruptedException {
            hy hyVar = hy.k;
            Intrinsics.checkNotNull(hyVar);
            hy hyVar2 = hyVar.g;
            if (hyVar2 == null) {
                long jNanoTime = System.nanoTime();
                hy.class.wait(hy.i);
                hy hyVar3 = hy.k;
                Intrinsics.checkNotNull(hyVar3);
                if (hyVar3.g != null || System.nanoTime() - jNanoTime < hy.j) {
                    return null;
                }
                return hy.k;
            }
            long jU = hyVar2.u(System.nanoTime());
            if (jU > 0) {
                long j = jU / 1000000;
                hy.class.wait(j, (int) (jU - (1000000 * j)));
                return null;
            }
            hy hyVar4 = hy.k;
            Intrinsics.checkNotNull(hyVar4);
            hyVar4.g = hyVar2.g;
            hyVar2.g = null;
            return hyVar2;
        }

        public final boolean d(hy hyVar) {
            synchronized (hy.class) {
                for (hy hyVar2 = hy.k; hyVar2 != null; hyVar2 = hyVar2.g) {
                    if (hyVar2.g == hyVar) {
                        hyVar2.g = hyVar.g;
                        hyVar.g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        public final void e(hy hyVar, long j, boolean z) {
            synchronized (hy.class) {
                try {
                    if (hy.k == null) {
                        hy.k = new hy();
                        new b().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j != 0 && z) {
                        hyVar.h = Math.min(j, hyVar.c() - jNanoTime) + jNanoTime;
                    } else if (j != 0) {
                        hyVar.h = j + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        hyVar.h = hyVar.c();
                    }
                    long jU = hyVar.u(jNanoTime);
                    hy hyVar2 = hy.k;
                    Intrinsics.checkNotNull(hyVar2);
                    while (hyVar2.g != null) {
                        hy hyVar3 = hyVar2.g;
                        Intrinsics.checkNotNull(hyVar3);
                        if (jU < hyVar3.u(jNanoTime)) {
                            break;
                        }
                        hyVar2 = hyVar2.g;
                        Intrinsics.checkNotNull(hyVar2);
                    }
                    hyVar.g = hyVar2.g;
                    hyVar2.g = hyVar;
                    if (hyVar2 == hy.k) {
                        hy.class.notify();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            hy hyVarC;
            while (true) {
                try {
                    synchronized (hy.class) {
                        hyVarC = hy.l.c();
                        if (hyVarC == hy.k) {
                            hy.k = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (hyVarC != null) {
                        hyVarC.x();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    public static final class c implements d36 {
        public final /* synthetic */ d36 e;

        public c(d36 d36Var) {
            this.e = d36Var;
        }

        @Override // com.zepto.d36
        public void Q(u70 source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            g.b(source.L0(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                vu5 vu5Var = source.c;
                Intrinsics.checkNotNull(vu5Var);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (vu5Var.c - vu5Var.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        vu5Var = vu5Var.f;
                        Intrinsics.checkNotNull(vu5Var);
                    }
                }
                hy hyVar = hy.this;
                hyVar.r();
                try {
                    this.e.Q(source, j2);
                    Unit unit = Unit.INSTANCE;
                    if (hyVar.s()) {
                        throw hyVar.m(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!hyVar.s()) {
                        throw e;
                    }
                    throw hyVar.m(e);
                } finally {
                    hyVar.s();
                }
            }
        }

        @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            hy hyVar = hy.this;
            hyVar.r();
            try {
                this.e.close();
                Unit unit = Unit.INSTANCE;
                if (hyVar.s()) {
                    throw hyVar.m(null);
                }
            } catch (IOException e) {
                if (!hyVar.s()) {
                    throw e;
                }
                throw hyVar.m(e);
            } finally {
                hyVar.s();
            }
        }

        @Override // com.zepto.d36
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public hy timeout() {
            return hy.this;
        }

        @Override // com.zepto.d36, java.io.Flushable
        public void flush() throws IOException {
            hy hyVar = hy.this;
            hyVar.r();
            try {
                this.e.flush();
                Unit unit = Unit.INSTANCE;
                if (hyVar.s()) {
                    throw hyVar.m(null);
                }
            } catch (IOException e) {
                if (!hyVar.s()) {
                    throw e;
                }
                throw hyVar.m(e);
            } finally {
                hyVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.e + ')';
        }
    }

    public static final class d implements y46 {
        public final /* synthetic */ y46 e;

        public d(y46 y46Var) {
            this.e = y46Var;
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            hy hyVar = hy.this;
            hyVar.r();
            try {
                this.e.close();
                Unit unit = Unit.INSTANCE;
                if (hyVar.s()) {
                    throw hyVar.m(null);
                }
            } catch (IOException e) {
                if (!hyVar.s()) {
                    throw e;
                }
                throw hyVar.m(e);
            } finally {
                hyVar.s();
            }
        }

        @Override // com.zepto.y46
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public hy timeout() {
            return hy.this;
        }

        @Override // com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            hy hyVar = hy.this;
            hyVar.r();
            try {
                long j2 = this.e.read(sink, j);
                if (hyVar.s()) {
                    throw hyVar.m(null);
                }
                return j2;
            } catch (IOException e) {
                if (hyVar.s()) {
                    throw hyVar.m(e);
                }
                throw e;
            } finally {
                hyVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.e + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        i = millis;
        j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!(!this.f)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            this.f = true;
            l.e(this, jH, zE);
        }
    }

    public final boolean s() {
        if (!this.f) {
            return false;
        }
        this.f = false;
        return l.d(this);
    }

    public IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long u(long j2) {
        return this.h - j2;
    }

    public final d36 v(d36 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }

    public final y46 w(y46 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public void x() {
    }
}
