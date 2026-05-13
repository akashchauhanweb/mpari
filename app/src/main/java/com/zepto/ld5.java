package com.zepto;

import com.zepto.pl2;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ld5 implements Closeable {
    public k90 c;
    public final kc5 e;
    public final kx4 f;
    public final String g;
    public final int h;
    public final gl2 i;
    public final pl2 j;
    public final nd5 k;
    public final ld5 l;
    public final ld5 m;
    public final ld5 n;
    public final long o;
    public final long p;
    public final r52 q;

    public static class a {
        public kc5 a;
        public kx4 b;
        public int c;
        public String d;
        public gl2 e;
        public pl2.a f;
        public nd5 g;
        public ld5 h;
        public ld5 i;
        public ld5 j;
        public long k;
        public long l;
        public r52 m;

        public a() {
            this.c = -1;
            this.f = new pl2.a();
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f.a(name, value);
            return this;
        }

        public a b(nd5 nd5Var) {
            this.g = nd5Var;
            return this;
        }

        public ld5 c() {
            int i = this.c;
            if (!(i >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.c).toString());
            }
            kc5 kc5Var = this.a;
            if (kc5Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            kx4 kx4Var = this.b;
            if (kx4Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.d;
            if (str != null) {
                return new ld5(kc5Var, kx4Var, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public a d(ld5 ld5Var) {
            f("cacheResponse", ld5Var);
            this.i = ld5Var;
            return this;
        }

        public final void e(ld5 ld5Var) {
            if (ld5Var != null) {
                if (!(ld5Var.d() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void f(String str, ld5 ld5Var) {
            if (ld5Var != null) {
                if (!(ld5Var.d() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(ld5Var.k0() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(ld5Var.j() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (ld5Var.p0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a g(int i) {
            this.c = i;
            return this;
        }

        public final int h() {
            return this.c;
        }

        public a i(gl2 gl2Var) {
            this.e = gl2Var;
            return this;
        }

        public a j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f.i(name, value);
            return this;
        }

        public a k(pl2 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f = headers.n();
            return this;
        }

        public final void l(r52 deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.m = deferredTrailers;
        }

        public a m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.d = message;
            return this;
        }

        public a n(ld5 ld5Var) {
            f("networkResponse", ld5Var);
            this.h = ld5Var;
            return this;
        }

        public a o(ld5 ld5Var) {
            e(ld5Var);
            this.j = ld5Var;
            return this;
        }

        public a p(kx4 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.b = protocol;
            return this;
        }

        public a q(long j) {
            this.l = j;
            return this;
        }

        public a r(kc5 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.a = request;
            return this;
        }

        public a s(long j) {
            this.k = j;
            return this;
        }

        public a(ld5 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.c = -1;
            this.a = response.z0();
            this.b = response.x0();
            this.c = response.n();
            this.d = response.e0();
            this.e = response.B();
            this.f = response.U().n();
            this.g = response.d();
            this.h = response.k0();
            this.i = response.j();
            this.j = response.p0();
            this.k = response.A0();
            this.l = response.y0();
            this.m = response.w();
        }
    }

    public ld5(kc5 request, kx4 protocol, String message, int i, gl2 gl2Var, pl2 headers, nd5 nd5Var, ld5 ld5Var, ld5 ld5Var2, ld5 ld5Var3, long j, long j2, r52 r52Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.e = request;
        this.f = protocol;
        this.g = message;
        this.h = i;
        this.i = gl2Var;
        this.j = headers;
        this.k = nd5Var;
        this.l = ld5Var;
        this.m = ld5Var2;
        this.n = ld5Var3;
        this.o = j;
        this.p = j2;
        this.q = r52Var;
    }

    public static /* synthetic */ String P(ld5 ld5Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return ld5Var.D(str, str2);
    }

    public final long A0() {
        return this.o;
    }

    public final gl2 B() {
        return this.i;
    }

    public final String D(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strJ = this.j.j(name);
        return strJ != null ? strJ : str;
    }

    public final pl2 U() {
        return this.j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nd5 nd5Var = this.k;
        if (nd5Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        nd5Var.close();
    }

    public final nd5 d() {
        return this.k;
    }

    public final boolean d0() {
        int i = this.h;
        return 200 <= i && 299 >= i;
    }

    public final k90 e() {
        k90 k90Var = this.c;
        if (k90Var != null) {
            return k90Var;
        }
        k90 k90VarB = k90.p.b(this.j);
        this.c = k90VarB;
        return k90VarB;
    }

    public final String e0() {
        return this.g;
    }

    public final ld5 j() {
        return this.m;
    }

    public final ld5 k0() {
        return this.l;
    }

    public final List m() {
        String str;
        pl2 pl2Var = this.j;
        int i = this.h;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return yr2.a(pl2Var, str);
    }

    public final a m0() {
        return new a(this);
    }

    public final int n() {
        return this.h;
    }

    public final ld5 p0() {
        return this.n;
    }

    public String toString() {
        return "Response{protocol=" + this.f + ", code=" + this.h + ", message=" + this.g + ", url=" + this.e.k() + '}';
    }

    public final r52 w() {
        return this.q;
    }

    public final kx4 x0() {
        return this.f;
    }

    public final long y0() {
        return this.p;
    }

    public final kc5 z0() {
        return this.e;
    }
}
