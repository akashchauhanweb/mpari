package com.zepto;

import com.zepto.ld5;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.json.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class pr2 implements s52 {
    public static final d h = new d(null);
    public int a;
    public final ql2 b;
    public pl2 c;
    public final yf4 d;
    public final j55 e;
    public final a80 f;
    public final z70 g;

    public abstract class a implements y46 {
        public final qf2 c;
        public boolean e;

        public a() {
            this.c = new qf2(pr2.this.f.timeout());
        }

        public final boolean d() {
            return this.e;
        }

        public final void e() {
            if (pr2.this.a == 6) {
                return;
            }
            if (pr2.this.a == 5) {
                pr2.this.r(this.c);
                pr2.this.a = 6;
            } else {
                throw new IllegalStateException("state: " + pr2.this.a);
            }
        }

        public final void j(boolean z) {
            this.e = z;
        }

        @Override // com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return pr2.this.f.read(sink, j);
            } catch (IOException e) {
                pr2.this.h().z();
                e();
                throw e;
            }
        }

        @Override // com.zepto.y46
        public cg6 timeout() {
            return this.c;
        }
    }

    public final class b implements d36 {
        public final qf2 c;
        public boolean e;

        public b() {
            this.c = new qf2(pr2.this.g.timeout());
        }

        @Override // com.zepto.d36
        public void Q(u70 source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.e)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            pr2.this.g.k(j);
            pr2.this.g.l0(HTTP.CRLF);
            pr2.this.g.Q(source, j);
            pr2.this.g.l0(HTTP.CRLF);
        }

        @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            pr2.this.g.l0("0\r\n\r\n");
            pr2.this.r(this.c);
            pr2.this.a = 3;
        }

        @Override // com.zepto.d36, java.io.Flushable
        public synchronized void flush() {
            if (this.e) {
                return;
            }
            pr2.this.g.flush();
        }

        @Override // com.zepto.d36
        public cg6 timeout() {
            return this.c;
        }
    }

    public final class c extends a {
        public long g;
        public boolean h;
        public final ds2 i;
        public final /* synthetic */ pr2 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pr2 pr2Var, ds2 url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.j = pr2Var;
            this.i = url;
            this.g = -1L;
            this.h = true;
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (this.h && !et6.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.j.h().z();
                e();
            }
            j(true);
        }

        public final void m() throws ProtocolException {
            if (this.g != -1) {
                this.j.f.E();
            }
            try {
                this.g = this.j.f.s0();
                String strE = this.j.f.E();
                if (strE == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = StringsKt__StringsKt.trim((CharSequence) strE).toString();
                if (this.g < 0 || (string.length() > 0 && !StringsKt__StringsJVMKt.startsWith$default(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.g + string + Typography.quote);
                }
                if (this.g == 0) {
                    this.h = false;
                    pr2 pr2Var = this.j;
                    pr2Var.c = pr2Var.b.a();
                    yf4 yf4Var = this.j.d;
                    Intrinsics.checkNotNull(yf4Var);
                    lz0 lz0VarL = yf4Var.l();
                    ds2 ds2Var = this.i;
                    pl2 pl2Var = this.j.c;
                    Intrinsics.checkNotNull(pl2Var);
                    yr2.f(lz0VarL, ds2Var, pl2Var);
                    e();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // com.zepto.pr2.a, com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!d())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.h) {
                return -1L;
            }
            long j2 = this.g;
            if (j2 == 0 || j2 == -1) {
                m();
                if (!this.h) {
                    return -1L;
                }
            }
            long j3 = super.read(sink, Math.min(j, this.g));
            if (j3 != -1) {
                this.g -= j3;
                return j3;
            }
            this.j.h().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            e();
            throw protocolException;
        }
    }

    public static final class d {
        public d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class e extends a {
        public long g;

        public e(long j) {
            super();
            this.g = j;
            if (j == 0) {
                e();
            }
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (this.g != 0 && !et6.p(this, 100, TimeUnit.MILLISECONDS)) {
                pr2.this.h().z();
                e();
            }
            j(true);
        }

        @Override // com.zepto.pr2.a, com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!d())) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.g;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(sink, Math.min(j2, j));
            if (j3 == -1) {
                pr2.this.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            }
            long j4 = this.g - j3;
            this.g = j4;
            if (j4 == 0) {
                e();
            }
            return j3;
        }
    }

    public final class f implements d36 {
        public final qf2 c;
        public boolean e;

        public f() {
            this.c = new qf2(pr2.this.g.timeout());
        }

        @Override // com.zepto.d36
        public void Q(u70 source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.e)) {
                throw new IllegalStateException("closed".toString());
            }
            et6.i(source.L0(), 0L, j);
            pr2.this.g.Q(source, j);
        }

        @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            pr2.this.r(this.c);
            pr2.this.a = 3;
        }

        @Override // com.zepto.d36, java.io.Flushable
        public void flush() {
            if (this.e) {
                return;
            }
            pr2.this.g.flush();
        }

        @Override // com.zepto.d36
        public cg6 timeout() {
            return this.c;
        }
    }

    public final class g extends a {
        public boolean g;

        public g() {
            super();
        }

        @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (!this.g) {
                e();
            }
            j(true);
        }

        @Override // com.zepto.pr2.a, com.zepto.y46
        public long read(u70 sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!d())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.g) {
                return -1L;
            }
            long j2 = super.read(sink, j);
            if (j2 != -1) {
                return j2;
            }
            this.g = true;
            e();
            return -1L;
        }
    }

    public pr2(yf4 yf4Var, j55 connection, a80 source, z70 sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.d = yf4Var;
        this.e = connection;
        this.f = source;
        this.g = sink;
        this.b = new ql2(source);
    }

    public final void A(pl2 headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (!(this.a == 0)) {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        this.g.l0(requestLine).l0(HTTP.CRLF);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.g.l0(headers.m(i)).l0(": ").l0(headers.u(i)).l0(HTTP.CRLF);
        }
        this.g.l0(HTTP.CRLF);
        this.a = 1;
    }

    @Override // com.zepto.s52
    public long a(ld5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!yr2.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return et6.s(response);
    }

    @Override // com.zepto.s52
    public void b() {
        this.g.flush();
    }

    @Override // com.zepto.s52
    public void c() {
        this.g.flush();
    }

    @Override // com.zepto.s52
    public void cancel() {
        h().e();
    }

    @Override // com.zepto.s52
    public d36 d(kc5 request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.a() != null && request.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.zepto.s52
    public void e(kc5 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        sc5 sc5Var = sc5.a;
        Proxy.Type type = h().A().b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        A(request.e(), sc5Var.a(request, type));
    }

    @Override // com.zepto.s52
    public y46 f(ld5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!yr2.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.z0().k());
        }
        long jS = et6.s(response);
        return jS != -1 ? w(jS) : y();
    }

    @Override // com.zepto.s52
    public ld5.a g(boolean z) {
        int i = this.a;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        try {
            j76 j76VarA = j76.d.a(this.b.b());
            ld5.a aVarK = new ld5.a().p(j76VarA.a).g(j76VarA.b).m(j76VarA.c).k(this.b.a());
            if (z && j76VarA.b == 100) {
                return null;
            }
            if (j76VarA.b == 100) {
                this.a = 3;
                return aVarK;
            }
            this.a = 4;
            return aVarK;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on " + h().A().a().l().p(), e2);
        }
    }

    @Override // com.zepto.s52
    public j55 h() {
        return this.e;
    }

    public final void r(qf2 qf2Var) {
        cg6 cg6VarI = qf2Var.i();
        qf2Var.j(cg6.d);
        cg6VarI.a();
        cg6VarI.b();
    }

    public final boolean s(kc5 kc5Var) {
        return StringsKt__StringsJVMKt.equals("chunked", kc5Var.d("Transfer-Encoding"), true);
    }

    public final boolean t(ld5 ld5Var) {
        return StringsKt__StringsJVMKt.equals("chunked", ld5.P(ld5Var, "Transfer-Encoding", null, 2, null), true);
    }

    public final d36 u() {
        if (this.a == 1) {
            this.a = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public final y46 v(ds2 ds2Var) {
        if (this.a == 4) {
            this.a = 5;
            return new c(this, ds2Var);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public final y46 w(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new e(j);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public final d36 x() {
        if (this.a == 1) {
            this.a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public final y46 y() {
        if (this.a == 4) {
            this.a = 5;
            h().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public final void z(ld5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jS = et6.s(response);
        if (jS == -1) {
            return;
        }
        y46 y46VarW = w(jS);
        et6.J(y46VarW, IntCompanionObject.MAX_VALUE, TimeUnit.MILLISECONDS);
        y46VarW.close();
    }
}
