package com.zepto;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ur2 {
    public static final a o = new a(null);
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final c g;
    public final b h;
    public final d i;
    public final d j;
    public y22 k;
    public IOException l;
    public final int m;
    public final rr2 n;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b implements d36 {
        public final u70 c = new u70();
        public pl2 e;
        public boolean f;
        public boolean g;

        public b(boolean z) {
            this.g = z;
        }

        @Override // com.zepto.d36
        public void Q(u70 source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            ur2 ur2Var = ur2.this;
            if (!et6.h || !Thread.holdsLock(ur2Var)) {
                this.c.Q(source, j);
                while (this.c.L0() >= PlaybackStateCompat.ACTION_PREPARE) {
                    d(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(ur2Var);
            throw new AssertionError(sb.toString());
        }

        @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ur2 ur2Var = ur2.this;
            if (et6.h && Thread.holdsLock(ur2Var)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(ur2Var);
                throw new AssertionError(sb.toString());
            }
            synchronized (ur2.this) {
                if (this.f) {
                    return;
                }
                boolean z = ur2.this.h() == null;
                Unit unit = Unit.INSTANCE;
                if (!ur2.this.o().g) {
                    boolean z2 = this.c.L0() > 0;
                    if (this.e != null) {
                        while (this.c.L0() > 0) {
                            d(false);
                        }
                        rr2 rr2VarG = ur2.this.g();
                        int iJ = ur2.this.j();
                        pl2 pl2Var = this.e;
                        Intrinsics.checkNotNull(pl2Var);
                        rr2VarG.e1(iJ, z, et6.L(pl2Var));
                    } else if (z2) {
                        while (this.c.L0() > 0) {
                            d(true);
                        }
                    } else if (z) {
                        ur2.this.g().d1(ur2.this.j(), true, null, 0L);
                    }
                }
                synchronized (ur2.this) {
                    this.f = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                ur2.this.g().flush();
                ur2.this.b();
            }
        }

        public final void d(boolean z) throws IOException {
            long jMin;
            boolean z2;
            synchronized (ur2.this) {
                try {
                    ur2.this.s().r();
                    while (ur2.this.r() >= ur2.this.q() && !this.g && !this.f && ur2.this.h() == null) {
                        try {
                            ur2.this.D();
                        } finally {
                        }
                    }
                    ur2.this.s().y();
                    ur2.this.c();
                    jMin = Math.min(ur2.this.q() - ur2.this.r(), this.c.L0());
                    ur2 ur2Var = ur2.this;
                    ur2Var.B(ur2Var.r() + jMin);
                    z2 = z && jMin == this.c.L0() && ur2.this.h() == null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ur2.this.s().r();
            try {
                ur2.this.g().d1(ur2.this.j(), z2, this.c, jMin);
            } finally {
            }
        }

        public final boolean e() {
            return this.f;
        }

        @Override // com.zepto.d36, java.io.Flushable
        public void flush() throws IOException {
            ur2 ur2Var = ur2.this;
            if (et6.h && Thread.holdsLock(ur2Var)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(ur2Var);
                throw new AssertionError(sb.toString());
            }
            synchronized (ur2.this) {
                ur2.this.c();
                Unit unit = Unit.INSTANCE;
            }
            while (this.c.L0() > 0) {
                d(false);
                ur2.this.g().flush();
            }
        }

        public final boolean j() {
            return this.g;
        }

        @Override // com.zepto.d36
        public cg6 timeout() {
            return ur2.this.s();
        }
    }

    public final class c implements y46 {
        public final u70 c = new u70();
        public final u70 e = new u70();
        public pl2 f;
        public boolean g;
        public final long h;
        public boolean i;

        public c(long j, boolean z) {
            this.h = j;
            this.i = z;
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jL0;
            synchronized (ur2.this) {
                this.g = true;
                jL0 = this.e.L0();
                this.e.d();
                ur2 ur2Var = ur2.this;
                if (ur2Var == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                ur2Var.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (jL0 > 0) {
                w(jL0);
            }
            ur2.this.b();
        }

        public final boolean d() {
            return this.g;
        }

        public final boolean e() {
            return this.i;
        }

        public final void j(a80 source, long j) throws EOFException {
            boolean z;
            boolean z2;
            long jL0;
            Intrinsics.checkNotNullParameter(source, "source");
            ur2 ur2Var = ur2.this;
            if (et6.h && Thread.holdsLock(ur2Var)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(ur2Var);
                throw new AssertionError(sb.toString());
            }
            while (j > 0) {
                synchronized (ur2.this) {
                    z = this.i;
                    z2 = this.e.L0() + j > this.h;
                    Unit unit = Unit.INSTANCE;
                }
                if (z2) {
                    source.skip(j);
                    ur2.this.f(y22.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    source.skip(j);
                    return;
                }
                long j2 = source.read(this.c, j);
                if (j2 == -1) {
                    throw new EOFException();
                }
                j -= j2;
                synchronized (ur2.this) {
                    try {
                        if (this.g) {
                            jL0 = this.c.L0();
                            this.c.d();
                        } else {
                            boolean z3 = this.e.L0() == 0;
                            this.e.H(this.c);
                            if (z3) {
                                ur2 ur2Var2 = ur2.this;
                                if (ur2Var2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                ur2Var2.notifyAll();
                            }
                            jL0 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jL0 > 0) {
                    w(jL0);
                }
            }
        }

        public final void m(boolean z) {
            this.i = z;
        }

        public final void n(pl2 pl2Var) {
            this.f = pl2Var;
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            IOException iOExceptionI;
            long j2;
            boolean z;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j3 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            while (true) {
                synchronized (ur2.this) {
                    ur2.this.m().r();
                    try {
                        if (ur2.this.h() != null) {
                            iOExceptionI = ur2.this.i();
                            if (iOExceptionI == null) {
                                y22 y22VarH = ur2.this.h();
                                Intrinsics.checkNotNull(y22VarH);
                                iOExceptionI = new t76(y22VarH);
                            }
                        } else {
                            iOExceptionI = null;
                        }
                        if (this.g) {
                            throw new IOException("stream closed");
                        }
                        if (this.e.L0() > j3) {
                            u70 u70Var = this.e;
                            j2 = u70Var.read(sink, Math.min(j, u70Var.L0()));
                            ur2 ur2Var = ur2.this;
                            ur2Var.A(ur2Var.l() + j2);
                            long jL = ur2.this.l() - ur2.this.k();
                            if (iOExceptionI == null && jL >= ur2.this.g().H0().c() / 2) {
                                ur2.this.g().i1(ur2.this.j(), jL);
                                ur2 ur2Var2 = ur2.this;
                                ur2Var2.z(ur2Var2.l());
                            }
                        } else if (this.i || iOExceptionI != null) {
                            j2 = -1;
                        } else {
                            ur2.this.D();
                            j2 = -1;
                            z = true;
                            ur2.this.m().y();
                            Unit unit = Unit.INSTANCE;
                        }
                        z = false;
                        ur2.this.m().y();
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        ur2.this.m().y();
                        throw th;
                    }
                }
                if (!z) {
                    if (j2 != -1) {
                        w(j2);
                        return j2;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    Intrinsics.checkNotNull(iOExceptionI);
                    throw iOExceptionI;
                }
                j3 = 0;
            }
        }

        @Override // com.zepto.y46
        public cg6 timeout() {
            return ur2.this.m();
        }

        public final void w(long j) {
            ur2 ur2Var = ur2.this;
            if (!et6.h || !Thread.holdsLock(ur2Var)) {
                ur2.this.g().c1(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(ur2Var);
            throw new AssertionError(sb.toString());
        }
    }

    public final class d extends hy {
        public d() {
        }

        @Override // com.zepto.hy
        public IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.zepto.hy
        public void x() {
            ur2.this.f(y22.CANCEL);
            ur2.this.g().W0();
        }

        public final void y() throws IOException {
            if (s()) {
                throw t(null);
            }
        }
    }

    public ur2(int i, rr2 connection, boolean z, boolean z2, pl2 pl2Var) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.m = i;
        this.n = connection;
        this.d = connection.I0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new c(connection.H0().c(), z2);
        this.h = new b(z);
        this.i = new d();
        this.j = new d();
        if (pl2Var == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(pl2Var);
        }
    }

    public final void A(long j) {
        this.a = j;
    }

    public final void B(long j) {
        this.c = j;
    }

    public final synchronized pl2 C() {
        Object objRemoveFirst;
        this.i.r();
        while (this.e.isEmpty() && this.k == null) {
            try {
                D();
            } catch (Throwable th) {
                this.i.y();
                throw th;
            }
        }
        this.i.y();
        if (!(!this.e.isEmpty())) {
            IOException iOException = this.l;
            if (iOException != null) {
                throw iOException;
            }
            y22 y22Var = this.k;
            Intrinsics.checkNotNull(y22Var);
            throw new t76(y22Var);
        }
        objRemoveFirst = this.e.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
        return (pl2) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final cg6 E() {
        return this.j;
    }

    public final void a(long j) {
        this.d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z;
        boolean zU;
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
        synchronized (this) {
            try {
                z = !this.g.e() && this.g.d() && (this.h.j() || this.h.e());
                zU = u();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            d(y22.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.n.V0(this.m);
        }
    }

    public final void c() throws IOException {
        if (this.h.e()) {
            throw new IOException("stream closed");
        }
        if (this.h.j()) {
            throw new IOException("stream finished");
        }
        if (this.k != null) {
            IOException iOException = this.l;
            if (iOException != null) {
                throw iOException;
            }
            y22 y22Var = this.k;
            Intrinsics.checkNotNull(y22Var);
            throw new t76(y22Var);
        }
    }

    public final void d(y22 rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.n.g1(this.m, rstStatusCode);
        }
    }

    public final boolean e(y22 y22Var, IOException iOException) {
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
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.e() && this.h.j()) {
                return false;
            }
            this.k = y22Var;
            this.l = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.n.V0(this.m);
            return true;
        }
    }

    public final void f(y22 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.n.h1(this.m, errorCode);
        }
    }

    public final rr2 g() {
        return this.n;
    }

    public final synchronized y22 h() {
        return this.k;
    }

    public final IOException i() {
        return this.l;
    }

    public final int j() {
        return this.m;
    }

    public final long k() {
        return this.b;
    }

    public final long l() {
        return this.a;
    }

    public final d m() {
        return this.i;
    }

    public final d36 n() {
        synchronized (this) {
            try {
                if (!(this.f || t())) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        }
        return this.h;
    }

    public final b o() {
        return this.h;
    }

    public final c p() {
        return this.g;
    }

    public final long q() {
        return this.d;
    }

    public final long r() {
        return this.c;
    }

    public final d s() {
        return this.j;
    }

    public final boolean t() {
        return this.n.C0() == ((this.m & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.k != null) {
                return false;
            }
            if (this.g.e() || this.g.d()) {
                if (this.h.j() || this.h.e()) {
                    if (this.f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final cg6 v() {
        return this.i;
    }

    public final void w(a80 source, int i) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!et6.h || !Thread.holdsLock(this)) {
            this.g.j(source, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void x(pl2 headers, boolean z) {
        boolean zU;
        Intrinsics.checkNotNullParameter(headers, "headers");
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
        synchronized (this) {
            try {
                if (this.f && z) {
                    this.g.n(headers);
                } else {
                    this.f = true;
                    this.e.add(headers);
                }
                if (z) {
                    this.g.m(true);
                }
                zU = u();
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.n.V0(this.m);
    }

    public final synchronized void y(y22 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.k == null) {
            this.k = errorCode;
            notifyAll();
        }
    }

    public final void z(long j) {
        this.b = j;
    }
}
