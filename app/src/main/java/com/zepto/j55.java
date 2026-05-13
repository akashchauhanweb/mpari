package com.zepto;

import com.zepto.gl2;
import com.zepto.kc5;
import com.zepto.ld5;
import com.zepto.rr2;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j55 extends rr2.d implements iw0 {
    public static final a t = new a(null);
    public Socket c;
    public Socket d;
    public gl2 e;
    public kx4 f;
    public rr2 g;
    public a80 h;
    public z70 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final List p;
    public long q;
    public final l55 r;
    public final bf5 s;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ vb0 c;
        public final /* synthetic */ gl2 e;
        public final /* synthetic */ wj f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vb0 vb0Var, gl2 gl2Var, wj wjVar) {
            super(0);
            this.c = vb0Var;
            this.e = gl2Var;
            this.f = wjVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            ub0 ub0VarD = this.c.d();
            Intrinsics.checkNotNull(ub0VarD);
            return ub0VarD.a(this.e.d(), this.f.l().i());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            gl2 gl2Var = j55.this.e;
            Intrinsics.checkNotNull(gl2Var);
            List<Certificate> listD = gl2Var.d();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
            for (Certificate certificate : listD) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public j55(l55 connectionPool, bf5 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.r = connectionPool;
        this.s = route;
        this.o = 1;
        this.p = new ArrayList();
        this.q = LongCompanionObject.MAX_VALUE;
    }

    public bf5 A() {
        return this.s;
    }

    public final boolean B(List list) {
        List<bf5> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (bf5 bf5Var : list2) {
            Proxy.Type type = bf5Var.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.s.b().type() == type2 && Intrinsics.areEqual(this.s.d(), bf5Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final void C(long j) {
        this.q = j;
    }

    public final void D(boolean z) {
        this.j = z;
    }

    public Socket E() {
        Socket socket = this.d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    public final void F(int i) throws SocketException {
        Socket socket = this.d;
        Intrinsics.checkNotNull(socket);
        a80 a80Var = this.h;
        Intrinsics.checkNotNull(a80Var);
        z70 z70Var = this.i;
        Intrinsics.checkNotNull(z70Var);
        socket.setSoTimeout(0);
        rr2 rr2VarA = new rr2.b(true, cd6.h).m(socket, this.s.a().l().i(), a80Var, z70Var).k(this).l(i).a();
        this.g = rr2VarA;
        this.o = rr2.G.a().d();
        rr2.b1(rr2VarA, false, null, 3, null);
    }

    public final boolean G(ds2 ds2Var) {
        gl2 gl2Var;
        if (et6.h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ds2 ds2VarL = this.s.a().l();
        if (ds2Var.n() != ds2VarL.n()) {
            return false;
        }
        if (Intrinsics.areEqual(ds2Var.i(), ds2VarL.i())) {
            return true;
        }
        if (this.k || (gl2Var = this.e) == null) {
            return false;
        }
        Intrinsics.checkNotNull(gl2Var);
        return f(ds2Var, gl2Var);
    }

    public final synchronized void H(i55 call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof t76) {
                if (((t76) iOException).c == y22.REFUSED_STREAM) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((t76) iOException).c != y22.CANCEL || !call.isCanceled()) {
                    this.j = true;
                    this.l++;
                }
            } else if (!w() || (iOException instanceof mw0)) {
                this.j = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        h(call.k(), this.s, iOException);
                    }
                    this.l++;
                }
            }
        } finally {
        }
    }

    @Override // com.zepto.iw0
    public kx4 a() {
        kx4 kx4Var = this.f;
        Intrinsics.checkNotNull(kx4Var);
        return kx4Var;
    }

    @Override // com.zepto.rr2.d
    public synchronized void b(rr2 connection, vz5 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.o = settings.d();
    }

    @Override // com.zepto.rr2.d
    public void c(ur2 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.d(y22.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.c;
        if (socket != null) {
            et6.k(socket);
        }
    }

    public final boolean f(ds2 ds2Var, gl2 gl2Var) {
        List listD = gl2Var.d();
        if (!listD.isEmpty()) {
            wf4 wf4Var = wf4.a;
            String strI = ds2Var.i();
            Object obj = listD.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            if (wf4Var.e(strI, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, com.zepto.da0 r22, com.zepto.v42 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.j55.g(int, int, int, int, boolean, com.zepto.da0, com.zepto.v42):void");
    }

    public final void h(yf4 client, bf5 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            wj wjVarA = failedRoute.a();
            wjVarA.i().connectFailed(wjVarA.l().s(), failedRoute.b().address(), failure);
        }
        client.t().b(failedRoute);
    }

    public final void i(int i, int i2, da0 da0Var, v42 v42Var) throws IOException {
        Socket socket;
        int i3;
        Proxy proxyB = this.s.b();
        wj wjVarA = this.s.a();
        Proxy.Type type = proxyB.type();
        if (type != null && ((i3 = k55.a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = wjVarA.j().createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(proxyB);
        }
        this.c = socket;
        v42Var.j(da0Var, this.s.d(), proxyB);
        socket.setSoTimeout(i2);
        try {
            is4.c.g().f(socket, this.s.d(), i);
            try {
                this.h = zf4.d(zf4.l(socket));
                this.i = zf4.c(zf4.h(socket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.s.d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(ow0 ow0Var) throws Throwable {
        wj wjVarA = this.s.a();
        SSLSocketFactory sSLSocketFactoryK = wjVarA.k();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.c, wjVarA.l().i(), wjVarA.l().n(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                nw0 nw0VarA = ow0Var.a(sSLSocket2);
                if (nw0VarA.h()) {
                    is4.c.g().e(sSLSocket2, wjVarA.l().i(), wjVarA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                gl2.a aVar = gl2.e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                gl2 gl2VarB = aVar.b(sslSocketSession);
                HostnameVerifier hostnameVerifierE = wjVarA.e();
                Intrinsics.checkNotNull(hostnameVerifierE);
                if (hostnameVerifierE.verify(wjVarA.l().i(), sslSocketSession)) {
                    vb0 vb0VarA = wjVarA.a();
                    Intrinsics.checkNotNull(vb0VarA);
                    this.e = new gl2(gl2VarB.e(), gl2VarB.a(), gl2VarB.c(), new b(vb0VarA, gl2VarB, wjVarA));
                    vb0VarA.b(wjVarA.l().i(), new c());
                    String strH = nw0VarA.h() ? is4.c.g().h(sSLSocket2) : null;
                    this.d = sSLSocket2;
                    this.h = zf4.d(zf4.l(sSLSocket2));
                    this.i = zf4.c(zf4.h(sSLSocket2));
                    this.f = strH != null ? kx4.l.a(strH) : kx4.HTTP_1_1;
                    is4.c.g().b(sSLSocket2);
                    return;
                }
                List listD = gl2VarB.d();
                if (!(!listD.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + wjVarA.l().i() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(wjVarA.l().i());
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(vb0.d.a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(wf4.a.a(x509Certificate));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    is4.c.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    et6.k(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void k(int i, int i2, int i3, da0 da0Var, v42 v42Var) throws IOException {
        kc5 kc5VarM = m();
        ds2 ds2VarK = kc5VarM.k();
        for (int i4 = 0; i4 < 21; i4++) {
            i(i, i2, da0Var, v42Var);
            kc5VarM = l(i2, i3, kc5VarM, ds2VarK);
            if (kc5VarM == null) {
                return;
            }
            Socket socket = this.c;
            if (socket != null) {
                et6.k(socket);
            }
            this.c = null;
            this.i = null;
            this.h = null;
            v42Var.h(da0Var, this.s.d(), this.s.b(), null);
        }
    }

    public final kc5 l(int i, int i2, kc5 kc5Var, ds2 ds2Var) throws IOException {
        String str = "CONNECT " + et6.N(ds2Var, true) + " HTTP/1.1";
        while (true) {
            a80 a80Var = this.h;
            Intrinsics.checkNotNull(a80Var);
            z70 z70Var = this.i;
            Intrinsics.checkNotNull(z70Var);
            pr2 pr2Var = new pr2(null, this, a80Var, z70Var);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a80Var.timeout().g(i, timeUnit);
            z70Var.timeout().g(i2, timeUnit);
            pr2Var.A(kc5Var.e(), str);
            pr2Var.b();
            ld5.a aVarG = pr2Var.g(false);
            Intrinsics.checkNotNull(aVarG);
            ld5 ld5VarC = aVarG.r(kc5Var).c();
            pr2Var.z(ld5VarC);
            int iN = ld5VarC.n();
            if (iN == 200) {
                if (a80Var.c().I() && z70Var.c().I()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iN != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + ld5VarC.n());
            }
            kc5 kc5VarA = this.s.a().h().a(this.s, ld5VarC);
            if (kc5VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt__StringsJVMKt.equals("close", ld5.P(ld5VarC, "Connection", null, 2, null), true)) {
                return kc5VarA;
            }
            kc5Var = kc5VarA;
        }
    }

    public final kc5 m() {
        kc5 kc5VarB = new kc5.a().i(this.s.a().l()).f("CONNECT", null).d("Host", et6.N(this.s.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.9.2").b();
        kc5 kc5VarA = this.s.a().h().a(this.s, new ld5.a().r(kc5VarB).p(kx4.HTTP_1_1).g(407).m("Preemptive Authenticate").b(et6.c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return kc5VarA != null ? kc5VarA : kc5VarB;
    }

    public final void n(ow0 ow0Var, int i, da0 da0Var, v42 v42Var) throws Throwable {
        if (this.s.a().k() != null) {
            v42Var.C(da0Var);
            j(ow0Var);
            v42Var.B(da0Var, this.e);
            if (this.f == kx4.HTTP_2) {
                F(i);
                return;
            }
            return;
        }
        List listF = this.s.a().f();
        kx4 kx4Var = kx4.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(kx4Var)) {
            this.d = this.c;
            this.f = kx4.HTTP_1_1;
        } else {
            this.d = this.c;
            this.f = kx4Var;
            F(i);
        }
    }

    public final List o() {
        return this.p;
    }

    public final long p() {
        return this.q;
    }

    public final boolean q() {
        return this.j;
    }

    public final int r() {
        return this.l;
    }

    public gl2 s() {
        return this.e;
    }

    public final synchronized void t() {
        this.m++;
    }

    public String toString() {
        Object objA;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.s.a().l().i());
        sb.append(':');
        sb.append(this.s.a().l().n());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.s.b());
        sb.append(" hostAddress=");
        sb.append(this.s.d());
        sb.append(" cipherSuite=");
        gl2 gl2Var = this.e;
        if (gl2Var == null || (objA = gl2Var.a()) == null) {
            objA = "none";
        }
        sb.append(objA);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(wj address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (et6.h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.p.size() >= this.o || this.j || !this.s.a().d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.l().i(), A().a().l().i())) {
            return true;
        }
        if (this.g == null || list == null || !B(list) || address.e() != wf4.a || !G(address.l())) {
            return false;
        }
        try {
            vb0 vb0VarA = address.a();
            Intrinsics.checkNotNull(vb0VarA);
            String strI = address.l().i();
            gl2 gl2VarS = s();
            Intrinsics.checkNotNull(gl2VarS);
            vb0VarA.a(strI, gl2VarS.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean v(boolean z) {
        long j;
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
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.d;
        Intrinsics.checkNotNull(socket2);
        a80 a80Var = this.h;
        Intrinsics.checkNotNull(a80Var);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        rr2 rr2Var = this.g;
        if (rr2Var != null) {
            return rr2Var.N0(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        return et6.D(socket2, a80Var);
    }

    public final boolean w() {
        return this.g != null;
    }

    public final s52 x(yf4 client, m55 chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.d;
        Intrinsics.checkNotNull(socket);
        a80 a80Var = this.h;
        Intrinsics.checkNotNull(a80Var);
        z70 z70Var = this.i;
        Intrinsics.checkNotNull(z70Var);
        rr2 rr2Var = this.g;
        if (rr2Var != null) {
            return new sr2(client, this, chain, rr2Var);
        }
        socket.setSoTimeout(chain.k());
        cg6 cg6VarTimeout = a80Var.timeout();
        long jH = chain.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cg6VarTimeout.g(jH, timeUnit);
        z70Var.timeout().g(chain.j(), timeUnit);
        return new pr2(client, this, a80Var, z70Var);
    }

    public final synchronized void y() {
        this.k = true;
    }

    public final synchronized void z() {
        this.j = true;
    }
}
