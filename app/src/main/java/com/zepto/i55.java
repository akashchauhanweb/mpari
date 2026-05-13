package com.zepto;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i55 implements da0 {
    public final l55 c;
    public final v42 e;
    public final c f;
    public final AtomicBoolean g;
    public Object h;
    public t52 i;
    public j55 j;
    public boolean k;
    public r52 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile r52 q;
    public volatile j55 r;
    public final yf4 s;
    public final kc5 t;
    public final boolean u;

    public final class a implements Runnable {
        public volatile AtomicInteger c;
        public final ga0 e;
        public final /* synthetic */ i55 f;

        public a(i55 i55Var, ga0 responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f = i55Var;
            this.e = responseCallback;
            this.c = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            pk1 pk1VarO = this.f.k().o();
            if (et6.h && Thread.holdsLock(pk1VarO)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(pk1VarO);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f.v(interruptedIOException);
                    this.e.onFailure(this.f, interruptedIOException);
                    this.f.k().o().g(this);
                }
            } catch (Throwable th) {
                this.f.k().o().g(this);
                throw th;
            }
        }

        public final i55 b() {
            return this.f;
        }

        public final AtomicInteger c() {
            return this.c;
        }

        public final String d() {
            return this.f.r().k().i();
        }

        public final void e(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.c = other.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            pk1 pk1VarO;
            String str = "OkHttp " + this.f.x();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f.f.r();
                try {
                    try {
                        z = true;
                    } catch (IOException e2) {
                        z = false;
                        e = e2;
                    } catch (Throwable th2) {
                        z = false;
                        th = th2;
                    }
                    try {
                        this.e.onResponse(this.f, this.f.s());
                        pk1VarO = this.f.k().o();
                    } catch (IOException e3) {
                        e = e3;
                        if (z) {
                            is4.c.g().k("Callback failure for " + this.f.G(), 4, e);
                        } else {
                            this.e.onFailure(this.f, e);
                        }
                        pk1VarO = this.f.k().o();
                    } catch (Throwable th3) {
                        th = th3;
                        this.f.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ExceptionsKt__ExceptionsKt.addSuppressed(iOException, th);
                            this.e.onFailure(this.f, iOException);
                        }
                        throw th;
                    }
                    pk1VarO.g(this);
                } catch (Throwable th4) {
                    this.f.k().o().g(this);
                    throw th4;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference {
        public final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i55 referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    public static final class c extends hy {
        public c() {
        }

        @Override // com.zepto.hy
        public void x() {
            i55.this.cancel();
        }
    }

    public i55(yf4 client, kc5 originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.s = client;
        this.t = originalRequest;
        this.u = z;
        this.c = client.i().a();
        this.e = client.q().a(this);
        c cVar = new c();
        cVar.g(client.f(), TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.f = cVar;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public final void A(j55 j55Var) {
        this.r = j55Var;
    }

    @Override // com.zepto.da0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public hy timeout() {
        return this.f;
    }

    public final void E() {
        if (!(!this.k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.k = true;
        this.f.s();
    }

    public final IOException F(IOException iOException) {
        if (this.k || !this.f.s()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String G() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.u ? "web socket" : "call");
        sb.append(" to ");
        sb.append(x());
        return sb.toString();
    }

    public final void c(j55 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!et6.h || Thread.holdsLock(connection)) {
            if (!(this.j == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.j = connection;
            connection.o().add(new b(this, this.h));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }

    @Override // com.zepto.da0
    public void cancel() {
        if (this.p) {
            return;
        }
        this.p = true;
        r52 r52Var = this.q;
        if (r52Var != null) {
            r52Var.b();
        }
        j55 j55Var = this.r;
        if (j55Var != null) {
            j55Var.e();
        }
        this.e.g(this);
    }

    public final IOException d(IOException iOException) {
        Socket socketY;
        boolean z = et6.h;
        if (z && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        j55 j55Var = this.j;
        if (j55Var != null) {
            if (z && Thread.holdsLock(j55Var)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "Thread.currentThread()");
                sb2.append(threadCurrentThread2.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(j55Var);
                throw new AssertionError(sb2.toString());
            }
            synchronized (j55Var) {
                socketY = y();
            }
            if (this.j == null) {
                if (socketY != null) {
                    et6.k(socketY);
                }
                this.e.l(this, j55Var);
            } else {
                if (!(socketY == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        IOException iOExceptionF = F(iOException);
        if (iOException != null) {
            v42 v42Var = this.e;
            Intrinsics.checkNotNull(iOExceptionF);
            v42Var.e(this, iOExceptionF);
        } else {
            this.e.d(this);
        }
        return iOExceptionF;
    }

    public final void e() {
        this.h = is4.c.g().i("response.body().close()");
        this.e.f(this);
    }

    @Override // com.zepto.da0
    public ld5 execute() {
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f.r();
        e();
        try {
            this.s.o().c(this);
            return s();
        } finally {
            this.s.o().h(this);
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i55 clone() {
        return new i55(this.s, this.t, this.u);
    }

    public final wj g(ds2 ds2Var) {
        SSLSocketFactory sSLSocketFactoryI;
        HostnameVerifier hostnameVerifierU;
        vb0 vb0VarG;
        if (ds2Var.j()) {
            sSLSocketFactoryI = this.s.I();
            hostnameVerifierU = this.s.u();
            vb0VarG = this.s.g();
        } else {
            sSLSocketFactoryI = null;
            hostnameVerifierU = null;
            vb0VarG = null;
        }
        return new wj(ds2Var.i(), ds2Var.n(), this.s.p(), this.s.H(), sSLSocketFactoryI, hostnameVerifierU, vb0VarG, this.s.C(), this.s.A(), this.s.z(), this.s.k(), this.s.E());
    }

    public final void h(kc5 request, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.n)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            this.i = new t52(this.c, g(request.k()), this, this.e);
        }
    }

    public final void i(boolean z) {
        r52 r52Var;
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (r52Var = this.q) != null) {
            r52Var.d();
        }
        this.l = null;
    }

    @Override // com.zepto.da0
    public boolean isCanceled() {
        return this.p;
    }

    public final yf4 k() {
        return this.s;
    }

    public final j55 l() {
        return this.j;
    }

    @Override // com.zepto.da0
    public void n(ga0 responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        e();
        this.s.o().b(new a(this, responseCallback));
    }

    public final v42 o() {
        return this.e;
    }

    public final boolean p() {
        return this.u;
    }

    public final r52 q() {
        return this.l;
    }

    public final kc5 r() {
        return this.t;
    }

    @Override // com.zepto.da0
    public kc5 request() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.zepto.ld5 s() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.zepto.yf4 r0 = r11.s
            java.util.List r0 = r0.v()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            com.zepto.ae5 r0 = new com.zepto.ae5
            com.zepto.yf4 r1 = r11.s
            r0.<init>(r1)
            r2.add(r0)
            com.zepto.q70 r0 = new com.zepto.q70
            com.zepto.yf4 r1 = r11.s
            com.zepto.lz0 r1 = r1.l()
            r0.<init>(r1)
            r2.add(r0)
            com.zepto.m90 r0 = new com.zepto.m90
            com.zepto.yf4 r1 = r11.s
            com.zepto.f90 r1 = r1.e()
            r0.<init>(r1)
            r2.add(r0)
            com.zepto.hw0 r0 = com.zepto.hw0.a
            r2.add(r0)
            boolean r0 = r11.u
            if (r0 != 0) goto L4a
            com.zepto.yf4 r0 = r11.s
            java.util.List r0 = r0.x()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L4a:
            com.zepto.fa0 r0 = new com.zepto.fa0
            boolean r1 = r11.u
            r0.<init>(r1)
            r2.add(r0)
            com.zepto.m55 r9 = new com.zepto.m55
            r3 = 0
            r4 = 0
            com.zepto.kc5 r5 = r11.t
            com.zepto.yf4 r0 = r11.s
            int r6 = r0.h()
            com.zepto.yf4 r0 = r11.s
            int r7 = r0.F()
            com.zepto.yf4 r0 = r11.s
            int r8 = r0.K()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            com.zepto.kc5 r2 = r11.t     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            com.zepto.ld5 r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r3 = r11.isCanceled()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 != 0) goto L83
            r11.v(r0)
            return r2
        L83:
            com.zepto.et6.j(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r2     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r2 = move-exception
            goto La6
        L90:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.v(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto La5
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> La0
            throw r1     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
            goto La6
        La5:
            throw r1     // Catch: java.lang.Throwable -> La0
        La6:
            if (r1 != 0) goto Lab
            r11.v(r0)
        Lab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.i55.s():com.zepto.ld5");
    }

    public final r52 t(m55 chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        t52 t52Var = this.i;
        Intrinsics.checkNotNull(t52Var);
        r52 r52Var = new r52(this, this.e, t52Var, t52Var.a(this.s, chain));
        this.l = r52Var;
        this.q = r52Var;
        synchronized (this) {
            this.m = true;
            this.n = true;
        }
        if (this.p) {
            throw new IOException("Canceled");
        }
        return r52Var;
    }

    public final IOException u(r52 exchange, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        boolean z4 = true;
        if (!Intrinsics.areEqual(exchange, this.q)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.m) {
                        if (z2 || !this.n) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.m = false;
                    }
                    if (z2) {
                        this.n = false;
                    }
                    boolean z5 = this.m;
                    boolean z6 = (z5 || this.n) ? false : true;
                    if (z5 || this.n || this.o) {
                        z4 = false;
                    }
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z3) {
            this.q = null;
            j55 j55Var = this.j;
            if (j55Var != null) {
                j55Var.t();
            }
        }
        return z4 ? d(iOException) : iOException;
    }

    public final IOException v(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.o) {
                    this.o = false;
                    if (!this.m && !this.n) {
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? d(iOException) : iOException;
    }

    public final String x() {
        return this.t.k().p();
    }

    public final Socket y() {
        j55 j55Var = this.j;
        Intrinsics.checkNotNull(j55Var);
        if (et6.h && !Thread.holdsLock(j55Var)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(j55Var);
            throw new AssertionError(sb.toString());
        }
        List listO = j55Var.o();
        Iterator it = listO.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual((i55) ((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listO.remove(i);
        this.j = null;
        if (listO.isEmpty()) {
            j55Var.C(System.nanoTime());
            if (this.c.c(j55Var)) {
                return j55Var.E();
            }
        }
        return null;
    }

    public final boolean z() {
        t52 t52Var = this.i;
        Intrinsics.checkNotNull(t52Var);
        return t52Var.e();
    }
}
