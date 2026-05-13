package com.zepto;

import android.support.v4.media.session.PlaybackStateCompat;
import com.zepto.da0;
import com.zepto.is4;
import com.zepto.ub0;
import com.zepto.v42;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class yf4 implements Cloneable, da0.a {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final long F;
    public final cf5 G;
    public final pk1 c;
    public final kw0 e;
    public final List f;
    public final List g;
    public final v42.c h;
    public final boolean i;
    public final xz j;
    public final boolean k;
    public final boolean l;
    public final lz0 m;
    public final f90 n;
    public final rs1 o;
    public final Proxy p;
    public final ProxySelector q;
    public final xz r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final HostnameVerifier x;
    public final vb0 y;
    public final ub0 z;
    public static final b J = new b(null);
    public static final List H = et6.t(kx4.HTTP_2, kx4.HTTP_1_1);
    public static final List I = et6.t(nw0.h, nw0.j);

    public static final class a {
        public int A;
        public int B;
        public long C;
        public cf5 D;
        public pk1 a = new pk1();
        public kw0 b = new kw0();
        public final List c = new ArrayList();
        public final List d = new ArrayList();
        public v42.c e = et6.e(v42.a);
        public boolean f = true;
        public xz g;
        public boolean h;
        public boolean i;
        public lz0 j;
        public f90 k;
        public rs1 l;
        public Proxy m;
        public ProxySelector n;
        public xz o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List s;
        public List t;
        public HostnameVerifier u;
        public vb0 v;
        public ub0 w;
        public int x;
        public int y;
        public int z;

        public a() {
            xz xzVar = xz.a;
            this.g = xzVar;
            this.h = true;
            this.i = true;
            this.j = lz0.a;
            this.l = rs1.a;
            this.o = xzVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SocketFactory.getDefault()");
            this.p = socketFactory;
            b bVar = yf4.J;
            this.s = bVar.a();
            this.t = bVar.b();
            this.u = wf4.a;
            this.v = vb0.c;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        public final Proxy A() {
            return this.m;
        }

        public final xz B() {
            return this.o;
        }

        public final ProxySelector C() {
            return this.n;
        }

        public final int D() {
            return this.z;
        }

        public final boolean E() {
            return this.f;
        }

        public final cf5 F() {
            return this.D;
        }

        public final SocketFactory G() {
            return this.p;
        }

        public final SSLSocketFactory H() {
            return this.q;
        }

        public final int I() {
            return this.A;
        }

        public final X509TrustManager J() {
            return this.r;
        }

        public final a K(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.u)) {
                this.D = null;
            }
            this.u = hostnameVerifier;
            return this;
        }

        public final a L(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.z = et6.h("timeout", j, unit);
            return this;
        }

        public final a M(boolean z) {
            this.f = z;
            return this;
        }

        public final a N(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if ((!Intrinsics.areEqual(sslSocketFactory, this.q)) || (!Intrinsics.areEqual(trustManager, this.r))) {
                this.D = null;
            }
            this.q = sslSocketFactory;
            this.w = ub0.a.a(trustManager);
            this.r = trustManager;
            return this;
        }

        public final a O(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.A = et6.h("timeout", j, unit);
            return this;
        }

        public final a a(v03 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.c.add(interceptor);
            return this;
        }

        public final a b(v03 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.d.add(interceptor);
            return this;
        }

        public final yf4 c() {
            return new yf4(this);
        }

        public final a d(f90 f90Var) {
            this.k = f90Var;
            return this;
        }

        public final a e(vb0 certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!Intrinsics.areEqual(certificatePinner, this.v)) {
                this.D = null;
            }
            this.v = certificatePinner;
            return this;
        }

        public final a f(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.y = et6.h("timeout", j, unit);
            return this;
        }

        public final xz g() {
            return this.g;
        }

        public final f90 h() {
            return this.k;
        }

        public final int i() {
            return this.x;
        }

        public final ub0 j() {
            return this.w;
        }

        public final vb0 k() {
            return this.v;
        }

        public final int l() {
            return this.y;
        }

        public final kw0 m() {
            return this.b;
        }

        public final List n() {
            return this.s;
        }

        public final lz0 o() {
            return this.j;
        }

        public final pk1 p() {
            return this.a;
        }

        public final rs1 q() {
            return this.l;
        }

        public final v42.c r() {
            return this.e;
        }

        public final boolean s() {
            return this.h;
        }

        public final boolean t() {
            return this.i;
        }

        public final HostnameVerifier u() {
            return this.u;
        }

        public final List v() {
            return this.c;
        }

        public final long w() {
            return this.C;
        }

        public final List x() {
            return this.d;
        }

        public final int y() {
            return this.B;
        }

        public final List z() {
            return this.t;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return yf4.I;
        }

        public final List b() {
            return yf4.H;
        }
    }

    public yf4(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorC;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.c = builder.p();
        this.e = builder.m();
        this.f = et6.P(builder.v());
        this.g = et6.P(builder.x());
        this.h = builder.r();
        this.i = builder.E();
        this.j = builder.g();
        this.k = builder.s();
        this.l = builder.t();
        this.m = builder.o();
        this.n = builder.h();
        this.o = builder.q();
        this.p = builder.A();
        if (builder.A() != null) {
            proxySelectorC = he4.a;
        } else {
            proxySelectorC = builder.C();
            proxySelectorC = proxySelectorC == null ? ProxySelector.getDefault() : proxySelectorC;
            if (proxySelectorC == null) {
                proxySelectorC = he4.a;
            }
        }
        this.q = proxySelectorC;
        this.r = builder.B();
        this.s = builder.G();
        List listN = builder.n();
        this.v = listN;
        this.w = builder.z();
        this.x = builder.u();
        this.A = builder.i();
        this.B = builder.l();
        this.C = builder.D();
        this.D = builder.I();
        this.E = builder.y();
        this.F = builder.w();
        cf5 cf5VarF = builder.F();
        this.G = cf5VarF == null ? new cf5() : cf5VarF;
        List list = listN;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.t = null;
            this.z = null;
            this.u = null;
            this.y = vb0.c;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((nw0) it.next()).f()) {
                    if (builder.H() != null) {
                        this.t = builder.H();
                        ub0 ub0VarJ = builder.j();
                        Intrinsics.checkNotNull(ub0VarJ);
                        this.z = ub0VarJ;
                        X509TrustManager x509TrustManagerJ = builder.J();
                        Intrinsics.checkNotNull(x509TrustManagerJ);
                        this.u = x509TrustManagerJ;
                        vb0 vb0VarK = builder.k();
                        Intrinsics.checkNotNull(ub0VarJ);
                        this.y = vb0VarK.e(ub0VarJ);
                    } else {
                        is4.a aVar = is4.c;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.u = x509TrustManagerP;
                        is4 is4VarG = aVar.g();
                        Intrinsics.checkNotNull(x509TrustManagerP);
                        this.t = is4VarG.o(x509TrustManagerP);
                        ub0.a aVar2 = ub0.a;
                        Intrinsics.checkNotNull(x509TrustManagerP);
                        ub0 ub0VarA = aVar2.a(x509TrustManagerP);
                        this.z = ub0VarA;
                        vb0 vb0VarK2 = builder.k();
                        Intrinsics.checkNotNull(ub0VarA);
                        this.y = vb0VarK2.e(ub0VarA);
                    }
                }
            }
            this.t = null;
            this.z = null;
            this.u = null;
            this.y = vb0.c;
        }
        J();
    }

    public final Proxy A() {
        return this.p;
    }

    public final xz C() {
        return this.r;
    }

    public final ProxySelector E() {
        return this.q;
    }

    public final int F() {
        return this.C;
    }

    public final boolean G() {
        return this.i;
    }

    public final SocketFactory H() {
        return this.s;
    }

    public final SSLSocketFactory I() {
        SSLSocketFactory sSLSocketFactory = this.t;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void J() {
        if (this.f == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f).toString());
        }
        if (this.g == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.g).toString());
        }
        List list = this.v;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((nw0) it.next()).f()) {
                    if (this.t == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.z == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.u == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (!(this.t == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.z == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.y, vb0.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int K() {
        return this.D;
    }

    @Override // com.zepto.da0.a
    public da0 a(kc5 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new i55(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final xz d() {
        return this.j;
    }

    public final f90 e() {
        return this.n;
    }

    public final int f() {
        return this.A;
    }

    public final vb0 g() {
        return this.y;
    }

    public final int h() {
        return this.B;
    }

    public final kw0 i() {
        return this.e;
    }

    public final List k() {
        return this.v;
    }

    public final lz0 l() {
        return this.m;
    }

    public final pk1 o() {
        return this.c;
    }

    public final rs1 p() {
        return this.o;
    }

    public final v42.c q() {
        return this.h;
    }

    public final boolean r() {
        return this.k;
    }

    public final boolean s() {
        return this.l;
    }

    public final cf5 t() {
        return this.G;
    }

    public final HostnameVerifier u() {
        return this.x;
    }

    public final List v() {
        return this.f;
    }

    public final List x() {
        return this.g;
    }

    public final int y() {
        return this.E;
    }

    public final List z() {
        return this.w;
    }

    public yf4() {
        this(new a());
    }
}
