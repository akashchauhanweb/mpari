package com.zepto;

import com.zepto.ld5;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r52 {
    public boolean a;
    public final j55 b;
    public final i55 c;
    public final v42 d;
    public final t52 e;
    public final s52 f;

    public final class a extends of2 {
        public boolean e;
        public long f;
        public boolean g;
        public final long h;
        public final /* synthetic */ r52 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r52 r52Var, d36 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.i = r52Var;
            this.h = j;
        }

        private final IOException d(IOException iOException) {
            if (this.e) {
                return iOException;
            }
            this.e = true;
            return this.i.a(this.f, false, true, iOException);
        }

        @Override // com.zepto.of2, com.zepto.d36
        public void Q(u70 source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.g)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.h;
            if (j2 == -1 || this.f + j <= j2) {
                try {
                    super.Q(source, j);
                    this.f += j;
                    return;
                } catch (IOException e) {
                    throw d(e);
                }
            }
            throw new ProtocolException("expected " + this.h + " bytes but received " + (this.f + j));
        }

        @Override // com.zepto.of2, com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.g) {
                return;
            }
            this.g = true;
            long j = this.h;
            if (j != -1 && this.f != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                d(null);
            } catch (IOException e) {
                throw d(e);
            }
        }

        @Override // com.zepto.of2, com.zepto.d36, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw d(e);
            }
        }
    }

    public final class b extends pf2 {
        public long c;
        public boolean e;
        public boolean f;
        public boolean g;
        public final long h;
        public final /* synthetic */ r52 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r52 r52Var, y46 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.i = r52Var;
            this.h = j;
            this.e = true;
            if (j == 0) {
                d(null);
            }
        }

        @Override // com.zepto.pf2, com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.g) {
                return;
            }
            this.g = true;
            try {
                super.close();
                d(null);
            } catch (IOException e) {
                throw d(e);
            }
        }

        public final IOException d(IOException iOException) {
            if (this.f) {
                return iOException;
            }
            this.f = true;
            if (iOException == null && this.e) {
                this.e = false;
                this.i.i().w(this.i.g());
            }
            return this.i.a(this.c, true, false, iOException);
        }

        @Override // com.zepto.pf2, com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.g)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j2 = delegate().read(sink, j);
                if (this.e) {
                    this.e = false;
                    this.i.i().w(this.i.g());
                }
                if (j2 == -1) {
                    d(null);
                    return -1L;
                }
                long j3 = this.c + j2;
                long j4 = this.h;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.h + " bytes but received " + j3);
                }
                this.c = j3;
                if (j3 == j4) {
                    d(null);
                }
                return j2;
            } catch (IOException e) {
                throw d(e);
            }
        }
    }

    public r52(i55 call, v42 eventListener, t52 finder, s52 codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.c = call;
        this.d = eventListener;
        this.e = finder;
        this.f = codec;
        this.b = codec.h();
    }

    public final IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            s(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.d.s(this.c, iOException);
            } else {
                this.d.q(this.c, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.d.x(this.c, iOException);
            } else {
                this.d.v(this.c, j);
            }
        }
        return this.c.u(this, z2, z, iOException);
    }

    public final void b() {
        this.f.cancel();
    }

    public final d36 c(kc5 request, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = z;
        lc5 lc5VarA = request.a();
        Intrinsics.checkNotNull(lc5VarA);
        long jContentLength = lc5VarA.contentLength();
        this.d.r(this.c);
        return new a(this, this.f.d(request, jContentLength), jContentLength);
    }

    public final void d() {
        this.f.cancel();
        this.c.u(this, true, true, null);
    }

    public final void e() {
        try {
            this.f.b();
        } catch (IOException e) {
            this.d.s(this.c, e);
            s(e);
            throw e;
        }
    }

    public final void f() {
        try {
            this.f.c();
        } catch (IOException e) {
            this.d.s(this.c, e);
            s(e);
            throw e;
        }
    }

    public final i55 g() {
        return this.c;
    }

    public final j55 h() {
        return this.b;
    }

    public final v42 i() {
        return this.d;
    }

    public final t52 j() {
        return this.e;
    }

    public final boolean k() {
        return !Intrinsics.areEqual(this.e.d().l().i(), this.b.A().a().l().i());
    }

    public final boolean l() {
        return this.a;
    }

    public final void m() {
        this.f.h().z();
    }

    public final void n() {
        this.c.u(this, true, false, null);
    }

    public final nd5 o(ld5 response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strP = ld5.P(response, xr2.HEADER_CONTENT_TYPE, null, 2, null);
            long jA = this.f.a(response);
            return new o55(strP, jA, zf4.d(new b(this, this.f.f(response), jA)));
        } catch (IOException e) {
            this.d.x(this.c, e);
            s(e);
            throw e;
        }
    }

    public final ld5.a p(boolean z) {
        try {
            ld5.a aVarG = this.f.g(z);
            if (aVarG != null) {
                aVarG.l(this);
            }
            return aVarG;
        } catch (IOException e) {
            this.d.x(this.c, e);
            s(e);
            throw e;
        }
    }

    public final void q(ld5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.d.y(this.c, response);
    }

    public final void r() {
        this.d.z(this.c);
    }

    public final void s(IOException iOException) {
        this.e.h(iOException);
        this.f.h().H(this.c, iOException);
    }

    public final void t(kc5 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.d.u(this.c);
            this.f.e(request);
            this.d.t(this.c, request);
        } catch (IOException e) {
            this.d.s(this.c, e);
            s(e);
            throw e;
        }
    }
}
